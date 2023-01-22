package hw1;



public  class dz1 {
    public static void main(String[] args) {
        int[] arr = {10, 6, 87, 8, 9, 4, 11};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("dv");
    }
}
