import java.util.Scanner;

public class SortTwoArr {

    public static void sort(int arr1[],int arr2[], int m, int n)
    {
        int i=0;
        int j=0;
        int k=0;

        int merge[]= new int[m+n];
       
        while(i<m && j<n)
        {
            if(arr1[i]<arr2[j])
            {
                merge[k++]=arr1[i++];
            }
            else{
                merge[k++]=arr2[j++];
            }
        }
        while(i<m){
            merge[k++]=arr1[i++];
        }
        while(j<n)
        {
            merge[k++]=arr2[j++];
        }

        for(int s=0; s<m; s++)
        {
            arr1[s]=merge[s];
        }
        for(int s=0; s<n; s++)
        {
            arr2[s]=merge[m+s];
        }

    }
    


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int m= sc.nextInt();
        int arr1[]= new int[m];
        System.out.println("Enter the size of second array:");
        int n= sc.nextInt();
        int arr2[]= new int[n];


        System.out.println("Enter the elements of first sorted array:");
        for (int i=0; i<arr1.length; i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the elements of second sorted array:");
        for (int i=0; i<arr2.length; i++)
        {
            arr2[i]=sc.nextInt();
        }

        sort(arr1,arr2,m,n);

        System.out.print("[");
        for (int i=0; i<arr1.length; i++)
        {
            System.out.print(arr1[i]);
        }
        System.out.print("]");
        System.out.print("[");
        for (int i=0; i<arr2.length; i++)
        {
            System.out.print(arr2[i]);
        }
        System.out.print("]");
    }
}
