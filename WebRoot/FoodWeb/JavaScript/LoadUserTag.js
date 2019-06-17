$(document).ready(function(){
	$.ajax({
		url:		"getUser",
		type:		"post",
		success:	loadUser
	});
});

function loadUser(data) {
	if(data==null){
		
	}
	else{
		var user=data;
		$("#title1").replaceWith("<a  id='title1' href='UpdateUser.html' style='font-size:20px;color:#000'>欢迎您："+user.userName+"</a>");
		$("#title2").replaceWith("<a  id='title2' href='logout'>"+
  				"<button type='button' class='btn btn-link'>注销</button></a>")
	}
}