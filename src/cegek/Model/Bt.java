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
public class Bt extends Ceg implements IBt {

    private Beltag beltag;    

    public Bt(Beltag beltag, String alakult, Ugyvezeto ugyvezeto, int dolgozokSzama, ArrayList<Integer> dolgozokAzonositoja) {
        super(alakult, ugyvezeto, dolgozokSzama, dolgozokAzonositoja);
        this.beltag = beltag;
       
    }

   

    @Override
    public void beltagValtozas(Beltag beltag) {
        this.beltag = beltag;
    }

}
