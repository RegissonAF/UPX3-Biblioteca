/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.upx3.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author regis
 */
public class cntrl_Livros {
    private ArrayList<Livros> livros = new ArrayList<>();
    
    public boolean save (Livros l){
        if (l != null) {
            livros.add(l);
            return true;
        
        }else
            return false;
    }
    public ArrayList<Livros> visualizar (){
        return livros;
        
    }
}
