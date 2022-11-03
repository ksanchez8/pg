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
//EX3K

public class AP2_16 {

    private static final String MSG_1 = "Introdueix dos nombres que es divideixin";
    private static final String MSG_2 = "El nombre donat si que es divisible";
    private static final String MSG_3 = "El nombre donat no es divisible";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2;
        System.out.println(MSG_1);
        num = sc.nextInt();
        num2 = sc.nextInt();
        if (num % num2 == 0) {

            System.out.println(MSG_2);

        } else {
            System.out.println(MSG_3);

        }

    }

}
