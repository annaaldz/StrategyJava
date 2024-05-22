/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorafrete.semstrategy;

/**
 *
 * @author annac
 */
public class Frete {

	private TipoFrete tipo;
	
	public Frete(TipoFrete tipo) {
		this.tipo = tipo;
	}

	public double calcularPreco(int distancia) {
		double preco = 0;
		if (TipoFrete.PAC.equals(tipo)) {
			preco = distancia * 1.25 + 10;
		} else if (TipoFrete.SEDEX.equals(tipo)) {
			preco = distancia * 1.45 + 12;
		}
		
		return preco;
	}
	
}
