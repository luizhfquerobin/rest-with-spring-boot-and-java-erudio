package com.querobin.math;

public class SimpleMath {
	// Somar
	public Double sum(Double numberOne, Double numberTwo) {

		return numberOne + numberTwo;
	}

	// Subtrair
	public Double subtraction(Double numberOne, Double numberTwo) {

		return numberOne - numberTwo;
	}

	// Multiplicação
	public Double multiplication(Double numberOne, Double numberTwo) {

		return numberOne * numberTwo;
	}

	// Divisão
	public Double division(Double numberOne, Double numberTwo) {

		return numberOne / numberTwo;
	}

	// Média
	public Double mean(Double numberOne, Double numberTwo) {

		return (numberOne + numberTwo) / 2;
	}

	// Raiz Quadrada
	public Double squareRoot(Double number) {

		return Math.sqrt(number);
	}
}
