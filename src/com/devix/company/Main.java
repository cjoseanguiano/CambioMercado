package com.devix.company;


import java.util.Scanner;

/*10:
Escriba un programa que nos calcule el cambio que debe dar la caja de un supermercado:
Dado un precio y una cantidad de dinero, el programa nos dirá cuántas monedas deben darse como cambio
de tal forma que el número total de monedas sea mínimo.*/
public class Main {

    public static void main(String[] args) {
        // write your code here
        double precio = 0;
        double cantidad = 0;
        int cantidadProductos = 0;
        double value;
        double cambio = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos productos son :");
        cantidadProductos = entrada.nextInt();
//        System.out.println("CANTIDAD DE PRODUCTOS ES : " + cantidadProductos);

        System.out.println("Ingresa el precio del producto");
        precio = entrada.nextDouble();
//        System.out.println("EL PRECIO ES : " + precio);

        System.out.println("Ingresa el dinero dado ");
        cantidad = entrada.nextDouble();
//        System.out.println("LA CANTIDAD DEL CLIENTE ES: " + cantidad);


        if (cantidadProductos >= 1) {
            value = cantidadProductos * precio;
//            System.out.println("EL VALUE ES : " + value);
            cambio = cantidad-value;
        }
        System.out.println("El cambio es :"+cambio);

    }
}
