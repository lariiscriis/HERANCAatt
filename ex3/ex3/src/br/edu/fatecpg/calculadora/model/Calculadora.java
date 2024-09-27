package br.edu.fatecpg.calculadora.model;

public class Calculadora implements OperacaoMatematica{
	private double a;
	private double b;
	
	public double getA(){
        return this.a;
    }

	public void setA(double a){
        this.a = a;
	}
	
	public double getB(){
        return this.b;
    }

	public void setB(double b){
        this.b = b;
	}
	
	public Calculadora(double a, double b)
	{ 
	this.a = a;
	this.b = b;	
	}
	
	@Override
	public double soma() {
		return a + b;
	}

	@Override
	public double subtracao() {
		return a - b;
	}

	@Override
	public double multiplicacao() {
		return a * b;
	}

	@Override
	public double divisao() {
		return a / b;
	}
	
}
