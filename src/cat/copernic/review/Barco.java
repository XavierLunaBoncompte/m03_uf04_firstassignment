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
public abstract class Barco implements EnCasoDeIncendioInterface, EnCasoDeAbordajeInterface {

    protected String nombre = "Sin nombre";
    private Motor motor;
    private double eslora;  //longitud barco
    private double manga;   // anchura barco
    private int nudos;  //velocidad
    private int peso;

    public Barco(Motor motor, double eslora, double manga, int nudos, int peso) {
        this.motor = motor;
        this.eslora = eslora;
        this.manga = manga;
        this.nudos = nudos;
        this.peso = peso;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getManga() {
        return manga;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }

    public int getNudos() {
        return nudos;
    }

    public void setNudos(int nudos) {
        this.nudos = nudos;
    }

    @Override
    public String toString() {
        return "Barco{" + "motor=" + motor + ", eslora=" + eslora + ", manga=" + manga + ", nudos=" + nudos + ", peso=" + peso + '}';
    }

    abstract void arranca();

    abstract void atraca();

}
