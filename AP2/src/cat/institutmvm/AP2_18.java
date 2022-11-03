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

/**
 *
 * @author Kilian
 */
public class AP2_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

}
