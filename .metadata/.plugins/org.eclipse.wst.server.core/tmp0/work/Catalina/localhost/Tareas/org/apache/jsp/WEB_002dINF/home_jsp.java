/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-05-21 22:48:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import models.Categoria;
import models.Tarea;
import java.util.ArrayList;
import models.Tarea;
import models.Categoria;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("models.Categoria");
    _jspx_imports_classes.add("models.Tarea");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Registro Tareas</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("	<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/css2?family=Kanit:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Open+Sans:ital,wght@0,300..800;1,300..800&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    	body{\r\n");
      out.write("    		background-color: white;\r\n");
      out.write("    		color: black;\r\n");
      out.write("    	}\r\n");
      out.write("    	\r\n");
      out.write("    	li{\r\n");
      out.write("    		color: black;\r\n");
      out.write("    	}\r\n");
      out.write("    	\r\n");
      out.write("    	#titulo ,h1{\r\n");
      out.write("    		font-family: \"Kanit\", static;\r\n");
      out.write("    	}\r\n");
      out.write("    	\r\n");
      out.write("    	#titulo{\r\n");
      out.write("  			color: transparent;\r\n");
      out.write("    		background-image: linear-gradient(to left, #FFD700, #7B68EE, #3498db, #2ecc71, #FFD700);    \r\n");
      out.write("    		background-clip: text;\r\n");
      out.write("    		animation: color 3s linear infinite;\r\n");
      out.write("    		background-size: 500%;    \r\n");
      out.write("\r\n");
      out.write("    	}\r\n");
      out.write("    	\r\n");
      out.write("    	@keyframes color {\r\n");
      out.write("    		from {\r\n");
      out.write("       			 background-position: 0% 50%;\r\n");
      out.write("    		}\r\n");
      out.write("\r\n");
      out.write("    		to {\r\n");
      out.write("        		background-position: 100% 50%;\r\n");
      out.write("    		}\r\n");
      out.write("		}\r\n");
      out.write("    	\r\n");
      out.write("    	\r\n");
      out.write("    \r\n");
      out.write("    	\r\n");
      out.write("    	\r\n");
      out.write("    \r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  	");

  		ArrayList<Categoria> cats = (ArrayList<Categoria>)request.getAttribute("cats"); 
  		ArrayList<Tarea> tareas = (ArrayList<Tarea>)request.getAttribute("tareas");
  	
  	
      out.write("\r\n");
      out.write("  	<nav class=\"navbar navbar-expand-lg bg-black\">\r\n");
      out.write("    	<div class=\"container-fluid\">\r\n");
      out.write("        	<a class=\"navbar-brand mx-auto \" id=\"titulo\" href=\"#\">Registro de Tareas</a>\r\n");
      out.write("    	</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    	<div class=\"row justify-content-center\">\r\n");
      out.write("        	<div class=\"col-12 col-md-9 col-lg-6\">\r\n");
      out.write("            	<form action=\"/Tareas/Home\" method=\"post\">\r\n");
      out.write("                	<div class=\"p-4\">\r\n");
      out.write("                    	<h1 class=\"text-center\">Ingrese una Tarea</h1>\r\n");
      out.write("                    	<br>\r\n");
      out.write("                    	<div class=\"form-group\">\r\n");
      out.write("                        	<input class=\"form-control\" placeholder=\"Nombre de tarea\" name=\"texto\" type=\"text\" required>\r\n");
      out.write("                    	</div>\r\n");
      out.write("                    	<br>\r\n");
      out.write("                    	<div class=\"col-12\">\r\n");
      out.write("              				<select class=\"form-select\" name=\"categoria_id\" required>\r\n");
      out.write("                				<option selected value required>Selecciona 1</option>\r\n");
      out.write("                					");
 for (Categoria c: cats) { 
      out.write("\r\n");
      out.write("                						<option value=\"");
      out.print(c.id );
      out.write('"');
      out.write('>');
      out.print(c.nombre );
      out.write("</option>\r\n");
      out.write("                					");
 } 
      out.write("\r\n");
      out.write("              				</select>\r\n");
      out.write("     					</div>\r\n");
      out.write("                    	<div class=\"text-center mt-3\">\r\n");
      out.write("                        	<input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\" onclick=\"mensaje()\">\r\n");
      out.write("                    	</div>\r\n");
      out.write("                	</div>\r\n");
      out.write("                	\r\n");
      out.write("            	</form>\r\n");
      out.write("        	</div>\r\n");
      out.write("    	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("   		<div class=\"col-6 offset-3 d-block m-auto m-0 p-2 col-md-3\">\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    			");
 for (Tarea t: tareas) { 
      out.write("\r\n");
      out.write("    				<ul class=\"list-group text-center\">\r\n");
      out.write("    					<li ");
 if (t.completada == true){ 
      out.write("class=\"text-decoration-line-through text-danger\"");
 } 
      out.write(" class=\"list-group-item text-center\">\r\n");
      out.write("    		 				<h5>Agregada el: ");
      out.print(t.fecha );
      out.write("</h5>\r\n");
      out.write("    		 				<h6 class=\"text-center\">(");
      out.print(t.texto);
      out.write(")</h6>\r\n");
      out.write("    		 				<a href=\"/Tareas/CheckearTarea?id=");
      out.print(t.id);
      out.write("\"><img src=\"https://img.icons8.com/?size=48&id=sz8cPVwzLrMP&format=png\" class=\"logotipo\" onclick=\"check()\" ></img></a>\r\n");
      out.write("    		 				<a href=\"/Tareas/GestionTarea?id=");
      out.print(t.id);
      out.write("\"><img src=\"https://img.icons8.com/?size=48&id=pre7LivdxKxJ&format=png\" class=\"logotipo\" onclick=\"eliminar()\"></img></a>\r\n");
      out.write("    					</li>\r\n");
      out.write("    				<br>\r\n");
      out.write("    			");
}
      out.write("\r\n");
      out.write("    		</ul>\r\n");
      out.write("   		\r\n");
      out.write("   		</div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   	function mensaje(){\r\n");
      out.write("   		alert(\"Tarea Agregada con éxito\");\r\n");
      out.write("   	}\r\n");
      out.write("   	\r\n");
      out.write("   	function eliminar(){\r\n");
      out.write("   		alert(\"Tarea eliminada con éxito\");\r\n");
      out.write("   	}\r\n");
      out.write("   	\r\n");
      out.write("   	function check(){\r\n");
      out.write("   		alert(\"Tarea Realizada con éxito\");\r\n");
      out.write("   	}\r\n");
      out.write("   \r\n");
      out.write("   </script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
