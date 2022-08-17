package Chapter9_homeWork3;

public class Reader {

	String name;
	int age;
	char sex;
	
	void read(Book book) {
		System.out.println("\nSuan okudugum kitap: "+book.title+"\nSayfa sayisi: "+book.page);
		System.out.println("Yazari:"+book.author.name);
		
	}
	void reader(Reader reader) {
		System.out.println("\nOkuma yapan kisi"+reader.name+" "+"\nYası:"+reader.age+" "+"Cinsiyet,:"+reader.sex);
	}
	
}
