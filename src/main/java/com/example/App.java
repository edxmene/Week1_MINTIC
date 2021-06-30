package com.example;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        mayor_que();
    }

    public static void mayor_que(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número entero 1: ");
        int num_1 = sc.nextInt();
        System.out.print("Ingrese número entero 2: ");
        int num_2 = sc.nextInt();
        System.out.print("Ingrese número entero 3: ");
        int num_3 = sc.nextInt();
        if(num_2 > num_1 && num_2 > num_3){
            System.out.println("El número mayor es el " + num_2);
        }else if(num_1 > num_2 && num_1 > num_3){
            System.out.println("El número mayor es el " + num_1);
        }else{
            System.out.println("El número mayor es el " + num_3);
        }
        sc.close();
    }


    public static void division(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número 1: ");
        float num_1 = sc.nextFloat();
        System.out.print("Ingrese número 2: ");
        float num_2 = sc.nextFloat();
        if(num_2 != 0){
            System.out.printf("El valor de la división es: %.3f %n", num_1/num_2);
        }else{
            System.out.println("El denominador (número 2) debe ser distinto de cero");
        }
        sc.close();
    }

    public static void letra_mayuscula(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        char caracter = sc.next().charAt(0); 
        if(caracter == Character.toLowerCase(caracter)){
            System.out.print("El caracter esta en minúscula.");
        }else{
            System.out.print("El caracter esta en mayúscula.");
        }
        sc.close();
    }

    public static void multiplo_10(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        if(numero%10 == 0){
            System.out.print("El número " + numero + " es múltiplo de 10");
        }else{
            System.out.print("El número " + numero + " no es múltiplo de 10");
        }
        sc.close();
    }

    public static void hipotenusa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese longitud del cateto 1: ");
        float cateto_1 = sc.nextFloat();
        System.out.print("Ingrese longitud del cateto 2: ");
        float cateto_2 = sc.nextFloat();
        double hipo = Math.sqrt(cateto_1*cateto_1 + cateto_2*cateto_2);

        System.out.printf("La hipotenusa es: %.3f %n", hipo);
        sc.close();
    }

    public static void km_to_ms(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la velocidad en Km/h: ");
        int kmh = sc.nextInt();
        float velocidad = kmh*0.28f;
        System.out.println("La velocidad en m/s es: " + velocidad);
        sc.close();
    }

    public static void ultimas_cifras(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor entero de la variable N: ");
        int N = sc.nextInt();
        System.out.print("Ingrese el valor entero de la variable m: ");
        int m = sc.nextInt();
        String number_str = Integer.toString(N);
        String resp = "";
        for (int i = 0; i < number_str.length()-m; i++) {
            resp += number_str.charAt(i);
        }
        System.out.println("Nuevo valor es: " + resp);
        sc.close();
    }

    public static void total_price(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio de venta del producto (sin iva): ");
        float precio = sc.nextFloat();
        System.out.print("Ingrese el número de prodcutos vendidos: ");
        int total_productos = sc.nextInt();
        System.out.print("Ingrese el porcentaje de iva aplicado: ");
        float iva = sc.nextFloat()/100;
        float precio_venta = precio*(1f+iva)*total_productos;
        System.out.println("El precio de venta es: " + precio_venta);
        sc.close();
    }



    public static void lucky_number(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento (dd/mm/aaaa): ");
        String input = sc.next();
        String[] Arr = input.split("/");
        int suma = 0;
        for(int i=0; i < Arr.length; i++){
            suma += Integer.parseInt(Arr[i]); 
        }
        String number_str = Integer.toString(suma);
        suma = 0;
        for (int i = 0; i < number_str.length(); i++) {
            suma += Character.getNumericValue(number_str.charAt(i));
        }
        System.out.println("Número de la suerte es: " + suma);
        sc.close();
    }
}
