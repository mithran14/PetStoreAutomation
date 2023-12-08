package iginter;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pojopayloa {

	/*
	 * { "name" : "Ram",
	 *  "age":12 
	 *  "Address": 
	 *  { 
	 *  "City":"Chennai",
	 * "state":"Tamil Nadu" 
	 * } 
	 * "subject" : 
	 * [ "Maths", "Science" ] }
	 */

	private String name;
	private String age;
	private Address address;
	private List<String> subject;

	// Constructors, getters, and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	public static void main(String[] args) throws JsonProcessingException  {
		Pojopayloa pojopayloa = new Pojopayloa();
		Address address = new Address();

		address.setCity("Chennai");
		address.setState("Tamil Nadu");

		pojopayloa.setName("Ram");
		pojopayloa.setAge("29");
		pojopayloa.setAddress(address);
		pojopayloa.setSubject(Arrays.asList("Maths", "Science"));

		ObjectMapper mapper = new ObjectMapper();

		String writeValueAsString = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(pojopayloa);
		System.out.println(writeValueAsString);
	}

	static class Address {

		private String city;
		private String state;

		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}

	}
}
