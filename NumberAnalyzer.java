public class NumberAnalyzer {

    public static String analyze(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) { // vòng lặp
            if (num % 2 == 0) {   // rẽ nhánh
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount > oddCount) {
            return "EVEN";
        } else if (oddCount > evenCount) {
            return "ODD";
        }
        return "EQUAL";
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(analyze(arr));
    }
}