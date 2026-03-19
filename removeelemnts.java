public class removeelemnts {
    public static void main(String[] args){
        int arr[]={3,3,2,2};
        int left=0;
        int value=3;
        for(int right=0; right<arr.length;right++){
            if(arr[right]!=value){
                arr[left]=arr[right];
                left++;
            }
        }
    for(int i=0; i<left;i++){
        System.out.println(+arr[i]);
    }
    }
} 
