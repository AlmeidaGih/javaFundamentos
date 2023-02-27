package br.com.fiap.banco;

public final class ContaPoupanca extends Conta{
	public ContaPoupanca(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	@Override 
	public double verificarSaldo() {
		return saldo;
	}
}
