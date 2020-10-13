/*
 * Acaba la clase Triangulo con el/los constructores, accesores (get/set)
 * método toString().
 * fecha limite: 15/10/2010 19:00
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class Triangulo {

    // propiedades
    private double base;
    private double altura;

    public Triangulo(double base, double altura) throws Exception {
        if (base <= 0) {
            throw new Exception("La base tiene que ser positiva");
        }
        this.base = base;

        if (altura <= 0) {
            throw new Exception("La altura tiene que ser positiva");
        }
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    /* Calcula el área de este triangulo */
    public double area() {
        return (base * altura) / 2;
    }

    /* Calcula el perímetro de este triangulo conocida su base y altura */
    public double perimetro() {
        double lado;

        lado = calculaHipotenusa();
        return lado + lado + base;
    }

    private double calculaHipotenusa() {
        double h;
        double costatBase;

        costatBase = base / 2;
        h = Math.sqrt(Math.pow(altura, 2.0) + Math.pow(costatBase, 2.0));
        System.out.println("Hipotenusa; " + h);
        return h;
    }

}
