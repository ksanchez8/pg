/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
//EX3B

//Nom: Kilian
//Cognoms: Sánchez Ramos
//INS Manuel Vázquez Montalbán
//Data d'edició: 27/10/2022
//Nom del cilce formatiu: Desenvolupament d'Aplicacions Web
//Nom del mòdul: Programació
public class AP2_7 {

    private static final String MSG_1 = "Es mayor";

    private static final String MSG_2 = "Es menor";

    private static final String MSG_3 = "Introdueix un nombre mayor a 35:";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_3);
        num = sc.nextInt();

        if (num > 35) {
            System.out.println(MSG_1);
        } else {
            System.out.println(MSG_2);
        }

    }

}
