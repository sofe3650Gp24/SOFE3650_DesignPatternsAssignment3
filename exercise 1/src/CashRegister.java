public class CashRegister {

    //calling variables according to data types
    private int CurrentProductUPC;
    private String CurrentProductInfo;
    private String pName;
    private float pPrice;

    public CashRegister() {
    }

    //getter method to update string of product info
    public String getCurrentProductInfo() {

        //return product info
        return CurrentProductInfo;
    }

    //setter method updates value of current product info variables such as pName and pPrice
    public void setCurrentProductInfo(String pName, float pPrice) {

        //the value is updated
        this.CurrentProductInfo = CurrentProductInfo;
    }

    //gets integer value of product UPC
    public int getCurrentProductUPC() {
        return CurrentProductUPC;
    }

    //sets and updated product UPC
    public void setCurrentProductUPC(int CurrentProductUPC) {

        this.CurrentProductUPC = CurrentProductUPC;
    }

}
