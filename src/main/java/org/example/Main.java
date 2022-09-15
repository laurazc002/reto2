package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import clases.Cliente;
import clases.Empanada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empanada empanada = new Empanada("Empanada de Pollo","Papa, Carne",1200,5000);
        Cliente cliente = new Cliente();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //pidiendo datos al cliente

        int opcion = 100;

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Venta Empanadas");
        System.out.println("2. Ver la empanada");
        System.out.println("3. Editar precio Empanada");
        System.out.println("5.Salir");

        while (opcion!=5){
            System.out.println("Digite una opcion: ");
            opcion= entradaTeclado.nextInt();

            if (opcion==1){
                System.out.println("Ingresa su saldo disponible: ");
                cliente.setSaldoDisponible(entradaTeclado.nextInt());
                if (cliente.getSaldoDisponible()>=5000){
                    System.out.println("El precio de la empanada es " + empanada.getPrecioVenta());
                    System.out.println("El ingrediente de la empanada es " + empanada.getIngrediente());
                    System.out.println("Digite la cantidad de las empanadas deseadas:");
                    empanada.setCantidad(entradaTeclado.nextInt());

                    if (empanada.calcularVenta()>cliente.getSaldoDisponible()){
                        System.out.println("No tienes saldo suficiente");
                        System.out.println("Ingresa una cantidad menor");
                        empanada.setCantidad(entradaTeclado.nextInt());
                    } else {
                        cliente.setSaldoDisponible(cliente.getSaldoDisponible() - empanada.calcularVenta());
                        System.out.println("Gracias por tu compra");
                        System.out.println("Su devuelta es: " + cliente.getSaldoDisponible());
                    }

                } else {
                    System.out.println("No tenes plata");
                    break;
                }

            } else if (opcion==2) {
                System.out.println("****" + empanada.getNombre() +"****");
                System.out.println("Regimen Comun");
                System.out.println(dtf.format(LocalDateTime.now()));
                System.out.println("Producto: Empanada de " + empanada.getIngrediente());
                System.out.println("Valor Unitario:" + empanada.getPrecioVenta());
                System.out.println("La cantidad" + empanada.getCantidad());
                System.out.println("El valor total: " + empanada.calcularVenta());
                System.out.println("Gracias por su compra");



            } else if (opcion==3) {


            } else if (opcion==5) {

            }else {


            }
        }
    }
}