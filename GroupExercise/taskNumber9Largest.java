package GroupExercise;

public class taskNumber9Largest {
    public static void main(String[] args) {
        //write a program to find the second largest number in the array
        int [] arr={12,56,23,29,456,677};
        int num=arr[0];
        int large=arr[1];
        for (int i = 1; i < arr.length; i++) {
           if(arr[i]>large){
               num=large;
               large=arr[i];

           }

            }

        System.out.println(large);
        }


    }

