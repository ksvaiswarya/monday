import java.text.DecimalFormat;

 class MedPlusBill {
    public static void main(String[] args) {
        String[] itemNames = {"Paracetamol", "Cough Syrup", "Band-Aid", "Antibiotic Cream"};
        int[] quantities = {2, 1, 3, 1};
        double[] itemPrices = {5.0, 10.0, 3.5, 8.0};

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        // Print the table header
        System.out.println("Item Name\tQuantity\tPrice\t\tTotal");

        // Print each item and its details
        double totalBill = 0;
        for (int i = 0; i < itemNames.length; i++) {
            double totalItemPrice = quantities[i] * itemPrices[i];
            totalBill += totalItemPrice;

            System.out.println(itemNames[i] + "\t\t" + quantities[i] + "\t\t" +
                    decimalFormat.format(itemPrices[i]) + "\t\t" +
                    decimalFormat.format(totalItemPrice));
        }

        // Print the total bill amount
        System.out.println("\nTotal Bill:\t\t\t\t\t\t" + decimalFormat.format(totalBill));
    }
}
