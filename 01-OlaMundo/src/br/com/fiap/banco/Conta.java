package br.com.fiap.banco;

/**
 * Classe que abstrai uma Conta bancária
 * @author AlmeidaGih
 * @version 1.0
 */
public abstract class Conta {
	
	/**
	 * Número da conta
	 */
	private int numero;
	/**
	 * Número da agência
	 */
	private int agencia;
	/**
	 * Saldo da conta
	 */
	protected double saldo;
	
	public Conta(int numero) {
		this.numero = numero;
	}
	
	public Conta(int numero, int agencia, double saldo) {
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSaldo(saldo);
	}
	
	/**
	 * Deposita um valor ao saldo da conta
	 * @param valor Valor a ser depositado
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Verifica o saldo da conta 
	 * @return Valor do saldo da conta
	 */
	public abstract double verificarSaldo();
}
