/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cegek.Model;

import java.io.Serializable;

/**
 *
 * @author ttoke
 */
public class Ugyvezeto extends User implements Serializable{
    private int kor;
    private String vegzettseg;

    public Ugyvezeto(int azonosito,int kor, String vegzettseg) {
        super();
        this.kor = kor;
        this.vegzettseg = vegzettseg;
    }

    public int getKor() {
        return kor;
    }

    public String getVegzettseg() {
        return vegzettseg;
    }
    
    
    public Ugyvezeto ugyvezetotMasol(){
        return this;
    }
}
