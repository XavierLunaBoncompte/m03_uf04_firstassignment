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
        CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
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
        }
    }
    
}
