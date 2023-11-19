package org.oenegm;

public class Main {

    public static void main(String[] args) {
        String problem = """
                    Two Crystal Ball problem:
                    Given two crystal balls that will break if dropped from high enough distance, determine the exact spot in which it will break in the most optimized way.
                    Solution: To understand the problem, let us assume the crystal ball will break if dropped from a height of 8 meters. So, if we drop from true meter, the ball will not break(false).
                    If dropped from height of 2 meter, again the ball will not break(false). We keep on doing it. When dropped from 8 meters, the ball will break(true).
                    If we list all falses and trues in an array,
                    it will look like below: [false, false, false, false, false, false, false, false ,false, false, false, true, true, true, true]
                    This solution is in O(sqrt(n))
                """;
        System.out.print(problem);
    }

    public static int twoCrystalBalls(boolean[] arr) {
        int jumpAmount = (int) Math.sqrt(arr.length);

        int i = jumpAmount;

        for (; i < arr.length; i += jumpAmount) {
            if (arr[i]) {
                break;
            }
        }

        i -= jumpAmount;

        for (int j = 0; j < jumpAmount && i < arr.length; j++, i++) {
            if (arr[i]) {
                return i;
            }
        }
        return -1;
    }

}