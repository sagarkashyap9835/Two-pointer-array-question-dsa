// public class closestpair {
//         public static void main(String[] args) {
//         int arr[] = {1,3,4,7,10};
//         int target = 15;
//         int bestSum = Integer.MAX_VALUE;
//         int num1 = -1;
//         int num2 = -1;
//         int left = 0;
//         int right = arr.length - 1;
//         while(left < right){
//             int sum = arr[left] + arr[right];
//             int diff1 = sum - target;
//             if(diff1 < 0){
//                 diff1 = diff1 * -1;
//             }
//             int diff2 = bestSum - target;
//             if(diff2 < 0){
//                 diff2 = diff2 * -1;
//             }
//             if(diff1 < diff2){
//                 bestSum = sum;
//                 num1 = arr[left]; 
//                 num2 = arr[right];
//             }
//             if(sum > target){
//                 right--;
//             }else{
//                 left++;
//             }
//         }
//         System.out.println("Closest pair: " + num1 + " " + num2);
//     }
// }



public class closestpair{
public static void main(String[] args){
   
     int arr[] = {1,3,4,7,10};
   int target=14;
   int bestsum =Integer.MAX_VALUE;
   int left=0;
   int num1=-1;
   int num2=-1;
   int right=arr.length-1;
   while(left<right){
int sum=arr[left]+arr[right];

int diff1=sum-target;
if(diff1<0){
    diff1=diff1*-1;
}
int diff2=bestsum-target;
if(diff2<0){
    diff2=diff2*-1;
}
if(diff1<diff2){
    bestsum=sum;
    num1=arr[left];
    num2=arr[right];
}
if(sum>target){
    right--;
}else{
    left++;
}
   }
    System.out.println("Closest pair: " + num1 + " " + num2);
}
}