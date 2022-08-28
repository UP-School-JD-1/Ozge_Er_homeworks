public class GiftProducts extends Stuff implements Locationable{
    protected Warehouses warehouse;
    protected String place;
    public GiftProducts(String skt,String description,int productId,Warehouses warehouses,String place){
        super(skt,description,productId);
        this.warehouse=warehouses;
        this.place=place;
    }
    @Override
    public boolean purchase(){
        return false;
    }

    @Override
    public boolean retrieval(){
        return false;
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
    public String toString(){
        String s = "Urunun satisi varmi?:" + purchase() + "\nUrunun iadesi varmi?:" + retrieval() + "\nBulundugu depo:" + warehouse()+"\nDepo icinde bulundugu yer:"+place()+"\nKargo durumu:"+cargoStateInfo()+"\nhashcode:"+hashCode();
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
//        if(!(o instanceof GiftProducts)) {
//            return false;
//        }
//
//        GiftProducts c = (GiftProducts) o;
//        return getProductId()==c.getProductId();
//    }
//
//    @Override
//    public int hashCode() {
//        int hash=5;
//        hash=31*hash+getProductId();
//        return hash;
//    }
}
