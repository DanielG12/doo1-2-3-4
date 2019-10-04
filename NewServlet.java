/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoServlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cammi
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("<link rel='stylesheet' href='//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css'>");
            out.println("<link rel='stylesheet' href='/resources/demos/style.css'>");
            out.println("<script src='https://code.jquery.com/jquery-1.12.4.js'></script>");
            out.println("<script src='https://code.jquery.com/ui/1.12.1/jquery-ui.js'></script>");
            out.println("<script>");
            out.println("$( function() {");
            out.println("  $( '#datepicker' ).datepicker();");
            out.println("} );");
            out.println("</script>");
            out.println("<style type='text/css'>");
            out.println("body {");
            out.println("    padding-left: 11em;");
            out.println("    font-family: Georgia, 'Times New Roman',");
            out.println("      Times, serif;");
            out.println("color: purple;");
            out.println("background-color: grey }");
            out.println("ul.navbar {");
            out.println("    list-style-type: none;");
            out.println("        padding: 0;");
            out.println("        margin: 0;");
            out.println("    position: absolute;");
            out.println("    top: 2em;");
            out.println("    left: 1em;");
            out.println("     width: 9em }");

            out.println("  h1 {");
            out.println("font-family: Helvetica, Geneva, Arial,");
            out.println("      SunSans-Regular, sans-serif }");
            out.println("  ul.navbar li {");
            out.println("background: white;");
            out.println("margin: 0.5em 0;");
            out.println("padding: 0.3em;");
            out.println("border-right: 1em solid black }");
           out.println("ul.navbar a {");
            out.println("text-decoration: none }");
           out.println("a:link {");
           out.println("color: blue }");
           out.println("a:visited {");
            out.println("color: purple }");
           out.println("address {");
            out.println("margin-top: 1em;");
            out.println("padding-top: 1em;");
            out.println("border-top: thin dotted }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Formulario para registrar Usuario</h1>");
            
            out.println("<form action='GuardarUsuario' method='get'>");
            out.println("<p>Nombre</p>");
            out.println("<input type='text' name='nombre' id='nombre'>");
            out.println("<p>Correo</p>");
            out.println("<input type='text' name='correo' id='correo'>");
            out.println("<p>Contraseña</p>");
            out.println("<input type='password' name='contra' id='contra'>");
            out.println("<p>Fecha de nacimiento</p>");
            out.println("<input type='text' name='fechanacimiento' id='datepicker'>");
            out.println("<p>Ciudad</p>");
            out.println("<input name='ciudad' list='ciudad'>");
            out.println("<datalist id='ciudad'>");
            out.println("<option value='Monterrey'>");
            out.println("<option value='San piter'>");
            out.println("<option value='Guadalupe'>");
            out.println("<option value='San nico'>");
            out.println("<option value='Apodaca city'>");
            out.println("</datalist>");
            out.println("<div>");
            out.println("<input type='submit' name='guardar' id='guardar' value='Guardar'>");
            out.println("</div>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
