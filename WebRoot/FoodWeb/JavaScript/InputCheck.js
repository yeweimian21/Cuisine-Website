var phoneStyle=1;
var emailStyle=1;

$(document).ready(function() {
	//name
	$("#name").focus(function() {
		$("#nameTip").text("");
	});
	$("#name").blur(function() {
		var name=$("#name").val();
		if(name==''){
			$("#nameTip").text("用户名不能为空");
		}
	});
	//password
	$("#password").focus(function() {
		$("#passwordTip").text("");
	});
	$("#password").blur(function() {
		var password=$("#password").val();
		if(password==''){
			$("#passwordTip").text("密码不能为空");
		}
	});
	//age
	$("#age").focus(function() {
		$("#ageTip").text("");
	});
	$("#age").blur(function() {
		var age=$("#age").val();
		if(age==''){
			$("#ageTip").text("年龄不能为空");
		}
	});
	//address
	$("#address").focus(function() {
		$("#addressTip").text("");
	});
	$("#address").blur(function() {
		var address=$("#address").val();
		if(address==''){
			$("#addressTip").text("地址不能为空");
		}
	});
	//phone
	$("#phone").focus(function() {
		phoneStyle=1;
		$("#phoneTip").text("");
	});
	$("#phone").blur(function() {
		var phone=$("#phone").val();
		if(phone==''){
			$("#phoneTip").text("电话不能为空");
		}
		var partten = /^\d{11}$/;
		if(!partten.test(phone)){
			phoneStyle=0;
			$("#phoneTip").text("电话格式不正确,请输入11位电话号码");
		}
	});
	//email
	$("#email").focus(function() {
		emailStyle=1;
		$("#emailTip").text("");
	});
	$("#email").blur(function() {
		var email=$("#email").val();
		if(email==''){
			$("#emailTip").text("邮箱不能为空");
		}
		var partten = /^([\.a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/;
		if(!partten.test(email)){
			emailStyle=0;
			$("#emailTip").text("邮箱格式不正确，请输入邮箱格式为**@**.com格式");
		}
	});
});

$("form").submit(function() {
	var tip="";
	var name=$("#name").val();
	var password=$("#password").val();
	var age=$("#age").val();
	var address=$("#address").val();
	var phone=$("#phone").val();
	var email=$("#email").val();
	if(name==''){
		tip+="用户名不能为空\n";
	}
	if(password==''){
		tip+="密码不能为空\n";
	}
	if(age==''){
		tip+="年龄不能为空\n";
	}
	if(address==''){
		tip+="地址不能为空\n";
	}
	if(phone==''){
		tip+="电话不能为空\n";
	}
	if(email==''){
		tip+="邮箱不能为空\n";
	}
	if(phoneStyle==0){
		tip+="电话格式错误\n";
	}
	if(emailStyle==0){
		tip+="邮箱格式错误\n";
	}
	
	if(tip==''){
		alert("操作成功");
		return true;
	}
	else{
		alert(tip);
		return false;
	}
});