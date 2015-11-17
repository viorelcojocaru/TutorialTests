package filterPattern;

import java.util.ArrayList;
import java.util.List;

import filterPattern.colectii.Gender;
import filterPattern.colectii.MaritalStatus;
import filterPattern.criterias.AndCriteria;
import filterPattern.criterias.FemaleCriteria;
import filterPattern.criterias.MaleCriteria;
import filterPattern.criterias.MariedCriteria;
import filterPattern.criterias.OrCriteria;
import filterPattern.criterias.SingleCriteria;

public class FilterPatternDemo {

	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person("Viorel", "Cojocaru", 30, Gender.MALE, MaritalStatus.MARIED));
		persons.add(new Person("Viorel", "Iordachita", 33, Gender.MALE, MaritalStatus.MARIED));
		persons.add(new Person("Eduard", "Bernevec", 21, Gender.MALE, MaritalStatus.SINGLE));
		persons.add(new Person("Olesea", "Furtuna", 20, Gender.FEMALE, MaritalStatus.SINGLE));
		persons.add(new Person("Stela", "Anton", 23, Gender.FEMALE, MaritalStatus.MARIED));
		persons.add(new Person("Veronica", "Zgureanu", 22, Gender.FEMALE, MaritalStatus.MARIED));
		persons.add(new Person("Veronica", "Goncear", 24, Gender.FEMALE, MaritalStatus.SINGLE));
		
		Criteria male=new MaleCriteria();
		Criteria female=new FemaleCriteria();
		Criteria single= new SingleCriteria();
		Criteria singleMale=new AndCriteria(single, male);
		Criteria singleorFemale=new OrCriteria(single, female);
		Criteria maried=new MariedCriteria();
		
		System.out.println("Male");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("Single Male");
		printPersons(singleMale.meetCriteria(persons));
		
		System.out.println("Single or female");
		printPersons(singleorFemale.meetCriteria(persons));
		
		System.out.println("Maried Persons");
		printPersons(maried.meetCriteria(persons));
		
	}
	public static void printPersons(List<Person> persons){
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getFirstName() 
		           +" Surname: "+ person.getLastName()+", Gender : " + person.getGender() 
		            +", Age: "+person.getAge()+", Marital Status : " + person.getMaritalStatus()
		            +" ]");
		}
	}

}
