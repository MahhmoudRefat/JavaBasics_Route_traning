/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package session1;

import java.util.Scanner;

/**
 *
 * @author mahhm
 */
public class TimeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in) ;
       int second = input.nextInt();
       int hours = (second / (60 * 60));
       second %= (60*60);
       int min = second /60 ; //66
       second = second % 60;

       System.out.print(hours + " "+ min + " " + second);
       
    }
    
}
