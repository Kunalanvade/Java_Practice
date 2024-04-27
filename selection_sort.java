import java.util.Scanner;

public class selection_sort {
    public static void SelectionSort(int a[])
{int n= a.length;

    
}

    for(

    int i = o;i<n-1;i++)
    {
        int min = i;
        for (j = i + 1; j <= n; j++) {
            if (a[j] < a[min])
                min = j;
        }

        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }

    public static void main(String[] args)
    {

        int a[]={9,3,1,4,2,7,5};
        System.out.println("origina array" );
        for (int m:a){
            System.out.println(m);
            SelectionSort(a);
            System.out.println("afte sorting");
            for (int p:a){
                System.out.println(p);
        }


    }


}
