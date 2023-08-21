// Java Program to Illustrate NoClassDefFoundError Exception

// Helper class
class HelperClass {

    // Method
    void greeting()
    {
        // Print statement whenever method is called
        System.out.println("hello!");
    }
}

// Main class
class GFG {

    // Main driver method
    public static void main(String args[])
    {
        // Creating object of a non-existent class
        HelperClass helper = new HelperClass();

        // Calling method of the above class
        helper.greeting();
    }
}

