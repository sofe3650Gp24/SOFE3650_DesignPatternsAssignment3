//implements from observer
public class TicketPrinter implements Observer {

    //method to print out receipt for product
    public void printTicket (String pName, float pPrice) {

        //print receipt
        System.out.println("       [ Product Receipt ]       ");
        System.out.println("________________________________");
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("     Product Name: " + pName     );
        System.out.println("    Product Price: $" + pPrice    );
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("________________________________");
    }

    @Override
    public void update(String pName, float pPrice) {

    }
}
