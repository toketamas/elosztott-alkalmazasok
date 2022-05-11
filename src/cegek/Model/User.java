/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cegek.Model;

import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author ttoke
 */
public class User  implements Serializable{

    private String azonosito;

    public User() {
        this.azonosito=setAzonosito();
    }

    public String getAzonosito() {
        return azonosito;
    }

    private String setAzonosito() {
       // System.err.println(LocalDateTime.now().toString().replaceAll("-", "").replaceAll(":", "").replace("T", "").replace(".", ""));
       // System.err.println("Int: " + Integer.MAX_VALUE);
       // System.err.println("Long: " + Long.MAX_VALUE);
       return  "U"+new Timestamp(System.currentTimeMillis()).getTime();
        //System.out.println(timestamp.getTime());
      //Integer.parseInt(LocalDateTime.now().toString().replaceAll("-", "").replaceAll(":", "").replace("T", "").replace(".", ""));
    }

}
