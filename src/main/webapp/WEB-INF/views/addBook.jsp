<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Book to store</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="resources/css/bookshop.css">
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
					<strong>Add a Book to store</strong>
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
					<a href="<c:url value="j_spring_security_logout" />" > 
						<button class="btn btn-primary loginbtn">Logout</button>
					</a>

				</div>
			</div>
		</div>
		<!-- Add Book -->
		<div class="row homecontent">
			<div class="col-lg-4 center">
				<img class="imageSize" src="resources/images/bookShop.png"
					alt="Book Shop">
			</div>
			<div class="col-lg-6">
				<form:form commandName="book" action="addBook" method="post" >
					<div class="alert alert-danger">
					<form:errors path="*" cssClass="errorblock" element="div" />
					</div>
					
					<table>
						<tr>
							<td>Title:</td>
							<td><form:input type="text" path="bookName"
									class="form-control" /></td>
							<td><form:errors path="bookName" cssClass="error" /></td>

						</tr>
						<tr>
							<td>Author:</td>
							<td><form:input type="text" path="author"
									class="form-control" /></td>
							<td><form:errors path="author" cssClass="error" /></td>

						</tr>
						<tr>
							<td>Price:</td>
							<td><form:input type="text" path="price"
									class="form-control" placeholder="Price" /></td>
							<td><form:errors path="price" cssClass="error" /></td>

						</tr>
						<tr>
							<td>Quantity:</td>
							<td><form:input type="text" path="quantity"
									class="form-control" /></td>
							<td><form:errors path="quantity" cssClass="error" /></td>

						</tr>
						<tr>
							<td></td>
							<td align="right"><input type="submit" value="Create"
								class="btn btn-success" /></td>
							<td></td>

						</tr>
					</table>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>