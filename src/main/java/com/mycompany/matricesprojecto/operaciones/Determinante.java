package com.mycompany.matricesprojecto.operaciones;

import com.mycompany.matricesprojecto.util.Utilidades;
import com.mycompany.matricesprojecto.util.matriz;

public class Determinante {
    static Utilidades ut = new Utilidades();
    static matriz mt = new matriz();
    
    public void Determinante2() {
        int order = ut.numeroSeleccionado("ingresar el orden de la matriz:");
        int[][] matriz = mt.definirMatriz(order, order, "Matriz principal");
        System.out.println("el determinnate es: " + determinante(matriz, order));
    }
    
    private int determinante(int[][] matriz, int orden) {
        int det = 0;
        if(orden == 1) {
            det = matriz[0][0];
        } else {
            for(int j = 0; j < orden; j++) {
                det = det + matriz[0][j] * cofactor(matriz, orden, 0, j);
            }
        }
        return det;
    }
    
    private int cofactor(int[][] matriz, int orden, int fila, int columna) {
        int[][] submatriz = new int[matriz.length - 1][matriz.length - 1];        
        int n = orden - 1;
        
        int x = 0;
        int y = 0;
        for(int i = 0; i < orden; i++) {
            for(int j = 0; j < orden; j++) {
                if(i != fila && j != columna){
                    submatriz[x][y] = matriz[i][j];
                    y++;
                    if(y >= n) {
                        x++;
                        y = 0;
                    }
                }
            }
        }
        int v = (int) Math.pow(-1, fila + columna);
        return v * determinante(submatriz, n);
    }
}
