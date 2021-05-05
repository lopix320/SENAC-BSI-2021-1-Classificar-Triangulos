/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heredia;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        num1 = leitor.nextDouble();
        System.out.print("Digite o segundo número:");
        num2 = leitor.nextDouble();
        System.out.print("Digite o terceiro número:");
        num3 = leitor.nextDouble();
        
        if(num1 >= (num2 + num3) || num2 >= (num1 + num3) || num3 >= (num2 + num1)){
            System.out.print("Não forma triangulo\n");
        }
            else{
                if(num1 != num2 && num2 != num3 && num3 != num1){
                System.out.println("Triangulo Escaleno");
                }
                if(num1 == num2 && num2 == num3 && num3 == num1){
                System.out.println("Triangulo Equilatero\n");
                }
                else{
                if (num1 == num2 || num2 == num3 || num1 == num3){
                System.out.println("Triangulo Isosceles");
                }
            
            }
        }
    
    }
}

