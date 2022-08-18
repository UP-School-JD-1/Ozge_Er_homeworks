package Book;

public enum BookType {
	   SCIENCE_FICTION("BİLİM-KURGU"), HORROR("KORKU"),ACTION("AKSİYON"), 
	   HISTORY ("TARİH"),DETECTIVE("POLİSİYE");
     // ID E VERILEBILIRDI.
    private String description;

    BookType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

