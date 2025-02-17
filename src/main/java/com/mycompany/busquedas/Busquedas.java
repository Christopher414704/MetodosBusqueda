/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busquedas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Busquedas {

  
    public static void busqueda_lineal(int cdatos){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> datos = new ArrayList<>();
        
        for (int x = 0; x < cdatos; x++){
            
            System.out.println("Ingresa el dato");
            int cdato = scanner.nextInt();
            datos.add(cdato);
            
        }
        
        int posicion = -1;
        System.out.println("Que dato deseas buscar");
        int bdato = scanner.nextInt();
        
        for(int x = 0; x < datos.size();x++){
            if(datos.get(x) == bdato){
                posicion = x;
                break;
            }
                
        }
        
        if (posicion != -1) {
            System.out.println("El numero " + bdato + " fue encontrado en la posicion " + posicion);
        } else {
            System.out.println("El numero " + bdato + " no se encuentra en la lista");
        }
        
    }
    
    public static void busqueda_binaria(int cdatos){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> datos = new ArrayList<>();
        
       

        for (int x = 0; x < cdatos; x++) {
            System.out.println("Ingresa el dato:");
            int cdato = scanner.nextInt();
            datos.add(cdato);
        }

        
        Collections.sort(datos);

        
        System.out.println("Ingresa el dato a buscar:");
        int bdato = scanner.nextInt();

        int inicio = 0, fin = datos.size() - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            
            
            System.out.println("El dato que deseas buscar es " + datos.get(medio) + " (s/n)");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("s")) {
                System.out.println("El dato " + bdato + " fue encontrado en la posicion: " + medio);
                encontrado = true;
                break;
            } else {
                System.out.println("El dato que deseas buscar es mayor o menor que " + datos.get(medio) + " (mayor/menor)");
                String indicacion = scanner.next();

                if (indicacion.equalsIgnoreCase("mayor")) {
                    inicio = medio + 1;
                } else if (indicacion.equalsIgnoreCase("menor")) {
                    fin = medio - 1;
                }
            }
        }
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el numero de datos a ingresar");
        int cdatos = scanner.nextInt();
        
        System.out.println("Selecciona el tipo de busqueda");
        System.out.println("1. Binaria");
        System.out.println("2. Secuencial");
        int tbusqueda = scanner.nextInt();
        
        if(tbusqueda == 1){
            busqueda_binaria(cdatos);
        } else{
            if(tbusqueda == 2){
                busqueda_lineal(cdatos);
            } else{
            System.out.println("No hay ninguna funcion con ese Numero");
          }
        }
        
    }
}

