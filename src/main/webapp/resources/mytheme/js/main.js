jQuery(document).ready(function($) {

	$('#msg').html("This is updated by jQuery")

});

var imgIndex = 4;
var imgPrefix = '<img src="<c:url value="/resources/img/';
var imgSuffix = '" />" style="width: 100px; margin-left: 10px;"/>';

function appendText = getImageSrc(){
imgIndex++;
appendText = imgPrefix + $A[imgIndex] + imgSuffix;
}