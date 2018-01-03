package ubru.se;

import ubru.cs.Student;

public class TestStudent2 extends Student{
	public void sayHi() {
		System.out.println("สวัสดีทุกคน");
	}

	public static void main(String[] args) {
		TestStudent2 std = new TestStudent2();
		std.sayHi();
	}

}
