// public class allpractice{
//     public static void main(){
//         int arr[]={10,20,30,40,50};
//         int left=0;
//         int right=arr.length-1;
// while(left<=right){

// if(left==right){
//     System.out.println(arr[left] + " ");
// }else{
//     System.out.println(arr[left]+ " ");
//     System.out.println(arr[right]+ " ");
// }
// left++;
// right--;
// }
//     }
// }


// public class allpractice{
//     public static void main(){
//         int arr[]={10,20,30,70,90,40,50};
//         int left=0;
//         int right=arr.length-1;
// while(left<right){
// int temp=arr[left];
// arr[left]=arr[right];
// arr[right]=temp;
// left++;
// right--;
// }
// for(int i=0;i<arr.length;i++){
//     System.err.println(arr[i] + " ");
// }
//     }
// }

// public class allpractice{
//     public static void main(){
//     String str="jahaj";
//         int left=0;
//         int right=str.length()-1;
//         boolean isPallindrome=true;
// while(left<right){
// if(str.charAt(left)!=str.charAt(right)){
//     isPallindrome=false;
//     break;
// }
// left++;
// right--;
// }
// System.err.println(isPallindrome);

//     }
// }


// public class allpractice{
//     public static void main(){
//     int arr[]={1,1,2,2,3,4,4};
//         int left=0;
//      for(int right=1; right<arr.length; right++){
//         if(arr[left]!=arr[right]){
// left++;
// arr[left]=arr[right];
//         }
//      }
//   for(int i=0; i<=left;i++){
//     System.out.println(arr[i]);
//   }


//     }
// }


// public class allpractice{
//     public static void main(){
//     int arr[]={0,1,0,2,12,15};
//         int left=0;
//      for(int right=0; right<arr.length; right++){
//     if(arr[right]!=0){
//         int temp=arr[left];
//         arr[left]=arr[right];
//         arr[right]=temp;
//         left++;
//     }
//      }
//   for(int i=0; i<arr.length;i++){
//     System.out.println(arr[i]);
//   }


//     }
// }




// public class allpractice{
//     public static void main(){
//     int arr[]={2,7,12,15};
//         int left=0;
//         int right=arr.length-1;
//         int target=11;
//   while(left<right){
//    int sum=arr[left]+arr[right];

// if(sum==target){
//     System.out.println(arr[left]+ " ," +arr[right]);
//     break;
// }else if(sum<target){
//    left++; 
// }
// else{
//     right--;
// }
// }

//      }
//     }




// public class allpractice{
//     public static void main(){
//     int arr[]={2,7,12,15};
//         int left=0;
//         int right=arr.length-1;
//         int target=11;
//   while(left<right){
//    int sum=arr[left]+arr[right];

// if(sum==target){
//     System.out.println(arr[left]+ " ," +arr[right]);
//     break;
// }else if(sum<target){
//    left++; 
// }
// else{
//     right--;
// }
// }

//      }
//     }



// public class allpractice{
//     public static void main(String[] args){
//         int arr[]={10,20,30,40,50};
//         int left=0;
//         int right=arr.length-1;
//         while(left<=right){
//             if(left==right){
//                 System.out.println(arr[left]);
//                     break;
//             }
//             else{
//                 System.out.println(arr[left] + " ");
//                 System.out.println(arr[right] + " ");
//             }
//             left++;
//             right--;
//         }


//     }
// }



// import java.util.Arrays;

// public class allpractice{
//     public static void main(String[] args){
//         int arr[]={10,20,30,40,50};
//         int left=0;
//         int right=arr.length-1;
//         while(left<right){
// int temp=arr[left];
// arr[left]=arr[right];
// arr[right]=temp;
//             left++;
//             right--;
//         }
// System.out.println(Arrays.toString(arr));

//     }
// }


// public class allpractice{
//     public static void main(String[] args){
//         String str="madam";
//         int left=0;
//         int right=str.length()-1;;
//         boolean isPallindrome=true;
//         while(left<right){
// if(str.charAt(left)!=str.charAt(right)){
//     isPallindrome=false;
//     break;
// }
// left++;
// right--;
//         }
//         System.out.print(isPallindrome);

//     }
// }



// public class allpractice{
//     public static void main(String[] args){
//         int arr[]={1,1,2,2,3,4,4};
//         int left=0;
//        for(int right=1;right<arr.length;right++){
//         if(arr[left]!=arr[right]){
//             left++;
//             arr[left]=arr[right];
//         }
//        }
//       for(int i=0;i<=left;i++){
//         System.out.println(arr[i]);
//       }
//     }
// }



// public class allpractice{
//     public static void main(String[] args){
//         int arr[]={0,1,0,3,12};
//         int left=0;
//        for(int right=0;right<arr.length;right++){
// if(arr[right]!=0){
//     int temp=arr[left];
//     arr[left]=arr[right];
//     arr[right]=temp;
//     left++;
// }
//        }
//       for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i] + " ");
//       }
//     }
// }


// public class allpractice{
//     public static void main(String[] args){
//         int arr[]={3,3,2,2};
//         int left=0;
//         int value=3;
//        for(int right=0;right<arr.length;right++){
// if(arr[right]!=value){
//   arr[left]=arr[right];
//   left++;
// }
//        }
//       for(int i=0;i<left;i++){
//         System.out.println(arr[i] + " ");
//       }
//     }
// }




// public class allpractice{
//     public static void main(String[] args){
//         int height[]={1,8,6,2,5,4,8,3,7};
//         int left=0;
//         int right=height.length-1;
//      int maxarea=0;
//      while(left<right){
//         int h=Math.min(height[left],height[right]);
//         int width=right-left;
//         int area=width*h;
//          maxarea=Math.max(area,maxarea);
//         //  Move smaller height
//         if(height[left]<height[right]){
//             left++;
//         }else{
//             right--;
//         }
         
//      }
//      System.out.println("Maximum area is:"+maxarea);

//     }
// }



// public class allpractice{
//     public static void main(String[] args){
//         int arr[]={2,4,7,10};
//         int target=6;
//         int left=0;
//         int right=arr.length-1;
//         while(left<right){
//             int sum=arr[left]+arr[right];
//             if(sum==target){
//                 System.out.println(arr[left]+ " , " +arr[right] );
//                 return;
//             }
//             else if(sum<target){
//                 left++;
//             }
//             else{
//      right--;
//             }
//         }
       
//     System.out.print("not pair found");
   

//     }
// }


// public class allpractice{
//     public static void main(String[] args){
//         int arr1[]={1,3,5,7};
//         int arr2[]={2,4,6};
//         int left=0;
//         int right=0;
//         boolean found=false;
//         while(left<arr1.length && right<arr2.length){
// if(arr1[left]==arr2[right]){
//     System.out.println(arr1[left]+ " ");
//     found=true;
//     left++;
//     right++;
// }else if(arr1[left]<arr2[right]){
//     left++;
// }
// else{
//     right++;
// }
//         }
//         if(!found){
//             System.out.println("no common elements found");
//         }
//     }
// }

