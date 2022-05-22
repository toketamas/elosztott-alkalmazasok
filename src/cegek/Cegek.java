/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cegek;

import cegek.Model.Beltag;
import cegek.Model.Bt;
import cegek.Model.Ceg;
import cegek.Model.Cegjegyzek;
import cegek.Model.Kft;
import cegek.Model.Ugyvezeto;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Timestamp;    
import java.util.Date;   

/**
 *
 * @author ttoke
 */
public class Cegek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beltag beltag = new Beltag(1, "Beltag János");
        Ugyvezeto btUgyvezeto = new Ugyvezeto(2, 33, "Főiskola");
        ArrayList<Integer> btDolgozokAzonositoja = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Bt bt = new Bt(beltag, "2021-11-04", btUgyvezeto, 6, btDolgozokAzonositoja);

        Ugyvezeto kftUgyvezeto = new Ugyvezeto(11, 53, "Középiskola");
        ArrayList<Integer> kftDolgozokAzonositoja = new ArrayList<Integer>(Arrays.asList(11, 22, 33, 44, 55, 66, 77));

        Kft kft = new Kft(12000000, "2022-02-24", kftUgyvezeto, 7, kftDolgozokAzonositoja);
        Cegjegyzek cegjegyzek = Cegjegyzek.cegjegyzekBetoltes();
       //ha a cégjegyzék üres beleteszi a kft-t és a bt-t és elmenti a cégjegyzéket
        if (cegjegyzek.getLista().size() == 0) {

            cegjegyzek.addCeg(kft);
            cegjegyzek.addCeg(bt);
            cegjegyzek.cegjegyzekMentes();
        } else {
            ArrayList<Ceg> ceglista = cegjegyzek.getLista();
            for (int i = 0; i < ceglista.size(); i++) {
                if(ceglista.get(i).getClass()==Kft.class){
                    System.out.println("A cég típusa Kft.");
                    System.out.println("Alaptőke:"+((Kft)ceglista.get(i)).getAlapToke());
                    System.out.println("Dolgozók száma"+(ceglista.get(i)).getDolgozokSzama());
                    System.out.println("Ügyvezető végzettsége:"+(ceglista.get(i)).getUgyvezeto().getVegzettseg());
                    System.out.println("Ügyvezető kora:"+(ceglista.get(i)).getUgyvezeto().getKor());
                    ArrayList<Integer> dolgozoAzonositok= (ceglista.get(i)).getDolgozokAzonositoja();
                    for(int j=0;j<dolgozoAzonositok.size();j++){
                    System.out.println(j+". dolgozó azonosítója: "+dolgozoAzonositok.get(j));
                    }
                    Timestamp ts= new Timestamp(ceglista.get(i).getCegjegyzekbeKerult());
                    Date date = new Date(ts.getTime());
                    System.out.println("Cégjegyzékbe került: " +  date);
                    System.out.println("");
                }else{
                    System.out.println("A cég típusa Bt.");
                    System.out.println("Beltag neve:"+((Bt)ceglista.get(i)).getBeltag().getNev());
                    System.out.println("Dolgozók száma"+(ceglista.get(i)).getDolgozokSzama());
                    System.out.println("Ügyvezető végzettsége:"+(ceglista.get(i)).getUgyvezeto().getVegzettseg());
                    System.out.println("Ügyvezető kora:"+(ceglista.get(i)).getUgyvezeto().getKor());
                    ArrayList<Integer> dolgozoAzonositok= (ceglista.get(i)).getDolgozokAzonositoja();
                    for(int j=0;j<dolgozoAzonositok.size();j++){
                    System.out.println(j+". dolgozó azonosítója: "+dolgozoAzonositok.get(j));
                    }
                    Timestamp ts= new Timestamp(ceglista.get(i).getCegjegyzekbeKerult());
                    Date date = new Date(ts.getTime());
                    System.out.println("Cégjegyzékbe került: " +  date);
                }
               
            }
        }

    }

}
