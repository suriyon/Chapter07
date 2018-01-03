package ubru.cs;

public class TestStudent {

	public static void main(String[] args) {
		Student std = new Student();
		std.setId("59122710101");
		std.setName("นางสาวชนัญชิดา ชุมพล");
		std.setBranch("วิศวกรรมซอฟต์แวร์");
		std.setGender("หญิง");
		std.setAge(20);
		System.out.println("Student ID: " + std.getId());
		System.out.println("Student Name: " + std.getName());
		System.out.println("Branch: " + std.getBranch());
		System.out.println("Gender: " + std.getGender());
		System.out.println("Student Age: " + std.getAge());
	}

}
