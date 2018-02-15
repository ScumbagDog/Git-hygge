package conradPakke;

public class Conrad {
	protected boolean drinksBeer = true;
	protected double promille = 1.5;

	public boolean isDrinksBeer(){
		return drinksBeer;
	}

	public double getPromille(){
		return promille;
	}

	public void giveBeer(){
		this.promille += 0.2;
	}
}
