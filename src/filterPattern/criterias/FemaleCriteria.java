package filterPattern.criterias;

import java.util.ArrayList;
import java.util.List;

import filterPattern.Criteria;
import filterPattern.Person;
import filterPattern.colectii.Gender;

public class FemaleCriteria implements Criteria{
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons=new ArrayList<Person>();
		for (Person onePerson : persons) {
			if (onePerson.getGender().equals(Gender.FEMALE)) {
				femalePersons.add(onePerson);
			}
		}
		return femalePersons;
	}
}
