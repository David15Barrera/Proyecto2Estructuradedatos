/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.proyectstructure;

/**
 *
 * @author david
 */

public enum Tipo {
    CORAZON("♥"),
    TREBOL("♣"),
    DIAMANTE("♦"),
    PICA("♠");

    private String simbolo = "";

    private Tipo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return this.simbolo;
    }

}
