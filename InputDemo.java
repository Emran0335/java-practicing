/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beginnerjava;

import java.util.Scanner;

/**
 *
 * @author emranhossain
 */
public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter any Number: ");
        number = input.nextInt();
        
        System.out.println("Number = "+number);
    }
}
