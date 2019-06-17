
$(document).ready(function(){
	getIndexInformation();
});

function getIndexInformation() {
	$.ajax({
		url:		"getRecommendationRecipe",
		type:		"post",
		success:	loadRecommendation
	});
	$.ajax({
		url:		"getLatestRecipe",
		type:		"post",
		success:	loadLatest
	});
	$.ajax({
		url:		"getHottestRecipe",
		type:		"post",
		success:	loadHottest
	});
	
}

function loadRecommendation(recommendation) {
	for(var i=0;i<3;i++){
		$("#Link"+i).attr("href","RecipeDetail.html?recipeId="+recommendation[i].recipeId);
		$("#content"+i).html("<h3>"+recommendation[i].recipeName+"</h3>");
		$("#item"+i).attr("src",recommendation[i].recipePicture);

	}
}

function loadLatest(latestRecipe) {
	var htmlContent="";
	for(var i=0;i<latestRecipe.length;i++){
		htmlContent+="<a href='RecipeDetail.html?recipeId="+latestRecipe[i].recipeId+"' style='margin-left:20px;'>"+
  						"<span class='label label-success'>"+latestRecipe[i].recipeName+"</span>"+
  					"</a>";
	}
	$("#latestContainer").empty();
	$("#latestContainer").append(htmlContent);
}

function loadHottest(hottestRecipe) {
	var hottest=$("#hottest");
	hottest.empty();
	var htmlContent="";
	var recipe;
	for(var i=0;i<hottestRecipe.length;i++){
		recipe=hottestRecipe[i];
		htmlContent+="<a href='RecipeDetail.html?recipeId="+recipe.recipeId+"'>"+
				"<div class='col-sm-6 col-md-4'>"+
        		"<div class='thumbnail'>"+
        			"<img src='"+recipe.recipePicture+"' alt='...' style='width:100%;height:200px'>"+
        			"<div class='caption'>"+
        				"<h3>"+recipe.recipeName+"</h3>"+
        				"<p style='height:50px'>"+recipe.introduction+"</p>"+
        			"</div>"+
        		"</div></div></a>";
	}
	hottest.append(htmlContent);
}