/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationbeginner;
import java.util.Scanner;
public class JavaApplicationbeginner {
 /*
 Kullanıcıdan değişken alarak vucüt kitle indeksini hesaplamak. 
    kilo / boy * boy 
    
*/
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Kilonuzu Girin : ");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu girin : ");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy*boy);
        System.out.println("Beden Kitle Indeksiniz : " + bki);
        
    }
    
}
