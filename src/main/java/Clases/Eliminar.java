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
import main.proyectstructure.Carta;
import main.proyectstructure.Arbol;
import main.proyectstructure.Simbolos;
import main.DeleteJson.lexerJsonDelete;
import main.DeleteJson.parser;

/**
 *
 * @author david
 */

public class Eliminar {

    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public Eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.request = request;
        this.response = response;
    }

    //Elimina las cartas en el orden que les corresponde
    public void eliminarCartas() {
        Arbol arbol = LlamadasArbol.getArbol();
        try {
            String jsonDelete = Simbolos.remplazarSimbolos(Simbolos.obtenerContenido(request.getReader()));
            StringReader sr = new StringReader(jsonDelete);
            lexerJsonDelete lexer = new lexerJsonDelete(sr);
            parser par = new parser(lexer);

            try {
                par.parse();
                if (!par.isErrores()) {
                    ArrayList<Carta> cartas = par.getCartas();

                    eliminarCartas(cartas, arbol);

                    ArrayList<String> cartasS = arbol.preOrden();
                    for (String c : cartasS) {
                        System.out.println(c);
                    }

                } else {
                    response.setStatus(400);
                }
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
                response.setStatus(400);
            }

        } catch (IOException ex) {
            response.setStatus(400);
        }
    }
//Verifica si las cartas no tienen hijos
    private void eliminarCarta(Carta carta, Arbol arbol) {
        if (arbol.buscar(carta, arbol.getRaiz()) != null) {
            if (!arbol.tieneHijos(carta, arbol.getRaiz())) {
                arbol.eliminar(carta, arbol.getRaiz());
            } else {
                response.setStatus(409);
            }
        } else {
            response.setStatus(404);
        }
    }
//Eliminacion de cartas y verifica que las que no suman 13
    private void eliminarCartas(ArrayList<Carta> cartas, Arbol arbol) {
        boolean valido;
        int cantidadCartas = cartas.size();
        switch (cantidadCartas) {
            case 0:
                response.setStatus(400);
                break;
            case 1: {
                Carta primeraCarta = cartas.get(0);
                valido = primeraCarta.getValorReal() == 13;
                if (valido) {
                    eliminarCarta(primeraCarta, arbol);
                } else {
                    response.setStatus(406);
                }
            }
            break;
            case 2: {
                Carta primeraCarta = cartas.get(0);
                Carta segundaCarta = cartas.get(1);
                valido = (primeraCarta.getValorReal() + segundaCarta.getValorReal()) == 13;
                if (valido) {
                    eliminarCarta(primeraCarta, arbol);
                    eliminarCarta(segundaCarta, arbol);
                } else {
                    response.setStatus(406);
                }
            }
            break;
        }
    }

}
