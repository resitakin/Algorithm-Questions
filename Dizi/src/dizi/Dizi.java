/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizi;

/**
 *
 * @author Mehmet AKIN
 */
public class Dizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x[]={1,2,5,6,7,9,8,0};
       MaxBulma.sayibulma(x);
        System.out.println("--------");
       DiziGöster.elemangöster(x);
       
       System.out.println("----------");
       MinBulma.enkgöster(x);
        System.out.println("**********");
       SiralamaDizi.siralama(x);
        System.out.println("----------------");
       DToplama.toplama(x);
       
    }
    
}
