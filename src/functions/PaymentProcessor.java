package PaymentProcessor;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor {

    // Replace with your Stripe API key
    private static final String STRIPE_SECRET_KEY = "sk_test_your_secret_key";

    // Initialize Stripe with your secret key
    static {
        Stripe.apiKey = STRIPE_SECRET_KEY;
    }

    // Method to process a payment
    public static void processPayment(String token, double amount, String currency) {
        Map<String, Object> params = new HashMap<>();
        params.put("amount", (int) (amount * 100)); // amount in cents
        params.put("currency", currency);
        params.put("source", token); // obtained with Stripe.js

        try {
            // Create a charge
            Charge charge = Charge.create(params);

            // Handle successful payment
            System.out.println("Payment successful. Charge ID: " + charge.getId());
        } catch (StripeException e) {
            // Handle payment failure
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Example usage
        String stripeToken = "tok_visa"; // Replace with an actual Stripe token
        double amount = 19.99;
        String currency = "usd";

        processPayment(stripeToken, amount, currency);
    }
}
