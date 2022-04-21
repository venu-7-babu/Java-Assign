import java. util.*;
class RearrangePositiveNegative {
static void sortArray(int a[], int n)
{
   // Store all non-negative values
    Vector<Integer> ans = new Vector<>();
    for (int i = 0; i < n; i++)
    {
        if (a[i] >= 0)
            ans.add(a[i]);
    }
    // Sort non-negative values
    Collections.sort(ans);
     int j = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] >= 0) 
        {
            a[i] = ans.get(j);
            j++;
        }
    }
    // Print the sorted array
    for (int i = 0; i < n; i++)
        System.out.print(a[i] + " ");
}
// Driver code
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in) ;
int n1=sc.nextInt();
int i;
    int arr[] =new int[n1];
for(i=0;i<n1;i++) 
{
arr[i]=sc.nextInt();
}
    int n = n1;
     sortArray(arr, n);
}
}
