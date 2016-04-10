<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/matching.js"></script>
</head>
<body>
	<form action="/map">
		<div>
			<p>This Enables Matching of Person to Address Available</p>
		</div>
		<fieldset>
			<legend>Person Profile</legend>
			<label for="firstName">First Name: </label> <select id="firstName"
				name="firstName">
				<c:forEach var="person" items="${persons}">
					<option value="${person.firstName}">${person.firstName}</option>
				</c:forEach>

			</select> </br> <label for="lastName">Last Name: </label> <select id="lastName"
				name="lastName"><c:forEach var="person" items="${persons}">
					<option value="${person.lastName}">${person.lastName}</option>
				</c:forEach></select> </br> <label for="Middle Name">Middle Name: </label> <select
				id="middleName" name="middleName"><c:forEach var="person"
					items="${persons}">
					<option value="${person.middleName}">${person.middleName}</option>
				</c:forEach></select></br> <label for="dob">DOB: </label> <select id="dob" name="dob"><c:forEach
					var="person" items="${persons}">
					<option value="${person.dob}">${person.dob}</option>
				</c:forEach></select> </br> <label for="ssn">SSN: </label> <select id="ssn" name="ssn"
				type="text"><c:forEach var="person" items="${persons}">
					<option value="${person.ssn}">${person.ssn}</option>
				</c:forEach></select>
		</fieldset>

		<fieldset>
			<legend>Address Profile</legend>
			<label for="houseNumber">House Number: </label> <select
				id="houseNumber" name="houseNumber"><c:forEach
					var="address" items="${address}">
					<option value="${address.houseNumber}">${address.houseNumber}</option>
				</c:forEach></select></br> <label for="streetName">Street Name: </label> <select
				id="streetName" name="streetName"><c:forEach var="address"
					items="${address}">
					<option value="${address.streetName}">${address.streetName}</option>
				</c:forEach></select></br> <label for="city">City: </label> <select id="city" name="city"><c:forEach
					var="address" items="${address}">
					<option value="${address.city}">${address.city}</option>
				</c:forEach></select></br> <label for="state">State: </label> <select id="state" name="state"><c:forEach
					var="address" items="${address}">
					<option value="${address.state}">${address.state}</option>
				</c:forEach></select> </br> <label for="zipCode">Zip Code: </label> <select id="zipCode"
				name="zipCode"><c:forEach var="address"
					items="${address}">
					<option value="${address.zipCode}">${address.zipCode}</option>
				</c:forEach></select>
		</fieldset>
		<input type="submit" value="submit" />
	</form>
</body>
</html>