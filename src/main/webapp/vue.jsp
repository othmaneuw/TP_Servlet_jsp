<%@page import="java.util.ArrayList"%>
<%@page import="entities.Produit"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
<%
  List<Produit> liste = (ArrayList<Produit>)request.getAttribute("listeP");
%>
<h1>jsp page </h1>
<div class="container">
<table class="table table-dark">
   <thead>
      <th>Id</th>
      <th>Designation</th>
      <th>Prix</th>
      <th>Quantite</th>
   </thead>
   <tbody>
   <% for(Produit p : liste){ %>
      <tr>
          <td><%=p.getRef() %></td>
          <td><%=p.getDes() %></td>
          <td><%=p.getPrix() %></td>
          <td><%=p.getQte() %></td>
      </tr>
    <% } %>
   </tbody>
</table>
</div>
</body>
</html>