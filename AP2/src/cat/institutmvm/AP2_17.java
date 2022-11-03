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
//EX4A
package cat.institutmvm;

import java.util.Scanner;

public class AP2_17 {

    private static final String MSG_1 = "Introdueix un nombre del 1 al 12";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();

        if (num >= 1 && num <= 12) {
            if (num == 1) {
                System.out.println("Enero");
            }
            if (num == 2) {
                System.out.println("Febrero");
            }
            if (num == 3) {
                System.out.println("Marzo");

            }
            if (num == 4) {
                System.out.println("Abril");
            }
            if (num == 5) {
                System.out.println("Mayo");
            }
            if (num == 6) {
                System.out.println("Junio");
            }
            if (num == 7) {
                System.out.println("Julio");

            }
            if (num == 8) {
                System.out.println("Agosto");
            }

            if (num == 9) {
                System.out.println("Septiembre");
            }
            if (num == 10) {
                System.out.println("Octubre");
            }
            if (num == 11) {
                System.out.println("Noviembre");

            }
            if (num == 12) {
                System.out.println("Diciembre");
            }
        } else {
            System.out.println("Error");
        }

    }
}
