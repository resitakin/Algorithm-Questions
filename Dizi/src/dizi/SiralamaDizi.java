/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dizi;

/**
 *
 * @author Mehmet AKIN
 */
public class SiralamaDizi {
    public static void siralama(int d[]){
        int gecici;
        
        
        for (int i = 0; i <d.length-1; i++) {
                    
            for (int j =i+1; j <d.length; j++) {
                
                if (d[i]>d[j]) {
                    gecici=d[i];
                    d[i]=d[j];
                    d[j]=gecici;
                    
                    
                }
           
    
    }
    }
        for (int i = 0; i <d.length; i++) {
            System.out.println(d[i]);
        }
    }
}