<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="kr.or.ddit.db.user.model.PageVo"%>
<%@page import="kr.or.ddit.db.user.model.UsersVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- core라이브러리를 쓸꺼니까! uri 잘 확인 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>사용자 등록</title>

<!-- LibLib(Css,js) -->
<%@include file="/common/basicLib.jsp"%>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
	$(document).ready(function(){
		$('#click').on('click',function(){
			
			
		});
	});


</script>
</head>

<body>
	<!--  header영역 -->
	<%@include file="/common/header.jsp"%>

	<div class="container-fluid">
		<div class="row">

			<!--  left영역 -->
			<%@include file="/common/left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<div class="row">
					<div class="col-sm-8 blog-main">
						<h2 class="sub-header">게시글 작성</h2>
						
						<form id="frm" class="form-horizontal" role="form" action="${pageContext.request.contextPath }/createText" method="post" 
							enctype="multipart/form-data">
						
							<div class="form-group">
								<label for="userNm" class="col-sm-2 control-label">첨부파일&nbsp;&nbsp; :  </label>
								<div class="col-sm-10">
									<input type="file" name="profile"/><button id="click" type="button">추가</button>
								</div>
							</div>
						
							<div class="form-group">
								<label for="userNm" class="col-sm-2 control-label">게시글 제목&nbsp;&nbsp; :  </label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="title"	name="title" /> 
								</div>
							</div>
							
							<div class="form-group">
								<label for="userNm" class="col-sm-2 control-label">게시글 내용&nbsp;&nbsp; :  </label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="content" name="content"  /> 
								</div>
							</div>
							
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button id="textBtn" type="button" class="btn btn-default">게시글 등록</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
