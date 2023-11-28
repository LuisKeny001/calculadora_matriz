package com.mycompany.matricesprojecto.operaciones;

import com.mycompany.matricesprojecto.util.Utilidades;

public class identidad {
    static Utilidades ut = new Utilidades();
    
    public void matrixIdentidad(){
        System.out.println("---------------------HALLAR LA MATRIZ DE INDETIDAD");
        int limite = ut.numeroSeleccionado("Ingrese el NUMERO de filas y columnas: ");
        
        System.out.println("\nMatriz identidad");
        String matrixImpresa = contruir(limite);
        
        System.out.println(matrixImpresa);
    }
    
    private String contruir(int limite) {
        String valor = ""; 
        int matriz1[][] = new int[limite][limite];
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                if (i == j) {
                    matriz1[i][j] = 1;
                } else {
                    matriz1[i][j] = 0;
                }
                valor +="[" + matriz1[i][j] + "]\t";
            }
            valor += "\n";
        }
        return valor;
    }
}
