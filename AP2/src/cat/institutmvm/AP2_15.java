/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Nom: Kilian
//Cognoms: Sánchez Ramos
//INS Manuel Vázquez Montalbán
//Data d'edició: 27/10/2022
//Nom del cilce formatiu: Desenvolupament d'Aplicacions Web
//Nom del mòdul: Programació
package cat.institutmvm;

import java.util.Scanner;
//EX3J

public class AP2_15 {

    private static final String MSG_1 = "El numero mes gran és: ";
    private static final String MSG_2 = "Introdueix un nombre: ";
    private static final String MSG_3 = "Introdueix un altre nombre: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println(MSG_2);
        num1 = sc.nextInt();

        System.out.println(MSG_3);
        num2 = sc.nextInt();

        System.out.println(MSG_3);
        num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);
            } else {
                System.out.println("el mayor es: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("el mayor es: " + num2);
        } else {
            System.out.println("el mayor es: " + num3);
        }
    }
}
