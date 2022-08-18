package Book;

public class Author {
	String name;
	int age;
	
	public Author(String name,int age) {
		this.name=name;
		this.age=age;
	}

	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	
	void getInfo() {
		System.out.println("adi:"+name+"\nyasi:"+age);
	}
}
