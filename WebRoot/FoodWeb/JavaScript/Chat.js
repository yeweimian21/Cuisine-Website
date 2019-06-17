
var chatList;
var pageCount;

$(document).ready(function() {
	getChatList();
})

function getChatList(){
	$.ajax({
		url:		"getChatList",
		type:		"post",
		success:	callbackChatList
	});	
}

function callbackChatList(data) {
	chatList=data;
	pageCount=Math.ceil(data.length/5);
	loadChatList(data,1);			//加载菜谱列表
	loadPage(pageCount);			//加载分页
}

//加载菜谱列表
function loadChatList(data,pageIndex) {
	var listTag=$("#chatList");
	listTag.empty();
	var json=data;
	var htmlContent="";
	for(var i=(pageIndex*5-5);i<pageIndex*5&&i<data.length;i++){
		var object=json[i];
		var user=object.user;
		var chat=object.chat;
		var picture=object.picture;
		htmlContent+="<div class='panel panel-default'>"+
        				"<div class='panel-body'>"+
        					"<h2>"+user.userName+"</h2>"+
        					"<p>"+chat.chatContent+"</p>"+
        					"<div class='row'>";
		for(var j=0;j<picture.length;j++){
			htmlContent+="<div class='col-lg-3 col-xs-6 col-md-3'>"+
								"<a href='#' class='thumbnail'>"+
									"<img style='width:100%;height:200px;' src='"+picture[j].chatPicture+"'>"+
								"</a>"+
							"</div>";
		}
		htmlContent+="</div></div></div>";
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
		loadChatList(chatList,pageIndex);
	});
}