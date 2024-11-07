package swing.demo.dayLast7;

public class Form {
	private String userName;
	private String password;
	private String comment;
	private String age;
	private int experience;
	private String gender;
	public Form(String userName, String password, String comment, String age, int experience, String gender) {
		super();
		this.userName = userName;
		this.password = password;
		this.comment = comment;
		this.age = age;
		this.experience = experience;
		this.gender = gender;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getComment() {
		return comment;
	}

	public String getAge() {
		return age;
	}

	public int getExperience() {
		return experience;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return  userName + " : " + password + " : " + comment + " : " + age
				+ " : " + experience + " : " + gender;
	}
	
}
