package br.com.infsolution.conta.modelo;

public class AtualizadorDeContas {
	private double saldoTotal;
	private double selic;
	public AtualizadorDeContas(double selic){
		this.selic=selic;
	}
	
	public void roda(Conta account){
		System.out.println("Saldo Inicial: "+account.getSaldo());
		account.atualiza(this.selic);
		System.out.println("Saldo Atulizado: "+account.getSaldo());
		this.saldoTotal+=account.getSaldo();
		
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}
