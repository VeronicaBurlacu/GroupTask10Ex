package GroupExercise;

public class taskNumber1 {
    public static void main(String[] args) {/*  Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
 */
        int [] arr={100,78,35,90,69,38,80};
        int small=arr[0];
        int large=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>large)
                large=arr[i];
           else if(arr[i]<small)
               small=arr[i];
        }
        System.out.println("Largest number is :"+large);
        System.out.println("smallest number is :"+small);
                }


            }




