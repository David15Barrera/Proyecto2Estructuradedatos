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
import InicioJson.lexerJsonStart;
import InicioJson.parser;

/**
 *
 * @author david
 */

public class InicioGame {

    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public InicioGame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.request = request;
        this.response = response;
    }

    public void recibirCartasIniciales() {
        Arbol arbol = LlamadasArbol.getArbol();
        try {
            String jsonStart = Simbolos.remplazarSimbolos(Simbolos.obtenerContenido(request.getReader()));
            StringReader sr = new StringReader(jsonStart);
            lexerJsonStart lexer = new lexerJsonStart(sr);
            parser par = new parser(lexer);

            try {
                par.parse();
                ArrayList<Carta> nodos = par.getCartas();
                if (!par.isErrores()) {
                    for (Carta carta : nodos) {
                        arbol.insertar(carta, response);
                    }
//Analisis Correcto                    
                    ArrayList<String> cartasS = arbol.preOrden();
                    for (String c : cartasS) {
                        System.out.println(c);
                    }
//Errores sintacticos en el inicio del Json
                }else{
                    response.setStatus(400);
                }
            } catch (Exception ex) {
//Errores en la lectura del analizador
                response.setStatus(400);
            }

        } catch (IOException ex) {
            response.setStatus(400);
        }

    }
}
