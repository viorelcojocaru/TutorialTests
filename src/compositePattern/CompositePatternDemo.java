package compositePattern;

public class CompositePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee CEO=new Employee("Ion Placinta", "CEO", 3000);
		
		Employee headSales=new Employee("Viorel Cojocaru", "Head Sales", 2000);
		
		Employee headMarketing =new Employee("Gheorghe Mistreanu", "Head Marketing", 2000);
		
		Employee clerk1=new Employee("Victoria", "Marketing", 1000);
		Employee clerk2=new Employee("Petru", "Marketing", 1000);
		
		Employee salesExecutive1=new Employee("Anatolie", "Sales", 1000);
		Employee salesExecutive2=new Employee("Andrei", "Sales", 1000);
		
		CEO.add(headMarketing);
		CEO.add(headSales);
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		
		System.out.println(CEO);
		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}

}
