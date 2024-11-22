public class FruitTest{
    public static void main(String[] args) {
        Fruit apple  = new Fruit("Apple",true,120);
        Fruit cherry = new Fruit("Cherry",false,100);
        apple.displaydetails();
        cherry.displaydetails();
        
    }
}
class Fruit{
   private String name;
    private boolean issinglefruit;
    private double price;
    Fruit(String name,boolean issinglefruit,double price){
        this.name = name;
        this.issinglefruit = issinglefruit;
        this.price = price;
    }
    void displaydetails(){
        System.out.println("Fruit Name:"+name);
        System.out.println("IsSingleFruit:"+issinglefruit);
        System.out.println("Price:"+price);
    }
}