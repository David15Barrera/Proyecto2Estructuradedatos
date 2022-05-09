/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.proyectstructure.Arbol;
import main.proyectstructure.Carta;
import main.proyectstructure.Simbolos;
import InsetJson.lexerJsonInsert;
import InsetJson.parser;

/**
 *
 * @author david
 */

public class Agregar {

    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public Agregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.request = request;
        this.response = response;
    }

    public void insertarCarta() {
        Arbol arbol = LlamadasArbol.getArbol();
        try {
            String jsonAdd = Simbolos.remplazarSimbolos(Simbolos.obtenerContenido(request.getReader()));
            StringReader sr = new StringReader(jsonAdd);
            lexerJsonInsert lexer = new lexerJsonInsert(sr);
            parser par = new parser(lexer);

            try {
                par.parse();
                Carta carta = par.getCarta();
   //Todo limpio
                if (!par.isErrores()) {
                    arbol.insertar(carta, response);
                    
                    ArrayList<String> cartasS = arbol.preOrden();
                    for (String c : cartasS) {
                        System.out.println(c);
                    }
                    
                } else {
                    response.setStatus(400);
                }
//Error al querer analizar el insetar nodo de carta en el json agregar
            } catch (Exception ex) {
                response.setStatus(400);
            }
//Error a la forma de leer el Json agregar
        } catch (IOException ex) {
            response.setStatus(400);
        }
    }
}
