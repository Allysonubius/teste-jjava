package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc =  new Calculadora();
		int soma = calc.somar("1 + 1 + 3");
		assertEquals(5,soma);
	}
	@Test
	public void testeSomarComMock() {
		Calculadora calculadora = mock(Calculadora.class);
		
		//when(Calculadora.somar("1 + 2").thenReturn(10));
		
		int resultado = calculadorasomar("1 + 2");
		
		assertEquals(10,resultado);
	}
	private int calculadorasomar(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	private Calculadora mock(Class<Calculadora> class1) {
		// TODO Auto-generated method stub
		return null;
	}

}
