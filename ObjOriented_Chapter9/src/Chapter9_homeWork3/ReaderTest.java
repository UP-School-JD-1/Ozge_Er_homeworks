package Chapter9_homeWork3;

public class ReaderTest {
	public static void main(String[] args) {
		
		Author yazar=new Author();
		yazar.name="Nazan Bekiroglu";
		 
		Book kitap=new Book();
		kitap.author=yazar; // author turunden tanimlanmis degisken icin Author classindan turemis 
		// referansi book class icindeki degiskene atamak lazim.o referansi baz alarak ilerleyebiliyor.
		kitap.currentPage=275;
		kitap.type="roman";
		kitap.isHardCover=false;
		kitap.page=400;
		kitap.title="Nar Agaci";
		
		Reader okuyucu =new Reader();
		okuyucu.name="ozge";
		okuyucu.age=23;
		okuyucu.sex='K';
		
		okuyucu.read(kitap);
		
		System.out.println("kitabin yazari:"+kitap.author.name);
		
		
		System.out.println(kitap.getInfo());		
		
		
		
	}

}
