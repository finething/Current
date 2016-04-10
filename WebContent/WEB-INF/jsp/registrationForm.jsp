<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="${pageContext.request.contextPath}/resource/registration.css"
	rel="stylesheet" type="text/css" />
<title>Register</title>
</head>
<body>
	<form action="/RetailP/saved" method="post">
		<fieldset>
			<legend>Registration Form</legend>

			<label for="firstName">First Name: </label> <input id="firstName"
				name="firstName" type="text" /></br> <label for="lastName">Last
				Name: </label> <input id="lastName" name="lastName" type="text" /> </br> <label
				for="Middle Name">Middle Name: </label> <input id="middleName"
				name="middleName" type="text" /></br> <label for="age">Age: </label> <input
				id="age" name="age" type="text" /> </br> <label for="ssn">SSN: </label>
			<input id="ssn" name="ssn" type="text" />
		</fieldset>
		<fieldset>
			<legend>Address</legend>
			<label for="houseNumber">House Number: </label> <input
				id="houseNumber" name="houseNumber" type="text" /></br> <label
				for="streetName">Street Name: </label> <input id="streetName"
				name="streetName" type="text" /></br> <label for="city">City: </label> <input
				id="city" name="city" type="text" /></br> <label for="state">State:
			</label> <input id="state" name="state" type="text" /> </br> <label for="zipCode">Zip
				Code: </label> <input id="zipCode" name="zipCode" type="text" />
		</fieldset>

		<input type="submit" value="submit">
	</form>
</body>
</html>