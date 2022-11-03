/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
//EX3A

//Nom: Kilian
//Cognoms: Sánchez Ramos
//INS Manuel Vázquez Montalbán
//Data d'edició: 27/10/2022
//Nom del cilce formatiu: Desenvolupament d'Aplicacions Web
//Nom del mòdul: Programació
public class AP2_6 {

    private static final String MSG_1 = "Introdueix un valor: ";
    private static final String MSG_2 = "Es positiu ";
    private static final String MSG_3 = "Es negatiu";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num < 0) {
            System.out.println(MSG_3);
        } else {

            System.out.println(MSG_2);
        }

    }
}
