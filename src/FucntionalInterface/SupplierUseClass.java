package FucntionalInterface;

import java.util.function.Supplier;

public class SupplierUseClass {
    public static void main(String[] args) {
        Supplier<String> messageSupplier = () -> "Hello from Supplier!";

        // Using the get() method
        String message = messageSupplier.get();
        System.out.println(message);  // Output: Hello from Supplier!
    }
    }

