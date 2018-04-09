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
            String pil = "";
            
            while(!pil.equals("quit")){
                System.out.println("##########################");
                System.out.println("#========== MENU ========#");
                System.out.println("#========================#");
                System.out.println("##########################");
                
                pil = JOptionPane.showInputDialog("Mau Cari apa? : ");
                if(pil.equals("quit")) break;
                System.out.println("#############################");
                
                java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://"+pil));
            }
        }
        catch (Exception ex) { 
            System.out.println("Error");
        }
    }
    
}
