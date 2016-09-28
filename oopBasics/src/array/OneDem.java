package array;

public class OneDem {

	int[] oneDemensionArrays = new int[10];
	
	
	public static void main(String[] args) {
		OneDem od = new OneDem();
		od.init();
	}


	private void init() {
		for (int i = 0; i < oneDemensionArrays.length; i++) {
			System.out.println("index: "+ i);
		}
		
	}
}
