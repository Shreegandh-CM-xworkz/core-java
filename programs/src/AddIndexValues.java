public class AddIndexValues {
    public static void sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    a[j] = a[j] + a[i];
                    a[i] = a[j] - a[i];
                    a[j] = a[j] - a[i];
                }
            }
        }
    }
    public static void pair(int a[],int target){
        //here we need 2 variable top equate the indexes
        int low=0;
        int high=a.length-1;
        while(low<high){
            if(a[low]+a[high]>target){
                high--;
            } else if (a[low]+a[high]<target) {
                low++;

            }else if(a[low]+a[high]==target){
                System.out.println("The indexes are ["+a[low]+","+a[high]+"]" );

                //to search for other pairs
                low++;
                high--;
            }
        }
    }


    public static void main(String[] args) {
        int a[] = {2, 3, 1, 6, 5};
        System.out.print("Original array:");
        for (int i=0;i<a.length;i++){
            System.out.print(+a[i]+ " ");
        }
        System.out.println();
  sort(a);
        System.out.print("Sorted array: ");
  for (int i=0;i<a.length;i++){
      System.out.print(+a[i]+ " ");
  }
        System.out.println();
  pair(a,5);


    }
}
