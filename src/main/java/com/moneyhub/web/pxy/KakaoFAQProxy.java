package com.moneyhub.web.pxy;

import java.util.ArrayList;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("kakaoPxy")
public class KakaoFAQProxy extends Proxy{

	public void kakaoFAQStore() {
				
		
//		System.out.println( title_stores().length + title_list.toString());
//		System.out.println( content_stores().length + title_content.toString());
	}
	
	public String[] title_stores() {
		String[] titles = {"해외송금 할 때 거주 정보를 어떻게 선택해야 하나요?",
				"인도에서 WU빠른해외송금을 수취 할 때 주의해야할 점이 있나요?",
				"WU빠른해외송금이 지급보류되었는데 어떻게 하면 될까요?",
				"멕시코시티로 해외송금을 하려는데, 지급지의 주 선택지에 멕시코시티(Ciudad de México)를 찾을 수 없습니다.",
				"WU빠른해외송금을 뉴질랜드에서 수취하는 경우 주의할 점이 있나요?",
				"WU빠른해외송금을 수취할 수 없는  경우는 무엇인가요?",
				"미국으로 보낸 고액의 WU빠른해외송금을 수취하려면 어떻게 해야하나요?",
				"WU빠른해외송금을 할 때 수취인 성이 없는 경우 어떻게 해야하나요?",
				"해외유학생/해외체재자 송금의 경우에는 거래외국환은행 지정을 해야 된다고 하는데요. 모바일로도 가능한지요?",
				"해외송금도 자동이체등록이 가능한가요?",
				"해외송금 보낼 때 수수료는 얼마인가요?",
				"해외송금시 환율우대는 어떻게 되나요?",
				"머니허브에서 해외송금 가능한 국가를 알고 싶습니다.",
				"유학 학비를 학교계좌로 직접 송금하는 것도 가능한가요?",
				"신청 완료한 해외송금에 대한 입력 내용 변경 또는 반환 신청이 가능한가요?",
				"해외송금이 가능한 시간은 언제입니까?",
				"해외송금 신청시 OTP가 필요한가요?",
				"WU빠른송금 받기할 때 필요한 정보 가운데 정확한 송금 금액의 확인이 어려울 경우, 어떻게 해야하나요?",
				"WU빠른해외송금을 보냈는데 수취인이 아직 받을 수 없다고 하는데 어떻게 해야하나요?",
				"오래전에 받은 WU빠른해외송금 받기 정보를 이용해 수취 가능한가요?",
				"WU빠른해외송금을 완료했는데 사기거래로 의심되는 경우 어떻게 해야하나요?",
				"해외송금 반환(퇴결)과 해외송금 취소의 차이는 무엇인가요?",
				"WU빠른해외송금을 보냈는데 정보를 잘못입력했어요, 변경이 가능한가요?",
				"WU해외송금 거래 중에 검토요청이 필요한 내용이 있다고 하는데 어떻게 해야하나요?",
				"WU빠른해외송금 받기 메뉴에서 영문명이 계속 일치 하지 않는다고 하는데 어떻게 해야하나요?",
				"WU빠른해외송금 받기는 어떻게 하나요?",
				"WU빠른해외송금을 보냈는데 수취인이 어떻게 지급받아야 하나요?",
				"WU빠른해외송금 보내기는 어떻게 하나요?",
				"WU빠른해외송금이 무엇인가요?",
				"해외에서 해외송금을 이용할 수 있나요?",
				"인도로 해외송금 시 은행코드는 무엇을 입력해야하나요?",
				"호주로 해외송금 시 은행코드는 무엇인가요?",
				"뉴질랜드 해외송금 시 은행코드는 무엇인가요?",
				"홍콩 은행코드는 무엇인가요?",
				"싱가포르 은행코드는 무엇인가요?",
				"영국으로 해외송금 시 계좌번호는 IBAN CODE와 어떻게 다른가요?",
				"캐나다 은행코드는 무엇인가요?",
				"미국으로 송금 시 은행코드에 입력하는 Electronic Routing Number는 무엇인가요?",
				"머니허브에서도 외화 예금 가입이 가능한가요?",
				"유학생, 해외체재비 송금 시 필요 서류는 무엇인가요?",
				"IBAN CODE가 무엇인가요?",
				"SWIFT 코드는 무엇인가요?",
				"해외자동송금 주기가 정해져있나요?",
				"해외자동송금 신청을 하였는데 변경 가능한가요?",
				"해외자동송금일자가 휴일입니다. 어떻게 되나요?",
				"해외자동송금 신청일 당일 및 종료일에 송금 되나요?",
				"해외 송금 보낼 때 환율 조회는 어디서 하나요?",
				"외환매입증명서 여러 장 발급 가능한가요?",
				"해외연수기관의 유학관련서류를 지금 당장 발급 받을 수 없어 해외유학생 거래 외국환은행 지정 등록을 할 수 없을 것 같습니다. 이럴경우 어떻게 송금 해야하나요?",
				"해외유학과 국외연수의 차이점은 무엇인가요?",
				"일반해외여행자와 해외체재자의 차이점은 무엇인가요?",
				"미성년자인 자녀를 해외유학생이나 해외체재자로 지정등록하여 해외송금할수 있는지요?",
				"해외에서 머니허브 입출금계좌로 송금 받으려면 어떻게 해야하나요?",
				"해외송금시, 국세청 등에 자동통보되는 금액기준이 어떻게 되나요?",
				"해외송금 신청건에 대하여 별도 요청없이 송금액이 반환되었습니다",
				"거래외국환은행 지정이란?",
				"건별 송금금액 미화 5천불 초과 해외송금을 보낼 때는 반드시 거래외국환은행 지정등록을 해야 하나요?",
				"지급증빙서류 미제출 송금이 무엇인가요?",
				"해외로 송금시 소요되는 기간은 어떻게 되는지요?",
				"해외로 송금을 보낼 때 필요한 정보가 궁금합니다."};
		return titles;
	}
	
	public String[] content_stores() {
		String[] contents = {"<p>머니허브 해외송금은 국민인 거주자만 이용이 가능합니다.  <br>따라서 해외송금 거래를 진행하기 위하여 외국환거래법상(외국환거래법 시행령 제 10조) 거주자인지 확인이 필요하며 거주자로 확인된 이후 12개월 주기로 재확인이 요청되니 참고부탁드립니다.  <br><br>아래의 경우 중 하나만 해당이 되어도 거주자로 판정할 수 있으니 참고하시어 선택바랍니다. <br><br>1. 국내에 주소를 두고 있습니다. <br>2. 주로 생계를 유지하는 동거가족이(부모, 배우자, 자녀 등) 국내에 주소를 두고 있습니다. <br>3. 대한민국 재외공관에서 근무할 목적으로 외국에 파견되어 체재 중입니다. <br>4. 비거주자였으나 입국하여 국내에 3개월이상 체재하고 있습니다.&nbsp;</p><p><br></p><p>※ 거주성확인 절차는 2019년 12월 13일부터 시행됩니다.</p>",
				"<p>인도 정부가 2019년 9월 1일부터 현금인출 시 세금이 부과되도록 규정을 개정하여 인도내 취급점에서 현금지급을 위하여 자금을 은행에서 인출할 때 해당 세금을 부과한다고 합니다. </p><p>이는 WU빠른해외송금의 수취수수료가 아닌 인도 고유의 정책으로 세금이 부과되는 것이니 거래에 참고 부탁드립니다.</p>",
				"<p>WU빠른해외송금의 제휴사인 WU(Westurn Union)사는 미국 FTC감독규정 요건에 따라, 송금사기로 의심되는 거래는 송금인이 사기 피해자가 아님이 확인 될때 까지 지급을 보류하고(On Hold) 있습니다.</p><p>WU서비스센터로 연락하여 담당직원과 유선통화를 통해 추가정보를 제공하고 해당 직원이 사기거래가 아니라고 판단되면 지급보류가 해제됩니다. 그러나 적정한 정보를 제공하지 못하였거나 해당거래가 사기거래로 판단되면 퇴결되며 송금원금 및 수수료는 반환 되지만 반환 시점의 전신환매입율이 적용되어 환차손이 발생할 수있습니다.&nbsp;</p><p>송금건이 지급보류로 확정되고 5일동안 WU서비스센터로 연락하지 않는 경우, 자동 퇴결되며 송금원금 및 수수료는 반환 되지만 반환 시점의 전신환매입율이 적용되어 환차손이 발생할 수있습니다.&nbsp;</p><p><br></p><p><span style=\"font-weight: 700;\">WU서비스센터 전화 번호</span><br></p><p>- 한국에서 거실때 : 00798-8521-3000 (수취인부담)</p><p>- 해외에서 거실때 : 체류중인 국가 국제전화용 번호 + 82 + 00798-8521-3000 (수취인부담)</p><p>※ 한국어 상담: 평일 9시~18시, 영어상담 : 24시간<br></p><p>※ 위와 같은 방법을 이용해야지만 전화요금이 수취인에게 부담되므로 주의 부탁드립니다.</p><p>※ 관련 사이트 : wu.com/fraudawareness</p>",
				"<p>멕시코시티로 송금보내시는 경우 지급지의 주 정보를 DF (DISTRITO FEDERAL)로 선택해주시면 됩니다.<br></p>",
				"<p>WU빠른해외송금을 뉴질랜드에서 수취하는 경우 주의할 점 안내드립니다.</p><p>- 뉴질랜드 거주자인 경우 : 제출하는 신분증 종류에 따라 추가 신분증명 자료 및 거주지 자료가 필요합니다.</p><p>- 여행자인 경우, 본국 거주지 주소증빙이 가능한 자료를 요청할 수 있으니 신분증(ex, 여권)외에 본국의 운전면허증 등 별도 신분증을 준비하셔야 할 수 있습니다. 반드시 방문예정인 가맹점에 문의 후 방문하시기 바랍니다.</p><br>",
				"<p>- WU빠른해외송금은 '개인'만 수취가 가능합니다. 따라서 <span style=\"background-color: rgb(255, 255, 0);\">법인은 수취불가</span>합니다.</p><p>- 수취인이 미성년자인 경우 수취가 불가능하거나 수취금액에 제한이 있을 수 있습니다.</p><p>&nbsp; (미성년자의 나이는 수취국가별, 주(state)별로 다르게 적용 될 수 있으니 <a href=\"https://www.moneyhub.com/app/guide/wuReceiving\" target=\"_blank\" style=\"background-color: rgb(255, 255, 0);\">WU빠른해외송금수취가이드</a>를&nbsp;통해 방문할 가맹점에 해당 내용을 확인 후 처리하시기 바랍니다.)</p><p>- 수취인이 해외송금거래제재자로 등록되어 있거나 사기거래로 의심되는 경우 수취 불가합니다.</p>",
				"<p>WU빠른해외송금을 미국으로 보낸 경우 송금시 기재한 지급지 주(State) 내에 위치한 웨스턴유니온 취급점에서 수취가 가능합니다.</p><p>그러나 규모가 작은 취급점인 편의점, 약국 등의 소매점은 보안상의 문제로 고액 현금보유가 불가하여 송금지급한도가 소액인 경우가 있으니, 방문 전에 꼭 근처 취급점의 상세정보를&nbsp;<span style=\"background-color: rgb(255, 255, 0);\"><a href=\"https://www.moneyhub.com/app/guide/wuReceiving\" target=\"_blank\">WU빠른해외송금 수취가이드</a></span>에서 확인하시고 방문하시길 부탁드리며 고액을 수취하시려면 아래 은행에 본인이 신분증을 소지하고 방문하시는 방법을 추천드립니다.</p><p>- US Bank : 미화 7천불까지 지급가능</p><p>&nbsp;(단, US bank 계좌 소지자에 한함)</p><p>- TCF Bank : 미화 7천불까지 지급가능</p><p>&nbsp; (TCF Bank계좌 없이 거래 가능)</p><p><br></p><p>※ 최근 미국에서 <font color=\"#ff0000\">3,000불을 초과</font>하는 고액현금 지급요청 시 가맹점에서 아래와 같은 서류를 요청하니 참고 부탁드립니다.<br></p><p>&nbsp;(<font color=\"#0000ff\">아리조나주</font>, <font color=\"#0000ff\">오클라호마주</font>, <font color=\"#0000ff\">뉴멕시코주</font>의 경우 <font color=\"#ff0000\">1,000불을 초과</font>하거나 <font color=\"#ff0000\">가맹점의 판단</font>에 의해 추가 서류를 요청할 수 있으니 참고부탁드립니다. )</p><p>- 수취인이 미국 비거주자(방문객, 관광객)인 경우 : 3,000달러 이하만 수취가능</p><p>- 수취인이 미국 거주 중인 외국인인 경우 : 본국 여권 + (SSN 혹은 Alien ID)&nbsp;</p><p>- 수취인이 미국 국적자인 경우 : 미국정부발행 신분증(생년월일 및 직업 확인 할 수 있음)&nbsp;</p><br>",
				"<p>인도네시아, 말레이시아 등 일부 국가의 경우 이름만 있고 성이 없는 경우가 있습니다.</p><p>이럴때에는 성(Last name)항목에 \"<span style=\"background-color: rgb(255, 255, 0);\">NO LAST NAME</span>\" 이라고 기재하시면 가능합니다.</p><p>※ WU빠른해외송금은 수취 시에 신분증과 이름이 다른 경우 지급이 제한 되므로</p><p>수취인명을 꼭 확인 하시고 송금하시기 바랍니다.</p>",
				"<p>네 가능합니다.</p><p>지정거래는 앱&gt; 해외송금&gt; 거래외국환은행 지정 메뉴에서 지정 사유 선택 후 신청이 가능합니다. </p><p>본인 및 해외유학생인 경우 대리인 (부모, 자녀, 배우자)에 의한 지정이 가능하며, 필요한 서류는 다음과 같습니다.</p><p><br></p><p>※ 해외유학생의 경우 거래외국환은행 지정 등록 후에도 매 연도별로 유학증빙서류를 제출하여야합니다. </p><p>유학증빙서류 미제출로 인하여 해외유학생의 거래외국환은행 지정 유효기간(등록일로부터 1년)이 만료된 경우, 미화 5천불초과 유학생 지정 송금이 불가합니다. </p><p>단, 유효기간 만료 후에도 유학증빙서류를 제출하여 계속해서 지정 및 송금 서비스를 이용할 수 있습니다.&nbsp;</p><p><br></p><p>&lt;유학생&gt;</p><p><p>* 기본 제출서류 <br>1. 여권사본<br>- 본인신청시 본인 여권 사본<br>- 대리신청시 유학생(지정대상자) 여권사본<br>2. 유학증빙서류 : 입학허가서/외국교육기관의 장이 발급하는 재학증명서 / 등록금납부확인서류 / 직전학기성적증명서 등 재학사실을 입증하는 서류 중 택 1 )&nbsp; <br>※ 영문으로 발급된 증명서를 제출 부탁드립니다.</p><p><br></p><p>* 대리신청 시 추가제출서류 <br></p><p><br>- 유학생이 국민인 경우<br>① 대리인본인 신분증<br>② 가족관계증명서류(유학생 기준으로 발급, 최근3개월 이내 발급분)</p><p><br></p><p>- 유학생이 외국국적 소지자인 경우<br>① 대리인본인 신분증 <br>② 가족관계증명서류(유학생 기준으로 발급, 최근3개월 이내 발급분)<br>③ 주민등록등본 등 부모가 국민임을 확인할 수 있는 서류(최근3개월 이내 발급분)<br>④ 대리신청자의 출입국사실증명(최근3개월 이내 발급분)</p><p><br></p><p>※ 대리신청은 지정대상자의 부모, 자녀, 배우자만 가능합니다.</p><p><br></p><p>&lt;해외체재자&gt;<br></p><p>* 제출 서류<br>1. 본인 여권 사본<br>2. 해외 파견 혹은 발령의 경우 관련 증빙서류<br>3. 기술훈련관련 해외체재자의 경우 : 훈련출장명령서 또는 국외 훈련기관의 훈련초청서 등 여행목적을 입증하는 서류<br>4. 문화관련 해외체재자의 경우 : 문화체육관광부장관, 대한체육회장 등 체육관련 단체의 장, 학교장 또는 소속 종단 등의 해외여행확인서(전국은행연합회 외국환거래업무 취급지침서식 제4-1호)<br>5. 국외연수관련 해외체재자의 경우 : 소속단체의 장 또는 국외 연수기관의 장이 발급한 국외연수를 입증하는 서류</p><p><br></p><p>※ 본인만 신청 가능합니다.</p><br>",
				"<p>송금 발송 후 30일이 지난 거래완료된 해외송금 건에 대해 등록 가능합니다. (취소 및 퇴결 건의 경우 자동해외송금 신청 불가) </p><p>- 해외 자동 송금은 지정한 송금일의 오전 10시에 처리되니 사전에 계좌 잔액을 확인부탁드립니다.</p><p>- 해외송금 내역조회 메뉴에서 해당 건을 선택하면 보여지는 상세 조회 화면의 제일 하단에 '해외자동송금 신청하기'를 통해 신청 가능합니다.</p><p>-&nbsp;'해외자동송금' 내역은 '[전체메뉴&gt;해외송금 내역조회] 우측 상단의 '자동송금'을 통해 확인 가능합니다. </p><p>- WU빠른해외송금은 자동송금 등록이 불가합니다.<br></p>",
				"<p>머니허브 해외송금은 송금 방식별로 수수료가 적용됩니다.</p><p><br></p><p>※&nbsp; 해외계좌송금</p><p>*19개국 : 미국, 캐나다, 영국, 호주, 싱가포르, 홍콩, 뉴질랜드, 인도, 독일, 프랑스, 오스트리아, 벨기에, 핀란드. 그리스, 아일랜드, 이탈리아, 네덜란드, 포르투갈, 스페인<br>- 송금수수료<br>&nbsp; - 송금금액 미화 기준 5천불 이하: 5천원(건당)<br>&nbsp; - 송금금액 미화 기준 5천불 초과: 1만원(건당)<br>- 전신료 면제<br>- 중개수수료 면제<br>- 수취수수료 면제</p><p>*3개국: 일본, 필리핀, 태국<br>- 송금수수료 : 8천원(건당, 송금금액 무관) <br>- 전신료 면제<br>- 중개수수료, 수취수수료 수취인 부담<br>- 수취인은 송금금액에서 중개 및 수취수수료가 제외된 금액을 수취함</p><p><br></p><p>※ WU빠른해외송금<br></p><p>- 송금수수료<br>&nbsp; - 송금금액 미화 기준 3천불 이하: USD 6 (건당)<br>&nbsp; - 송금금액 미화 기준 3천불 초과: USD 12 (건당)<br>- 전신료 없음<br>- 중개수수료 없음<br>- 수취수수료 없음</p><br>",
				"<p>- 해외계좌송금의 경우, 주요통화 해외송금은 50% 환율우대가 적용됩니다.<br>※ 주요통화 : USD, JPY, EUR, CAD, AUD, NZD, GBP, HKD, SGD</p><p><br></p><p>- WU빠른해외송금은 환율우대가 없습니다.</p><br>",
				"<p><strong><strong>※ 해외계좌송금</strong> <br>22개 국가로 송금 가능하며 각 국가의 현지 통화로 송금 됩니다. ( ex. 캐나다로 송금하는 경우 CAD로만 송금 가능. 다른 통화 불가)</strong></p><p>* 미국(USD), 캐나다(CAD), 영국(GBP), 호주(AUD), 싱가포르(SGD), 홍콩(HKD), 뉴질랜드(NZD), 인도(INR), 일본(JPY), 필리핀(PHP), 태국(THB), 유럽11개국(EUR)(독일, 프랑스, 오스트리아, 벨기에, 핀란드. 그리스, 아일랜드, 이탈리아, 네덜란드, 포르투갈, 스페인)</p><p><br></p><p><strong>※ WU빠른해외송금</strong><br>북한, 이란등의 제재국가를 제외한 전세계 200여개국에 송금이 가능하며 가능국가는 송금 보내기메뉴에서 국가 선택시 확인 가능합니다. </p><p>WU빠른해외송금은 송금 국가와 상관 없이 오직 USD로만 송금 가능합니다.</p><br>",
				"<p>해외계좌송금으로 보내시는 경우 학교 계좌로 송금이 가능합니다. 반면, WU빠른해외송금은 법인을 제외한 개인에게만 송금이 가능합니다.<br>유학생의 경우, 학교 및 유학원 계좌 등의 계좌로 송금이 가능합니다. 단, 학교로 직접 송금 하는 경우, 송금이 완료되어도 학교측의 확인이 늦어지는 경우가 종종 발생하므로 송금 완료하신 후 송금 완료 확인서와 유학생 영문명, 학번 등의 세부내용을 기재하여 학교에 별도 통보(이메일 발송 등)를 진행하시면 빠른 확인이 가능합니다.<br></p>",
				"<p>신청된 해외송금의 입력내용 변경 및 취소는 불가능합니다. </p><p>신청 내용을 입력하기 전 반드시 송금국가별 가이드를 확인해주시고, 잘못된 정보를 기입하거나 오타를 입력하지 않도록 주의해주세요.</p><p></p><p>단, WU빠른해외송금의 경우 아래의 제한적인 경우에만 변경이 가능합니다.<br>- 수취인 영문명의 성과 이름을 반대로 기재한 경우<br>- 수취인 영문명의 일부 스펠링을 착오 기재한 경우<br>- 입력실수로 원하는 지급지 주/도시 정보를 잘못 기재한 경우</p><p><br></p><p>※ 머니허브에서 송금하신 <span style=\"background-color: rgb(255, 255, 0);\">WU빠른해외송금의 변경 및 취소는 머니허브 고객센터에서만 처리가능</span>합니다.</p><p>&nbsp;웨스턴유니온 고객센터에 직접 연락하신 경우 꼭 머니허브 고객센터에도 연락하셔야합니다.</p><br>",
				"<p>- 해외송금 거래가능 시간 : 24시간<br>- 거래외국환은행 지정신청 가능시간 : 평일 9시~18시(한국은행 영업일 기준으로, 주말, 공휴일, 근로자의날 제외됩니다.)<br>※ 단, 해외송금 서비스 점검으로 인해 23시 30분부터 00시 10분까지 거래가 제한됩니다. <br></p>",
				"<p>해외송금 신청금액이 원화기준 1천만원 초과일 경우 OTP인증이 필요합니다. <br></p><p>※ 당행 OTP 가 없으신 경우, 타행 OTP 이용등록 후 사용하실 수 있습니다. <br></p><p>※ 별도로 OTP이용금액설정을 하신 경우 해당 설정에 따라 적용됩니다.<br></p>",
				"<p>웨스턴 유니온 송금의 경우, 대부분 USD로 송금되지만 일부 국가의 경우 송금 국가의 통화로 송금되어 지급시까지 USD 금액이 확정되지 않아 정확한 송금 금액의 확인이 어려울 수 있습니다. </p><p>이러한 경우 머니허브 고객센터로 전화주시면 송금 금액을 확인하는데 도움을 드리도록 하겠습니다. (단, 본인 확인 및 송금 정보를 필수적으로 확인합니다.)<br></p>",
				"<p>제휴사인 WU(웨스턴유니온)사는 분쟁,소송 또는 OFAC제재대상국가, UN제재대상국가에 해당하는 국가로 송금하시거나 금융제재자의 해외송금 거래를 방지하기위하여 다양한 방식으로 해외송금거래를 검토 및 확인 하고 있기때문에 극히 일부의 경우 정상적으로 송금하였음에도 불구하고 지급지연, 거래 취소, 거래 제한이 발생 할 수 있습니다. </p><p>해당 케이스가 발생하는 경우 고객센터로 문의 주시면 안내드리도록하겠습니다.</p>",
				"<p>WU빠른해외송금은 송금 후 45일 이상 경과된 거래를 수취하시려면 송금을 보낸 송금인이 송금보낸 취급점 혹은 웨스턴유니온 서비스센터에 수취가능하도록 상태변경을 요청하여야 합니다.<br></p>",
				"<p>웨스턴 유니온 Fraud Hotline(00798-8521-2590)에 고객이 직접 연락하여 거래 지급 중지를 요청할 수 있습니다.</p><p>지급 중지 요청 후 거래 반환은 머니허브 고객센터에 요청하셔야 합니다.</p><p>그러나 거래 반환을 위하여 지급중지 상태 해지시, 웨스턴 유니온 준법팀의 검토가 필요하므로, 사기관련 내용에 대한 추가 확인이 필요한 자료를 고객에게 요청할 수 있습니다.</p>",
				"<p>* 송금 퇴결(반환)이란?<br>해외송금 거래를 완료 하고 난 후 상대은행 혹은 수취인이 송금수취를 거절하거나, 송금 정보가 부정확하거나 준법, AML 이슈등으로 송금이 반환되는 경우를 \"퇴결\"거래라고 합니다. </p><p>이 때 송금시 지불했던 수수료는 반환되지 않으며 반환되는 시점에 전신환매입율이 적용되어 환차손이 발생할 수 있습니다. </p><p>상대방이 수취를 거절하는 퇴결의 경우 퇴결 자금을 돌려받을 때까지 상당한 시간이 소요되므로(대략 2주~3주) 송금 시 주의를 기울여 주시기 바랍니다.</p><p><br></p><p><p>* 송금 취소란?<br>WU빠른해외송금 보내기 거래를 신청하고 난 후 WU사에서 시스템 오류, 한도 초과 등으로 거절응답이 오는 경우 거래는 즉시 취소되어 송금거래는 무효가 되로 출금되었던 전액(수수료 포함)이 재입금되게 되는데 이 거래를 송금취소라고 합니다. </p>",
				"<p>WU빠른해외송금 보내기의 경우 수취인이 자금을 수취하기 전이라면 제한적인 경우에 한하여 머니허브 고객센터를 통해 변경이 가능합니다. 아래에 해당하는 항목이 아닌 경우 취소 후 재송금하셔야하니 고객센터로 연락해주세요.</p><p>단, 변경 가능 항목은 아래와 같습니다.<br></p><p>- 수취인 영문명(성/이름을 반대로 입력하였거나 일부 철자를 틀린 경우만 가능)</p><p>- 수취국가 (송금시 입력 항목이 같은 국가만 변경 가능)</p><p>- 미국, 캐나다로 송금 하신 경우 주(State) 정보</p><p>- 멕시코로 송금 하신 경우 주(State) / 도시(CIty) 정보</p><p><br></p><p>※ 수취인영문명에 띄어쓰기가 필요하신 경우 송금 후 고객센터로 연락주시면 변경 가능합니다</p>",
				"<p>머니허브 해외송금은 분쟁,소송 또는 OFAC제재대상국가, UN제재대상국가로 송금하거나, 금융제재자의 해외송금으로 의심되는 경우 이를 사전에 확인하고 검토해야하는 의무가 있으며 이를 위해 해외송금정보를 확인하고 검토하는 업무를 수행하고 있습니다. </p><p>검토를 요청하시면 최대한 신속하게 검토할 수 있도록 노력하고 있습니다. 일부 거래의 경우 송금 정보의 확인을 위하여 고객님께 별도 연락을 취할 수도 있습니다.&nbsp; </p>",
				"<p>머니허브 앱내 '전체메뉴' 상단의 이름을 눌러 '내정보'에 등록된 영문명을 확인해주세요.</p><p>머니허브에서 WU빠른해외송금받기를 신청하실 때 고객님의 영문명은 고객정보에 입력되어 있는 영문명을 사용합니다.</p><p>WU빠른해외송금 받기 메뉴에 진입하셔서 실제 거래를 하시기 전에 고객정보상의 한글명과 영문명이 일치하지 않는다면 착오지급 방지를 위하여 받기 거래가 거절됩니다.&nbsp;</p><p>따라서 WU빠른해외송금 받기 거래를 수행하시려면 고객정보의 영문명을 한번 더 확인 하셔야합니다. </p><p>송금인의 실수로 고객님의 영문명을 잘못 기재한 경우 송금인이 송금한 해외취급점에 수정요청을 하거나 취소 후 재송금 하여야 하니 이점 유념하시기 바랍니다.</p>",
				"<p>아래와 같이 WU빠른해외송금 받기 필요정보가 모두 일치하게 입력되어야 수취가 가능합니다. <br>&nbsp; - 수취인 영문명<br>&nbsp; - 송금인 영문명<br>&nbsp; - MTCN (10자리숫자)<br>&nbsp; - 송금국가<br>&nbsp; - 송금금액</p><p></p><p><p>※ 유의사항<br>- 해외 웨스턴유니언 취급점에서 수취국가를 \"대한민국\"으로 지정한 송금만 수취 가능합니다.<br>- 송금인이 지정한 본인만 수취가능합니다. (수취인 영문명과 한글명이 일치해야 함)<br>- WU빠른해외송금 받기는 동일자 동일인&nbsp;미화 7천불만 수취가능합니다.<br>- 수취시에는 별도 수수료는 없습니다.<br>- 수취 신청 시점의 전신환 매입율이 적용되어 원화로 지급됩니다. (환율우대 없음)</p><p>- USD로 수취는 불가합니다.</p><br>",
				"<p>먼저 [전체메뉴 &gt; 해외송금 거래내역&gt; 해당 해외송금상세페이지&gt; WU송금추적]을 선택하신 뒤, 하단의 '공유하기' 버튼을 통하여 카카오톡이나 메일 등 다양한 방식으로 수취인이 필요한 모든 정보를 간편하게 전달해주세요.&nbsp;</p><p>수취인은 &nbsp;<strong><font color=\"#000000\" style=\"background-color: rgb(255, 255, 0);\">'<font color=\"#000000\" style=\"background-color: rgb(255, 255, 0);\"><a href=\"https://www.moneyhub.com/app/guide/wuReceiving\" target=\"_blank\">WU빠른해외송금&nbsp;수취가이드</a></font></font></strong><font color=\"#000000\">'</font>를 통해 해외송금을 받는 방법과 근처에 있는 WU취급점 위치를 빠르게 확인할 수 있습니다. 방문예정 취급점의 운영안내(Hours &amp; Info)를 통해 수취가능금액, 영업시간 등을 상세정보를 확인하거나 유선으로 문의 후 방문해 주세요.</p><p>수취인은 송금 정보를 전달 받은 이후, 언제든 WU취급점을 방문하여 돈을 찾을 수 있습니다. (반드시, WU취급점 방문 시, 공유 받은 송금 정보와 본인의 신분증을 지참해야 합니다.)<br></p>",
				"<p>WU빠른해외송금을 보내실 때에는 수취인의 영문명과 수취할 국가를 알고 계셔야 송금이 가능합니다. (단, 미국, 캐나다, 멕시코, 남아공의 경우 추가입력항목 존재)<br>- <b>송금통화</b> : 송금은 수취국가와 상관없이 오직 USD로만 가능하며 수취인은 수취시에 USD로 수취하거나 수취당시 환율을 적용하여 현지통화로 수취할 수 있습니다. (수취 국가 및 WU취급점 정책에 따라 상이할 수 있음)<br>- <b>송금 한도</b> : 동일자 동일인 기준 미화 7천불 이내 ( 수취 국가 및 WU취급점 정책에 따라 상이할 수 있으며 WU사의 준법정책에 의한 한도가 발생할 수 있습니다. )<br>- <b>입력 정보</b> : 수취국가, 수취인 영문명(수취시에 신분증을 확인 하므로 가급적 신분증 상의 영문명을 입력하시기 바랍니다.) </p><p>&nbsp; ※ 영문명의 일부 철자를 잘못 입력한 경우에는 변경 가능합니다. (단, 머니허브 고객센터로 요청 필요)</p><p>&nbsp; ※&nbsp;추가입력필요 국가 : 지급지 state/city :미국, 캐나다, 멕시코 // 질문/답변 : 남아공<br>- <b>송금 수수료</b> : 송금액 미화 3천불 이하 =&gt; $6 // 송금액 미화 3천불&nbsp;초과 =&gt;$12 (그외 별도 수수료 없음)<br>- <b>환율우대</b> : 없음<br>- <b>수취인</b> :&nbsp;개인(미성년자 불가)만 가능하며 <span style=\"background-color: rgb(255, 255, 0);\">법인으로 송금은 불가</span>합니다.</p>",
				"<p>글로벌 해외송금사인 웨스턴 유니온 (WU, Western Union)사와 제휴하여 운영하는 해외송금 방식입니다.&nbsp;</p><p>수취인의 영문명, 수취국가 등 간단한 정보 입력만으로 해외송금이 가능하며, 송금 신청 후 약 1분 내외로 수취도 할 수 있습니다. </p><p>또한 전세계 WU&nbsp;취급점을 통해 보낸 송금도 모바일앱에서 간편하게 바로 받을 수 있습니다. &nbsp;</p>",
				"<p>네, 해외에서도 해외송금 서비스 이용 가능하나, 반드시 사전 주의사항을 확인 부탁드립니다.</p><p></p><p>기본적으로 해외송금 거래시 요청되는 인증은 아래와 같습니다.</p><p>&nbsp; - 원화 기준 1천만원 초과 송금시에는 OTP 추가 인증 (※별도로 OTP이용금액설정을 하신 경우 해당 설정에 따라 적용됩니다.)</p><p>&nbsp; - 기기 사양에 따라 100 만원 초과 송금시 ARS 인증 (등록된 국내 전화번호만 가능)</p><p>&nbsp; ※ 해외에서 사용하시는 경우 기기사양과 별개로 거래 유형에 따라(거래패턴의 변경, 의심거래 등) ARS 인증이 요청 될 수 있으며 인증이 되지 않는 경우 해외송금 거래가 불가할 수 있습니다.</p>",
				"<p>인도 송금시 은행코드는 반드시 IFSC Code 영문/숫자 11자리를 넣으셔야 합니다.</p><p>&nbsp;</p><p>IFSC Code is required by moneyhub when sending INR to the India. <br></p>",
				"<p>호주 송금시 은행코드는 BSB Number 숫자 6자리 입니다. </p><p></p><p>BSB Number is required by moneyhub when sending AUD to the Australia. <br></p>",
				"<p>뉴질랜드 송금시 은행코드는 National Clearing Code 숫자 6자리 입니다.</p><p>뉴질랜드 계좌번호(15자리 혹은 16자리)는 다음과 같이 구성되어 있습니다.&nbsp;<br>&nbsp; National Clearing Code 6자리 + 계좌번호 9자리 혹은 10자리<br>&nbsp; ex) 계좌번호 :&nbsp; <strong>011848</strong>&nbsp;1234567890 (16자리)<br>&nbsp; - 은행코드(National Clearing code) :<strong> 011848</strong><br>&nbsp;- 송금 시&nbsp;입력&nbsp;계좌번호: 1234567890 (10자리)</p><p>&nbsp;계좌번호가 9자리이면 끝 2자리 앞에 숫자 ‘0’을 넣어서 10자리를 만들어서 입력합니다.<br>&nbsp; ex ) 계좌번호 : <strong>011848</strong>&nbsp;123456789 (15자리)<br>&nbsp; - 은행코드(National Clearing code) : <strong>011848</strong><br>&nbsp; - 송금 시&nbsp;입력 계좌번호: 1234567089 (숫자 ‘0’을 추가하여 10자리로 입력)</p><p>&nbsp;</p><p>National Clearing Code is required by moneyhub when sending NZD to the New Zealand.<br></p>",
				"<p>홍콩송금시 은행코드는 Clearing Code and Branch Code 입니다. 숫자 6자리로 구성되어 있으며, 영문은 포함되지 않습니다.  <br><br>Clearing Code and Branch Code are required by moneyhub when sending HKD to the Hongkong.&nbsp;<br></p>",
				"<p>싱가포르 송금시 은행코드는 ACH Bank Code and Branch Code (IBG Bank-Branch Code) 숫자 7자리 입니다. </p><p>*&nbsp;FAST/GIRO에서 사용되는 은행코드를 입력시 반환(퇴결)될 수 있습니다.<br></p><p></p><p><br>ACH Bank Code and Branch Code (IBG Bank-Branch Code) is required by moneyhub when sending SGD to the Singapore. <br>&nbsp;* Bank code and Branch code used in FAST/GIRO is not available.<br></p>",
				"<p>머니허브에서 영국으로 송금보내실 경우 은행코드(Sort Code)와 계좌번호가 필요하며, IBAN CODE만 알고계신 경우 IBAN CODE를 통해 은행코드(Sort Code)와 계좌번호를 확인하실 수 있습니다. 단, Sort Code를 이용한 ACH송금이 가능한 은행인지 사전에 확인하여 주시기 바랍니다.</p><p> </p><p>※ 영국 IBAN CODE 체계는 다음과 같이 구성되어있습니다. </p><p>GB + 숫자2자리 + BIC영문 4자리 + Sort Code숫자6자리 + 계좌번호 숫자8자리 </p><p>ex) IBAN CODE: GB 26 MIDL 400515 12345678</p><p>&nbsp; 은행코드(Sort Code): 400515</p><p>&nbsp; 계좌번호: 12345678<br></p>",
			
				"<p>캐나다 은행코드는 Canada Routing Number (혹은 EFT Routing Number)&nbsp; 숫자 9자리입니다.</p><p></p><p>Canda Routing Number는 아래와 같이 구성되어 있습니다. <br>&nbsp;숫자 '0' + bank code 3자리 + branch code 5자리<br>ex)&nbsp; bank name : Citizen Bank of Canada<br>&nbsp; branch name : 401-815 West Hastings Street<br>&nbsp; bank code(=Financial institution number) : 309<br>&nbsp; branch code :17500<br>&nbsp; Routing number : 030917500<br></p><p>*Transit Number(숫자8자리)와 SWIFT Code는 처리불가합니다.<br>Transit Number(=MICR Number)는 Branch code 5자리 + Bank code 3자리로, 위 예시의 Citizen Bank의 Transit Number는 \"17500309\"입니다.</p><p> </p><p>* 유의사항<br>Transit Number(숫자8자리)와 SWIFT Code는 머니허브 해외송금 처리가 불가합니다.<br>계좌번호는 반드시 CAD 계좌번호여야 하며, USD 계좌번호인 경우 반환(퇴결)될 수 있습니다. </p><p></p><p>The Canada Routing Number, a.k.a EFT Routing Number, is required by moneyhub when sending CAD to the Canada. <br>The Canadian Routing Number is a nine digits numerial codes used to identify an individual branch of a financial institution in Canada.&nbsp; <br>If&nbsp; an ABA Routing Number other than the Canada Routing Number is entered in for transfers to the Canada, the remittance may be denied and returned.&nbsp; <br></p><p>* Transit Number(= MICR Number) and SWIFT code are also not used.</p><p></p>",
				"<p><b>Electronic Routing Number</b>는 전자적 거래<b>(direct deposit, automatic payment, ACH transfer)</b>에서 사용되는 은행코드이며, <b>ACH Routing Number</b>라고도 합니다. 미국에서 사용하는 은행코드<b>(Routing Number)</b>는 거래종류에 따라 구분되며, 미국으로 송금 시 <b>Electronic Routing Number</b>외 별도의 <b>Routing Number</b>를 입력하실 경우, 송금이 반환(퇴결)될 수 있습니다. <br><br>" + 
				"<b>The Electronic Routing Number, a.k.a ACH Routing Number, is a bank code used for electronic transactions such as direct deposit, automatic payment, ACH transfer, etc. in the U.S. The Routing Number may differ by the type of transaction.<br>" + 
				"If a Routing Number other than the Electronic Routing Number is entered in for transfers to the U.S., the remittance may be denied and returned.</b><br>" + 
				"※The Electronic Routing Number is required by moneyhub when sending USD to the U.S.</p>",
				"<p>외화예금상품은 제공하고있지 않습니다.</p>",
				"<p>해외송금 실행시에는 별도의 서류가 필요하지 않습니다. 단, 거래외국환은행 지정 등록이 선행되어야 하며&nbsp;지정(연장)등록신청시 서류가 필요합니다.</p>",
				"<p>IBAN(International Bank Account Number) CODE는 수취계좌 고유번호를 말하는 것으로, 유럽국가 송금의 자금결제 자동화를 위해 유럽국가연합소속의 은행들에서 사용하고있습니다. 따라서 유럽지역으로 해외송금시 IBAN CODE가 수취계좌번호란에 필수로 기재되어야합니다.</p>",
				"<p>수취은행을 식별할수 있는 bank code 중 하나로 자동화 처리를 목적으로 금융기관을 코드화하여 SWIFT라는 표준화기구에서 금융기관 앞에 부여한 고유번호입니다. 즉, 해외 송금을 위해서 외국의 지급은행명을 8자리 혹은 11자리로 구성하여 코드화시킨 것이 SWIFT 코드이며, BIC 코드(Bank Identifier Code)라고도 불립니다.</p>",
				"<p>매월 / 2개월 / 3개월 로 지정 가능합니다.</p>",
				"<p>출금계좌, 송금주기, 이체일, 금액만 변경 가능하며, 지정 사유 변경은 불가합니다. 또한, 지정사유별로 금액변경에 제한이 있을 수 있습니다.<br />자동송금이체 당일에는 변경이 불가합니다.</p>",
				"<p>머니허브 해외송금은 365일 24시간 가능하기 때문에 이체일이 휴일이라도 송금 발송 됩니다.</p>",
				"<p>신청일 당일은 이체일로 지정이 불가합니다. 송금지정일 전일까지 신청해 주셔야합니다.</p><p>또한 해외자동송금 종료일은 이체일로 포함되지 않습니다. 마지막 이체일과 종료일이 동일하면 이체 불가하니 참고 부탁드립니다.</p><p> </p>",
				"<p>해외송금 메뉴의 신청 화면에서 송금국가와 금액을 선택하시면 현재기준의 적용환율을 확인하실 수 있습니다.</p><p><br></p><p>※ 환율은 실시간으로 변동하기때문에 신청화면의 환율과 송금 정보 입력 후 실제 송금시 환율이 달라질 수 있습니다. 송금 정보 입력 후 \"송금하기\"버튼을 선택하기 전에 환율 및 금액을 다시 한번 확인하시기 바랍니다.</p><p> </p>",
				"<p>외환매입증명서는 원본 1회 발급이 기본 정책이기 때문에 최초 1매만 발급 가능합니다. 사본으로 재발급을 원하실 경우 고객센터(1599-3333)에서 FAX 및 이메일로 발급 가능합니다.&nbsp;</p>",
				"<p>건당 미화 5천불 이하 송금인 경우 지정없이 가능합니다. <br>건당 미화 5천불 초과 송금 시 유학생 지정을 위한 서류가 지연되신다면 거주자의 지급증빙서류 미제출 송금 사유로 지정하여 우선처리 가능합니다.</p>",
				"<p>해외유학이란 외국의 교육기관, 연구기관 또는 연수기관에서 6월 이상의 기간에 걸쳐 수학하거나 학문, 기술연구 또는 연수하는 것을 말합니다.<br />국외연수라 함은 외국의 교육기관, 연구기관 또는 연수기관에서 6월 미만의 기간에 걸쳐 수학하거나 기술을 연구,연수(기술관련 정규기관 및 연수기관에서의 연구 또는 연수를 말하며 초청연수를 포함) 하는 것을 말합니다.</p>",
				"<br /><p>일반해외 여행자는 해외체재자 및 유학생에 해당하지 아니하는 거주자인 해외여행자로 외국에서 체재기간이 30일이하 여행자를 의미합니다.  <br /> <br />해외체재자는 다음에 해당하는 외국에 체재하는 자로서 체재기간이 30일을 초과하는 자입니다.<br />-  상용, 문화, 공무 및 기술훈련을 목적으로 외국에 체재하는 자. 다만, 국내 거주기간이 5년 미만인<br /> 외국인 거주자는 제외함<br />-  6월 미만의 기간에 걸쳐 국외연수를 목적으로 외국에 체재하는 자. 다만, 국내 거주기간이 5년 미만인 <br /> 외국인 거주자는 제외함<br />-  국내기업 및 연구기관 등에 근무하는 자로서 그 근무기관을 업무를 위하여 외국에 체재하는 국내거주기간<br />5년 미만인 외국인거주자와 외국의 영주권 또는 장기체류자격을 취득한 재외국민의 경우 모두 해외체재자에<br /> 해당함<br /><br />유학생은 외국의 교육기관·연구기관 또는 연수기관에서 6월 이상의 기간에 걸쳐 수학하거나 학문·기술을 연구 또는<br />연수할 목적으로 외국에 체재하는 아래의 하나에 해당하는 자로서 6개월 미만 연수목적으로 체재하는 <br />국외연수생과 구분합니다.<br />-  영주권자가 아닌 국민 또는 국내 거주기간이 5년 이상인 외국인인 경우<br />-  위에 해당되지 않는 사람으로서 유학경비를 지급하는 부모가 영주권자가 아닌 국민인 거주자인 경우 <br /> <br /></p>",
				"<p>네.  머니허브는 미성년자의 거래가 제한되므로 부모님이 미성년자인 자녀를 유학생으로 지정등록하여 송금할 수 있습니다.<br />송금신청인: 부모 / 지정대상자: 유학생인 자녀</p>",
				"<p>해외에서 머니허브 입출금 계좌로 송금 받으실 수 있습니다. </p><p>수취가능통화는<strong> </strong><b>USD, EUR, JPY, GBP, CAD, AUD, NZD, HKD, SGD, CHF, CNY, DKK, SEK, NOK</b>&nbsp;이며, 송금대금은 원화 환전하여&nbsp;입금됩니다.</p><p>수취가능통화 외 통화로 송금보내실 경우, 송금이 반환될 수 있습니다. (예: <font color=\"#ff0000\"><b>해외에서 KRW(원화)로 송금 시 수취불가</b>)</font></p><p><br>또한 해외에서 보낸 송금자금을 받으실 때에는 송금 사유 확인을 위하여&nbsp;담당부서에서 <font color=\"#ff0000\" style=\"\">개별 연락</font>을 드려 <font color=\"#ff0000\">사유 확인 및 증빙서류제출을 요청</font>드릴 수 있습니다. (연락 미수신시 송금이 반환 될 수 있습니다.)<br><br>※ 해외에서 머니허브 계좌로 수취할 때 해외송금인에게 제공해야하는 정보<br>1. 수취계좌번호: 머니허브 입출금 계좌번호 <br>2. 수취인명: 계좌 예금주 영문명 ※수취인명이 예금주 <font color=\"#ff0000\">한글명</font>과 <font color=\"#ff0000\">영문명</font>이 일치하지 않을 경우 송금이 반환될 수 있습니다.<br>3. 본인 휴대폰번호<strong>(필수 기재 요청)</strong> ※연락처 미 기재시 송금이 반환될 수 있습니다.<br>4. 은행명:  CITIBANK KOREA INC - MONEYHUB (SWIFT CODE&nbsp;: CITIKRSX<b>KAK</b>)&nbsp; ※CITIKRSX만 기재시 송금이 반환되며, 해당 CODE를 찾을수 없는 경우 적요에 \"<span style=\"background-color: rgb(255, 255, 0);\">MONEYHUB</span>\" 로 기재부탁드립니다.</p><p>5. 은행주소:  24 CHEONGGYECHEON-RO, JUNG-GU, SEOUL, KOREA</p><p><br>※ 머니허브의 타발송금은 한국씨티은행과 제휴하여 처리됩니다.</p>",
				"<p> -소액송금 : 별도 통보 없음<br /> -유학생송금 : 연간 누계액이 미화 10만불을 초과하면 외국환거래규정 제4-8조에 근거하여 국세청 및 금융감독원 자동 보고대상이 됩니다.<br /> -증여성송금 : 송금 건별 내역에 대하여 관세청 통보, 누적금액 미화 1만불 초과 송금시 국세청 및 금융감독원 자동 보고대상이 됩니다.</p>",
				"<p>해외송금 신청시 입력한 정보의 오류, 해외 수취인 계좌의 해지 혹은 적정성(입출금 계좌가 아닌 saving 계좌나 대출계좌로 송금 불가), 해외수취인 거절 등의 사유로 인해 퇴결처리될 수 있습니다. 자세한 내용은 고객센터(1599-3333)로 문의주시기 바랍니다.</p>",
				"<p>미화 기준 5천불 초과 송금시 송금 목적에 따라 해외송금을 보낼 외국환은행을 지정하는 행위입니다.<br>외국환거래법령에 의거 외국환거래 중 관리가 필요한 거래 등은 하나의 외국환 은행을 지정하여 거래하여야 하며, 이는 외화의 과다 유출을 방지하고 외환관리의 효율화를 기하기 위한 것입니다.</p>",
				"<p>미화 기준 5천불 초과 금액을 송금하실 때에는 반드시 머니허브로&nbsp;거래외국환은행 지정등록이 선행되어야합니다. <br>단, 미화 5천불 이하 금액은 지정등록이 필요치 않습니다.</p>",
				"<p>건당 송금금액 5천불 초과 송금 중 경조금, 생활비 등 증빙서류를 별도로 준비하기 어려운 증여성 송금입니다. <br>연간 미화 5만불이내 한도에서 증빙서류없이 거래외국환은행 지정 후 송금하실 수 있습니다.</p>",
				"<p>  머니허브 해외송금은 송금국가별로 소요기간이 다르며 국내 및 해외, 주말과 공휴일을 제외하고 아래와 같이 예상할 수 있습니다.&nbsp;</p><p>- 소요기간 : 약 3~5일<br></p><p>(현지 국가 및 은행 사정에 따라 변동 될 수 있습니다.)</p>",
				"<p>1. 수취계좌영문명, 2. 수취은행 bank code, 3. 수취 계좌번호, 4.수취인주소 <br>각 국가별 세부사항이 존재하므로 국가별 안내사항을 참고하시기바랍니다.</p>"};

		return contents;
	}
	
	
	
	
	
}
