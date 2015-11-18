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
				<form name='loginForm'
					action="<c:url value='j_spring_security_check' />" method='POST'>
					<div class="col-lg-10">
						<c:if test="${not empty error}">
							<div class="error">${error}</div>
						</c:if>
						<c:if test="${not empty msg}">
							<div class="msg">${msg}</div>
						</c:if>
					</div>
					<div class="form-group col-lg-5">
						<label for="user" class="control-label">Username</label><br /> <input
							type="text" class="form-control" name='username'
							placeholder="Username" required>
					</div>

					<div class="form-group col-lg-5">
						<label for="pass" class="control-label">Password</label><br /> <input
							type="password" class="form-control" name='password'
							placeholder="Password" required>
					</div>

					<div class="form-group col-lg-2">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" /> <input
							class="btn btn-primary loginbtn" name="submit" type="submit"
							value="submit" />
						<!-- 					<input type="submit" class="btn btn-primary loginbtn" name="submit">Login</input> -->
					</div>
				</form>
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
						<input class="btn btn-success" name="submit" type="submit"
							value="submit" />
					</div>
				</form>
			</div>

		</div>
	</div>


</body>
</html>
