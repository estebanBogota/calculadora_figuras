import java.util.Scanner;

public class logic {
    Scanner sc = new Scanner(System.in);


    int figura, operacionTriangulo, operacionCuadrado, operacionRectangulo, operacionCirculo;
    boolean ejecutar = true;


    
    public void Pedir_datos() {


        System.out.println("Elija una de las siguientes figuras \n 1. Triangulo"); 
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /____\\");
        System.out.println("\n 2.Cuadrado");
        System.out.println(" ______");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");
        System.out.println("\n 3. Rectangulo");
        System.out.println(" ______");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");
        System.out.println("\n4. Circulo\n");
        System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("   ***   ");

        figura = sc.nextInt();
    }







    public void Determinar_figura() {
        if (figura == 1) {
            System.out.println("Usted ha elegido: Triángulo\n");
            System.out.println("   /\\");
            System.out.println("  /  \\");
            System.out.println(" /____\\");
            } else if (figura == 2) {
                System.out.println("Usted ha elegido: Cuadrado\n");
                System.out.println(" ______");
                System.out.println("|      |");
                System.out.println("|      |");
                System.out.println("|______|");
                } else if (figura == 3) {
                    System.out.println("Usted ha elegido: Rectángulo\n");
                    System.out.println(" ______");
                    System.out.println("|      |");
                    System.out.println("|      |");
                    System.out.println("|      |");
                    System.out.println("|______|");
                    } else if (figura == 4) {
                        System.out.println("Usted ha elegido: Círculo\n");
                        System.out.println("   ***   ");
                        System.out.println(" *     * ");
                        System.out.println("*       *");
                        System.out.println("*       *");
                        System.out.println(" *     * ");
                        System.out.println("   ***   ");
                        }else{
                            System.out.println("Elija una opcion valida");
                        }
                       
    }






    

    public void Operando_triangulo() {
        int perimetroTriangulo, areaTriangulo;
        int l1, l2, l3, base, altura;

        if (figura == 1) {
            System.out.println("Elija que operación va a realizar:  \n 1. Perimetro \n 2. Area");
            operacionTriangulo = sc.nextInt();
        }

        if (operacionTriangulo == 1) {
            System.out.println("Usted ha elegido perimetro");
            System.out.println("Ingrese lado 1: ");
            l1 = sc.nextInt();
            System.out.println("Ingrese lado 2: ");
            l2 = sc.nextInt();
            System.out.println("Ingrese lado 3: ");
            l3 = sc.nextInt();

            perimetroTriangulo = l1 + l2 + l3;
            System.out.println("El perimetro de su triangulo es: " + perimetroTriangulo);
            } else if (operacionTriangulo == 2) {
                System.out.println("Usted ha elegido area");
                System.out.println("Ingrese la base: ");
                base = sc.nextInt();
                System.out.println("Ingrese la altura: ");
                altura = sc.nextInt();

                areaTriangulo = base * altura;

                System.out.println("El area de su triangulo es: " + areaTriangulo);
            }else if (operacionTriangulo != 0){
                System.out.println("Elija una opción valida");
            }
    }







    public void Operando_cuadrado () {
        int perimetroCuadrado,areaCuadrado;
        int lc1, lc2, lc3, lc4;

        if (figura == 2) {
            System.out.println("Elija que operación va a realizar \n 1. Perimetro \n 2. Area");
            operacionCuadrado = sc.nextInt();
        }

        if (operacionCuadrado == 1) {
            System.out.println("Usted ha elegido perimetro");
            
            System.out.println("Ingrese el primer lado: ");
            lc1 = sc.nextInt();
            System.out.println("Ingrese el segundo lado: ");
            lc2 = sc.nextInt();
            System.out.println("Ingrese el tercer lado: ");
            lc3 = sc.nextInt();
            System.out.println("Ingrese el cuarto lado: ");
            lc4 = sc.nextInt();

            perimetroCuadrado = lc1 + lc2 + lc3 + lc4;

            System.out.println("El perimetro de su cuadrado es: " + perimetroCuadrado);
        } else if (operacionCuadrado == 2) {
                System.out.println("Usted ha elegido area");

                System.out.println("Ingrese el primer lado");
                lc1 = sc.nextInt();
                System.out.println("Ingrese el segundo lado");
                lc2 = sc.nextInt();

                areaCuadrado = lc1 * lc2;

                System.out.println("El area de su cuadrado es: " + areaCuadrado);
        } else if (operacionCuadrado !=0) {
            System.out.println("Ingrese una opción valida");
        }
    }




    public void Operando_rectangulo() {
        int perimetroRectangulo, areaRectangulo;
        int longitud, ancho;

        if (figura == 3) {
            System.out.println("Elija que operación quiere realizar \n 1. Perimetro \n 2. Area");
            operacionRectangulo = sc.nextInt();
        }

        if (operacionRectangulo == 1) {
            System.out.println("Usted ha elegido perimetro\n");

            System.out.println("Ingrese la longitud: ");
            longitud = sc.nextInt();
            System.out.println("Ingrese el ancho: ");
            ancho = sc.nextInt();
        
            perimetroRectangulo = longitud * 2 + (ancho*2);
       

            System.out.println("El perimetro de su rectangulo es: " + perimetroRectangulo);
        }else if (operacionRectangulo == 2) {
            System.out.println("Usted ha elegido area");

            System.out.println("Ingrese la longitud: ");
            longitud = sc.nextInt();
            System.out.println("Ingrese el ancho: ");
            ancho = sc.nextInt();

            areaRectangulo = longitud * ancho;

            System.out.println("El area de su rectangulo es: " + areaRectangulo);
        } else if(operacionRectangulo != 0) {
                System.out.println("Ingrese una opción valida");
        }
    }






    public void Operando_circulo() {
        double longitudCircunf, radio, diametro;
        if (figura == 4) {

            System.out.println("Indique la operación que quiere realizar \n 1. Radio \n 2. Diametro");
            operacionCirculo = sc.nextInt();
        }

        if (operacionCirculo == 1) {
            System.out.println("Usted ha elegido radio");
            System.out.println("Ingrese la longitud de la circunferencia: ");
            longitudCircunf = sc.nextDouble();

            radio = longitudCircunf / (2 * Math.PI);

            System.out.println("El radio de su circunferencia es: " + radio);
        }else if (operacionCirculo == 2) {
                System.out.println("Usted ha elegido diametro");
                System.out.println("Ingrese el radio: ");
                radio = sc.nextDouble(); 

                diametro = radio * 2;

                System.out.println("El diametro de su circunferencia es: " + diametro);
        } else if (operacionCirculo != 0) {
            System.out.println("Ingrese una opción valida");
        }
    }
    
    

}
