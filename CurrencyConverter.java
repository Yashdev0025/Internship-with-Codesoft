import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simple hardcoded exchange rates relative to USD
        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.91);
        rates.put("INR", 83.5);
        rates.put("GBP", 0.78);
        rates.put("JPY", 145.0);

        System.out.print("Enter base currency (USD, EUR, INR, GBP, JPY): ");
        String base = sc.next().toUpperCase();
        System.out.print("Enter target currency: ");
        String target = sc.next().toUpperCase();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (!rates.containsKey(base) || !rates.containsKey(target)) {
            System.out.println("Invalid currency code!");
        } else {
            double converted = amount / rates.get(base) * rates.get(target);
            System.out.printf("%.2f %s = %.2f %s%n", amount, base, converted, target);
        }

        sc.close();
    }
}
