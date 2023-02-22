import java.util.Arrays;

public class ArrayFun {

    public static void main(String[] args) {
        //declare an empty double array of size 6
        double[] scores = new double[6];

        //declare an array of 10 ints
        int[] nums = {34, 29, 10, 28, 97, 84, 18, 5, 82, 1};
                    //0   1   2   3   4   5   6   7  8   9
        //how are these elements organized?

        //getting a value
        int fifthElement = nums[4];
        System.out.println(fifthElement);

        //replacing a value
        nums[4] = 12;

        //getting the length of an array
        int numsLength = nums.length;
        System.out.println(numsLength);

        ///////////////traversing arrays/////////////////

        //printing all the values in an array

        //while loop
        int x = 0;
        while(x < numsLength){
            System.out.print(nums[x] + " ");
            x++;
        }
        System.out.println();


        //for loop
        for(int i = 0; i < numsLength; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        //printing

        int max = nums[0];
        for(int j = 0; j < numsLength; j++){
            if(nums[j] > max){
                max = nums[j];
            }
        }
        System.out.println(max);

        for(int i = 0; i < numsLength; i++){
            if(nums[i] == 84){
                System.out.println(i);
            }
        }
    }
}
