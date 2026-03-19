public class pallindrome {
    public static void main(String[] args){

String str="madam";
int left=0;
int right=str.length()-1;
boolean isPaliindrome=true;
while(left<right){
if(str.charAt(left)!=str.charAt(right)){
    isPaliindrome=false;
    break;
}
left++;
right--;
}
System.out.println(isPaliindrome);
    }
}
