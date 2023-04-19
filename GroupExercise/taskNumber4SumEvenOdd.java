package GroupExercise;

public class taskNumber4SumEvenOdd {
    public static void main(String[] args) {
        /* Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array  */
        int[][] arr = {{12, 45, 78, 90, 34},
                {45, 23, 89, 45, 67},
                {67, 89, 23, 67, 23},
                {45, 89, 34, 32, 8}
        };
  int even=0;
  int odd=0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if(anInt%2!=0) {
                    odd=odd+anInt;
                }
               if(anInt%2==0){
                   even=even+anInt;
               }
            }

        }
        System.out.println(odd);//717 odd numbers
        System.out.println(even);//288 even numbers
    }
}