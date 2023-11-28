//창열기
function popOpen() {

    var modalPop = $('.modal-wrap');
    var modalBg = $('.modal-bg'); 

    $(modalPop).show();
    $(modalBg).show();arguments
    //스크롤고정
	$('html').css({overflow: 'hidden' , height: 'auto' });
  
}
//창닫기
 function popClose() {
   var modalPop = $('.modal-wrap');
   var modalBg = $('.modal-bg');
	
   $(modalPop).hide();
   $(modalBg).hide();
   //스크롤고정
	$('html').removeAttr('style');
}