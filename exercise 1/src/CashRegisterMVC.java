public class CashRegisterMVC {

    //driver class to run CashRegisterMVC
    public static void main(String[] args) {

        //cash register model takes values from product database
        CashRegister model = addProductDB();

        Display view = new Display();

        //keyboard controls the model and view
        Keyboard keyboardController = new Keyboard(model, view);

        //keyboard controller changes and updates view
        keyboardController.changeView();

        //keyboard manual input of product info
        keyboardController.setCurrentProductInfo("Oats", 8.00F);

        keyboardController.changeView();
    }

    static CashRegister addProductDB() {

        //product database
        CashRegister cashRegister = new CashRegister();
        cashRegister.setCurrentProductInfo("Oats", 8.00F);
        cashRegister.setCurrentProductUPC(946280174);

        //return to cash register
        return cashRegister;
    }
}
