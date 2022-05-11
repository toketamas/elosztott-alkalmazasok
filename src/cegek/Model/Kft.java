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
public class Kft extends Ceg implements IKft {

    public Kft(int alapToke, String alakult, Ugyvezeto ugyvezeto, int dolgozokSzama, ArrayList<Integer> dolgozokAzonositoja) {
        super(alapToke, alakult, ugyvezeto, dolgozokSzama, dolgozokAzonositoja);
    }     
    
    @Override
    public void alaptokeValtozas(int alapToke) {
        this.alapToke=alapToke;
    }
    
}
