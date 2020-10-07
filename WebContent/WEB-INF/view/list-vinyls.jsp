<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
	<title> List Vinyls</title>
	
	<!-- bootstrap style sheet -->
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	
	<!-- reference my css -->
	
	<link type="text/css"
	rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>
<body>

	<div>
         <jsp:include page="header.jsp"></jsp:include>
     </div>
	
	<div id="container">
	
		<div id="list">
		
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Title</th>
						<th>Artist</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="tempVinyl" items="${vinyls}">
				
					<tr>
						<td> ${tempVinyl.title}</td>
						<td> ${tempVinyl.artist}</td>
						<td> ${tempVinyl.price}</td>
					</tr>
			
				</c:forEach>
				</tbody>
			
			</table>
		
		</div>
	
	</div>

</body>

</html>












