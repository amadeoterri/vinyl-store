<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

	<meta charset="ISO-8859-1">
	
	<title>Add vinyl</title>
	
	<%@include file="head.html" %>
	
</head>

<body>

	<div>
		<jsp:include page="header.jsp"></jsp:include>
	</div>

	<div id="container" class="m-3">
	
		<form:form action="saveVinyl" modelAttribute="vinyl" method="POST" class="mb-1">
		
		<!-- need to associate this data with vinyl id -->
		<form:hidden path="id" />
		
		  <div class="form-group">
		    <label for="title">ALBUM TITLE </label>
		    <form:input path="title" class="form-control" />
		  </div>
		  
		  <div class="form-group">
		    <label for="artist">ARTIST NAME </label>
		    <form:input path="artist" class="form-control"/>
		  </div>
		  
		  <div class="form-group">
		    <label for="price">PRICE </label>
		    <form:input path="price" class="form-control"/>
		  </div>
		  
		  <div class="row m-0">
			<button type="submit" class="btn btn-dark" value="submit">Submit</button>

			<a class="btn" href="${pageContext.request.contextPath}/vinyls/list">Cancel</a>
		  </div>
		  
		</form:form>
	
	</div>

</body>
</html>