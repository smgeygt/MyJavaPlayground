/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationbeginner;
import java.util.Scanner;
public class JavaApplicationbeginner {
 /*
  Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini  alın ve sürücünün ne kadarödemesi gerektiğini hesaplayın.
    
    
*/
public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Araciniz kilometrede kac kurus yakiyor? : ");
      double price = scanner.nextDouble();
      
      System.out.println("Araciniz ile kac kilometre gittiniz ? :  ");
      double km = scanner.nextDouble();
   
      System.out.println("Toplam odemeniz gereken tutar: " +(price * km)+ " tl dir ...");
      
    }
    
}
