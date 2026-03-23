public class trappedwater{
    public static void main(String[] args){
     int height[] = {4, 2, 0, 6, 3, 2, 5};
     int left=0;
     int right=height.length-1;
     int leftmax=0;
     int rightmax=0;
    int water=0;
while(left<right){
if(height[left]<height[right]){
    if(height[left]>=leftmax){
        leftmax=height[left];
    }else{
        water+=leftmax-height[left];
    }
    left++;
}else{
  if(height[right]>=rightmax){
        rightmax=height[right];
    }else{
        water+=rightmax-height[right];
    }
    right--;

}
}
System.out.println("Total trapped water is:" +water);
}
}