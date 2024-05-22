/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorafrete.semstrategy;

import java.util.Scanner;

/**
 *
 * @author annac
 */
public class CalculadoraFreteSemStrategy {

    public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Informe a distância(Km): ");
			int distancia = entrada.nextInt();
			System.out.print("Qual o tipo de frete (1) PAC, (2) SEDEX: ");
			int opcaoFrete = entrada.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
			
			Frete frete = new Frete(tipoFrete);
			double preco = frete.calcularPreco(distancia);
			System.out.printf("O valor total é de R$%.2f", preco);
		}
	}
}
