public class traversearray{
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        int left=0;
        int right=arr.length-1;
        while(left <= right){
    if(left == right){
        System.out.println(arr[left]);
    } else {
        System.out.println(arr[left]);
        System.out.println(arr[right]);
    }
    left++;
    right--;
}
    }
}