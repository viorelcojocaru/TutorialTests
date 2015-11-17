package filterPattern.criterias;

import java.util.ArrayList;
import java.util.List;

import filterPattern.Criteria;
import filterPattern.Person;
import filterPattern.colectii.Gender;

public class MaleCriteria implements Criteria {
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person onePerson : persons) {

			if (onePerson.getGender().equals(Gender.MALE)) {
				malePersons.add(onePerson);
			}
		}
	return malePersons;
	}
}
