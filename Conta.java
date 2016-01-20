package br.com.infsolution.conta.modelo;

public class Conta {
protected double saldo;

public void depositar(double valor){
	this.saldo+= valor;
}
public void sacar(double valor){
	this.saldo-= valor;
}

public double getSaldo(){
	return this.saldo;
}
public void atualiza(double taxa){
	this.saldo+=this.saldo * taxa;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Saldo da conta"+this.saldo;
	}
}
