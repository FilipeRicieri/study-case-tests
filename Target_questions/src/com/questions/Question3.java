package com.questions;

public class Question3 {

	package com.questions;

	public class FaturamentoDiario {

	    public static void main(String[] args) {
	        // Exemplo de vetor com valores de faturamento diário
	        double[] faturamento = {1200.50, 3200.00, 2700.25, 500.75, 2900.30, 0.0, 2300.10, 0.0, 1800.60, 4100.90};

	        double menorFaturamento = encontrarMenorFaturamento(faturamento);
	        double maiorFaturamento = encontrarMaiorFaturamento(faturamento);
	        double mediaMensal = calcularMediaMensal(faturamento);
	        int diasAcimaMedia = contarDiasAcimaMedia(faturamento, mediaMensal);

	        System.out.println("Menor faturamento diário: R$ " + menorFaturamento);
	        System.out.println("Maior faturamento diário: R$ " + maiorFaturamento);
	        System.out.println("Número de dias com faturamento superior à média: " + diasAcimaMedia);
	    }

	    public static double encontrarMenorFaturamento(double[] faturamento) {
	        double menor = Double.MAX_VALUE;
	        
	        // Ignora dias sem faturamento (faturamento = 0.0)
	        for (double valor : faturamento) {
	            if (valor != 0.0 && valor < menor) {
	                menor = valor;
	            }
	        }
	        return menor;
	    }

	    public static double encontrarMaiorFaturamento(double[] faturamento) {
	        double maior = Double.MIN_VALUE;

	        for (double valor : faturamento) {
	            if (valor > maior) {
	                maior = valor;
	            }
	        }
	        return maior;
	    }

	    public static double calcularMediaMensal(double[] faturamento) {
	        double soma = 0;
	        int diasComFaturamento = 0;

	        // Considera apenas dias com faturamento (> 0)
	        for (double valor : faturamento) {
	            if (valor > 0) {
	                soma += valor;
	                diasComFaturamento++;
	            }
	        }

	        return diasComFaturamento > 0 ? soma / diasComFaturamento : 0;
	    }

	    public static int contarDiasAcimaMedia(double[] faturamento, double media) {
	        int count = 0;

	        for (double valor : faturamento) {
	            if (valor > media) {
	                count++;
	            }
	        }

	        return count;
	    }
	}

	
}
