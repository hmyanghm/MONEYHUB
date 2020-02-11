var exchange = exchange || {}
exchange =(()=>{
	const WHEN_ERR = 'js파일을 찾지 못했습니다.'

	let _, js, mypage_vue_js, exChart_js, remit_box_js, line_graph_js, nav_vue_js, exch, cus, acc

	let init =()=>{
		_ = $.ctx()
		js = $.js()
		exch = $.exch()
		cus = $.cusInfo()
		acc = $.acc()
		mypage_vue_js = js + '/vue/mypage_vue.js'
		exChart_js = js + '/mypage/exChart.js'
		remit_box_js = js + '/remit/remit_box.js'
		line_graph_js = js + '/exchart/line_graph.js'
		nav_vue_js = js + '/vue/nav_vue.js'
	}
	let onCreate =()=>{
		alert('들어왔나요 exchange????? - ')
		init()
		$.when(
			$.getScript(mypage_vue_js),
			$.getScript(remit_box_js),
			$.getScript(nav_vue_js)
		)
		.done(()=>{
			setContentView()
			remit_box.onCreate({ flag : 'exchange2', cntcd : '' })
		})
		.fail(()=>{
			alert(WHEN_ERR)
		})
		
	}
	let setContentView =()=>{
		
		$('#root div.themoin-main')
		.html(nav_vue.exchange_nav())
		
		$('.form-calculator .amount-row .send')
    	.css({ cursor : 'text',
    		'background-image' : 'none'})
                                		
		$.getScript(exChart_js)
		
		$('#popup-root')
		.html(nav_vue.exch_cntcd_popup())
		.hide()
		
		$('#popup-exchange').empty()
		
		//cntcd가 자꾸 두개 나옴 왜?
		let cntcd = $('#exch_box .amount-row .receive h3').text()
		let exch_arr = []
		alert('exchange.js의 cntcd는??? '+cntcd+'1')
	/*	$.getJSON('/web/exrate/search/cntcd/' + cntcd, d=>{	
			$.each(d.exlist, (i, j)=>{
				exch_arr.push(parseFloat(j.exrate))
			})
			exch.exrate = exch_arr[0]
			sessionStorage.setItem('exch',JSON.stringify(exch))
		})*/
/*		$('#exch_box .amount-row input.send-amount').keyup(()=>{
				common.receive_value_calc(exch.exrate)
		})*/
				
		$(function(){
			$('#exchangebt').one('click', function(){
				alert('버튼 클릭?')
				$('#chart').fadeIn()

				$.getJSON(_+'/exchange/extrend/cntcd/' + cntcd, d=>{
					if(d.msg === 'UP'){
						$('#exchange_check').text('최근 약 2주간 해당 환율은 상승세입니다.')
						$('#exchange_check').css('color', 'blue')
						$('#exchange_check').css('text-align', 'center')
						$('#exchange_check').css('font-weight', 'bold')
					}else{
						$('#exchange_check').text('최근 약 2주간 해당 환율은 하락세입니다.')
						$('#exchange_check').css('color', 'red')
						$('#exchange_check').css('text-align', 'center')
						$('#exchange_check').css('font-weight', 'bold')
					}
				})
//				$.getScript(exChart_js)
				$(this).click(function(){
					if(confirm('환전하시겠습니까? 확인을 누르시면 바로 실행됩니다.')){

						exch.exchKrw = $('#exch_box .amount-row input.send-amount').val() //환전할 원화 금액
						exch.exchCnt = $('#exch_box .amount-row input.receive-amount').val() //환전된 외화 금액
						exch.cntcd = cntcd
						exch.cemail = cus.cemail
						exch.exrate = exch.exrate
						sessionStorage.setItem('exch',JSON.stringify(exch))

						$('#auth_mgmt').each(function(){
							$.ajax({
								url : _+'/exchange/insert',
								type : 'POST',
								data: JSON.stringify(exch),
								dataType : 'json',
								contentType : 'application/json',
								success : d=>{
									if(d.msg === 'SUCCESS'){
										let cemail = cus.cemail
										let cno = cus.cno
										$.getJSON(_+'/customers/getAcc/' + cemail + '/' + cno, t=>{
											if(d.msg === "SUCCESS"){
												acc.balance = t.acc.balance
												alert(acc.balance)
												sessionStorage.setItem('acc', JSON.stringify(acc))
											}else{
												alert('계좌 getJSON 실패')
											}
										})
										alert('머니허브 계좌로 이동합니다.')
										$.ajax({
											url : _ + '/exchange/balanceChg',
											type : 'POST',
											data : JSON.stringify({
												cemail : cus.cemail,
												exch : JSON.stringify(exch),
												acc : JSON.stringify(acc)
											}),
											dataType : 'json',
											contentType : 'application/json',
											success : d=>{
												if(d.msg === 'SUCCESS'){
													alert('회원 정보가 수정되었습니다.')
												}else if(d.msg === 'FAIL'){
													alert('잔액이 부족합니다. 잔액를 확인해주세요.')
												}
											},
											error : e=>{
												alert('cus_info_chg ajax 실패')  
											}
										})
										
										var tab_id = $(this).attr('data-tab')
										$(this).addClass('active')
										$("#"+tab_id).addClass('active')
										$('#cus_info').removeClass('active')
										$('#pwd_chg').removeClass('active')
										$('#alarm').removeClass('active')
										$('#ref_mgmt').removeClass('active')
										$('#withdrawal').removeClass('active')
										$('#exchange_test').removeClass('active')
										$('#exchange').removeClass('active')
										auth_mgmt.onCreate()
									}else{
										alert('고객님 계좌를 확인해주세요.')
										var tab_id = $(this).attr('data-tab')
										$(this).addClass('active')
										$("#"+tab_id).addClass('active')
										$('#cus_info').removeClass('active')
										$('#pwd_chg').removeClass('active')
										$('#alarm').removeClass('active')
										$('#ref_mgmt').removeClass('active')
										$('#withdrawal').removeClass('active')
										$('#exchange_test').removeClass('active')
										$('#exchange').removeClass('active')
										auth_mgmt.onCreate()
									}
								}
							})

						})
					}
				})
			})
		})
	}
	
	
	return { onCreate }
})()