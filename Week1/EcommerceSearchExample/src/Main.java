public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Footwear"),
                new Product(103, "Mobile", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        // Linear Search
        Product result1 = LinearSearch.search(products, "Mobile");

        if (result1 != null) {
            System.out.println("Linear Search:");
            System.out.println("Product Found: " + result1.productName);
        } else {
            System.out.println("Product Not Found");
        }

        // Binary Search
        Product result2 = BinarySearch.search(products, 104);

        if (result2 != null) {
            System.out.println("\nBinary Search:");
            System.out.println("Product Found: " + result2.productName);
        } else {
            System.out.println("Product Not Found");
        }

    }

}