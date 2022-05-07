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

    public Ugyvezeto(int kor, String vegzettseg, int azonosito) {
        super(azonosito);
        this.kor = kor;
        this.vegzettseg = vegzettseg;
    }
}
