import java.util.*;

public class armstrong {

    public static long expo(long a,long b){
        long cons=1;
        if(a==0||b==0)
            cons=0;
        for(;b>0;b--)
            cons*=a;
        return cons;}
    public static long digitlong(long x){
      int counter=0;
      while(x>0){
        x=(x-x%10)/10;
        counter++;
      }return counter;
    }
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int b = input.nextInt();
    int a=b;
    int remainder;
    int total=0;
    long l=digitlong(a);
    for(long x=l;x>0;x--){//basamak sayısı kere her basamağın 3 üssünü alan döngü
     remainder=a%10;// son basamağı bulur
     total+=expo(remainder,l);//üssünü alır
     a=(a-(a%10))/10;//girilen sayıdan son basamağı çıkarıp 10' böler bu işlemi bu sayı üzerinden devam ettirir
    }if(total==b){
        System.out.println("This is an armstrong number");
    }
    }
}