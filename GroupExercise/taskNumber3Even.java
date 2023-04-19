package GroupExercise;

public class taskNumber3Even {
    public static void main(String[] args) {
      /* . Create a 2D array or integer type where you will store
    odd and even numbers. Develop a program which will
   identify/print the even numbers only. */
        int [][] array={ {12,45,67,23,67} ,
                        {45,78,23,45,47},
                        {34,75,89,56,34},
                         {23,67,43,76,98}};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]%2==0) {
                    sum++;


                }
                }
            
            }
        System.out.println("sum = " + sum);
        }
    }

