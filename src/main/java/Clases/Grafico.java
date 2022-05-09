/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.proyectstructure.Arbol;

/**
 *
 * @author david
 */

public class Grafico {

    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public Grafico(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.request = request;
        this.response = response;
    }

    public void getStatus() {
        Arbol arbol = LlamadasArbol.getArbol();
        try {
            Jsonimg();
        } catch (IOException ex) {
            response.setStatus(400);
        }
    }

    private void Jsonimg() throws IOException {
        String json = "{\n";
        String serverName = request.getServerName();
    }
}
