/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1;

import java.util.Scanner;

/**
 *
 * @author mahhm
 */
public class gradeproblem {
     public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
     int grade = input.nextInt();
     if (grade<=100 && grade >= 90){
     System.out.println("A");
     }
     else if (grade<=89 && grade >= 80){
     }
     System.out.println("B");
     }
}
