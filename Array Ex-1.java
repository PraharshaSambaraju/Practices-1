public class ArrayVerification {
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: ");
        printArray(numbers);

        // Modify the array
        modifyArray(numbers, 10, 2); // Set the value at index 2 to 10

        // Print the modified array
        System.out.println("\nModified Array: ");
        printArray(numbers);
    }

    // Method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to modify an array at a specific index
    private static void modifyArray(int[] arr, int value, int index) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
            System.out.println("Array modified at index " + index + " with value " + value);
        } else {
            System.out.println("Invalid index for modification");
        }
    }
}