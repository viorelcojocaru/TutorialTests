package filterPattern.criterias;

import java.util.ArrayList;
import java.util.List;

import filterPattern.Criteria;
import filterPattern.Person;
import filterPattern.colectii.MaritalStatus;

public class SingleCriteria implements Criteria{

	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePerson=new ArrayList<Person>();
		for (Person onePerson : persons) {
			if (onePerson.getMaritalStatus().equals(MaritalStatus.SINGLE) ) {
				singlePerson.add(onePerson);
			}
		}
		return singlePerson;
	}
}
