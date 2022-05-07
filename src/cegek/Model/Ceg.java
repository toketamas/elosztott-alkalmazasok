/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cegek.Model;

import java.util.ArrayList;

/**
 *
 * @author ttoke
 */
public abstract class Ceg {
    
    private String alakult;
    private Ugyvezeto ugyvezeto;
    private int dolgozokSzama;
    private ArrayList<Integer> dolgozokAzonositoja;

    public Ceg(String alakult, Ugyvezeto ugyvezeto, int dolgozokSzama, ArrayList<Integer> dolgozokAzonositoja) {
        this.alakult = alakult;
        this.ugyvezeto = ugyvezeto;
        this.dolgozokSzama = dolgozokSzama;
        this.dolgozokAzonositoja = dolgozokAzonositoja;
    }
    
}
