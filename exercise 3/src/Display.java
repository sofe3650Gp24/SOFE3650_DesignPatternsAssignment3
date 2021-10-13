//implements from observer
public class Display implements Observer {

    //method to use product information and print them
    public void printProductInfo(String pName, float pPrice) {

        //prints product name and price in display
        System.out.println("---- Product Info ----");
        System.out.println("Product: " + pName);
        System.out.println("Price: " + pPrice);
    }

    @Override
    public void update(String pName, float pPrice) {

    }
}
