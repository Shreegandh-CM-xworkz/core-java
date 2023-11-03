public class ReversingArray {
    public static void reverse(int []a,int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int []a={1,2,3,2,4};
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        reverse(a,0,4);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
