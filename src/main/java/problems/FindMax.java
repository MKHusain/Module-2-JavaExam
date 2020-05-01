package problems;

public class FindMax {

    public void GetThreeMaxValues(int[] nums) {

        int maxOne = 0;
        int maxTwo = 0;
        int maxThree = 0;

        for (int n : nums) {
            if (maxOne < n) {
                if (maxTwo < maxOne ){
                    maxThree = maxTwo;
                }
                maxTwo = maxOne;
                maxOne = n;
            }
            else if (maxTwo < n) {
                maxTwo = n;
            }
        }

        System.out.println("Max1 - " + maxOne);
        System.out.println("Max2 - " + maxTwo);
        System.out.println("Max3 - " + maxThree);
    }

    public static void main(String[] args) {

        int list[] = { 15, 24, 48, 21, 43, 11, 79, 93 };

        FindMax max = new FindMax();
        max.GetThreeMaxValues(list);
    }
}
