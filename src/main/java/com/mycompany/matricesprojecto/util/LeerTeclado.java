package com.mycompany.matricesprojecto.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerTeclado {
    
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public int leerInt(String  msg) throws IOException{
        int val;
        System.out.println(msg);
        val = Integer.parseInt(br.readLine());
        return val;
    }
}
