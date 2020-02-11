"use strict"
var remit_box = remit_box || {}
remit_box =(()=>{
	let _, js, line_graph_js, exrate_js, flag, cntcd, deal, exChart_js, 
		exrateSess, exch
	let init =x=>{
		_ = $.ctx()
		js = $.js()
		deal = $.deal()
		exch = $.exch()
		line_graph_js = js + '/exchart/line_graph.js'
		exrate_js = js + '/exchart/exrate.js'
		exChart_js = js + '/mypage/exChart.js'
		flag = x.flag
		cntcd = x.cntcd
		exrateSess = {}
	}
	
	let onCreate =x=>{
		init(x)
		$.when(
			$.getScript(exrate_js)
		)
		.done(()=>{
			common.remit_send_focusout()
			popup()
		})
		.fail(()=>{
			alert('js를 불러오지 못했습니다.')
		})
	}
	
	let popup =()=>{
		alert('>>> ' +flag)
		if(flag === 'exchange'){	// 모의 환전 시
			let send_data = [ //{ img : 'kr', cntcd : 'KRW', curr : '대한민국 한화', flag : ''}, 
							{ img : 'us', cntcd : 'USD', curr : '미국 달러', flag : '' },
							{ img : 'cn', cntcd : 'CNY', curr : '중국 위안', flag : '' },
							{ img : 'de', cntcd : 'EUR', curr : '독일 유로', flag : '' },			
							{ img : 'au', cntcd : 'AUD', curr : '호주 달러', flag : '' },
							{ img : 'jp', cntcd : 'JPY', curr : '일본 엔', flag : '' }]
			
			$('#cntcd_slide ul').empty()
			cntcd_display(send_data)
			
			$('.form-calculator .amount-row .send')	// send cntcd 클릭 시 팝업
			.click(e=>{
				e.preventDefault()
				if( cntcd === 'KRW' ){
					if( cntcd_slide.style.display === 'none'){
						$('#cntcd_slide').css({ display : 'block'})
					}else{
						$('#cntcd_slide').css({ display : 'none'})
					}
				}
			})
			exrate.onCreate()
		}else if(flag === 'exchange2'){	// 환전 시 보이는 팝업창!
			alert('remit_box의 popup flag(exchage2)로 들어옴>>>')
				let receive_data2 = [
					{ img : 'cn', cntcd : 'CNY', curr : '중국 위안', flag : '' },
					{ img : 'us', cntcd : 'USD', curr : '미국 달러', flag : '' },
					{ img : 'sg', cntcd : 'SGD', curr : '싱가포르 달러', flag : '' },
					{ img : 'au', cntcd : 'AUD', curr : '호주 달러', flag : '' },
					{ img : 'gb', cntcd : 'GBP', curr : '영국 파운드', flag : '' },
					{ img : 'vn', cntcd : 'VND', curr : '베트남 동', flag : '' },
					{ img : 'be', cntcd : 'EUR', curr : '벨기에 유로', flag : '' },
					{ img : 'fr', cntcd : 'EUR', curr : '프랑스 유로', flag : '' },
					{ img : 'de', cntcd : 'EUR', curr : '독일 유로', flag : '' },
					{ img : 'it', cntcd : 'EUR', curr : '이탈리아 유로', flag : '' },
					{ img : 'nl', cntcd : 'EUR', curr : '네덜란드 유로', flag : '' },
					{ img : 'pt', cntcd : 'EUR', curr : '포르투갈 유로', flag : '' },
					{ img : 'es', cntcd : 'EUR', curr : '스페인 유로', flag : '' }]
				
				
			
				$('#exch_box .amount-row .receive')	// 환전에서 receive cntcd 클릭 시
				.click(e=>{
					e.preventDefault()
					$('#popup-root')
					.html(nav_vue.exch_cntcd_popup())
					.show()
					
					$('#popup-close')
					.click(e=>{
						e.preventDefault()
						$('#popup-root')
						.html(nav_vue.exch_cntcd_popup())
						.hide()
					})
					
					$('#popup_box input').val('')
					$('#popup_box ul').empty()
					cntcd_display(receive_data2)
				})

				$('#popup_box input').keyup(()=>{
					search_filter(receive_data2)			
				})
				
				common.popup_close('root')
		}else{	// 송금 시
			let receive_data = [ { img : 'jp', cntcd : 'JPY', curr : '일본 엔', flag : '' },
					{ img : 'cn', cntcd : 'CNY', curr : '중국 위안', flag : '' },
					{ img : 'us', cntcd : 'USD', curr : '미국 달러', flag : '' },
					{ img : 'sg', cntcd : 'SGD', curr : '싱가포르 달러', flag : '' },
					{ img : 'au', cntcd : 'AUD', curr : '호주 달러', flag : '' },
					{ img : 'gb', cntcd : 'GBP', curr : '영국 파운드', flag : '' },
					{ img : 'vn', cntcd : 'VND', curr : '베트남 동', flag : '' },
					{ img : 'be', cntcd : 'EUR', curr : '벨기에 유로', flag : '' },
					{ img : 'fr', cntcd : 'EUR', curr : '프랑스 유로', flag : '' },
					{ img : 'de', cntcd : 'EUR', curr : '독일 유로', flag : '' },
					{ img : 'it', cntcd : 'EUR', curr : '이탈리아 유로', flag : '' },
					{ img : 'nl', cntcd : 'EUR', curr : '네덜란드 유로', flag : '' },
					{ img : 'pt', cntcd : 'EUR', curr : '포르투갈 유로', flag : '' },
					{ img : 'es', cntcd : 'EUR', curr : '스페인 유로', flag : '' }]
			
			$('.form-calculator .amount-row .receive')	// receive cntcd 클릭 시
			.click(e=>{
				e.preventDefault()
				$('#popup-root')
				.show()
				
				$('#popup_box input').val('')
				$('#popup_box ul').empty()
				cntcd_display(receive_data)
			})

			$('#popup_box input').keyup(()=>{
				search_filter(receive_data)			
			})
			common.popup_close('root')
		}
	}
	
/*	let send_cntcd_filter =x=>{
		let filtered_data = []
		for(let i=0; i< x.length; i++ ){
			if(x[i].cntcd !== cntcd ){
				filtered_data.push(x[i])
			}
		}
		alert('filtered_data - ' + JSON.stringify(filtered_data))
		cntcd_display(filtered_data)
	}*/
	
	let search_filter =x=>{
		let filtered_data = []
		for(let i=0; i< x.length; i++ ){
			if(x[i].curr.indexOf($('#popup_box input').val()) > -1 ){
				filtered_data.push(x[i])
			}else{
				$('#popup_box ul').empty()
			}
		}
		cntcd_display(filtered_data)
	}
	
	let cntcd_display =x=>{
		$.each(x, (i, j)=>{
			j.flag = flag
			let append_root = '#popup_box ul'
			if(j.flag === 'exchange'){
				append_root = '#cntcd_slide ul'
			}
			
			$(`<li><img src="https://img.themoin.com/public/img/circle-flag-${j.img}.svg"><a><p>${j.cntcd}</p><p>${j.curr}</p></a></li>`)
			.appendTo(append_root)
			.click(()=>{
				$('#popup-root')
				.hide()
				$('#popup_box input').val('')
				if( j.flag === 'mypage' || j.flag ==='remit'){

					$('.form-calculator .amount-row .receive img').attr("src",`https://img.themoin.com/public/img/circle-flag-${j.img}.svg`)
					$('.form-calculator .amount-row .receive p').text(`${j.curr.substring(0, j.curr.indexOf(' '))}`)
					$('.form-calculator .amount-row .receive h3').text(`${j.cntcd}`)
					
					/*$('#chart')
					.html(`<canvas id="canvas" style="width:70%; height: 150px; max-height: 220px"></canvas>`)
					$.getScript(line_graph_js)*/
					sessionStorage.setItem('cntimg', `https://img.themoin.com/public/img/circle-flag-${j.img}.svg`)
					deal.cntp =$('.form-calculator .amount-row .receive p').text() //송금 국가명, 국가코드
					deal.cntcd = $('.form-calculator .amount-row .receive h3').text()
					sessionStorage.setItem('deal',JSON.stringify(deal))
					alert("레미트박스 국가명 >>>"+deal.cntp+"국가코드 >>>"+deal.cntcd)
					
				}
				else if(( j.flag === 'exchange')){
					if( cntcd_slide.style.display === 'none'){
						$('#cntcd_slide').css({ display : 'block'})
					}else{
						alert( '나라 선택 후  display 없을 때: ' + cntcd_slide.style.display )
						$('#cntcd_slide').css({ display : 'none'})
					}
					
					$('.form-calculator .amount-row .send p').text(`${j.curr.substring(0, j.curr.indexOf(' '))}`)
					$('.form-calculator .amount-row .send h3').text(`${j.cntcd}`)
					exrate.onCreate()

				}
				else if( j.flag === 'exchange2'){ //여기는 레미트박스에서 국가 변경할 때
					alert('remit_box cntcd_display.flag 여기?' + j.flag)
					$('#exch_box .amount-row .receive p').text(`${j.curr.substring(0, j.curr.indexOf(' '))}`) //레미트박스 국가
					$('#exch_box .amount-row .receive h3').text(`${j.cntcd}`) //레미트박스 통화
					alert(`j.cntcd - ${j.cntcd}`)
					exch.cntcd = j.cntcd
					let exch_arr = []
					
					function getExrate(){
						return new Promise(function(resolve){
							$.getJSON('/web/exrate/search/cntcd/' + j.cntcd, d=>{	
								if(d){
									$.each(d.exlist, (i, j)=>{
										exch_arr.push(parseFloat(j.exrate))
									})
									exch.exrate = exch_arr[0]
									sessionStorage.setItem('exch', JSON.stringify(exch))
									alert('getjson>>>remit_box - exch.exrate : '+$.exch().exrate +', exch.cntcd : ' + $.exch().cntcd)
									resolve()
								}
							})
						})
					}
					getExrate()
					.then(()=>{
						common.receive_value_calc(exch_arr[0])
						$('#exch_box .amount-row input.send-amount').keyup(()=>{
							parseFloat(common.receive_value_calc(exch_arr[0]))
						})
						alert('>>>remit_box - exch.exrate : '+$.exch().exrate +', exch.cntcd : ' + $.exch().cntcd)
						//alert 결과는 object로 나옴 왜? cntcd가 선택한 cntcd + USD 함께 나옴
						alert('선택한 국가 : ' + $('#exch_box .amount-row .receive p').text())
					})
					.catch(()=>{
						alert('오동작')
					})
				}
				else{
					/*$('.form-calculator .amount-row .receive p').text(`${j.curr.substring(0, j.curr.indexOf(' '))}`)
					$('.form-calculator .amount-row .receive h3').text(`${j.cntcd}`)
					exrate.onCreate()*/
				}
			})
		})
	}
	
	return { onCreate }
})()