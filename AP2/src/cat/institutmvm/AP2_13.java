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
//3H

public class AP2_13 {

    private static final String MSG_1 = "Introdueix un nombre";
    private static final String MSG_2 = "Com es senar, el resultat del elevat al cuadrat es:";
    private static final String MSG_3 = "Com es impar, el resultat del elevat al cub es:";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2;
        System.out.println(MSG_1);
        num = sc.nextInt();

        if (num % 2 == 0) {
            num2 = num * num;
            System.out.println(MSG_2);
            System.out.println(num2);

        } else {
            num2 = num * num * num;
            System.out.println(MSG_3);
            System.out.println(num2);

        }

    }

}
