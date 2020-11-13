package PegadasDeCarbono;

public class TestCarbon {

	public static void main(String[] args) {
		
		Bicicleta bici= new Bicicleta();
		Carro car=new Carro(100, 20, 0.2);
		Casa hou= new Casa(15,20,0.3);
		CarbonEmissionCost[] lista = {bici,car,hou};
		for (int i=0; i<lista.length; i++ ) {
			System.out.println(lista[i]);
			System.out.println(lista[i].getCarbonEmission());
		}

	}

}
