package com.mycompany.matricesprojecto.util;

public class matriz {
    static Utilidades ut = new Utilidades();
    
    public int[][] definirMatriz(int fila, int columna, String tituloMatriz){
        int[][] matriz = new int[fila][columna];
        
        System.out.println("-> Comienza " + tituloMatriz);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                String msj = "introduce el valor del elemento " + (i + 1) + "," + (j + 1) + ": ";
                matriz[i][j] = ut.numeroSeleccionadoNegativo(msj);
            }
        }
        
        System.out.println(tituloMatriz);
        imprimirMatriz(matriz);
        
        return matriz;
    }
    
    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("" + matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    private void imprimirMatrizEspecial(int[][] matriz, int fila, int columna){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("" + matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
