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

    private int alapToke;

    public Kft(int alaptoke, String alakult, String cegvezetoNeve, int dolgozokSzama, ArrayList<Integer> dolgozokAzonositoja) {
        super(alakult, cegvezetoNeve, dolgozokSzama, dolgozokAzonositoja);
        this.alapToke = alaptoke;
    }
    @Override
    public void alaptokeValtozas(int alapToke) {
        this.alapToke=alapToke;
    }
    
}
