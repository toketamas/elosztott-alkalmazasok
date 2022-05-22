/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cegek;

import cegek.Model.Bt;
import cegek.Model.Cegjegyzek;

/**
 *
 * @author ttoke
 */
public class Cegek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cegjegyzek cegjegyzek = Cegjegyzek.cegjegyzekBetoltes();
        System.out.println(cegjegyzek);
        cegjegyzek.cegjegyzekMentes();
    }
    
}
