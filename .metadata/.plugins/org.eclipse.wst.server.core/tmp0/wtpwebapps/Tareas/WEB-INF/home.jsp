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
    <link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Kanit:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Open+Sans:ital,wght@0,300..800;1,300..800&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">
    <style type="text/css">
    	body{
    		background-color: white;
    		color: black;
    	}
    	
    	li{
    		color: black;
    	}
    	
    	#titulo ,h1{
    		font-family: "Kanit", static;
    	}
    	
    	#titulo{
  			color: transparent;
    		background-image: linear-gradient(to left, #FFD700, #7B68EE, #3498db, #2ecc71, #FFD700);    
    		background-clip: text;
    		animation: color 3s linear infinite;
    		background-size: 500%;    

    	}
    	
    	@keyframes color {
    		from {
       			 background-position: 0% 50%;
    		}

    		to {
        		background-position: 100% 50%;
    		}
		}
    	
    	a:hover:after {
    		background-color: #333;
    		color: #fff;
    		padding: 4px 8px;
    		border-radius: 4px;
    		position: absolute;
    
		}
  
    	
    
    </style>

  </head>
  <body>
  	<%
  		ArrayList<Categoria> cats = (ArrayList<Categoria>)request.getAttribute("cats"); 
  		ArrayList<Tarea> tareas = (ArrayList<Tarea>)request.getAttribute("tareas");
  	
  	%>
  	<nav class="navbar navbar-expand-lg bg-black">
    	<div class="container-fluid">
        	<a class="navbar-brand mx-auto " id="titulo" href="#">Registro de Tareas</a>
    	</div>
	</nav>

    <div class="container">
    	<div class="row justify-content-center">
        	<div class="col-12 col-md-9 col-lg-6">
            	<form action="/Tareas/Home" method="post">
                	<div class="p-4">
                    	<h1 class="text-center fs-1">Ingrese una Tarea</h1>
                    	<br>
                    	<div class="form-group">
                        	<input class="form-control" placeholder="Nombre de tarea" name="texto" type="text" required>
                    	</div>
                    	<br>
                    	<div class="col-12">
              				<select class="form-select" name="categoria_id" required>
                				<option selected value required>Selecciona 1</option>
                					<% for (Categoria c: cats) { %>
                						<option value="<%=c.id %>"><%=c.nombre %></option>
                					<% } %>
              				</select>
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

 
    			<% for (Tarea t: tareas) { %>
    				<ul class="list-group text-center">
    					<li <% if (t.completada == true){ %>class="text-decoration-line-through text-danger"<% } %> class="list-group-item text-center">
    		 				<h4>Agregada el: <%=t.fecha %></h4>
    		 				<h6 class="text-center">Tarea: (<%=t.texto%>)</h6>
    		 				
    	
                			<% for (Categoria c: cats) { %>
                					<% if(t.categoria_id == c.id){ %>
                							<h5>Categor�a: <%=c.nombre %></h5>
                							
                					<%} %>
                			<% } %>
    		 				
    		 				<a href="/Tareas/CheckearTarea?id=<%= t.getId() %>" title="Checkear Tarea">
    							<img src="https://img.icons8.com/?size=48&id=sz8cPVwzLrMP&format=png" class="logotipo" onclick="check()"></img>
							</a>
    		 				<a href="/Tareas/GestionTarea?id=<%=t.getId()%>" title="Eliminar Tarea">
    		 					<img src="https://img.icons8.com/?size=48&id=pre7LivdxKxJ&format=png" class="logotipo" onclick="eliminar()"></img>
    		 				</a>
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