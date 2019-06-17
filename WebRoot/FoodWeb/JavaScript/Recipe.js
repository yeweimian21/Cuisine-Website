
var recipeList;
var pageCount;

$(document).ready(function() {
	getRecipeNav();
});

function getRecipeNav() {
	$.ajax({
		url:		"getRecipeNav",
		type:		"post",
		success:	loadRecipeNav
	});
}

//加载菜单
function loadRecipeNav(data) {
	var group=$("#accordion2");
	group.empty();
	var htmlContent="";
	var object;
	var list;
	for(var i=0;i<data.length;i++){
		object=data[i];
		list=object.dataList;
		
		htmlContent+="<div class='panel panel-default'>"+
						"<div class='panel-heading' data-toggle='collapse'"+
								"data-parent='#accordion2' href='#collapse"+i+"'>"+
							"<a class='accordion-toggle'>"+
								object.title+
								"<span class='glyphicon glyphicon-triangle-bottom pull-right' aria-hidden='true'></span>"+
							"</a>"+
						"</div>"+
						"<div id='collapse"+i+"' class='panel-collapse collapse' style='height: 0px;'>"+
							"<div class='panel-body'>"+
								"<ul class='nav nav-pills nav-stacked'>";
								for(var j=0;j<list.length;j++){
									htmlContent+="<li>"+
										"<a class='recipeItem' href='get"+object.name+"Recipe?"+object.name+"Id="+list[j][object.name+"Id"]+"' target='mainpage'>"+
											list[j][object.name+"Name"]+
										"</a>"+
									"</li>";
								}
								htmlContent+="</ul>"+
							"</div>"+
						"</div>"+
					"</div>";
	}
	group.append(htmlContent);
	$("[class='recipeItem']").click(function(){
		getRecipeList($(this).attr("href"));
		return false;
	});
	
}

//加载菜谱列表
function getRecipeList(url){
	$.ajax({
		url:		url.toString(),
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