package datastructures.examples;

//for more array examples see: datatypes_operators/examples/ext

// Find the minimum and maximum values in an array.
class Arrays {
    public static void main(String args[]) {
        // declare and initialize array size 10
        int nums[] = new int[10];
        int min, max;

        // populate array
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = 0;
        // check for min and max
        for(int i=0; i < 10; i++) {
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }
        // print out min and max
        System.out.println("min and max: " + min + " " + max);
    }
}

/////////////
/*
class Arrays {
    public static void main(String[] args) {

        int[] nums = new int[10];
        int min, max;


        nums[0] = 99;
        nums[1] = 38493;
        nums[2] = -2749;
        nums[3] = 47393;
        nums[4] = -3858;
        nums[5] = 2704;

        min = max = 0;

        for(int i=0; i<10; i++){
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
}


class Arrays {
    public static void main(String[] args) {
        int nums[] =new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 55;
        nums[3] = 44;
        nums[4] = 3954;
        nums[5] = -573;
        nums[6] = -8888;
        nums[7] = 39028;
        nums[8] = -83945;
        nums[9] = -39548;

        min = max = 0;

        for(int i=0; i<10; i++){
            if(nums[i] < min)
                min = nums[i];
            if(nums[i]> max)
                max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
}

class Arrays {
    public static void main(String[] args) {

        int[] nums = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5634;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;


        min = max = 0;

        for(int i =0; i<10; i++) {
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }

        System.out.println("min and max: "+ min + " " + max);
    }
}
*/