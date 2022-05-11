/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cegek.Model;

/**
 *
 * @author ttoke
 */
public class Ugyvezeto extends User {
    private int kor;
    private String vegzettseg;

    public Ugyvezeto(int kor, String vegzettseg) {
        super();
        this.kor = kor;
        this.vegzettseg = vegzettseg;
    }
    
    
    public Ugyvezeto ugyvezetotMasol(){
        return this;
    }
}
