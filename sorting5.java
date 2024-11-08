import java.util.Arrays;

class sorting5
 {
    public static void main(String[] args) 
    {

        // Sorting List of Integers
        int[] intArray = {10, 5, 15, 20, 3};
        Arrays.sort(intArray);
        System.out.println("Sorted Integers: " + Arrays.toString(intArray));

        // Sorting List of Names (Strings)
        String[] nameArray = {"John", "Alice", "Bob", "David"};
        Arrays.sort(nameArray);
        System.out.println("Sorted Names: " + Arrays.toString(nameArray));
    }
}
