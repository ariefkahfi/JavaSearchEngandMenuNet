/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programsearchengine;
import java.util.*;
import java.awt.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Refnaldy
 */
public class ProgramSearchEngine {

    public static void main(String[] args) {
        try{
            int menu=0;
            String pil;
            
            while(menu==0){
                System.out.println("##########################");
                System.out.println("#========== MENU ========#");
                System.out.println("#========================#");
                System.out.println("#==Created by: M. Irvan==#");
                System.out.println("#====== zzCOMzz =========#");
                System.out.println("##########################");
                System.out.println("# #");
                System.out.println("# #");
                System.out.println("# #");
                System.out.println("# #");
                System.out.println("# Web yang Dicari = #");
                System.out.println("# #");
                System.out.println("# #");
                System.out.println("# #");
                
                pil = JOptionPane.showInputDialog("Mau Cari apa? : ");
                System.out.println("#############################");
                
                String src2 = null;
                
                java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://"+pil));
            }
        }
        catch (Exception ex) { 
            System.out.println("Error");
        }
    }
    
}
