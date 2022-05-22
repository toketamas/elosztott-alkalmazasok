/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cegek.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ttoke
 */
public class Kft extends Ceg implements IKft,Serializable {
    
    private Ugyvezeto ugyvezeto;
    private int alapToke;

    public int getAlapToke() {
        return alapToke;
    }
    

    public Kft(int alapToke, String alakult, Ugyvezeto ugyvezeto, int dolgozokSzama, ArrayList<Integer> dolgozokAzonositoja) {
        super(alakult, ugyvezeto, dolgozokSzama, dolgozokAzonositoja);
        this.alapToke=alapToke;
        this.ugyvezeto=ugyvezeto;
    }     
    
    @Override
    public void alaptokeValtozas(int alapToke) {
        this.alapToke=alapToke;
    }
    
}
