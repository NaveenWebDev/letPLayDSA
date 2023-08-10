public class BubbleShort {

    public static void BubbleShort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {5, 4, 1, 6, 2};
        BubbleShort(number);

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }


    }
}
