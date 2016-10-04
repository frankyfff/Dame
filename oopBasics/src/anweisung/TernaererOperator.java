package anweisung;

public class TernaererOperator {

	private boolean schalter;

	public void showTernaerOperator() {
		
		if (schalter) {
			setSchalter(false);
		} else {
			setSchalter(true);
		}
		
		String temp;
		temp = getSchalter() ? "TRUE" : "FALSE";
		
		System.out.println(temp);
	}

	
	
	public void setSchalter(boolean schalter) {
		this.schalter = schalter;
	}

	private boolean getSchalter() {
		return schalter;
	}

	public static void main(String[] args) {
		TernaererOperator to = new TernaererOperator();
		to.showTernaerOperator();
		to.showTernaerOperator();
		to.showTernaerOperator();
		
	}
}
