/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import main.proyectstructure.Arbol;
/**
 *
 * @author david
 */

public class LlamadasArbol {

    private static Arbol arbol = null;

    private LlamadasArbol() {
        arbol = new Arbol();
    }

    public static Arbol getArbol() {
        if (arbol == null) {
            new LlamadasArbol();
        }
        return arbol;
    }
}
