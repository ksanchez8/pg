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
//EX3I

public class AP2_14 {

    private static final String MSG_1 = "El numero mes gran és: ";
    private static final String MSG_2 = "Introdueix un nombre: ";
    private static final String MSG_3 = "Introdueix un altre nombre: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2;

        System.out.println(MSG_2);
        num = sc.nextInt();

        System.out.println(MSG_3);
        num2 = sc.nextInt();

        if (num > num2) {
            System.out.println(MSG_1);
            System.out.println(num);
        } else {
            System.out.println(MSG_1);
            System.out.println(num2);

        }

    }
}
