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
//EX3G

public class AP2_12 {

    private static final String MSG_1 = "Introdueix un nombre senar";
    private static final String MSG_2 = "Es senar";
    private static final String MSG_3 = "No es senar";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(MSG_2);

        } else {
            System.out.println(MSG_3);
        }

    }

}
