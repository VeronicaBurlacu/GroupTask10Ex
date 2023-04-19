package GroupExercise;

public class taskNumber2Sum {
    public static void main(String[] args) {
        /* Create an array of integer values. After the array is
           created, calculate the sum of all stored elements in
           that array.  */
        int [] sum={12,56,23,56,78};
        int su=0;
        for (int i : sum) {
            for (int i1 : sum) {
                su=i1+su;

            }

        }
        System.out.println(su);
        }
    }

