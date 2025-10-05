// Coder Cafe Java Code
// Importing the LocalDateTime class
import java.time.LocalDateTime;
// Importing the DateTimeFormatter class
import java.time.format.DateTimeFormatter;
public class CoderCafe {
    public static void main(String args[]) {

        // Establishing the amount in each order
        int matcha = 2;
        int latte = 4;
        int cappuccino = 3;
        int hotChocolate = 1;

        // Establishing the prices of each item
        double priceMatcha = 4.50;
        double priceLatte = 5.30;
        double priceCappuccino = 3.75;
        double priceHotChocolate = 4.80;

        // Establishing the total prices of the drink orders
        double matchaTotal = priceMatcha * matcha;
        double latteTotal = priceLatte * latte;
        double cappuccinoTotal = priceCappuccino * cappuccino;
        double hotChocolateTotal = priceHotChocolate * hotChocolate;

        // Establishing the subtotal, sales tax, rounded tax, service fee, amount in order, coder cafe fee, rounded cafe fee, and total price
        double subtotal = matchaTotal + latteTotal + cappuccinoTotal + hotChocolateTotal;
        double salesTax = subtotal * .08875;
        double roundedTax = (int) (salesTax * 100) / 100.0;
        double serviceFee = 1.21;
        int amountInOrder = matcha + latte + cappuccino + hotChocolate;
        double coderCafeFee =  subtotal % amountInOrder;
        double roundedCafeFee = (int) (coderCafeFee * 100) / 100.0;
        double total = subtotal + roundedTax + serviceFee + roundedCafeFee;

        // Printing the welcome message
        System.out.println("---------------------------------------------");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t-");
        System.out.println("-\t\tWelcome to Libby's Coder Cafe!\t\t-");

        // Establishing and printing date and time
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("-\t\t\tMM-dd-yyyy HH:mm:ss \t\t\t-");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);

        // Printing the prices of the orders of each drink
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t-");
        System.out.printf("-\t" + matcha + " X Iced Matcha" + "  " + "\t\t$ %.2f", matchaTotal);
        System.out.print("\t\t\t-");
        System.out.println(" ");
        System.out.printf("-\t" + latte + " X Iced Latte" + "  " + "\t\t$ %.2f", latteTotal);
        System.out.print("\t\t\t-");
        System.out.println(" ");
        System.out.printf("-\t" + cappuccino + " X Cappuccino" + "  " + "\t\t$ %.2f", cappuccinoTotal);
        System.out.print("\t\t\t-");
        System.out.println(" ");
        System.out.printf("-\t" + hotChocolate + " X Hot Chocolate" + "  " + "\t\t$ %.2f", hotChocolateTotal);
        System.out.print("\t\t\t-");
        System.out.println(" ");

        // Printing the subtotal, sales tax, rounded tax, service fee, amount in order, coder cafe fee, rounded cafe fee, and total price
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t-");
        System.out.printf("-\tSubtotal: \t\t\t\t$ %.2f\t\t\t-", subtotal);
        System.out.println(" ");
        System.out.printf("-\tSales Tax: \t\t\t\t$ %.2f\t\t\t-", roundedTax);
        System.out.println(" ");
        System.out.printf("-\tService Fee: \t\t\t$ %.2f\t\t\t-", serviceFee);
        System.out.println(" ");
        System.out.printf("-\tCoder Cafe Fee: \t\t$ %.2f\t\t\t-", roundedCafeFee);
        System.out.println(" ");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t-");
        System.out.printf("-\tTotal: \t\t\t\t\t$ %.2f\t\t\t-", total);
        System.out.println(" ");
        System.out.println("-\t\t\t\t\t\t\t\t\t\t\t-");

        // Printing a "thank you" message
        System.out.println("-\t\t\tThank you, come again!\t\t\t-");
        System.out.println("---------------------------------------------");
        }
    }
