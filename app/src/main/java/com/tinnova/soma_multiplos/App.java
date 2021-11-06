/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tinnova.soma_multiplos;

import com.tinnova.soma_multiplos.core.Multiplos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Programa para somar os múltiplos de 5 ou 3 ===");
        System.out.println("Digite o valor limite para a soma dos múltiplos: (não inclusivo)");
        int value = input.nextInt();
        System.out.printf("O resultado da soma de todos os multiplos de 3 ou 5 abaixo de %d é %d.",
                value, Multiplos.getSumMultiplos3or5(value));
        input.close();
    }
}
