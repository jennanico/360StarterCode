
public class PersonAge {
	
	String firstName;
	String lastName;
	int age;
	
	
	/**
	 * @return the fname
	 */
	public String getFname() {
		return firstName;
	}


	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.firstName = fname;
	}


	/**
	 * @return the lname
	 */
	public String getLname() {
		return lastName;
	}


	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lastName = lname;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @param fname
	 * @param lname
	 * @param age
	 */
	public PersonAge(String fname, String lname, int age) {
		super();
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person:" + firstName + " " + lastName + ", " + age;
	}
	
	public static void main(String[] args) {
		PersonAge r = new PersonAge("Romeo", "Mon", 15);
		System.out.println("R "+r);
	}


	
	
	

}
