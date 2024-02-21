/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array4;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Array4 {

    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);  
      int array;
      int i;
        System.out.print("Digite o tamanho do array: ");
        array = scanner.nextInt();
        int []numeros = new int [array];
        int []numeros2 = new int [array];
        for (i = 0; i < array; i++) {
          System.out.println("Digite o numero na posicao "+i);
          numeros[i]=scanner.nextInt();
      }for ( i = 0; i < array; i++) {
        System.out.println(numeros[i]);
      }
      for (i = 0; i < array; i++) {
          System.out.println("Digite o numero na posicao "+i);
          numeros2[i]=scanner.nextInt();
      }for ( i = 0; i < array; i++) {
        System.out.println(numeros2[i]);
      }
      for ( i = 0; i < array; i++) {
        int total = numeros[i]+numeros2[i];
        System.out.println("A soma dos numeros na posicao "+i+" e igual a "+total);
      }
  }
}
SS