<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<div id="container">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

  <a class="navbar-brand" href="#">Vinyl4Charity</a>
  
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  
  <div class="collapse navbar-collapse" id="navbarNav">
  
    <ul class="navbar-nav">
    
      <li class="nav-item active">
        <a class="nav-link" href="${pageContext.request.contextPath}/vinyls/list">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="#">Users</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="#">Charities</a>
      </li>
      
    </ul>
    
  </div>
  
</nav>

</div>