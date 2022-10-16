public class no_dupplicate {

    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void non_duplicate(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // System.out.print(max);
        //counting the numbers
        int count[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        print_arr(count);
        System.out.println();
        //unique element
        System.out.print("UNIQUE ELEMENT :: ");
        for(int i=0;i<count.length;i++){
            if(count[i]==1){
                System.out.print(i +" ");
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {0,1,1,1,2,3,3,4,5,6,5,8,7,8};
        non_duplicate(arr);
    }
}
