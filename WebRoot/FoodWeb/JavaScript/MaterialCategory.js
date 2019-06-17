$(document).ready(function() {
	getMaterialCategory();
});

function getMaterialCategory() {
	$.ajax( {
		url : "getMaterialCategory",
		type : "post",
		success : loadMaterialNav
	});
}

function loadMaterialNav(json) {
	var nav = $("#materialTag");
	var content = $("#materialContent");
	nav.empty();
	content.empty();
	var data = json;
	var html1 = "", html2 = "";
	for ( var i = 0; i < data.length; i++) {
		var materialCategory = data[i].materialCategory;
		if (i == 0) {
			html1 += "<li role='presentation' class='active' id='firstTag'><a href='#material"
					+ materialCategory.materialCategoryId
					+ "' aria-controls='material"
					+ materialCategory.materialCategoryId
					+ "' role='tab' data-toggle='tab'>"
					+ materialCategory.materialCategoryName + "</a></li>";
		} else {
			html1 += "<li role='presentation' class=''><a href='#material"
					+ materialCategory.materialCategoryId
					+ "' aria-controls='material"
					+ materialCategory.materialCategoryId
					+ "' role='tab' data-toggle='tab'>"
					+ materialCategory.materialCategoryName + "</a></li>";
		}
	}
	for ( var i = 0; i < data.length; i++) {
		var materialList = data[i].material;
		if (materialList != "") {
			html2 += "<div role='tabpanel' class='tab-pane' id='material"
					+ materialList[i].materialCategoryId + "'>";
			html2 += "<table class='table'>";
			for ( var j = 0; j < materialList.length; j++) {
				if (j % 6 == 0) {
					html2 += "<tr>";
				}
				html2 += "<td class='col-lg-2'>"
						+ "<a href='MaterialRecipe.html?materialId="
						+ materialList[j].materialId
						+ "'>"
						+ "<button type='button' class='btn btn-primary col-lg-12'>"
						+ materialList[j].materialName + "</button>" + "</a>"
						+ "</td>";
				if (j % 6 == 5) {
					html2 += "</tr>";
				}
			}
			html2 += "</table>";
			html2 += "</div>";
		} else {
			html2 += "<div role='tabpanel' class='tab-pane' id='material" +
					+data[i].materialCategory.materialCategoryId + "'>";
			html2 += "<table class='table'><tr><td>&nbsp;</td></tr></table></div>";
		}
	}
	nav.append(html1);
	content.append(html2);
	$("#material1").attr("class", "tab-pane active");
}