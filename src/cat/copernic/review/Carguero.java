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
public class Carguero extends BarcoDeMercancias {

    private int numContenedores;

    public Carguero(int numContenedores, String tipoMercancia, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tipoMercancia, motor, eslora, manga, nudos, peso);
        this.numContenedores = numContenedores;
    }

}
