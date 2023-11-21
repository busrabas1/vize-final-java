/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puanhesaplama;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Puanhesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double not;
        double vize;
        double fnal;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Vize Notu giriniz");
    vize=scanner.nextInt();
    Scanner scann=new Scanner(System.in);
    System.out.println("Final Notu giriniz");
    fnal=scann.nextInt();
    not=vize*0.40+fnal*0.60;
    
        if (not>90) {
            System.out.println("AA"); 
            
        }
        else if  ((not>=70) && (not<90)) {
            System.out.println("BB");
            
        }
        else if ((not>=50) && (not<70)) {
            System.out.println("CC");
              
        }
        else if ((not>=30) && (not<50)) {
            System.out.println("DD");
              
        }
        else if ((not>=0)  && (not<30)) {
            System.out.println("FF");
              
        }
    }
    
}
