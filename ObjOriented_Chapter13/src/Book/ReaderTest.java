package Book;

public class ReaderTest {
	public static void main(String[] args) {
		
		Author yazar=new Author("Nazan Bekiroglu",59);
		Author yazar2= new Author("Ahmet Umit",62);
		yazar.getInfo();
		
		 //booktype girisi
		Book kitap = new Book(yazar,"nar agaci",BookType.HISTORY,275,120);
		kitap.author=yazar;
		Book kitap1=new Book(yazar2,"istanbul hatirasi",BookType.DETECTIVE,450,156);
		kitap.getInfo();
		
		Reader okuyucu =new Reader("ozge",23,"k");
		okuyucu.getReader();
		
	}

}
