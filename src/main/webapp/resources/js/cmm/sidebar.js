"use strict"
var sidebar = sidebar || {}
sidebar = (()=>{
	let _, js, nav_vue_js, exchange_test_js, page_flag
	let init =x=>{
		_ = $.ctx()
		js = $.js()
		nav_vue_js = js + '/vue/nav_vue.js'
		exchange_test_js = js + '/mypage/exchange_test.js'
		page_flag = x
	}
	let onCreate =x=>{
		init(x)
		$.when(
			$.getScript(nav_vue_js)
		)
		.done(()=>{
			setContentView()
			mypage_move()
			$('#mypageId').text($.cusInfo().cemail)
			init_page()
		})
		.fail(()=>{
			alert()
		})
	}
	let setContentView =()=>{
		$('#root div.themoin-main')
		.html(nav_vue.sidebar_cus())
	}
	
	let init_page =()=>{
		if(page_flag === 'exchange_test'){
			$('#exchange_test').attr('class', 'active')
			$('#exchange_test').siblings().not('div.spacer').attr('class', '')
			exchange_test.onCreate()
		}else{
			cus_info.onCreate()
		/*	$.getJSON(_+'/customers/cusInfo/' + $('#cemail').val(), d=>{
				cemail : sessionStorage.getItem('CEMAIL')
				$('#mypageId').text(d.cus.cemail)
			})*/
		}
	}
	
	let mypage_move =()=>{
		let data = [{ id : 'cus_info', 		className : 'active',	tabNo : 1, title : '회원 정보'		},
					{ id : 'pwd_chg', 		className : '', 		tabNo : 2, title : '비밀번호 변경'	},
					{ id : 'auth_mgmt', 	className : '', 		tabNo : 3, title : '머니허브 계좌'	},
					{ id : 'exchange_test', className : '', 		tabNo : 4, title : '모의 환전'		},
					{ id : 'exchange', 		className : '', 		tabNo : 5, title : '환전'		},
					{ id : 'withdrawal',	className : '', 		tabNo : 6, title : '회원 탈퇴'		} ]
		
		$.each(data, (i, j)=>{
			$(`<a id="${j.id}" class="${j.className}" data-tab="tab-${j.tabNo}">${j.title}</a>`)
			.css({'margin-right': '7%', 'padding-top' : '20px'})
			.appendTo('.tab')
			.click(function(e){
				e.preventDefault()
//				alert(j.className + ' - ' + $(this).attr('id'))
				$(this).attr('class', 'active')
				$(this).siblings().not('div.spacer').attr('class', '')
				
				switch ($(this).attr('id')) {
				case 'cus_info':
					cus_info.onCreate()
					break;
				case 'pwd_chg':
					pwd_chg.onCreate()
					break;
				case 'auth_mgmt':
					auth_mgmt.onCreate()
					break;
				case 'exchange_test':
					exchange_test.onCreate()
					break;
				case 'exchange':
					exchange.onCreate()
					break;
				case 'withdrawal':
					withdrawal.onCreate()
					break;
				}
			})
		})

		$('.tab')
		.append(`<div class="spacer"></div> 
				<img src="https://img.themoin.com/public/img/img-man-s.svg">
				<p id="mypageId"></p>`)
		
		/*$('#cus_info')
		.click(function(){
			var tab_id = $(this).attr('data-tab')
			$(this).addClass('active')
			$("#"+tab_id).addClass('active')
			$('#pwd_chg').removeClass('active')
			$('#auth_mgmt').removeClass('active')
			$('#alarm').removeClass('active')
			$('#ref_mgmt').removeClass('active')
			$('#withdrawal').removeClass('active')
			$('#exchange_test').removeClass('active')
			$('#exchange').removeClass('active')
			
			cus_info.onCreate()
		})
		
		$('#pwd_chg')
		.click(function(){
			var tab_id = $(this).attr('data-tab')
			$(this).addClass('active')
			$("#"+tab_id).addClass('active')
			$('#cus_info').removeClass('active')
			$('#auth_mgmt').removeClass('active')
			$('#alarm').removeClass('active')
			$('#ref_mgmt').removeClass('active')
			$('#withdrawal').removeClass('active')
			$('#exchange_test').removeClass('active')
			$('#exchange').removeClass('active')
			
			pwd_chg.onCreate()
			
		})
		
		$('#auth_mgmt')
		.click(function(){
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
			
		})
		
		$('#alarm')
		.click(function(){
			var tab_id = $(this).attr('data-tab')
			$('#alarm').removeClass('active')
			$('themoin-mypage-profile').removeClass('active')
			$(this).addClass('active')
			$("#"+tab_id).addClass('active')
			$('#cus_info').removeClass('active')
			$('#pwd_chg').removeClass('active')
			$('#auth_mgmt').removeClass('active')
			$('#ref_mgmt').removeClass('active')
			$('#withdrawal').removeClass('active')
			$('#exchange_test').removeClass('active')
			$('#exchange').removeClass('active')
			
			alarm.onCreate()
			
		})
		
		$('#ref_mgmt')
		.click(function(){
			var tab_id = $(this).attr('data-tab')
			$('#ref_mgmt').removeClass('active')
			$('themoin-mypage-profile').removeClass('active')
			$(this).addClass('active')
			$("#"+tab_id).addClass('active')
			$('#cus_info').removeClass('active')
			$('#pwd_chg').removeClass('active')
			$('#auth_mgmt').removeClass('active')
			$('#alarm').removeClass('active')
			$('#withdrawal').removeClass('active')
			$('#exchange_test').removeClass('active')
			$('#exchange').removeClass('active')
			
			ref_mgmt.onCreate()
			
		})
		
		$('#withdrawal')
		.click(function(){
			var tab_id = $(this).attr('data-tab')
			$('#withdrawal').removeClass('active')
			$('themoin-mypage-profile').removeClass('active')
			$(this).addClass('active')
			$("#"+tab_id).addClass('active')
			$('#cus_info').removeClass('active')
			$('#pwd_chg').removeClass('active')
			$('#auth_mgmt').removeClass('active')
			$('#alarm').removeClass('active')
			$('#ref_mgmt').removeClass('active')
			$('#exchange_test').removeClass('active')
			$('#exchange').removeClass('active')
			
			withdrawal.onCreate()
			
		})
		
		$('#exchange_test')
		.click(function(){
			var tab_id = $(this).attr('data-tab')
			$('#exchange_test').removeClass('active')
			$('themoin-mypage-profile').removeClass('active')
			$(this).addClass('active')
			$("#"+tab_id).addClass('active')
			$('#cus_info').removeClass('active')
			$('#pwd_chg').removeClass('active')
			$('#auth_mgmt').removeClass('active')
			$('#alarm').removeClass('active')
			$('#ref_mgmt').removeClass('active')
			$('#withdrawal').removeClass('active')
			$('#exchange').removeClass('active')
			
			exchange_test.onCreate()
			
		})
		
		$('#exchange')
		.click(function(){
			var tab_id = $(this).attr('data-tab')
			$('#exchange').removeClass('active')
			$('themoin-mypage-profile').removeClass('active')
			$(this).addClass('active')
			$("#"+tab_id).addClass('active')
			$('#cus_info').removeClass('active')
			$('#pwd_chg').removeClass('active')
			$('#auth_mgmt').removeClass('active')
			$('#alarm').removeClass('active')
			$('#ref_mgmt').removeClass('active')
			$('#withdrawal').removeClass('active')
			$('#exchange_test').removeClass('active')
			
			exchange.onCreate()
			
		})*/
	}
	return { onCreate }
})()