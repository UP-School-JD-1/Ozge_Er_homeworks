import java.util.Scanner;

public class Cloth extends Product implements Locationable  {
    Sizes size;

    public Cloth(String skt,String description,int productId,Sizes size,Warehouses warehouse,String place){
        super(skt,description,productId,warehouse,place);
        this.size=size;
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
    public Warehouses warehouse() {
        return warehouse;
    }

    @Override
    public String place() {
        return place;
    }

    @Override
    public boolean purchase(){
        return true;
    }

    @Override
    public boolean retrieval(){
        return true;
    }

    Sizes getSize(){
        return  size;
    }

    @Override
    public String toString(){
        String s = "Urunun satisi varmi?:" + purchase() + "\nUrunun iadesi varmi?:" + retrieval() + "\nBulundugu depo:" + warehouse+"\nBeden:"+size+"\nFiyat:"+price()+"\nOdeme durumu:"+payment()+"\nKargo durumu:"+cargoStateInfo()+"\n"+getProductId()+"\nhashcode:"+hashCode();
        return s;
    }

//    @Override
//    public boolean equals(Object o) {
//        //default equals
//        if (o==this) {
//            return true;
//        }
//
//        //control
//        if(!(o instanceof Cloth)) {
//            return false;
//        }
//
//        Cloth c = (Cloth) o;
//        return getProductId()==c.getProductId();
//    }
////
//    @Override
//    public int hashCode() {
//        int hash=5;
//        hash=31*hash+getProductId();
//        return hash;
//    }

}
