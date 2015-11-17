package filterPattern.criterias;

import java.util.List;

import filterPattern.Criteria;
import filterPattern.Person;

public class AndCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPerson=criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPerson);
	}
	 
	public AndCriteria(Criteria criteria, Criteria otherCriteria){
		this.criteria=criteria;
		this.otherCriteria=otherCriteria;
	}

}
