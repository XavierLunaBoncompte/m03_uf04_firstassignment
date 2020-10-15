/*
 * FIRST ASSIGNMENT
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class M03_UF04_FirstAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prueba to código aquí

        Barco barco = new Yate(true, 4, 6, new Motor(1000), 20, 12.5, 23, 7);
        barco.arranca();

        Barco barco2 = new PortaAviones(35, 35, new Motor(6000), 250, 70, 46, 60000);
        barco2.arranca();

        System.out.println(barco instanceof PortaAviones);

        Barco barco3 = new Carguero(20, "Coches", new Motor(7000), 300, 120, 43, 80000);

        Barco barco4 = new Petrolero(1000.5, "Petroleo", new Motor(6500), 240, 60, 30, 8);

        Barco barco5 = new Metanero(4, "Gas Natural", new Motor(4500), 2300, 50, 27, 7);

        /*CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
        System.out.println(cc1);
        try {
            cc1.ingresa(123.09);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(cc1);
        try {
            cc1.abona(98.87);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(cc1);

        Cuadrado c1;
        System.out.println("CUADRADO\n");
        try {
            c1 = new Cuadrado(9);
            System.out.println("Area; " + c1.area());
            System.out.println("Perimetro; " + c1.perimetro()+ "\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        Triangulo t1;
        System.out.println("TRIANGULO\n");
        
        try {
            t1 = new Triangulo(6, 3);
            System.out.println("Area; " + t1.area());
            System.out.println("Perimetro; " + t1.perimetro());
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
    }

}
