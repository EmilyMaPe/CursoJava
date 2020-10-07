package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    @Override// <-- esta generando error
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        //recibir la peticion y responder al navegador con String
        resp.setContentType("text/html; charset=UTF-8");
        //Con este objeto podemos empezar a escribir en el navegador web
        //reportar excepcion
        PrintWriter out = resp.getWriter();
        out.println("Hola Mundo desde Servlets");
        //Es recomendable no usar codigo HTML desde Servlets
        //Hacer un Clean and Build --> necesario tener detenido el servido GlassFish
        //Se genera un archivo war --> Web ARchive file
    }
}
