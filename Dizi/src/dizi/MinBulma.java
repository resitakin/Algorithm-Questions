/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dizi;

/**
 *
 * @author Mehmet AKIN
 */
public class MinBulma {
    
    public static void enkgöster(int d[]){
        
        int enk=d[0];
        for (int i = 0; i <d.length; i++) {
            if (enk>d[i]) {
                
                enk=d[i];
            }
        }
        System.out.println(enk);
    
    }
    
}
