package GroupExercise;

public class taskNumber7Fibonnaci {
    public static void main(String[] args) {
      /*  Write a Java Program to print the first 10 numbers of
        Fibonacci series.*/
        int n1=0,n2=1,n3,i,count=10;
        System.out.println(n1+" "+n2);//printing 0 and 1 (the starting point)
        for ( i = 2; i < count; ++i) {//loop starts from 2 bc 0 and 1 are already printed
            n3=n1+n2;
        System.out.println(""+n3);
        n1=n2;
        n2=n3;
        }
    }
}
