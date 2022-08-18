package Book;

public class Reader {

	String name;
	int age;
	String sex;
	
	public Reader(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	void getReader() {
		System.out.println("adi:"+name+"\nyasi:"+age+"\ncinsiyeti:"+sex);		
	}
	
}
