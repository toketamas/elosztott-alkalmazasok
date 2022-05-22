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
public class Beltag extends User implements Serializable{

    public Beltag(int aznosito,String nev) {
        super();
        this.nev = nev;
    }
    private String nev;

    public String getNev() {
        return nev;
    }
    
    
}
