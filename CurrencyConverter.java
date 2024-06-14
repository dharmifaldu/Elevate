import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String,Double> rates = new HashMap<>();
    
        rates.put("INR", 83.5);  // Indian Rupee
        rates.put("USD", 1.0);   // US Dollar
        rates.put("EUR", 0.93);  // Euro
        rates.put("GBP", 0.78);  // British Pound
        rates.put("JPY", 157.32); // Japanese Yen
        rates.put("AUD", 1.51);  // Australian Dollar
        rates.put("CAD", 1.37);  // Canadian Dollar
        
        try{
            System.out.print("Enter the amount to convert: ");
            double amount = Double.parseDouble(sc.nextLine());

            System.out.print("Enter the source currency: ");
            String fromCurrency = sc.nextLine().toUpperCase();

            System.out.print("Enter the target currency: ");
            String toCurrency = sc.nextLine().toUpperCase();

            if(!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)){
                System.out.println("Invalid currency code entered.");
            }
            else{
                double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency, rates);
                System.out.printf("%.2f %s is equivalent to %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
           
            }

        }
        catch(NumberFormatException e){
            System.out.println("Invalid amount entered.Please enter a numeric value.");
        }
        finally {
            sc.close();
        }

    }
    public static double convertCurrency(double amount, String fromCurrency, String toCurrency, HashMap<String,Double> rates ){
        double amountInUSD = amount / rates.get(fromCurrency);
        return amountInUSD * rates.get(toCurrency);
    }
}