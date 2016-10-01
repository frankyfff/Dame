package anweisung;

public class TernaererOperator {

	private boolean schalter;

	public void showTernaerOperator() {
		if (schalter) {
			System.out.println("ififififif");
			setSchalter(false);
		} else {
			System.out.println("elseelseelse");
			setSchalter(true);
			System.out.println("hatesgelesen");
		}
		
		
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
		
		getSchalter() ? System.out.println("A") : System.out.println("B");
	}
}
