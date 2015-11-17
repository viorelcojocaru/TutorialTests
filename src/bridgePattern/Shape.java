package bridgePattern;

public abstract class Shape {

	protected DrowAPI drowAPI;
	
	protected Shape(DrowAPI drowAPI){
		this.drowAPI=drowAPI;
		
	}
	public abstract void drow();
}
