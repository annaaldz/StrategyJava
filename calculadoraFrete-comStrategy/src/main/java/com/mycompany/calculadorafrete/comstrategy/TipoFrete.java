/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorafrete.comstrategy;

import com.mycompany.calculadorafrete.comstrategy.frete.Pac;
import com.mycompany.calculadorafrete.comstrategy.frete.Sedex;

/**
 *
 * @author annac
 */
public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Pac();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	};
	
	public abstract Frete obterFrete();
	
}
