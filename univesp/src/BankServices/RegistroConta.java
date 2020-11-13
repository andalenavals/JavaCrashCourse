package BankServices;

public class RegistroConta {
	public static void main(String[] args) {
		Data d1=new Data(07,04,2017);
		Data d2=new Data(15,05,2017);
		Correntista c1 =new Correntista("22222", "Ana");
		Correntista c2= new Correntista("11111", "Jose");
		Correntista c3= new Correntista("33333", "Jesus");
		Correntista [] correntistas1= new Correntista[2];
		correntistas1[0]=c1;
		correntistas1[1]=c2;
		Correntista [] correntistas2= new Correntista[1];
		correntistas2[0]=c3;
		
		// Conta conta= new Conta(3455,d,correntistas1,200);
		Conta conta1= new ContaCorrente(5555,d1,correntistas1,100,0.15);
		Conta conta2= new ContaCorrente(0000,d2,correntistas2,100,0.0);
		System.out.println(conta1);
		conta1.fazerDeposito(800);
		System.out.println(conta1);
		if(conta1.fazerSaque(900)==true) {
			System.out.println("Saque realizado");
		}
		else {
			System.out.println("Saque não realizado, saldo insuficiente");
		}
		System.out.println(conta1);
		
		System.out.println(conta2);
		conta2.fazerDeposito(300);
		System.out.println(conta2);
		System.out.println(conta2.consultarSaldo());
	}
}
