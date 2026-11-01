/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;
public class JavaApplication8 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        
        input.nextLine();
        
        System.out.print("Enter your university: ");
        String university = input.nextLine();
        
        
        System.out.print("Enter your course: ");
        String course = input.nextLine();
        
        System.out.print("Enter your years of study: ");
        int years = input.nextInt();
        
        
        System.out.println("Hello " + name);
        System.out.println("Age is "+ age);
        System.out.println("University is : "+ university);
        System.out.println("Course is : " + course);
        System.out.println("years of study :" + years);
        
        
        
    } 
    
}
