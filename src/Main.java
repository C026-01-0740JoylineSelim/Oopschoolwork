import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        String registrationNumber = "C026-01-0740/2023";
        String customerName = "Joyline Cheptoo Selim";
        String customerAddress = "Private Bag";
        String customerContact = "0100100100";
        String invoiceDate = "28/04/2020";

        // Create invoice items
        String[] items = {"Pencil", "Duster", "Pens", "Crayon"};
        int[] quantities = {4, 10, 9, 10};
        double[] unitPrices = {20, 50, 30, 80};

        // Calculate total quantity, subtotal, and VAT
        int totalQuantity = 0;
        double subtotal = 0;
        double vat = 0.16;

        for (int i = 0; i < items.length; i++) {
            totalQuantity += quantities[i];
            subtotal += quantities[i] * unitPrices[i];
        }

        double vatAmount = subtotal * vat;
        double totalAmount = subtotal + vatAmount;

        // Print invoice header
        System.out.println("*******************************************************************************************************************");
        System.out.println("****** " + registrationNumber + " ******");
        System.out.println("Address: #99 ACS Building Gilmore Ave. New Mla., Quezon City  *  Tel. No: 123-4567");
        System.out.println("VAT REG. TIN 098-765-4321-0000");
        System.out.println("-------------------------------------------------- SALES INVOICE --------------------------------------------------");
        System.out.println("Sold to: " + customerName);
        System.out.println("Address: " + customerAddress);
        System.out.println("Contact Number: " + customerContact);
        System.out.println("Date: " + invoiceDate);
        System.out.println("*******************************************************************************************************************");
        System.out.println("Qty  | Item Description | Unit Price | Amount");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        // Print invoice items
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-4d | %-15s | %-10.2f | %-10.2f\n", quantities[i], items[i], unitPrices[i], quantities[i] * unitPrices[i]);
        }

        // Print total quantity, subtotal, VAT, and total amount
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("Total Quantity: %-3d\n", totalQuantity);
        System.out.printf("Sub Total: %-30.2f\n", subtotal);
        System.out.printf("VAT (16%%): %-25.2f\n", vatAmount);
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("Total Amount: %-25.2f\n", totalAmount);
        System.out.println("*******************************************************************************************************************");
    }
}
