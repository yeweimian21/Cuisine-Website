
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
	var recipeIdParam=getUrlParam("recipeId");
	getRecipe(recipeIdParam);
})

function getRecipe(recipeIdParam) {
	$.ajax({
		url:		"getRecipeDetail",
		data:		{
				recipeId:recipeIdParam
	},
		type:		"post",
		success:	loadRecipe
	});
}

function loadRecipe(data) {
	var object=data;
	var htmlContent="";
	$("#title").html(data.recipe.recipeName);
	$("#image").attr("src",data.recipe.recipePicture);
	$("#introduction").html(data.recipe.introduction);
	
	$("#taste").html(data.taste.tasteName);
	$("#craft").html(data.craft.craftName);
	$("#costTime").html(data.costTime.costTimeName);
	$("#difficulty").html(data.difficulty.difficultyName);
	$("#category").html(data.category.categoryName);
	$("#cuisine").html(data.cuisine.cuisineName);
	
	var html="";
	$("#ingredient").empty();
	for(var i=0;i<data.ingredient.length;i++){
		html+="<tr><td>"+data.ingredient[i].ingredientName+"</td>"+
				"<td>"+data.ingredient[i].ingredientAmount+"</td></tr>";
	}
	$("#ingredient").append(html);
	html="";
	$("#method").empty();
	for(var i=0;i<data.method.length;i++){
		html+="<tr><td>"+data.method[i].stepId+"</td>"+
				"<td><img src='"+data.method[i].stepPicture+"' width='200px' height='200px'></td>"+
				"<td>"+data.method[i].stepContent+"</td></tr>";
	}
	$("#method").append(html);
	html="";
	$("#technique").empty();
	for(var i=0;i<data.technique.length;i++){
		html+="<tr><td>"+data.technique[i].techniqueId+"</td>"+
				"<td>"+data.technique[i].techniqueContent+"</td></tr>";
	}
	$("#technique").append(html);
	
}