import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        logic l = new logic();
        boolean ejecutar = true;

        while (ejecutar) {
     
        l.Pedir_datos();
        l.Determinar_figura();
        l.Operando_triangulo();
        l.Operando_cuadrado();
        l.Operando_rectangulo();
        l.Operando_circulo();
        ejecutar = l.Terminar_o_no();
        }

        
        System.out.println("Programa terminado");
        sc.close();
    }
}
