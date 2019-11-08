


public class Main {


    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 8, 34, 11, 13};
        printOddNumbers(arr);

    }

    public static void printOddNumbers(int[] arr) {

        StringBuilder abс = new StringBuilder();



        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                abс.append(arr[i] + ",");
            }
        }

        System.out.println(abс.deleteCharAt(abс.length()-1));
    }

}

