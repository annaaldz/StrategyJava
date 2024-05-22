/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorafrete.comstrategy.frete;

import com.mycompany.calculadorafrete.comstrategy.Frete;

/**
 *
 * @author annac
 */
public class Sedex implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.45 + 12;
	}
	
}
