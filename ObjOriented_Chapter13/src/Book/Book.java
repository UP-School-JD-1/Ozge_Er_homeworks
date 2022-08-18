package Book;

public class Book {
	
	protected Author author; 
	private String title;
	private int page;
	private BookType type;
	private int currentPage;
	
	public Book(Author author,String title,BookType type,int page,int currentPage) {
		this.author=author;
		this.title=title;
		this.type=type;
		this.page=page;
		this.currentPage=currentPage;
	}
	
	
	public void getInfo()
	{	
		System.out.println("yazar:"+author.name+"\nisim:"+title+"\ntipi:"+type+"\nsayfa sayisi:"+page);
	}
	
	
	Author getAuthor() {
		return author;
	}
	void setAuthor(Author author) {
		this.author=author;
	}
	
	 String getTitle() {
		return title;
	}
	 
	 void setTitle(String title) {
		 this.title=title;
	 }
	 
	 BookType getBookType() {
		 return type;
	 }
	 
	 void setType(BookType type) {
		 this.type=type;
	 }
	 
	 int getPage() {
		 return page;
	 }
	 void setPage(int page) {
		 this.page=page;
	 }
	 
	 int getCurrentPage() {
		 return currentPage;
	 }
	 void setCurrentPage(int currentPage) {
		 this.currentPage=currentPage;
	 }
	 
	
	
	
	
}
