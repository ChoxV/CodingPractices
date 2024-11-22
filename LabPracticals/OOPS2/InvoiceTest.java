import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {
       
        Invoice invoice = new Invoice("A51234B", "Laptop", 7, 50201.00);

        System.out.println("The part number is: " + invoice.getPartNumber());
        System.out.println("The price per item is: " + invoice.getPricePerItem());
        System.out.println("The part description is: " + invoice.getPartDescription());
        System.out.println("The quantity is: " + invoice.getQuantity());
        System.out.println("The invoice amount is: " + invoice.getInvoiceAmount());
        invoice.setPartNumber("9855642");
        invoice.setPartDescription("mobile");
        invoice.setQuantity(-8); 
        invoice.setPricePerItem(8.00);
        System.out.println("\nUpdated part number is: " + invoice.getPartNumber());
        System.out.println("Updated part description is: " + invoice.getPartDescription());
        System.out.println("Updated price per item is: " + invoice.getPricePerItem());
        System.out.println("Updated quantity is: " + invoice.getQuantity());
        System.out.println("Updated invoice amount is: " + invoice.getInvoiceAmount());
    }
}

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity > 0 ? quantity : 0;  
        this.pricePerItem = pricePerItem > 0 ? pricePerItem : 0.0; 
    }
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity > 0 ? quantity : 0;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem > 0.0 ? pricePerItem : 0.0;
    }
    public double getInvoiceAmount() {
        return pricePerItem * quantity;
    }
}