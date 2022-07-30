package Chapter9_homeWork3;

import java.lang.invoke.StringConcatFactory;

public class Book {
	
	public Author author; // bunu normal dusunme.bu reference variable
	public String title;
	public int page;
	public String type;
	public boolean isHardCover;
	public int currentPage;
	
	public String getInfo()
	{	
		String info="\nKitabin adi:"+title+" "+"\nYazari:"+author.name;
		return info;
	}
	
	
	
}
