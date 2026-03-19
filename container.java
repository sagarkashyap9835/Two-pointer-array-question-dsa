public class container {
    public static void main(){
int height[] = {1,8,6,2,5,4,8,3,7};
int left=0;
int right=height.length-1;
int maxarea=0;

while(left<right){
int h=Math.min(height[left],height[right]);
int width=right-left;
int area=h*width;
maxarea=Math.max(maxarea,area);

// move smaller height

if(height[left]<height[right]){
    left++;
}
else{
    right--;
}
}
System.out.println("maxarea is:" +maxarea);
    }
}