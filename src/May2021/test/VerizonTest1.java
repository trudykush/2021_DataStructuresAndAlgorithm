package May2021.test;

public class VerizonTest1 {
    public static void main(String[] args) {
        int[] arr = {1, -23, 4, 55, 111};

        int sum = 0;
        for (int i : arr) {
            if (Math.abs(i) > 9 && Math.abs(i) < 100) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
