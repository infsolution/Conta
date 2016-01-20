package br.com.infsolution.conta.modelo;

public class ContaPoupanca extends Conta{
@Override
public void atualiza(double taxa) {
	// TODO Auto-generated method stub
	this.saldo+=this.saldo*taxa*3;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Saldo da conta"+this.saldo;
}

}
