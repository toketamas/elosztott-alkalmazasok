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
public abstract class Ceg implements Serializable{

    private String alakult;
    private Ugyvezeto ugyvezeto;
    private int dolgozokSzama;
       
    public Ceg(String alakult, Ugyvezeto ugyvezeto, int dolgozokSzama, ArrayList<Integer> dolgozokAzonositoja) {
        this.alakult = alakult;
        this.ugyvezeto = ugyvezeto;
        this.dolgozokSzama = dolgozokSzama;
        this.dolgozokAzonositoja = dolgozokAzonositoja;
        this.cegjegyzekbeKerult = cegjegyzekbeKerult;
        this.cegjegyzekbeKerult = 0L;
       
    }

    public String getAlakult() {
        return alakult;
    }

    public Ugyvezeto getUgyvezeto() {
        return ugyvezeto;
    }

    public ArrayList<Integer> getDolgozokAzonositoja() {
        return dolgozokAzonositoja;
    }
    private ArrayList<Integer> dolgozokAzonositoja;
    private Long cegjegyzekbeKerult;

  

    public int getDolgozokSzama() {
        return dolgozokSzama;
    }

    public void setCegjegyzekbeKerult(Long cegjegyzekbeKerult) {
        this.cegjegyzekbeKerult = cegjegyzekbeKerult;
    }

    public Long getCegjegyzekbeKerult() {
        return cegjegyzekbeKerult;
    }
    
   


}
