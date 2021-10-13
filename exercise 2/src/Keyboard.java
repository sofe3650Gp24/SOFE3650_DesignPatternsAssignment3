public class Keyboard {

    //setting variable to model and view
    private final CashRegister model;
    private final Display view;

    public Keyboard(CashRegister model, Display view)
    {
        this.model = model;
        this.view = view;
    }

    //setter method updates product name and product price
    public void setCurrentProductInfo(String pName, float pPrice)
    {
        model.setCurrentProductInfo(pName, pPrice);
    }

    //getter method gets the value of the variable (getCurrentProductInfo)
    public String getCurrentProductInfo()
    {
        return model.getCurrentProductInfo();
    }

    //setter method to update product UPC
    public void setCurrentProductUPC(int CurrentProductUPC)
    {
        model.setCurrentProductUPC(CurrentProductUPC);
    }

    //getter method to get the value of the product UPC
    public int getCurrentProductUPC()
    {
        //return value to model
        return model.getCurrentProductUPC();
    }

    //updates view of product info and product UPC
    public void changeView()
    {
        view.printProductInfo(model.getCurrentProductInfo(), model.getCurrentProductUPC());
    }
}
