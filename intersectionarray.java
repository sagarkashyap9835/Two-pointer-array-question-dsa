public class intersectionarray {
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4};
        int arr2[] = {2,4,6};

        int left = 0;
        int right = 0;

        while(left < arr1.length && right < arr2.length) {

            if(arr1[left] == arr2[right]) {
                System.out.print(arr1[left] + " ");
                left++;
                right++;
            }
            else if(arr1[left] < arr2[right]) {
                left++;
            }
            else {
                right++;
            }
        }
    }
}