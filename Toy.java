// coding task 2

public class Toy {
    public String name;
    public int price;
    public Toy(String n, int p){
        name = n;
        price = p;
        System.out.println("A new toy has been made!");
    }
    public void updateName(String n){
        System.out.println("Changing old name: " + name);
        name = n;
        System.out.println("new name: " + name);
    }
    public void updatePrice(int p){
        price = p;
    }
    public void showPrice(){
        System.out.println("price: " + price + " Taka");
    }
}
