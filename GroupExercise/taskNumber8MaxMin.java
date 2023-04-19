package GroupExercise;



public class taskNumber8MaxMin {
    public static void main(String[] args) {
        // Maximum and minimum number in the array
        int[] arr = {23, 45, 87, 54, 78};
        int a = arr[0];
        int b = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a)
                a = arr[i];
        }

        System.out.println("maximum number is: "+a);
        for (int i = 0; i < arr.length; i++) {
            if(b>arr[i])
                b=arr[i];

        }
        System.out.println("minimum number is:"+b);
    }
}

