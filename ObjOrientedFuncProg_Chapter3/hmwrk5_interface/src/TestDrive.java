public class TestDrive {
    public static void main(String[] args) {
        //objects were created
        Food food= new Food ("12.45.56","salatalik","sebze",4689,Warehouses.AVRUPA,"A002");
        Cloth cloth= new Cloth("12.05.2025","pembe gomlek",856931,Sizes.XL,Warehouses.TUZLA,"HG4532");
        GiftProducts gift = new GiftProducts("sonsuz","promosyon urun",85412,Warehouses.GEBZE,"B15200");
        Stuff stuff = new Stuff("2028","bilgisayar",78421);

        //
        System.out.println("****Gift Product****");
        System.out.println(gift.toString());
        space();
        System.out.println("****Food Product****");
        food.price();
        System.out.println(food.toString());
        space();
        System.out.println("****Cloth Product****");
        System.out.println(cloth.toString());


    }
    static void space(){
        System.out.println("\n");
    }


}
