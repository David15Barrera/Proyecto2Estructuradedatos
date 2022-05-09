/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.proyectstructure.Arbol;

/**
 *
 * @author david
 */

public class OrdenAvl {

    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public OrdenAvl(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.request = request;
        this.response = response;
    }

    public void getOrden() {
        String orden = this.request.getParameter("transversal");
        Arbol arbol = LlamadasArbol.getArbol();
        try {
            switch (orden) {
                case "preOrder":
                    this.crearJson(arbol.preOrden());
                    break;
                case "inOrder":
                    this.crearJson(arbol.inOrden());
                    break;
                case "postOrder":
                    this.crearJson(arbol.postOrden());
                    break;
                default:
                    response.setStatus(400);
            }
        } catch (IOException ex) {
            response.setStatus(400);
            ex.printStackTrace(System.out);
        }
    }

    private void crearJson(ArrayList<String> cartas) throws IOException {
        String json = "{";
        for (int i = 0; i < cartas.size(); i++) {
            json += "\n\t\"" + i + "\": \"" + cartas.get(i) + "\"";
            if (i < cartas.size() - 1) {
                json += ",";
            }
        }
        response.setCharacterEncoding("UTF-8");
        response.getWriter().append(json + "\n}");
    }

}
