/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cegek.Model;

import java.util.ArrayList;

/**
 *
 * @author ttoke
 */
public interface ICegjegyzek {
    public ArrayList<Ceg> listaBekerulesDatumSzerint();
    public ArrayList<Ceg> listaLetszamSzerint();
    public ArrayList<Ceg> listaAlaptokeSzerint();
    public void cegjegyzekMentes();
   
}
