import java.util.Scanner;

public class binary_search {
    public static void binarysearch(int a[],int key){
        int low =0;
        int high=a.length-1;
        while (low<=high){
            int mid =(low +high)/2;
            if (a[mid]==key){
                return mid;


            }else if (a[mid]<key){
                low=mid+1;
            }
            else{high = mid-1;}}
            
        }
    }

    public static void main(String[] args) {

        int a[] = { 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("order of elemeints is ");
        for (int n : a) {
            System.out.println(n);
            int key = 50;
            binarysearch(a, key);
            if (result!=-1){
                System.out.println("Searchfound"+result );}
                else {
                    System.out.println("system not found ");
                }
            }
        }

    }


