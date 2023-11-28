package com.mycompany.matricesprojecto.operaciones;

import com.mycompany.matricesprojecto.util.Utilidades;
import com.mycompany.matricesprojecto.util.matriz;

public class suma {
    static Utilidades ut = new Utilidades();
    static matriz mt = new matriz();
    
    public void suma(){
        System.out.println("---------------------HALLAR SUMA DE DOS MATRICES");
        int limite = ut.numeroSeleccionado("Ingrese el NUMERO de filas y columnas: ");
        int[][] m1 = mt.definirMatriz(limite,limite,"Matriz 1");
        int[][] m2 = mt.definirMatriz(limite,limite,"Matriz 2");
        int[][] mr = new int[limite][limite];
        
        System.out.println("----Matriz resultante----");
        
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                mr[i][j] = m1[i][j] + m2[i][j];
            }
        }
        mt.imprimirMatriz(mr);
    }
}
