<%@page import="kr.or.ddit.lprod.model.LprodVo"%>
<%@page import="kr.or.ddit.paging.model.PageVo"%>
<%@page import="kr.or.ddit.user.model.UserVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<!-- core라이브러리를 쓸꺼니까! uri 잘 확인 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
	
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

<title>사용자 리스트</title>

<!-- LibLib(Css,js) -->
<%@include file="/common/basicLib.jsp"%>
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
						<h2 class="sub-header">사용자</h2>
						<div class="table-responsive">
							<table class="table table-striped">
								<tr>
									<th>사용자 아이디(el)</th>
									<th>사용자 이름(el)</th>
									<th>사용자 별명(el)</th>
									<th>등록일시</th>
								</tr>

								<c:forEach items="${lprodList }" var="lprod">
									<tr>
										<td>${lprod.lprod_id }</td>
										<td>${lprod.lprod_gu }</td>
										<td>${lprod.lprod_nm }</td>
										<td></td>
									</tr>
								</c:forEach>
							</table>
						</div>

						<a class="btn btn-default pull-right">사용자 등록</a>

						<!-- 
							사용자수 : 105건
							페이지네이션 : 11건 
							쿼리문2개! 전체건수 조회, 해당페이지에 대해서 조회하는 쿼리!
						-->

						<div class="text-center">
							<ul class="pagination">
							
							<c:choose>
								<c:when test="${pageVo.page eq 1 }">
									<li class="disabled"><span>«</span></li>
								</c:when>
								<c:otherwise>
									<li>
									<a href=" ${pageContext.request.contextPath }/lprodpagination?page=${pageVo.page-1}&pageSize=${pageVo.pageSize}">«</a>
									</li>
								</c:otherwise>
							</c:choose>
							
							<c:forEach var="i" begin="1" end="${paginationSize }">
									<c:choose>
										<c:when test="${pageVo.page eq i}" >
											<li class="active">
												<span>${i}</span>
											</li>
									</c:when>
									<c:otherwise>
										<li>
											<a href="${pageContext.request.contextPath }/lprodpagination?page=${i}&pageSize=${pageVo.pageSize}">${i}</a>
										</li>
									</c:otherwise>	
									</c:choose>
								</c:forEach>
									
									
								<c:choose>
									<c:when test="${pageVo.page eq paginationSize }">
										<li class="disabled"><span>»</span></li>
									</c:when>
									<c:otherwise>
										<li>
										<a href=" ${pageContext.request.contextPath }/lprodpagination?page=${pageVo.page+1}&pageSize=${pageVo.pageSize}">»</a>
										</li>
									</c:otherwise>
								</c:choose>
									
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
