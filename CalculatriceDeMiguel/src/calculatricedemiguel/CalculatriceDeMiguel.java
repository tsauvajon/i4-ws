/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricedemiguel;

import fr.epsi.montpellier.i4.classe1.tsauvajon.Add;
import fr.epsi.montpellier.i4.classe1.tsauvajon.Miguel_Service;
import java.util.Scanner;

/**
 *
 * @author thomas.sauvajon
 */
public class CalculatriceDeMiguel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Miguel_Service ms = new Miguel_Service();

        Add addOperation = new Add();
        addOperation.setOp1(4);
        addOperation.setOp2(6);

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Op�rande :");
        float result = sc.nextFloat();

        for (;;) {
            System.out.println("Op�ration (*, +, /, -):");
            String operation = sc.next();
            System.out.println("Op�rande :");
            float op2 = sc.nextFloat();

            switch (operation) {
                case "*":
                    result = ms.getMiguelPort().mul(result, op2);
                    break;
                case "/":
                    try {
                        result = ms.getMiguelPort().div(result, op2);
                    } catch (Exception ae) {
                        System.out.println("Exception attrap�e. Division par 0 ?");
                        continue;
                    }
                    break;
                case "+":
                    result = ms.getMiguelPort().add(result, op2);
                    break;
                case "-":
                    result = ms.getMiguelPort().sub(result, op2);
                    break;
                default:
                    System.out.println("Op�ration invalide");
                    return;
            }

            System.out.println(result);
        }
    }
}
