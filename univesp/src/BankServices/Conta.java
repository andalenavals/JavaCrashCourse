package BankServices;

public abstract class Conta {
	private int nroConta;
	private double saldo;
	private Data dataApertura;
	private Correntista [] correntistas;
	
	public Conta(int nroConta, Data dataApertura, Correntista [] correntistas, double monto ) {
		this.nroConta=nroConta;
		this.dataApertura=dataApertura;
		this.correntistas=correntistas;
		this.saldo=monto;
	}
	
	public Data getDataApertura() {
		//If we do not pass a clone is risky since other can modify.
		return (Data)dataApertura.clone();
	}
	
	public String toString() {
		String rpta= " nroConta: "+nroConta+" saldo: "+saldo+" dataApertura: "+dataApertura;
		for(int i=0; i<correntistas.length;i++) {
			rpta=rpta+" "+correntistas[i];
		}
		return rpta;
	}
	
	public boolean fazerDeposito(double monto) {
		if(monto>=0) {
			saldo+=monto;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean fazerSaque(double monto) {
		if(saldo>monto) {
			saldo-=monto;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean fazerTransferencia(Conta destino, double monto) {
		if(this.fazerSaque(monto)==true) {
			destino.fazerDeposito(monto);
			return true;
		}
		else {
			return false;
		}
	}
	
	final double consultarSaldo() {
		return saldo;
	}
}
