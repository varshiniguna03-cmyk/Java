class EvenSumDoWhile {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;

        do {
            sum = sum + i;
            i = i + 2;
        } while (i <= 20);

        System.out.println("Sum of first 10 even numbers = " + sum);
    }
}