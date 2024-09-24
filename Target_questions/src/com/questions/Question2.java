package com.questions;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }

    public static boolean pertenceFibonacci(int numero) {
        int a = 0;
        int b = 1;
        
        if (numero == 0 || numero == 1) {
            return true;
        }
        // Calcula a sequência Fibonacci até o número ser maior igual ao input
        while (b <= numero) {
            if (b == numero) {
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        
        return false;
    }
}
