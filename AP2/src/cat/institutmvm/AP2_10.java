/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
//EX3E

//Nom: Kilian
//Cognoms: Sánchez Ramos
//INS Manuel Vázquez Montalbán
//Data d'edició: 27/10/2022
//Nom del cilce formatiu: Desenvolupament d'Aplicacions Web
//Nom del mòdul: Programació
public class AP2_10 {

    private static final String MSG_1 = "Molt bé";

    private static final String MSG_2 = "No esta bé";

    private static final String MSG_3 = "Introdueix un nombre entre el 25 i el 50:";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_3);
        num = sc.nextInt();

        if (num > 25 && num < 50) {
            System.out.println(MSG_1);
        } else {
            System.out.println(MSG_2);
        }

    }

}
