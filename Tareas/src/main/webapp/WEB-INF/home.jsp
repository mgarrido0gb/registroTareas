<%@page import="models.Categoria"%>
<%@page import="models.Tarea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList" import="models.Tarea" import="models.Categoria"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registro Tareas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style type="text/css">
    	body{
    		background-color: white;
    		color: black;
    	}
    	
    	li{
    		color: black;
    	}
    	
    	.logotipo{
    		width: 30px;
    		height: 30px;
    	}
    	
    	
    
    	
    	
    
    </style>

  </head>
  <body>
  	<nav class="navbar bg-primary" id="nav">
  		<div class="container">
    		<a class="navbar-brand" href="#">
      			<img src="https://cdn-icons-png.flaticon.com/512/181/181627.png"  width="40" height="40">
    		</a>
  		</div>
	</nav>
    
    <div class="container">
    	<div class="row justify-content-center">
        	<div class="col-12 col-md-9 col-lg-6">
            	<form action="/Tareas/Home" method="post">
                	<div class="p-4">
                    	<h1 class="text-center">Ingrese una Tarea</h1>
                    	<div class="form-group">
                        	<input class="form-control" placeholder="Nombre de tarea" name="texto" type="text" required>
                    	</div>
                    	<div class="text-center mt-3">
                        	<input type="submit" value="Guardar" class="btn btn-primary" onclick="mensaje()">
                    	</div>
                	</div>
            	</form>
        	</div>
    	</div>
	</div>
    
    
   <div class="row">
   		<div class="col-6 offset-3 d-block m-auto m-0 p-2 col-md-3">
   			 <%
    			ArrayList<Tarea> tareas = (ArrayList<Tarea>)request.getAttribute("tareas");
    		%>
 
    			<% for (Tarea t: tareas) { %>
    				<ul class="list-group text-center">
    					<li <% if (t.completada == true){ %>class="text-decoration-line-through text-danger"<% } %> class="list-group-item text-center">
    		 				<%=t.texto %> (creada en: <%=t.fecha %>)
    		 				<a href="/Tareas/CheckearTarea?id=<%=t.id%>"><img src="https://img.icons8.com/?size=48&id=sz8cPVwzLrMP&format=png" class="logotipo" onclick="check()" ></img></a>
    		 				<a href="/Tareas/GestionTarea?id=<%=t.id%>"><img src="https://img.icons8.com/?size=48&id=pre7LivdxKxJ&format=png" class="logotipo" onclick="eliminar()"></img></a>
    					</li>
    				<br>
    			<%}%>
    		</ul>
   		
   		</div>
   </div>
   
   
   <script type="text/javascript">

   
   	function mensaje(){
   		alert("Tarea Agregada con �xito");
   	}
   	
   	function eliminar(){
   		alert("Tarea eliminada con �xito");
   	}
   	
   	function check(){
   		alert("Tarea Realizada con �xito");
   	}
   
   </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>