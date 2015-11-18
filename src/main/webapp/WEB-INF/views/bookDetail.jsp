<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update a Book Details</title>
<c:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<c:url value="/resources/css/bootstrap-theme.min.css"
	var="bootstrapCss2" />
<c:url value="/resources/css/bookshop.css" var="bootstrapCss3" />
<link rel="stylesheet" href="${bootstrapCss}">
<link rel="stylesheet" href="${bootstrapCss2}">
<link rel="stylesheet" href="${bootstrapCss3}">
<c:url value="/resources/images/bookShop.png" var="bootstrapCss1" />
<style>
table, th, td {
	border: 0px solid black;
}
</style>
</head>
<body>
	<div class="containner">
		<!-- header -->
		<div class="row home">
			<div class="col-lg-4 center">
				<h1>
					<strong>Update Book</strong>
				</h1>
			</div>
			<div class="col-lg-4"></div>
			<div class="col-lg-4">
				<div class="col-lg-8">
					<c:if test="${pageContext.request.userPrincipal.name != null}">
						Welcome : ${pageContext.request.userPrincipal.name}
				</c:if>
				</div>
				<div class="col-lg-4">
					<a href="<c:url value="j_spring_security_logout" />">
						<button class="btn btn-primary loginbtn">Logout</button>
					</a>

				</div>
			</div>
		</div>
		<!-- Add Book -->
		<div class="row homecontent">
			<div class="col-lg-4 center">
				<img class="imageSize" src="${bootstrapCss1}" alt="Book Shop">
			</div>
			<div class="col-lg-4">
				<form:form commandName="book" action="../books/${book.id}"
					method="post">
					<form:errors path="*" cssClass="errorblock" element="div" />

					<table>
						<tr>
							<td>Title:</td>
							<td><form:input type="text" path="bookName"
									class="form-control" value="${book.bookName}" /></td>
							<td><form:errors path="bookName" cssClass="error" /></td>

						</tr>
						<tr>
							<td>Author:</td>
							<td><form:input type="text" path="author"
									class="form-control" value="${book.author}" /></td>
							<td><form:errors path="author" cssClass="error" /></td>

						</tr>
						<tr>
							<td>Price:</td>
							<td><form:input type="text" path="price"
									class="form-control" value="${book.price}" /></td>
							<td><form:errors path="price" cssClass="error" /></td>
						</tr>
						<tr>
							<td>Quantity:</td>
							<td><form:input type="text" path="quantity"
									class="form-control" value="${book.quantity}" /></td>
							<td><form:errors path="quantity" cssClass="error" /></td>
						</tr>
					</table>
					<br />
					<input type="submit" value="update" class="btn btn-success" />
				</form:form>
				<br />
				<form action="delete?bookId=${book.id}" method="post">
					<button type="submit" class="btn btn-success">Delete</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>