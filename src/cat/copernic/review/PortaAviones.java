/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author lubo1
 */
public class PortaAviones extends BarcoDeGuerra {

    private int aviones;

    public PortaAviones(int aviones, int cañones, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(cañones, motor, eslora, manga, nudos, peso);
        this.aviones = aviones;
    }

}
