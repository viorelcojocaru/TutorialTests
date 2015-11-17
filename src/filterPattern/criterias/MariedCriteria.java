package filterPattern.criterias;

import java.util.ArrayList;
import java.util.List;

import filterPattern.Criteria;
import filterPattern.Person;
import filterPattern.colectii.MaritalStatus;

public class MariedCriteria implements Criteria {
List<Person> mariedPersons=new ArrayList<Person>();
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		for (Person person : persons) {
			if (person.getMaritalStatus().equals(MaritalStatus.MARIED)) {
				mariedPersons.add(person);
			} 
		}
		return mariedPersons;
	}

}
