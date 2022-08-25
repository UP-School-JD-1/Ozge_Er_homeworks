import java.util.Scanner;

public class Stuff implements Productable,Priceable {
    protected String skt;
    protected String description;
    protected String adress;
    protected int productId;

    public Stuff(String skt,String description,int productId){
        this.skt=skt;
        this.description=description;
        this.productId=productId;
    }
    @Override
    public int price() {
        Scanner input = new Scanner(System.in);
        System.out.println("kac adet istiyorsunuz?");
        int amount= input.nextInt();
        int price=7500;
        return amount*price;
    }
    @Override
    public String payment() {
        String payment="Odemeniz basariyla gerceklesti.";
        return payment;
    }
    public String getAdress(){
        Scanner input= new Scanner(System.in);
        System.out.println("Adres bilginizi giriniz:");
        adress= input.nextLine();
        return adress;
    }
    @Override
    public String cargoStateInfo(){
        String info = new String();
        info="Urununuz bir gun icinde kargoya verilecektir.";
        return info;
    }

    @Override
    public boolean purchase(){
        return true;
    }

    @Override
    public boolean retrieval(){
        return true;
    }

    String getSkt(){
        return skt;
    }

    void setSkt(String skt){
        this.skt=skt;
    }

    String getDescription(){
        return description;
    }

    void setDescription(String description){
        this.description=description;
    }

    int getProductId(){
        return  productId;
    }

    @Override
    public boolean equals(Object o) {
        //default equals
        if (o==this) {
            return true;
        }

        //control
        if(!(o instanceof Stuff)) {
            return false;
        }

        Stuff c = (Stuff) o;
        return getProductId()==c.getProductId();
    }

    @Override
    public int hashCode() {
        int hash=5;
        hash=31*hash+getProductId();
        return hash;
    }
}
