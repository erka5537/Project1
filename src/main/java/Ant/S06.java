package Ant;

public class S06 {

    public static void main(String[] args) {
        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1, -90};

        int min1 = 0;
        int max1 = 0;
        int max2 = 0;
        int ikincimax1 = 0;

        for (int i = 1; i <arr.length; i++) {

            max1 = Math.max(max1, arr[i]);
            min1 = Math.min(min1, arr[i]);

        }
        System.out.println(max1);
        System.out.println(min1);
        System.out.println(max2);
    }
}
