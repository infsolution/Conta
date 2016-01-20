package br.com.infsolution.conta.modelo;

public class ContaCorrente extends Conta{
	@Override
public void atualiza(double taxa) {
	// TODO Auto-generated method stub
	this.saldo+=this.saldo*taxa*2;
}
@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		this.saldo -= valor-0.10;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Saldo da conta"+this.saldo;
}
}
