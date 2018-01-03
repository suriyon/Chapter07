package ubru.cs;

public class Student {
	private String id;
	private String name;
	private String branch;
	private int age;
	public String gender;
	
	
	
	public Student() {
		id = "59122710101";
		name = "นางสาวชนัญชิดา ชุมพล";
		branch = "วิศวกรรมซอฟต์แวร์";
		age = 20;
		gender = "หญิง";
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
