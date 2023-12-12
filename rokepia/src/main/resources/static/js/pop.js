

function getJson(contentsId) {
    $.ajax({
        url: "http://localhost:9001/humuhumu?contentsId="+contentsId,
        type: "get",
        dataType: "json",
        success: function(response) {
            console.log(response);
            
            
            // 반환받은 콘텐츠
            var content = response.content;
            var data = response.location;

            var htmlContent = ""; // 새로운 HTML 내용을 저장할 변수
            // JavaScript를 사용하여 style 속성의 background-image URL 변경
	        var imageinDiv = document.querySelector('.imagein');
	        var newImageUrl = content.image; // 새로운 이미지의 경로
	
	        // background-image 속성 변경
	        imageinDiv.style.backgroundImage = 'url(' + newImageUrl + ')';
	        
	        // contents_title의 값을 변경
	        var contentsTitleElement = document.querySelector('.contents_title');
            contentsTitleElement.textContent = content.title;

            for (var i = 0; i < data.length; i++) {
                var image = data[i].image;
                var info = data[i].info;

                htmlContent +=
                    "<tr>" +
                    "<td class='TD1'>" +
                    "<img src='" + image + "'>" +
                    "</td>" +
                    "<td class='gray' text='" + info + "'>" + info + "</td>" +
                    "</tr>";
            }

            // 기존 내용을 새로운 HTML 내용으로 교체
            $("#humuBody").html(htmlContent);
        },
        error: function(xhr, status, error) {
            console.error("Error fetching data:", error);
        }
    });
}

//팝업창 로딩
function popOpen(contentsId) {
	getJson(contentsId);
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