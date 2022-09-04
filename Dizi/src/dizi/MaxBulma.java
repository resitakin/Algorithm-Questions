/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dizi;

/**
 *
 * @author Mehmet AKIN
 */
public class MaxBulma {
    public static void sayibulma(int d[]){
       
        int max=d[0];
        for (int i = 0; i <d.length; i++) {
            if (max<d[i]) {
                max=d[i];
                
            }
        
        }
        System.out.println(max);

   }
}