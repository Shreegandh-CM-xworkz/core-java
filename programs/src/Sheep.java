public class Sheep {
    public static void  count(Boolean[] arr){
        int presentCount =0;
        int absentCount =0;
        for (int i=0;i<arr.length;i++){
            Boolean isPresent=arr[i];
            if ( isPresent !=null) {
                if (isPresent) {
                    presentCount++;
                } else {
                    absentCount++;
                }
            }

        }
        System.out.println(presentCount);
        System.out.println(absentCount);
    }

    public static void main(String[] args) {
       Boolean [] arr={
               true, true, true, false, true, true, true, true, true, false,
               true, false, true, false, false, true, true, true, true, false, false, true, true};
       count(arr);


    }
}
