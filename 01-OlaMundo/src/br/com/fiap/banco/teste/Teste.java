package br.com.fiap.banco.teste;

import br.com.fiap.banco.Conta;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cc = new ContaCorrente();
		cc.setSaldo(50);
		cc.setAgencia(123);
		cc.setNumero(321);
		
		cc.depositar(100);
		
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(111,222,1000);
		
		poupanca.retirar(50);
		
		System.out.println(poupanca.verificarSaldo());
		
		Conta cc2 = null;
		if(cc2 != null) {
			System.out.println("Existe uma conta");
		}else {
			System.out.println("Não existe uma conta");
		}
	}

}
