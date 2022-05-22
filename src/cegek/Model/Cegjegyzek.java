/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cegek.Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Serializable;

/**
 *
 * @author ttoke
 */
public class Cegjegyzek implements ICegjegyzek, Serializable {

    private ArrayList<Ceg> lista;

    public Cegjegyzek() {
        this.lista = null;
    }

    public void addCeg(Ceg ceg) {
        ceg.setCegjegyzekbeKerult(new Timestamp(System.currentTimeMillis()).getTime());
        lista.add(ceg);
    }

    @Override
    public ArrayList<Ceg> listaBekerulesDatumSzerint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Ceg> listaLetszamSzerint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Ceg> listaAlaptokeSzerint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cegjegyzekMentes() {
        try {
            FileOutputStream file = new FileOutputStream("cegjegyzek.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(this);
            out.close();
            file.close();
            System.out.println("A cégjegyzék mentése megtörtént!");
        } catch (IOException ex) {
            System.out.println("A cégjegyzék mentése sikertelen.");
        }
    }

    @Override
    public Cegjegyzek cegjegyzekBetoltes() {
        try {
            FileInputStream file = new FileInputStream("cegjegyzek.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            Cegjegyzek cegjegyzek = (Cegjegyzek) in.readObject();

            in.close();
            file.close();
            System.out.println("Cégjegyzék beolvasva");
            return cegjegyzek;
        } catch (IOException ex) {
            System.out.println("Cégjegyzék betöltése sikertelen");
            return null;
        }

    }

}
