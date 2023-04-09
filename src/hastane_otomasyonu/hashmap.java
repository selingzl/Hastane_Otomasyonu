/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hastane_otomasyonu;

import java.util.HashMap;

/**
 *
 * @author Lenovo
 */
public class hashmap {
    static HashMap<String, String> signpanelhasta= new HashMap<String,String>();
    static HashMap<String, String> signpanelhastaad= new HashMap<String,String>();
    static HashMap<String, String> signpanelpersonel= new HashMap<String,String>();
    static HashMap<String, String> signpanelpersonelad= new HashMap<String,String>();
    static HashMap<String, String> signpanelpersonelunvan= new HashMap<String,String>();
    static HashMap<String, String> signpanelyonetici= new HashMap<String,String>();
    static HashMap<String, String> signpanelyoneticiad= new HashMap<String,String>();
    static HashMap<String, String> doktor= new HashMap<String,String>();
    static HashMap<String, String> onaylanmıs= new HashMap<String,String>();
    static HashMap<String, String> onay= new HashMap<String,String>();
    static HashMap<String, String> onayhasta= new HashMap<String,String>();
    
    static HashMap<String, String> hastarapor= new HashMap<String,String>();
  
    
    static HashMap hemsire=new HashMap();
    static HashMap tahlilg=new HashMap();
    static HashMap tahlilh=new HashMap();
    static HashMap tahlilk=new HashMap();
    static HashMap tahlilu=new HashMap();
    static HashMap maas=new HashMap();
   
    
    
    static String hAD;
    static String pAD;
    static String yAD;
    static String hastaTC;
    static String hsifre;
    static String personelNO;
    static String psifre;
    static String punvan;
    static String yoneticiNO;
    static String ysifre;
    static String glukozh;
    static String hemoglobinh;
    static String urikasith;
    static String kreatininh;
    static String b;
    static String a;
    static String hastatc;
    static String dn;
    
    
    
    //static HashMap<String,String> tahlil=new HashMap<String,String>();
    public hashmap(){
       signpanelpersonel.put(personelNO, psifre);
       signpanelpersonelad.put(personelNO, pAD);
       signpanelpersonelunvan.put(personelNO, punvan);
       signpanelhastaad.put(hastaTC, hAD);
       signpanelhasta.put(hastaTC, hsifre);
       signpanelyonetici.put(yoneticiNO, ysifre);
       signpanelyoneticiad.put(yoneticiNO, yAD);
       tahlilg.put(hastatc, hashmap.glukozh);
       tahlilh.put(hastatc, hashmap.hemoglobinh);
       tahlilk.put(hastatc, hashmap.kreatininh);
       tahlilu.put(hastatc, hashmap.urikasith);
       maas.put(personelNO, maas);
    }
    public static void main(String[] args){
       
        
        
    }
    
}
