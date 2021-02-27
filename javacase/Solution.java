package javacase;

/**
 * hello
 */
public class Solution {
    public static void main(String[] args) {
        int data[] = { 8, 1, 3, 3, 1, 2, 7, 2, 1, 7, 9, 7 };
        int n = 5;
        solution(data, n);
    }

    private static void solution(int data[], int n) {
        int dataLength = data.length;
        int maxnumber = 0;

        int i = 0;
        while (i < dataLength) {
            if (data[i] <= 0) {
                i++;
                continue;
            }
            int elementIndex = data[i] - 1;
            if (data[elementIndex] > 0) {
                data[i] = data[elementIndex];
                data[elementIndex] = -1;
            } else {
                data[elementIndex]--;
                data[i] = 0;
                i++;
            }

            System.out.println("Below are counts of all elements");
            for (int j = 0; j < n; j++)
                System.out.println(j + 1 + "->" + Math.abs(data[j]));

            // //detect what is maxnumber for data array, for new heap size countArray
            // for (int i = 0; i < data.length; i++) {
            // maxnumber = data[i];
            // if (data[i] > maxnumber) {
            // data[i] = maxnumber;
            // }
            // }

            // int[] countArray = new int[maxnumber+1];

            // //countArray dizisinin [i] inci elemanı n`den büyük eşitse, sil -
            // for (int i = 0; i < dataLength; i++) {
            // if (countArray[i] >= n) {
            // System.out.println(cou);
            // }

            // }

        }
    }
}