package bitonic;

public class Main {
    public static void main(String[] args) {
            int i=0;int flag = 0 ;
            int arr[] = {1001,15,25,45,42,21,17,12,11};
        for( i = 0 ; i < arr.length-1 ; i++){
            if( arr[i+1]> arr[i]) {

                flag = 1;continue ;
            }else {
                System.out.println( arr[i]);flag=0;break;}

        }
        if (flag==1)
        System.out.println(arr[arr.length]);
    }
}
