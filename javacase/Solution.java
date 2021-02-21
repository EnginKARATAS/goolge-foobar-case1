package javacase;

/**
 * hello
 */
public class Solution {
    public static void main(String[] args) {
        int data[] = { 3, 2, 3, 4, 1, 2, 3, 3, 3, 3, 3 };
        int n = 5;
        solution(data, n);
    }

    private static void solution(int data[], int n) {
        // if data[i]
        boolean collideOnce = false;

        int countArray[] = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    System.out.println("i  : " + i + "    j  : " + j);
                    System.out.println(data[i]);
                    countArray[data[j]] += 1;

                }
            }
        }

        for (int i = 0; i < countArray.length; i++) {
            System.out.println("countArray[" + i + "]" + "--> value :  " + countArray[i]);
        }

    }
}