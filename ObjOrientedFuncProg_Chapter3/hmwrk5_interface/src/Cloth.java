import java.util.Scanner;

public class Cloth extends Stuff implements Productable,Priceable,Locationable {
    Sizes size;
    protected Warehouses warehouse;
    protected String place;
    public Cloth(String skt,String description,int productId,Sizes size,Warehouses warehouse,String place){
        super(skt,description,productId);
        this.size=size;
        this.warehouse=warehouse;
        this.place=place;
    }

    @Override
    public int price() {
        Scanner input = new Scanner(System.in);
        System.out.println("Sepete kac adet"+" "+description+" "+"eklensin?");
        int amount= input.nextInt();
        int price=75;
        return amount*price;
    }

    @Override
    public boolean purchase(){
        return true;
    }

    @Override
    public boolean retrieval(){
        return true;
    }
    @Override
    public Warehouses warehouse() {
        return warehouse;
    }

    @Override
    public String place() {
        return place;

    }

    Sizes getSize(){
        return  size;
    }

    int getProductId(){
        return productId;
    }

    @Override
    public String toString(){
        String s = "Urunun satisi varmi?:" + purchase() + "\nUrunun iadesi varmi?:" + retrieval() + "\nBulundugu depo:" + warehouse()+"\nBeden:"+size+"\nFiyat:"+price()+"\nOdeme durumu:"+payment()+"\nKargo durumu:"+cargoStateInfo();
        return s;
    }

    @Override
    public boolean equals(Object o) {
        //default equals
        if (o==this) {
            return true;
        }

        //control
        if(!(o instanceof Cloth)) {
            return false;
        }

        Cloth c = (Cloth) o;
        return getProductId()==c.getProductId();
    }

    @Override
    public int hashCode() {
        int hash=5;
        hash=31*hash+getProductId();
        return hash;
    }

}
