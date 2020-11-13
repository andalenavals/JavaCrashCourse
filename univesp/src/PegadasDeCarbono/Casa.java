package PegadasDeCarbono;

public class Casa implements CarbonEmissionCost{
	private double electricityConsumption; //kwatday
	private double gasConsumption; 
	private double emission_factor; 
	
	public Casa(double electricityConsumption, double gasConsumption, double emission_factor) {
		this.electricityConsumption = electricityConsumption;
		this.gasConsumption = gasConsumption;
		this.emission_factor = emission_factor;
	}

	public double getCarbonEmission(){
		return emission_factor*electricityConsumption*gasConsumption;
	}
	
	public double getElectricityConsumption() {
		return electricityConsumption;
	}

	public void setElectricityConsumption(double electricityConsumption) {
		this.electricityConsumption = electricityConsumption;
	}

	public double getGasConsumption() {
		return gasConsumption;
	}

	public void setGasConsumption(double gasConsumption) {
		this.gasConsumption = gasConsumption;
	}

	public double getEmission_factor() {
		return emission_factor;
	}

	public void setEmission_factor(double emission_factor) {
		this.emission_factor = emission_factor;
	}

	@Override
	public String toString() {
		return "Casa [electricityConsumption=" + electricityConsumption + ", gasConsumption=" + gasConsumption
				+ ", emission_factor=" + emission_factor + "]";
	}
}
