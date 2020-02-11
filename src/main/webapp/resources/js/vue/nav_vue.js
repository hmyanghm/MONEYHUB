var nav_vue = nav_vue || {}
nav_vue = {
	nav : ()=>{
		return `<nav class="themoin-header" id="nav-global"> 
			<div> 
				<a class="logo"> 
					<img id="navlogo" src="/web/resources/img/logo/white_logo.png"> 
				</a> 
				<div class="spacer"></div> 
				<a class="menu"> 
					<div class="line1"></div> 
					<div class="line2"></div> 
				</a> 
				<ul class="aa"> 
					<li><a id="join">회원가입</a></li>
					<li><a id="login">로그인</a></li> 
					<li><a id="admin_login">관리자</a></li> 
					<li><a id="tables_mgmt_a">DB Table 관리</a></li> 
				</ul> 
		<script> 
					$(document).ready(function(){  
						  $(window).scroll(function(){  
						        var scroll = $(window).scrollTop();  
						        if(scroll == 0){ 
						        	$(".themoin-header").css("background-color","#313c4a"); 
						        	$("#navlogo").attr("src","/web/resources/img/logo/white_logo.png"); 
						        	$(".themoin-header ul li a").css("color","#ffffff"); 
						        	$(".themoin-language-dropdown a").css("color","#ffffff"); 
						        }else  if(scroll>1){ 
							        $(".themoin-header").css("background-color","rgba(255, 255, 255, 0.9)","color","#003764"); 
							        $("#navlogo").attr("src","/web/resources/img/logo/black_logo.png"); 
							        $(".themoin-header ul li a").css("color","#313c4a"); 
							        $(".themoin-language-dropdown a").css("color","#003764") 
							    }  
						  })  
					}) 
				</script>
		</nav`
	},
	logined_nav : ()=>{
		return `<nav class="themoin-header"> 
			<div> 
				<a class="logo"> 
					<img id="navlogo" src="/web/resources/img/logo/white_logo.png"> 
				</a> 
				<div class="spacer"></div> 
				<a class="menu"> 
					<div class="line1"></div> 
					<div class="line2"></div> 
				</a> 
				<ul class=""> 
					<li><a id="exch">환전</a></li> 
					<li><a id="remit">해외 송금</a></li> 
					<li><a id="testexch">모의 환전</a></li> 
					<li><a id="mgmt">내 계정 관리</a></li> 
					<li><a id="logout">로그아웃</a></li> 
					<li class="mobile"> 
						<div class="themoin-language-dropdown" tabindex="0"> 
			</div> 
		</nav`
	},
	/*sidebar_admin : ()=>{
		return `<div class="themoin-mypage">
			<div class="tab-container">
				<div class="tab">
					<!-- <a v-for="list of lists" :key="list.aclick" @click="list.aclick" class="list.isShow"> {{list.text}}</a> -->
					<a class="active1" @click.prevent="admin_a">관리자 변경</a>
					<a class="" @click.prevent="pwdchg_a">비밀번호 변경</a>
					<a class="" @click.prevent="studentList_a">학생 목록</a>
					<a class="" @click.prevent="studentsFindSome_a">조건별 학생 검색</a>
					<a class="" @click.prevent="scoreEdit_a">학생 성적 수정</a>
					<a class="" @click.prevent="idSearch_a">ID 학생 검색</a>
					<div class="spacer"></div>
					<img src="https://img.themoin.com/public/img/img-man-s.svg">
					<p>{{cemail}}</p>
				</div>
			</div>
		</div>`
	},*/
	sidebar_cus : ()=>{
		return `<div class="themoin-mypage"> 
		<div class="tab-container"> 
			<div class="tab"> 
				
				
			</div> 
		</div> 
		<div class="mypage"></div> 
		</div`

	},
	exchange_nav : ()=>{
		return 	`<div class="themoin-remit-component" style="padding: 30px 0 40px 0;border-top-width: 0px;">
					<div id="moin-event-amount" class="moin-event-amount"><br>
					<h1 style="padding-bottom: 0px;">지금 바로 머니허브 환전을 이용해보세요</span>
						<p class="color-deepgrey"></p>
					</div>
			<div id="chart" style="display: none;"><canvas id="canvas" style="width:200px; height:50px; margin-bottom: 10px"></canvas></div>
				<div class="check_font" id="exchange_check" ></div>
					<div class="moin-amount">
						<div id="exch_box" class="form-calculator main">
							<div class="amount-row">
								<div class="">
									<p>환전할 원화 금액</p>
									<input class="send-amount" id="exchange_amount"  type="text" tabindex="0" placeholder="0.00">
								</div>
								<div class="unit-select send" tabindex="0" >
									<p>대한민국</p>
									<h3>KRW</h3>
								</div>
							</div>
							<div class="amount-row">
								<div class="">
									<p>환전될 외화 금액</p>
									<input class="receive-amount" type="text" tabindex="0" placeholder="0.00" readonly="">
								</div>
								<div class="unit-select receive" tabindex="0">
									<p>미국</p>
									<h3>USD</h3>
								</div>
							</div>
							<button id="exchangebt" class="index-send-btn moin-body">환전하기</button>
						</div>
					</div>
				</div>`
	},
	exch_cntcd_popup : ()=>{
		return `<div class="moin-popup">
					<div class="themoin-unit-select-popup" tabindex="-1">
						<div class="unit-content">
							<a class="moin-close" id="popup-close">
								<img src="https://img.themoin.com/public/img/btn-close.png" srcset="https://img.themoin.com/public/img/btn-close.png 1x,
								          https://img.themoin.com/public/img/btn-close@2x.png 2x,
								          https://img.themoin.com/public/img/btn-close@3x.png 3x">
			      			</a>
			      			<h3>환전할 통화 선택</h3>
			      			<div id="popup_box">
			      				<form onsubmit="return false">
			      					<input type="text" placeholder="환전할 통화를 선택해주세요.">
			      					<button>입력</button>
			      				</form>
			      				<ul>
			      					
			      				</ul>
			      			</div>
			      		</div>
			      	</div>
				</div>`
	},
	exch_popup : ()=>{	//환전할때 사용하는 팝업
		return `<div class="moin-popup">
					<div class="themoin-unit-select-popup" tabindex="-1">
						<div class="unit-content" style="width: 500px; height: auto; min-height: 420px ; max-height : 700px; padding-bottom:20px;">
							<a class="moin-close">
								<img src="https://img.themoin.com/public/img/btn-close.png" srcset="https://img.themoin.com/public/img/btn-close.png 1x,
										https://img.themoin.com/public/img/btn-close@2x.png 2x,
										https://img.themoin.com/public/img/btn-close@3x.png 3x">
							</a>
							<div class="themoin-remit-component" style="padding-top: 23px; border-top-width: 0px; padding-bottom: 0px; margin: 0 auto;">
								<div id="exch_box" class="form-calculator main" style="width: 100%; min-width: 400px;">
									<div class="amount-row" style="min-height: 100px;">
										<div class="">
											<p style="text-align: left;">환전 금액</p>
											<input class="send-amount" id="exchange_send_amount"  type="text" tabindex="0" placeholder="0.00" value="1000000">
										</div>
										<div class="unit-select send" tabindex="0">
											<p>대한민국</p>
											<h3>KRW</h3>
										</div>
									</div>
									<div id="cntcd_slide" class="amount-row" style="min-height: 270px; display : none">
											<ul style="width : 100%; border-width : 1px; border-color :#dbdbdf; border-top-style: solid; border-left-style: solid; border-right-style: solid;" ></ul>
									</div>
									<div class="amount-row" style="min-height: 100px;">
										<div class="">
											<p style="text-align: left;">예상 비용</p>
											<input class="receive-amount" type="text" tabindex="0" placeholder="0.00" readonly="">
										</div>
										<div class="unit-select receive" tabindex="0" style="background-image: none; cursor: text;">
											<p>미국</p>
											<h3>USD</h3>
										</div>
									</div>
									<div id="exchange_test_exrate" style="width : 100%; height: 35px">
										<p></p> 
									</div>
								</div>
							</div>
						</div>
					</div>`
	}
/*	<a id="cus_info" class="active" data-tab="tab-1" style="margin-right: 50px">회원 정보</a> 
	<a id="pwd_chg" class="active_a" data-tab="tab-2" style="margin-right: 50px">비밀번호 변경</a> 
	<a id="auth_mgmt" class="active_a" data-tab="tab-3" style="margin-right: 50px">머니허브 계좌</a> 
	<a id="exchange_test" class="active_a" data-tab="tab-4" style="margin-right: 50px">모의 환전</a> 
	<a id="exchange" class="active_a" data-tab="tab-5" style="margin-right: 50px">환전</a> 
	<a id="withdrawal" class="active_a" data-tab="tab-6" style="margin-right: 50px">회원 탈퇴</a>
	<div class="spacer"></div> 
	<img src="https://img.themoin.com/public/img/img-man-s.svg">
	<p id="mypageId"></p> */
}