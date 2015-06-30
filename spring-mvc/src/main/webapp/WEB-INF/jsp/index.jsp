<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
	var path = '<%=path%>';
</script>
<!-- 自定义主页js -->
<script src="<%=path%>/resources/js/index.js"></script>
<title>mvc主页</title>
<style>
	section.title{
		color: #fff;
		background-color: #337ab7;
		border-color: #337ab7;
	}
	section.content{
		color: #31708f;
		background-color: #d9edf7;
		border-color: #bce8f1;
		border-style: solid;
		border-width: 1px;
		padding-top: 10px;
		padding-bottom: 10px;
		margin-bottom: 3px;
	}
	nav.navbar{
		margin-bottom:0px;
	}
</style>
</head>
<body>
	<nav class="navbar navbar-default">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#"> 
	        <img alt="Brand" style="height:30px;width:auto;" src="<%=path%>/resources/imgs/Brand2.png">
	      </a>
	    </div>
	  </div>
	</nav>
	<div class="container-fluid">
		<section class="row title">
			<h2>在线二维码工具</h2>
		</section>
		<section class="row content">
			<div class="col-md-5" >
				<label>输入要转换的代码</label>
				<input type="text" id="qrCode" name="qrCode">
				<button id="generateCode" class="btn btn-primary">生成</button>
			</div>
			<div class="col-md-5">
				<img id="qrCodeImage" style="height:300px;width:300px;" src="<%=path%>/utils/qrcode/default"></img>
			</div>
		</section>
	</div>
</body>
</html>