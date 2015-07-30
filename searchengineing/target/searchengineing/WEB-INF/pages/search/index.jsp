<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="resource/img/1.ico" />
<title>TAILING</title>
<style type="text/css">
#kw {
	margin: 0;
	width: 521px;
	height: 20px;
	padding: 9px 7px;
	padding: 11px 7px 7px\9;
	font: 16px arial;
	border: 1px solid #d8d8d8;
	border-bottom: 1px solid #ccc;
	vertical-align: top;
	outline: none;
	position: relative;
	float: left;
}

#h_kw {
	margin: 0;
	width: 421px;
	height: 10px;
	padding: 9px 7px;
	padding: 11px 7px 7px\9;
	font: 16px arial;
	border: 1px solid #d8d8d8;
	border-bottom: 1px solid #ccc;
	vertical-align: top;
	outline: none;
	position: relative;
	float: left;
}

.s_btn {
	cursor: pointer;
	width: 102px;
	height: 30px;
	line-height: 30px;
	padding: 0;
	border: 0;
	background-color: #38f;
	font-size: 16px;
	color: white;
	position: relative;
	float: left;
}

#kw_box {
	margin-left: 10px; position : relative;
	float: left;
	position: relative;
}

#key_word {
	width: 500px;
	height: 150px;
	margin: 0 auto;
	position: relative;
	float: left;
}

a {
	text-decoration: none;
	color: -webkit-link;
}

li {
	list-style: none;
}

.box {
	margin-top: 10%;
	margin-left: 25%;
}

#nv a {
	color: #00C;
	text-decoration: underline;
	font-size: 14px;
	margin-left: 19px;
}

#nv b {
	font-size: 14px;
	margin-left: 19px;
}

.head {
	display: none;
	margin-top: -9px;
	margin-left: -8px;
	width: 105%;
	height: 36px;
	border: 1px solid #d8d8d8;
	padding-top: 10px;
}

#resmsg {
	margin-left: 30px;
	margin-top: 30px;
}

#imagebox {
	margin-left: 10px;
	position: relative;
	float: left;
}

.per {
	margin-top: 10px;
}

.name {
	font-size: 17px;
	font: oblique;
}

.contents {
	font-size: 13px;
	width: 700px;
	
	letter-spacing: 0.5px;
	line-height:1.54;
}

.st {
	height: 40px;
}
</style>
<script	src="<%=request.getContextPath()%>/resource/jquery/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#kw").focus();
		$("#kw").css("border-color","#38f")
		
		$("#h_kw").focus();
		$("#h_kw").css("border-color","#38f")
		
		$("#kw").on('focus',function(){
			$("#kw").css("border-color","#38f")
		});
		
		$("#kw").on('blur',function(){
			$("#kw").css("border-color","")
		});
		$("#h_kw").on('focus',function(){
			$("#h_kw").css("border-color","#38f")
		});
		
		$("#h_kw").on('blur',function(){
			$("#h_kw").css("border-color","")
		});
		
		function search(event){
			var code = event.keyCode;
			if(typeof(code) =='undefined'){
				code = 13;
			}
			if (code==13&& ($("#kw").val().trim()||$("#h_kw").val().trim())) {
				if(!$("#h_kw").val()){
					$("#h_kw").val($("#kw").val());
					$("#kw").val("");
				}
				$("#bd").css("display", "none");
				$("#hd").css("display", "block"); 
// 				$("#hd").css("position","fixed");
				$("#h_kw").focus();
				var data={};
				data.keyWord = $("#kw").val()|| $("#h_kw").val()
				console.log(data.keyWord)
				$.get("<%=request.getContextPath()%>/search/getmsg",data,function(rdata){
					console.log(rdata.data)
					var data  = rdata.data
					var ht=''
					for(var i=0 ;i<data.length;i++){
						ht+='<li><div class="per name"><a href='+data[i].uri+' target="_blank">'+data[i].name+'</a></div>'+'<div class="per contents">'+data[i].shortContent+'</div>'
						+'</div></li>'
					}
					$("#resmsg").text('');
					$("#resmsg").append(ht);
				})
			}
			
			
		}
	
		$("#kw").keyup(function(event) {
				search(event)
		})
		
		$("#h_kw").keyup(function(event) {
				search(event)
		})
		
		$('#su').on('click',function(event){
			search(event)
		})
		
		
// 			$("#kw").keyup(function(event) {
// 				var code = event.keyCode;
// 				var ischar = code<90&&code>65;
// 				if (ischar) {
// 					console.log($("#kw").val());
// 					$("#h_kw").val($("#kw").val());
// 					$("#bd").css("display", "none");
// 					$("#hd").css("display", "block"); 
// 					$("#h_kw").focus();
// 				}
// 			})
			
			
			
	})
</script>
</head>
<body>
	<div class="head" id="hd">
		<div>
			<div  id="imagebox">
				<a href="<%=request.getContextPath()%>/search"><img alt="index"
					src="<%=request.getContextPath()%>/resource/img/logo_01.png"></a>
			</div>
			<div id="kw_box">
				<input type="text" class="s_ipt" name="wd" id="h_kw" maxlength="100"
					autocomplete="off">
				<input type="submit" value="TAILING" id="h_su" class="s_btn">
			</div>
		</div>
	</div>
	<div id="resmsg"></div>
	<div class="box" id="bd">
		<div style="margin-left:18%">
		<img alt="index" src="<%=request.getContextPath()%>/resource/img/logo.png">
		</div>
		<p id="nv" class="s-word-top">
			<a href="http://news.baidu.com" target="_blank">新闻</a><b>网页</b><a
				href="http://tieba.baidu.com" target="_blank">贴吧</a><a
				href="http://zhidao.baidu.com" target="_blank">知道</a><a
				href="http://music.baidu.com" target="_blank">音乐</a><a
				href="http://image.baidu.com" target="_blank">图片</a><a
				href="http://v.baidu.com" target="_blank">视频</a><a
				href="http://map.baidu.com" target="_blank">地图</a><a
				href="http://baike.baidu.com" target="_blank">百科</a><a
				href="http://wenku.baidu.com" target="_blank">文库</a><a
				href="http://www.baidu.com/more/" target="_blank">更多&gt;&gt;</a>
		</p>
		<div>
			<input type="text" class="s_ipt" name="wd" id="kw" maxlength="100"
				autocomplete="off">
			<input type="submit" value="TAILING" id="su" class="s_btn st">
		</div>
	</div>
</body>
</html>