package com.mycompany.matricesprojecto.operaciones;

import com.mycompany.matricesprojecto.util.Utilidades;
import com.mycompany.matricesprojecto.util.matriz;

public class transpuesta {
    static Utilidades ut = new Utilidades();
    static matriz mt = new matriz();
    
    public void transpuesta(){
        System.out.println("---------------------HALLAR MATRIZ TRANSPUESTA");
        int f,c;
        f = ut.numeroSeleccionado("Ingrese el numero de filas: ");
        c = ut.numeroSeleccionado("Ingrese el numero de columnas: ");
        System.out.println("");
        
        int[][] matriz = mt.definirMatriz(f,c,"Matriz Inicial");
        int[][] matrizT = new int[c][f];
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Transpuesta");
        mt.imprimirMatriz(matrizT);
    }
}
