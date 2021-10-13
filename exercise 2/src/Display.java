public class Display implements View {

    //method to use product information and print them
    public void printProductInfo(String pName, float pPrice) {

        //prints product name and price in display
        System.out.println("---- Product Info ----");
        System.out.println("Product: " + pName);
        System.out.println("Price: " + pPrice);
    }

    //override method implementing from view
    @Override
    public void displayProduct(Product p) {
        System.out.println("---- Product Info ----");
    }
}
