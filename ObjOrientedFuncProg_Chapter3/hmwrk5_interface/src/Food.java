import java.util.Scanner;

public class Food extends Product implements Locationable  {
    private String section;

    public Food(String skt, String description, String section, int productId,Warehouses warehouse,String place){
        super(skt,description,productId,warehouse,place);
        this.section=section;
    }

    @Override
    public int price() {
        Scanner input = new Scanner(System.in);
        System.out.println("kac kilo"+" "+description+" "+"istiyorsunuz?");
        int amount= input.nextInt();
        return amount*10;
    }

    @Override
    public String  payment() {
        String payment="odeme gerceklestirildi.";
        return payment;
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
    return false;
    }

    @Override
    public String cargoStateInfo(){
        String info = new String();
        info="Gun icinde kargoya verilecektir.";
        return info;
    }


    String getSection(){
        return section;
    }

    @Override
    public String toString(){
        String s = "Urunun satisi varmi?:" + purchase() + "\nUrunun iadesi varmi?:" + retrieval() + "\nBulundugu depo:" + warehouse()+"\nDepo icinde bulundugu yer:"+place+"\nFiyat:"+price()+"\nOdeme durumu:"+payment()+"\nKargo durumu:"+cargoStateInfo()+"\nhashcode:"+hashCode();
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
//        if(!(o instanceof Food)) {
//            return false;
//        }
//
//        Food f = (Food) o;
//        return getProductId()==f.getProductId();
//    }
//
//    @Override
//    public int hashCode() {
//        int hash=5;
//        hash=31*hash+getProductId();
//        return hash;
//    }
}
