public class ReverseArray {

    public static void reverseArray(int[] arr, int left, int right) {
        // Step 1: Base case
        if (left >= right) {
            return;
        }

        // Step 2: Store temporary value
        int temp = arr[left];

        // Step 3: Move right value to left
        arr[left] = arr[right];

        // Step 4: Put temporary value to right
        arr[right] = temp;

        // Step 5: Recursive call moving pointers inward
        reverseArray(arr, left + 1, right - 1);
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create numbers array with 10, 20, 30, 40, 50
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        displayArray(numbers);

        // Call reverseArray with the right parameters
        reverseArray(numbers, 0, numbers.length - 1);

        System.out.println("Reversed array:");
        displayArray(numbers);
    }
}
