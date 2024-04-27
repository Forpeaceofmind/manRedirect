<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Course</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	margin: 0;
	padding: 0;
	font-family: Arial, sans-serif;
	background-image: linear-gradient(to bottom, #00FF00, #008000);
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container {
	text-align: center;
}

h1 {
	color: #FFFFFF;
}

h2 {
	color: #FFFFFF;
	margin-top: 20px;
}

button {
	margin-top: 20px;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

.lesson-btn {
	background-color: #4CAF50;
	color: #FFFFFF;
	margin-right: 10px;
}

.profile-btn {
	background-color: #008CBA;
	color: #FFFFFF;
}

.footer {
	text-align: center;
	padding: 20px 0;
	margin-top: 20px;
	border-top: 1px solid #e5e5e5;
	color: #777;
}
</style>
</head>

<body>

	<div class="container text-center">
		<h1>Welcome to the Java course!</h1>
		<p>Congratulations on your successful login to the platform. Are
			you ready to start studying?</p>
		<p class="lead">
			<c:out value="${requestScope.invitationMessage}" />
		</p>
		<c:out value="${sessionScope.user.name}" />

		<div class="content">
			<a href="profile.html" class="profile-btn" onclick="goToProfile()">My
				Profile</a> <a href="lessons.html" class="lesson-btn"
				onclick="goToLessons()">Go to Lessons </a>

		</div>
		<div class="footer">
			<p>&copy; 2024 Learn Java.</p>
		</div>
	</div>
	<script>
		function goToLessons() {

			console.log("Navigating to lessons...");
		}

		function goToProfile() {

			console.log("Navigating to profile...");
		}
	</script>

</body>
</html>