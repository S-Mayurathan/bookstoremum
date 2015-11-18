<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
<meta charset="utf-8">
<title>Book Shop</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="resources/css/bookshop.css">
<!-- <script type="text/javascript" src="resources/js/jquery-2.1.4.min.js"></script> -->
<!-- <script type="text/javascript" src="resources/js/bootstrap.min.js"></script> -->

</head>
<body>
	<div class="containner">
		<!-- header -->
		<div class="row home">
			<div class="col-lg-6 center">
				<h1>
					<strong>Book SHOP</strong>
				</h1>
			</div>
			<div class="col-lg-6">
				
			</div>
		</div>
		<!-- Sign Up -->
		<div class="row homecontent">
			<div class="col-lg-6 center">
				<img class="imageSize" src="resources/images/bookShop.png"
					alt="Book Shop">
			</div>
			<div class="col-lg-6">
				<form method="POST" action="signup">
					<h2>
						<strong>Sign Up</strong>
					</h2>
					<div class="form-group col-lg-6">

						<label for="email">Username</label> <input type="text"
							class="form-control" name="username"
							placeholder="Username" required>
					</div>
					<div class="form-group col-lg-6 clear">
						<label for="newpassword">Password</label> <input type="password"
							class="form-control"  name="password"
							placeholder="New password" required>
					</div>
					<div class="form-group col-lg-6 clear">
						<label for="email">Email address</label> <input type="email"
							class="form-control" name="email" placeholder="Email"
							required>
					</div>
					<div class="form-group col-lg-6 clear">
						<label> <input type="checkbox" name="authorities" value="ROLE_ADMIN">ADMIN</label>
						<label> <input type="checkbox" name="authorities" value="ROLE_USER">USER</label>
					</div>
					<div class="form-group col-lg-6 clear">
						<input class="btn btn-success" name="submit" type="submit"
							value="submit" />
				</form>
			</div>

		</div>
	</div>

	</div>

</body>
</html>
