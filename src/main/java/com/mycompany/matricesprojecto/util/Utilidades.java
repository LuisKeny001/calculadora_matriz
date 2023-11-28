package com.mycompany.matricesprojecto.util;

public class Utilidades {
    private static LeerTeclado lt = new LeerTeclado();
    
    public int numeroSeleccionado(String msg) {
        int numero;
        boolean valido = false;
        do{
            try {
                numero = lt.leerInt(msg);
                if(numero < 0) {
                    System.out.println("El numero no puede ser negativo");
                } else { valido = true; }
            } catch (Exception e) {
                numero = -1;
                System.out.println("Upss, no se puede reconocer el numero");
            }
        }while(!valido);
        return numero;
    }
    
     public int numeroSeleccionadoNegativo(String msg) {
        int numero;
        boolean valido = false;
        do{
            try {
                numero = lt.leerInt(msg);
                valido = true;
            } catch (Exception e) {
                numero = -1;
                System.out.println("Upss, no se puede reconocer el numero");
            }
        }while(!valido);
        return numero;
    }
}
