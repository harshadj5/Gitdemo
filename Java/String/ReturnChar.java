package Java.String;
class ReturnChar{
    public static void main(String[] args){
    String str = "Good Morning";
    int l = str.length();
    for(int i=0;i<l;i++){
        char ch = str.charAt(i);
        System.out.printf("str[%d]--->%c\n",i,ch);
    }
    
    }
}