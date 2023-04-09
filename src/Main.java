public class Main {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 4, 1};
        double average = findAverage(arr);
        System.out.println("The average is " + average);
    }

    public static double findAverage(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        return average;
    }
}
