package bean;
// Generated Oct 24, 2016 5:01:11 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Parkir generated by hbm2java
 */
public class Parkir  implements java.io.Serializable {


     private String kartuParkir;
     private Date tglParkir;
     private String platNomer;
     private String nim;

    public Parkir() {
    }

    public Parkir(String kartuParkir, Date tglParkir, String platNomer, String nim) {
       this.kartuParkir = kartuParkir;
       this.tglParkir = tglParkir;
       this.platNomer = platNomer;
       this.nim = nim;
    }
   
    public String getKartuParkir() {
        return this.kartuParkir;
    }
    
    public void setKartuParkir(String kartuParkir) {
        this.kartuParkir = kartuParkir;
    }
    public Date getTglParkir() {
        return this.tglParkir;
    }
    
    public void setTglParkir(Date tglParkir) {
        this.tglParkir = tglParkir;
    }
    public String getPlatNomer() {
        return this.platNomer;
    }
    
    public void setPlatNomer(String platNomer) {
        this.platNomer = platNomer;
    }
    public String getNim() {
        return this.nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }




}


