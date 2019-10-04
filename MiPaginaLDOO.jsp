<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title> Pagina Ldoo </title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
    <style type="text/css">
     body {
         padding-left: 11em;
         font-family: Georgia, "Times New Roman",
           Times, serif;
     color: purple;
     background-color: grey }
     ul.navbar {
         list-style-type: none;
             padding: 0;
             margin: 0;
         position: absolute;
         top: 2em;
         left: 1em;
         width: 9em }

       h1 {
     font-family: Helvetica, Geneva, Arial,
           SunSans-Regular, sans-serif }
       ul.navbar li {
     background: white;
     margin: 0.5em 0;
     padding: 0.3em;
     border-right: 1em solid black }
    ul.navbar a {
     text-decoration: none }
    a:link {
     color: blue }
    a:visited {
     color: purple }
    address {
     margin-top: 1em;
     padding-top: 1em;
     border-top: thin dotted }
     </style>
</head>
<body>

<!-- Menú de navegación del sitio -->
<ul class="navbar">
  <li><a href="index.html">Pagina principal</a>
  <li><a href="MiPaginaLDOO.jsp">Meditaciones</a>
  <li><a href="MiPaginaLDOO.jsp">Mi ciudad</a>
  <li><a href="MiPaginaLDOO.jsp">Enlaces</a>
</ul>

<!-- Contenido principal -->
<h1>Mi primera pagina con estilo</h1>
    
 
  
<div>
<p> Pagina Ldoo
    
<p>...
</div>

<div><img src="img/images.jpg" alt=""/></div>
<div>
<a href="https://www.google.com.mx">Google</a>
</div>
<div>
    <form action="NewServlet" method="get">
        <div>
            <input type="submit" name="guardar" id="guardar" value="Ir a formulario">
        </div>
    </form>
    
</div>
<!-- Firma y fecha de la página, ¡sólo por cortesía! -->
<address>Creada el 13/08/2019  <br>
  dggc.17@gmail.com.</address>

</body>
</html>
