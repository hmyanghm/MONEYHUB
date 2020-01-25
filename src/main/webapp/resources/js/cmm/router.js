"use strict"
function Session(x){	
	sessionStorage.setItem('ctx', x);
	sessionStorage.setItem('js', x + '/resources/js');
	sessionStorage.setItem('css', x + '/resources/css');
	sessionStorage.setItem('img', x + '/resources/img');
	sessionStorage.setItem('jsp',x +'/resources/jsp');
	var deal = new Object() // 송금 객체
	sessionStorage.setItem('deal',JSON.stringify(deal));
	return{
		ctx : ()=>{ return sessionStorage.getItem('ctx');},
		js : ()=>{ return sessionStorage.getItem('js');},
		css : ()=>{ return sessionStorage.getItem('css');},
		img : ()=>{ return sessionStorage.getItem('img');},
		jsp : ()=>{return sessionStorage.getItem('jsp');},
		deal : ()=>{return JSON.parse(sessionStorage.getItem('deal'))},
		cusInfo : ()=>{return JSON.parse(sessionStorage.getItem('cus'))}
	}
}

