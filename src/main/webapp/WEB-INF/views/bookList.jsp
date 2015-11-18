<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Books List</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="resources/css/bookshop.css">
<style>
table, th, td {
	border: 1px solid black;
	text-align: "center"
}
</style>

</head>
<body>
	<div class="containner">
		<!-- header -->
		<div class="row home">
			<div class="col-lg-4 center">
				<h1>
					<strong>Book List</strong>
				</h1>
			</div>
		</div>
		<div class="row homecontent">
			<div class="col-lg-4 center">
				<img class="imageSize" src="resources/images/bookShop.png"
					alt="Book Shop">
			</div>
			<div class="col-lg-6">
				<a href="addBook"> <input class="btn btn-success"
					value="Add a new Book" /></a> <br /> <br />
				<table style="width: 100%">
					<tr>
						<th>Title of the Book</th>
						<th>Author</th>
						<th>Unit Price</th>
						<th>Total Quantity</th>
						<th>Option</th>
					</tr>
					<c:forEach var="book" items="${books}">
						<tr>
							<td>${book.bookName}</td>
							<td>${book.author}</td>
							<td>${book.price}</td>
							<td>${book.quantity}</td>
							<td align="center"><a href="books/${book.id}"><input
									class="btn btn-success" value="edit" /></a></td>
						</tr>
					</c:forEach>
				</table>

			</div>
		</div>
	</div>
</body>
</html>