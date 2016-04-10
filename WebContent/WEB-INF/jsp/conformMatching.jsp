<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<div>
			<p>This Enables Matching of Person to Address Available</p>
		</div>
		<fieldset>
			<legend>Person Profile</legend>
			<label for="firstName">First Name: </label> <select id="firstName"
				name="firstName"></select> </br> <label for="lastName">Last Name:
			</label> <select id="lastName" name="lastName"></select> </br> <label
				for="Middle Name">Middle Name: </label> <select id="middleName"
				name="middleName"></select></br> <label for="age">Age: </label> <select
				id="age" name="age"></select> </br> <label for="ssn">SSN: </label> <select
				id="ssn" name="ssn" type="text"></select>
		</fieldset>

		<fieldset>
			<legend>Address Profile</legend>
			<label for="houseNumber">House Number: </label> <select
				id="houseNumber" name="houseNumber"></select></br> <label
				for="streetName">Street Name: </label> <select id="streetName"
				name="streetName"></select></br> <label for="city">City: </label> <select
				id="city" name="city"></select></br> <label for="state">State: </label> <select
				id="state" name="state"></select> </br> <label for="zipCode">Zip
				Code: </label> <select id="zipCode" name="zipCode"></select>
		</fieldset>
		<input type="submit" value="submit" />
	</form>
</body>
</html>