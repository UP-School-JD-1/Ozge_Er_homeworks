import java.util.Scanner;

public abstract class Stuff {
    protected String skt;
    protected String description;
    protected int productId;

    public Stuff(String skt,String description,int productId){
        this.skt=skt;
        this.description=description;
        this.productId=productId;
    }

    public String cargoStateInfo(){
        String info = new String();
        info="Urununuz bir gun icinde kargoya verilecektir.";
        return info;
    }

    public abstract boolean purchase();

    public abstract boolean retrieval();

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
