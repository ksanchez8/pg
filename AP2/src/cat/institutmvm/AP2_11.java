/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
//EX3F

//Nom: Kilian
//Cognoms: Sánchez Ramos
//INS Manuel Vázquez Montalbán
//Data d'edició: 27/10/2022
//Nom del cilce formatiu: Desenvolupament d'Aplicacions Web
//Nom del mòdul: Programació
public class AP2_11 {

    private static final String MSG_1 = "Es menor a 15";
    private static final String MSG_2 = "Es mayor a 15";
    private static final String MSG_3 = "Introdueix dos valors:";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_3);
        num1 = sc.nextInt();

        num2 = sc.nextInt();

        if (num1 % num2 < 15) {

            System.out.println(MSG_1);
        } else {
            System.out.println(MSG_2);

        }

    }
}
