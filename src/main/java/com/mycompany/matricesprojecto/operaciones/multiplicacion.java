package com.mycompany.matricesprojecto.operaciones;

import com.mycompany.matricesprojecto.util.Utilidades;
import com.mycompany.matricesprojecto.util.matriz;

public class multiplicacion {
    static Utilidades ut = new Utilidades();
    static matriz mt = new matriz();
    
    public void multiplicacion(){
        System.out.println("---------------------HALLAR LA MULTIPLICACION DE DOS MATRICES");
        recomendacion();
        
        System.out.println("Primera matriz------------");
        int f1= ut.numeroSeleccionado("Introduce el numero de filas de la primera matriz; ");
        int c1= ut.numeroSeleccionado("Introduce el numero de columnas de la primera matriz; ");
        
        System.out.println("Segunda matriz------------");
        int f2 = ut.numeroSeleccionado("Introduce el numero de filas de la segunda matriz; ");
        int c2 = ut.numeroSeleccionado("Introduce el numero de columnas de la segunda matriz; ");
        
        System.out.println("------Datos ingresados------");
        System.out.println("--Matriz 1 de: " + f1 + "x" + c1 + " ...");
        System.out.println("--Matriz 2 de: " + f2 + "x" + c2 + " ...");
        System.out.println("----------------------------");
        
        if(c1 == f2){
            int[][] m1 = mt.definirMatriz(f1,f2,"Matriz 1");
            int[][] m2 = mt.definirMatriz(f1,f2,"Matriz 2");
            int[][] mr = new int[f1][c2];
            
            System.out.println("----Matriz resultante----");
            for(int i = 0; i < f1; i++){
                for(int j = 0; j < c2; j++){
                    for(int h = 0; h <c1; h++){
                        mr[i][j] += m1[i][h] * m2[h][j];
                    }
                }
            }
            mt.imprimirMatriz(mr);
        } else {
            System.out.println("No se puede realizar la operacion");
        }
    }
    
    private void recomendacion() {
        String rec =    "| RECOMENDACION---------------------------------------|\n"
                +       "| [1] Las matrices debes ser de las mismas dimenciones|\n"
                +       "|     Por ejemplo: matriz 4x4, 3x3, 7x7, etc..        |\n"
                +       "| [2] Ten en cuenta que la dimension que pongas vas a |\n"
                +       "|     agregar un numero por cada uno                  |\n"
                +       "| ----------------------------------------------------|\n";
        System.out.println(rec);
    }
}
