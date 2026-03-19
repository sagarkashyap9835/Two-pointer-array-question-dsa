public class MergeArrays {
    public static void main(String[] args) {

        int arr1[] = {1,3,5};
        int arr2[] = {2,4,6};

        int left = 0;
        int right = 0;

        while(left < arr1.length && right < arr2.length) {

            if(arr1[left] < arr2[right]) {
                System.out.print(arr1[left] + " ");
                left++;
            } else {
                System.out.print(arr2[right] + " ");
                right++;
            }
        }

        // remaining elements
        while(left < arr1.length) {
            System.out.print(arr1[left] + " ");
            left++;
        }

        while(right < arr2.length) {
            System.out.print(arr2[right] + " ");
            right++;
        }
    }
}
