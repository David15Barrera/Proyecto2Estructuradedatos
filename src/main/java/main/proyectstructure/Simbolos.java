/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.proyectstructure;

/**
 *
 * @author david
 */

import java.io.BufferedReader;
import java.io.IOException;

public class Simbolos {

    public static String obtenerContenido(BufferedReader reader) {
        String contenido = "";
        String linea;
        try {

            while ((linea = reader.readLine()) != null) {
                contenido += linea;
            }

            return contenido;
        } catch (IOException ex) {
            System.err.println("Ha ocurrido un error al Leer");
            ex.printStackTrace(System.out);
        }
        return contenido;
    }

    public static String remplazarSimbolos(String entrada) {
        entrada = entrada.replace("â£", "♣");
        entrada = entrada.replace("â¥", "♥");
        entrada = entrada.replace("â¦", "♦");
        entrada = entrada.replace("â", "♠");
        entrada = entrada.replace("J", "11");
        entrada = entrada.replace("A", "1");
        entrada = entrada.replace("Q", "12");
        entrada = entrada.replace("K", "13");
        return entrada;
    }

    public static int obtenerValorHash(int valor, Tipo tipo) {
        switch (tipo) {
            case CORAZON:
                return valor + 40;
            case DIAMANTE:
                return valor + 20;
            case PICA:
                return valor + 60;
            default:
                return valor;
        }
    }

    public static int obtenerValorHashInverso(int valor, Tipo tipo) {
        switch (tipo) {
            case CORAZON:
                return valor - 40;
            case DIAMANTE:
                return valor - 20;
            case PICA:
                return valor - 60;
            default:
                return valor;
        }
    }
}
