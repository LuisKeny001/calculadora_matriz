package com.mycompany.matricesprojecto.principal;

import com.mycompany.matricesprojecto.operaciones.Determinante;
import com.mycompany.matricesprojecto.operaciones.identidad;
import com.mycompany.matricesprojecto.operaciones.multiplicacion;
import com.mycompany.matricesprojecto.operaciones.resta;
import com.mycompany.matricesprojecto.operaciones.suma;
import com.mycompany.matricesprojecto.operaciones.transpuesta;
import com.mycompany.matricesprojecto.util.Utilidades;

public class MenuPrincipal {
    //utiles
    static Utilidades ut = new Utilidades();
    
    // operaciones
    static identidad id = new identidad();
    static multiplicacion mt = new multiplicacion();
    static resta rt = new resta();
    static suma sm = new suma();
    static transpuesta tr = new transpuesta();
    static Determinante dt2 = new Determinante();
    
    public void menu(){
        int opc;
        do{
            System.out.println("---------------------");
            System.out.println("Bienvenido a la calculadora de matrices");
            
            String msg = presentacionMenu();
            opc = ut.numeroSeleccionado(msg);
            switch (opc) {
                case 0: {
                    System.out.println("TEN UN BUEN DIA");
                    break;
                }
                case 1: {
                    sm.suma();
                    break;
                }
                case 2: {
                    rt.resta();
                    break;
                }
                case 3: {
                    id.matrixIdentidad();
                    break;
                }
                case 4: {
                    mt.multiplicacion();
                    break;
                }
                case 5: {
                    tr.transpuesta();
                    break;
                }
                case 6: {
                    dt2.Determinante();
                    break;
                }
                default: System.out.println("LA OPCION QUE SELECCIONASTE NO EXISTE!!!!!");
            }
        }while(opc != 0);
    }
    
    private String presentacionMenu() {
        String msg = "\n--ELIJA LA OPCION QUE DESEA PROBAR"
                    +"\n[1] suma de matrices"
                    +"\n[2] resta de matrices"
                    +"\n[3] matriz identidad"
                    +"\n[4] multiplicacion de matrices"
                    +"\n[5] transpuesta de matriz"
                    +"\n[6] determinante de la matriz"
                    +"\n[0] salir--------------------------";
        return msg;
    }
}
