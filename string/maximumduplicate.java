public class maximumduplicate {
   public static void main(String[] args){

String str="programmming";
int maxcount=0;
char maxchar=' ';
int count=0;

for(int i=0; i<str.length();i++){
    count=1;
    for(int j=i+1; j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
count++;
        }
    }
if(count>maxcount){
    maxcount=count;
    maxchar=str.charAt(i);
}
}
System.out.println("maxchar is : " +maxchar);
System.out.println("maxcount repetition element is : " +maxcount);

   } 
}
