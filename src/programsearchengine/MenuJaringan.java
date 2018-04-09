/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programsearchengine;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author data
 */
public class MenuJaringan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int menu = 0;
            int pil;
            Scanner masuk = new Scanner (System.in);
            
        while(menu==0){
        System.out.println("===============MENU==============");
        System.out.println("1. Perintah Shutdown");
        System.out.println("2. Google");
        System.out.println("3. Exit");
        System.out.println("=================================");
        System.out.println("Masukkan Pilihan Angka Pilihan Anda");
        System.out.println("Pilih = ");
        pil=masuk.nextInt();
        
        if(pil<1 || pil>3){
            System.out.println("Input yang Anda Masukkan Salah !!");
        }else if(pil==3){
            System.exit(0);
        }
        switch(pil){
            case 1:
                Runtime rt = Runtime.getRuntime();
                Process proc;
                try{
                    proc = rt.exec("CMD/C START Shutdown -s");
                }
                catch(Exception e){
                    System.err.println("Caught an error : " +e.getMessage());
                }
                break;
            case 2:
                String scr2 = null;
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.google.co.id"));
            break;
            
            case 3:
                System.exit(0);
        
        }
    }
    
    }catch(Exception ex){ 
        System.out.println("Error");
    }
    }
    
    }