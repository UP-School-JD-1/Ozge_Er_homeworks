public class Product extends Stuff implements Priceable{
    protected Warehouses warehouse;
    protected String place;
    public Product(String skt,String description,int productId,Warehouses warehouse,String place){
        super(skt,description,productId);
        this.warehouse=warehouse;
        this.place=place;
    }

    @Override
    public boolean purchase() {
        return true;
    }

    @Override
    public boolean retrieval() {
        return false;
    }

    @Override
    public String payment() {
        String payment="odeme gerceklestirildi.";
        return payment;
    }

    @Override
    public int price() {
        return 0;
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
