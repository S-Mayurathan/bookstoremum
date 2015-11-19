<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Details</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="resources/css/bookshop.css">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="resources/js/bootSearch.js"></script>
</head>
<body>
	<div class="containner">
		<!-- header -->
		<div class="row home">
			<div class="col-lg-6 center">
				<h1>
					<strong>BOOK Details</strong>
				</h1>
			</div>
			<div class="col-lg-6">
				<form name='searchForm' id="searchForm">
					<div class="form-group col-lg-5">
						<label for="user" class="control-label">Search</label><br /> 
						<input type="text" class="form-control" name='search' 
							placeholder="Search" required>
							
					</div>
					<div class="form-group col-lg-2">
					 <input class="btn btn-primary loginbtn" type="submit"
							value="submit" />
					</div>
					</form>
			</div>

		</div>
		<!-- Sign Up -->
		<div class="row homecontent">

			<div class="col-lg-4 left">
				<img class="imageSize" src="resources/images/bookShop.png"
					alt="Book Shop">
			</div>
			<div class="col-lg-8">
				<h2>
					<strong>Avaliable Book Details</strong>
				</h2>
				<div class="form-group col-lg-6">

					<table class="table table-bordered">
						<thead>
							<tr>
								<th>Book Name</th>
								<th>Author</th>
								<th>Prize</th>
								<th>SHOP</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="book" items="${books}">
								<tr>
									
									<td>${book.bookName}</td>
									<td>${book.author}</td>
									<td>&#36; ${book.price}</td>
									<td><a href="#">Shop</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

		</div>
	</div>


</body>
</html>