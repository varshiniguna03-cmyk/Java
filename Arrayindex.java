public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        try {
            for (int i = 0; i <= 7; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }
    }
}