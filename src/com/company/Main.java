package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ejer;

        do{
            System.out.println("Ingrese el numero del ejercicio (1-18): ");
            ejer = sc.nextInt();

            limpiar(10);

            switch (ejer){
                case 1:
                    ejer1();
                    break;
                case 2:
                    ejer2();
                    break;
                case 3:
                    ejer3();
                    break;
                case 4:
                    ejer4();
                    break;
                case 5:
                    ejer5();
                    break;
                case 6:
                    ejer6();
                    break;
                case 7:
                    ejer7();
                    break;
                case 8:
                    ejer8();
                    break;
                case 9:
                    ejer9();
                    break;
                case 10:
                    ejer10();
                    break;
                case 11:
                    ejer11();
                    break;
                case 12:
                    ejer12();
                    break;
                case 13:
                    ejer13();
                    break;
                case 14:
                    ejer14();
                    break;
                case 15:
                    ejer15();
                    break;
                case 16:
                    ejer16();
                    break;
                case 17:
                    ejer17();
                    break;
                case 18:
                    ejer18();
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta...");
                    break;
            }

            System.out.println("\nPulse un numero distinto a 0 si desea ver otro ejercicio");
            ejer = sc.nextInt();

        }while(ejer <=18 && ejer >0);



    }

    public static void ejer1(){

        System.out.println("Programa java que realice lo siguiente: declarar una variable N de tipo int, una\n" +
                "variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.\n" +
                "A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la\n" +
                "diferencia de A - N, el valor numérico correspondiente al carácter que contiene la variable C.\n");

        int A = 5;
        double B = 3.5;
        char C = 's';

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(Character.getNumericValue(C));

    }
    public static void ejer2(){

        System.out.println("Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos\n" +
                "variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar\n" +
                "por pantalla una serie de operaciones entre ellas.\n");

        int A = 2;
        int B = 10;
        double C = 2.5;
        double D = 5.5;

        System.out.println("Suma :" + (A + D));
        System.out.println("Resta :" + (C - D));
        System.out.println("Division :" + (B / C));
        System.out.println("multiplicacion :" + (B * A));
    }
    public static void ejer3(){

        System.out.println("Programa Java que declare una variable entera N, asignarle un valor. A continuación\n" +
                "escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su\n" +
                "valor a 3, duplicar su valor.\n");

        int N = 5 ;

        System.out.println(N + 77);
        System.out.println(N - 2);
        System.out.println(N * 3);
    }
    public static void ejer4(){

        System.out.println("Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a\n" +
                "cada una. A continuación realiza las instrucciones necesarias para que: B tome el\n" +
                "valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.\n");

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int aux = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        b = c;
        c = a;
        a = d;
        d = aux;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    public static void ejer5(){

        System.out.println("Programa Java que declare una variable A de tipo entero, asignarle un valor. A\n" +
                "continuación mostrar un mensaje indicando si A es par o impar.\n");

        int A ;
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduzca un numero: ");
        A = sc.nextInt();

        if(parInpar(A)){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado no es par");
        }

    }
    public static void ejer6(){

        System.out.println("Programa Java que declare una variable B de tipo entero y asignarle un valor. A\n" +
                "continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.");

        Scanner sc = new Scanner(System.in);

        int A;

        System.out.println(("Ingrese un numero: "));
        A = sc.nextInt();

        if(positivoNegativo(A)){
            System.out.println(("El numero ingresado es positivo"));
        }else{
            System.out.println("El numero ingresador es negativo");
        }


    }
    public static void ejer7(){

        System.out.println("Programa Java que declare una variable C de tipo entero y asignarle un valor. A\n" +
                "continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,\n" +
                "si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.\n");

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        if(parInpar(num)){
            System.out.println(("El numero es par"));
        }else{
            System.out.println("El numero es inpar");
        }

        if(positivoNegativo(num)){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }

        if(multiplo5(num)){
            System.out.println(("El numero es multiplo de 5"));
        }else{
            System.out.println("El numero no es multiplo de 5");
        }

        if(multiplo10(num)){
            System.out.println(("El numero es multiplo de 10"));
        }else{
            System.out.println("El numero no es multiplo de 10");
        }

    }
    public static void ejer8(){
        System.out.println("Programa Java que lea un nombre y muestre por pantalla:\n" +
                "“Buenos días, {NOMBRE}”.\n");

        String nombre;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nombre: ");
        nombre = sc.nextLine();

        System.out.println("Buenos dias, " + nombre);

    }
    public static void ejer9(){
        System.out.println("Programa Java que lea un número entero por teclado y calcule el doble y el triple de\n" +
                "ese número y lo muestre por pantalla.\n");

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        double doble = Math.pow(num, 2);
        double triple = Math.pow(num, 3);

        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);

    }
    public static void ejer10(){
        System.out.println("Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados centígrados.\n");

        double temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un temperatura en farenheit : ");
        temp = sc.nextDouble();

        System.out.println("La temperatura ingresada en farenheit en centigrados es:" + fahrenheitACentigrados(temp));

    }
    public static void ejer11(){
        System.out.println("Programa que lee por teclado el valor del radio de una circunferencia, calcula y\n" +
                "muestra por pantalla la longitud y el área de la circunferencia.");

        double r;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio de una circunferencia: ");
        r = sc.nextDouble();

        System.out.println("Area: " + areaCircunferencia(r));
        System.out.println("Long: " + longitudCircunferencia(r));

    }
    public static void ejer12(){
        System.out.println("Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado\n");

        double v;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la velocidad: ");
        v = sc.nextDouble();

        System.out.println("La velocidad en k/h es: " + v + " y en m/s es: " + cambioVelocidad(v));

    }
    public static void ejer13(){
        System.out.println("Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la\n" +
                "longitud de la hipotenusa según el teorema de Pitágoras.\n");

        Scanner sc = new Scanner(System.in);

        double catetoA;
        double catetoB;

        System.out.println("Ingresa la long del cateto A :");
        catetoA = Math.pow(sc.nextDouble(), 2);

        System.out.println("Ingresa la long del cateto B :");
        catetoB = Math.pow(sc.nextDouble(), 2);

        System.out.println("Cateto A: " + catetoA);
        System.out.println("Cateto B: " + catetoB);
        System.out.println("Hipotenusa: " + hipotenusa(catetoA, catetoB));

    }
    public static void ejer14(){
        System.out.println("Programa que calcula el volumen de una esfera.");

        Scanner sc = new Scanner(System.in);

        double r;

        System.out.println("Ingrese el radio de la esfera: ");
        r = sc.nextDouble();

        System.out.println("El volumen de la esfera es: " + volumenEsfera(r));

    }
    public static void ejer15(){
        //Programa que calcula el área de un triángulo a partir de la longitud de sus lados.

    }
    public static void ejer16(){
        System.out.println("Programa que lee un número de 3 cifras y muestra sus cifras por separado.\n");

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println((" Ingrese un numero: "));
        num = sc.nextInt();

        String cadena = String.valueOf(num);

        String dig[] = cadena.split("(?<=.)");

        for(int r = 0; r < dig.length; r++){
            System.out.println(dig[r]);
        }
    }
    public static void ejer17(){
        System.out.println("Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan posiciones impares.\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        String cadena = String.valueOf(num);
        String[] dig = cadena.split("(?<=.)");

        for(int i = 0; i < dig.length; i++){

            if(i % 2 == 0){
                System.out.println(dig[i]);
            }
        }
    }

    public static void ejer18(){
        System.out.println("Programa que lea tres números enteros H, M, S que contienen hora, minutos y\n" +
                "segundos respectivamente, y comprueba si la hora que indican es una hora válida.\n");

        Scanner sc = new Scanner(System.in);

        int hora;
        int min;
        int seg;

        System.out.println("Ingrese la Hora: ");
        hora = sc.nextInt();
        System.out.println("Ingrese los minutos: ");
        min = sc.nextInt();
        System.out.println("Ingrese los segundos: ");
        seg = sc.nextInt();

        if(hora >= 0 && hora < 24){
            if(min >= 0 && min < 60){
                if(seg >= 0 && seg < 60){
                    System.out.println("La hora ingresada es correcta");
                }else{
                    System.out.println("La hora ingresada es incorrecta");
                }
            }else{
                System.out.println("La hora ingresada es incorrecta");
            }
        }else{
            System.out.println("La hora ingresada es incorrecta");
        }

    }

    //FUNCIONES

    //Para saber is es par o Inpar
    public static boolean parInpar(int num){
        if(num % 2 == 0) {
            return true;
        }

        return false;
    }

    //Para saber si un numero es positivo o negativo
    public static boolean positivoNegativo(int num){
        if(num >= 0) {
            return true;
        }
        return false;

    }

    //Para saber si un numero es multiplo de 5
    public static boolean multiplo5(int num){
        if(num % 5 == 0){
            return true;
        }
        return false;

    }
    //Para saber si un numero es multiplo de 10
    public static boolean multiplo10(int num){
        if(num % 10 == 0){
            return true;
        }else{
            return false;
        }
    }

    //Para elevar el numero ingresado
    public  static  double elevarNum(int num){

        Scanner sc = new Scanner(System.in);

        System.out.println("Por cuanto desea elevar el numero ingresado: ");
        int aux = sc.nextInt();

        double aux2 = Math.pow(num, aux);

        return aux2;
    }

    //Para pasa de grados fahrenheit a centigrados
    public static  double fahrenheitACentigrados(double temp) {

        temp = (temp - 32) * 5/9;

        return temp;
    }

    //Para scar el area de una circuferencia
    public static double areaCircunferencia(double r){

        double area = 3.14 * (r * r);
        return area;

    }

    //Para sacar la long de una circuferencia
    public static double longitudCircunferencia(double r){

        double l = 2* 3.14 * r;
        return l;
    }

    //Para sacar pasar de km/h a m/s
    public static double cambioVelocidad(double v){
        double v2 = v / 3.16;
        return v2;
    }

    //Para sacar la hipotenusa usando el metodo de pitagoras
    public static double hipotenusa(double ca, double cb){
        double H = Math.pow(ca + cb, 2);
        return H;
    }

    //Para sacar el volumen de una esfera
    public static double volumenEsfera(double r){
        double v = 4/3 * 3.14;
        v = v * Math.pow(r, 3);
        return v;
    }

    public static void limpiar(int lineas)
    {
        for (int i=0; i < lineas; i++)
        {
            System.out.println("");
        }
    }
}