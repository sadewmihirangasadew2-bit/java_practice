/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

import java.util.Scanner;
public class JavaApplication {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter your name: ");
        String name = input.nextLine();
        
        System.out.print("enter your age: ");
        int age = input.nextInt();
        
        System.out.println("Hello " + name );
        System.out.println("Your Age is " + age);
    }
    
}
