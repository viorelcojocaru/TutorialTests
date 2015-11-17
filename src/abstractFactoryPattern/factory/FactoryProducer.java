package abstractFactoryPattern.factory;


public class FactoryProducer {
	
	
	public static AbstractFactory getFactory(String chose){
		if (chose.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if(chose.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}	
		return null;
	}

}
