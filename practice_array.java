import java .util.Scanner;

public class practice_array {

    public static void main (String[] args){
        int a[]= new int [5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[5]=50;
        
        // System.out.println(a[3]);
        // for(int i:a){
        //     System.out.println(i);
        // }

        // //String array
        // String s[]= new String[3];
        // s[0]="wel";
        // s[1]="come";
        // s[3]="tata";
        // System.out.println("length of sting array :"+s.length);
        // for (String i:s){
        //     System.out.println(i);

            // unlimited array
            int a[]= {10,20,30,40,50};
            int sum = 0;
            for (int i:a){
                System.out.prinln(i);
                sum= sum + i;
            }
            System.out.print("sum of values is "+ sum);

        }
    }
}
