package bridgePattern.circles;

import bridgePattern.DrowAPI;

public class GreenCircle implements DrowAPI {

	@Override
	public void drowCircle(int radius, int x, int y) {
		System.out.println("Drow Green Circle whith radius=" +radius+" in x="+x+" y="+y);
		
	}

}
