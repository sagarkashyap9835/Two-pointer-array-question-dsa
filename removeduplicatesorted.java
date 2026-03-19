public class removeduplicatesorted {
    public static void main(String[] args){

int arr[]={1,1,2,2,3,4,4};
int left=0;
for(int right=1;right<arr.length;right++){
    if(arr[left]!=arr[right]){
        left++;
        arr[left]=arr[right];
    }
}
for(int i=0; i<=left;i++){
    System.out.println(arr[i]+  "  ");
}

    }
}
