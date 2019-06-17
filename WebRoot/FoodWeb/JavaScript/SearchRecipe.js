
var recipeList;
var pageCount;

$(document).ready(function() {
	getRecipeList();
})

function getRecipeList(){
	$.ajax({
		url:		"getSearchRecipe",
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