
var recipeList;
var pageCount;

//该JavaScript方法用来获取url中的参数，即该行的对象的id
function getUrlParam(urlParam){
    var reg=new RegExp("(^|&)"+urlParam+"=([^&]*)(&|$)");//构造一个含有目标参数的正则表达式对象
    var r=window.location.search.substr(1).match(reg);  //匹配目标参数
    if(r!=null){                    //返回参数值
        return unescape(r[2]);
    }
    return null;
}

$(document).ready(function() {
	var materialId=getUrlParam("materialId");
	getRecipeList(materialId);
})

function getRecipeList(materialId){
	$.ajax({
		url:		"getMaterialRecipe",
		data:		{
			materialId:materialId
		},
		type:		"post",
		success:	callbackRecipeList
	});	
}

function callbackRecipeList(data) {
	recipeList=data;
	pageCount=Math.ceil(data.length/5);
	loadRecipeList(data,1);			//加载菜谱列表
	loadPage(pageCount);			//加载分页
}

//加载菜谱列表
function loadRecipeList(data,pageIndex) {
	var listTag=$("#recipeList");
	listTag.empty();
	var json=data;
	var htmlContent="";
	for(var i=(pageIndex*5-5);i<pageIndex*5&&i<data.length;i++){
		var object=json[i];
		htmlContent+="<div class='media'>"+
						"<div class='media-left'>"+
        					"<a href='RecipeDetail.html?recipeId="+object.recipeId+"'>"+
        						"<img class='media-object' src='"+object.recipePicture+"' alt='...' style='width: 200px;height: 200px;'>"+
        					"</a>"+
        				"</div>"+
        				"<div class='media-body'>"+
        					"<h2 class='media-heading'>"+object.recipeName+"</h2>"+object.introduction+
        				"</div>"+
        			"</div>";
	}
	listTag.append(htmlContent);
}

//加载分页
function loadPage(count) {
	$("#page").empty();
	var html="";
	for(var i=1;i<=pageCount;i++){
		html+="<li><a href='#' class='pageIndex'>"+i+"</a></li>";
	}
	$("#page").append(html);
	$(".pageIndex").click(function(){
		var pageIndex=$(this).text();
		loadRecipeList(recipeList,pageIndex);
	});
}