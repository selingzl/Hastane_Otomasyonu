/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hastane_otomasyonu;

import java.util.Scanner;

interface islem{
    
    public void tahlil(String a, String b);
    public void rapor(String a,String b);
    
}
public abstract class personelislem implements islem {
    
    public void tahlil(String a,String b){
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextLine();
        a=b;
    }
    public void rapor(String a,String b){
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextLine();
        a=b;
    }
}
