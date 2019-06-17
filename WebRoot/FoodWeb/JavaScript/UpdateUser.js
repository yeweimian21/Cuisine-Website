$(document).ready(function() {
	getUserInfo();
})

function getUserInfo() {
	$.ajax({
		url:		"getUser",
		type:		"post",
		success:	loadUserInfo
	});
}

function loadUserInfo(data) {
	var user=data;
	$("[name='userName']").val(user.userName);
	$("[name='password']").val(user.password);
	if(user.gender==0){
		$("[name='gender']").get(0).checked=true;
	}
	else{
		$("[name='gender']").get(1).checked=true;
	}
	$("[name='age']").val(user.age);
	$("[name='address']").val(user.address);
	$("[name='phone']").val(user.phone);
	$("[name='email']").val(user.email);
}