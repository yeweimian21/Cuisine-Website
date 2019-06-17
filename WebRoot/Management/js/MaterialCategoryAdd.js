
$(document).ready(function() {
	getMaterialCategory();
});

function getMaterialCategory() {
	$.ajax({
		url:		"getMaterialCategoryAll",
		type:		"post",
		success:	loadMaterialCategory
	});
}

function loadMaterialCategory(data) {
	$("#table").empty();
	var html="";
	for(var i=0;i<data.length;i++){
		html+="<form action='updateMaterialCategory'><input type='hidden' name='materialCategoryId' value='"+data[i].materialCategoryId+"'>" +
					"<span style='position:absolute;left:50px;'>"+data[i].materialCategoryId+"</span>"+
					"<input  style='margin-left:400px;' type='text' name='materialCategoryName' value='"+data[i].materialCategoryName+"'></td>" +
					"<button style='margin-left:300px;' class='btn btn-default text-right' type='submit'>修改</button></form>" +
					"<a style='position:relative;left:950px;top:-32px;'href='deleteMaterialCategory?id="+data[i].materialCategoryId+"'><button class='btn btn-default'>删除</button></a>";
	}
	$("#table").append(html);
}