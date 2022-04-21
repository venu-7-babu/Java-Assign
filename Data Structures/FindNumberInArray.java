import java. util. *;
class FindNumberInArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int n1=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }


         for(i=0;i<a.length;i++){
              if(a[i]==n1){
              System.out.println(i);
              break;
              }
             
         
}
System.out.println("Not");
}
}
}
