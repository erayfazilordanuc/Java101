import java.util.Scanner;

public class repeate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oluşturmak istediğiniz dizinin uzunluğunu giriniz :");
        int a =input.nextInt();
        int[] list = new int[a];
        for(int b=1;b<=list.length;b++){
            System.out.print("\n"+b+". elemanı giriniz :");
            list[b-1]=input.nextInt();
        }
        evenrepeaters(list);
    }
    
    static void evenrepeaters(int[] array){

    int[] repeaters = new int[array.length];
    int index=0;
    System.out.print("Tekrar eden çift sayılar : \n");
    for(int a=0;a<array.length;a++){
        int sayac=-1;

        for(int b=0;b<array.length;b++){
            if(array[b]==array[a]){
                sayac++;
            }
        }
    
    if(sayac>0&&array[a]%2==0){//Bu kısımdan tekrar eden sayının hangi parametrelerde olacağı değiştirilir
        boolean stat=false;
        for(int f=0;f<repeaters.length;f++){
            if(repeaters[f]==array[a]){
                stat=true;
            } 
            
        }
        if(stat==false){
        repeaters[index]=array[a];
            index++;
            System.out.println(array[a]+" sayısı "+(sayac+1)+" kere geçiyor");}

    }
    }
    int[] repeaters2 = new int[array.length];
    int index2=0;
    System.out.print("Tekrar eden tek sayılar : \n");
    for(int a=0;a<array.length;a++){
        int sayac=-1;

        for(int b=0;b<array.length;b++){
            if(array[b]==array[a]){
                sayac++;
            }
        }
    
    if(sayac>0&&array[a]%2!=0){//Bu kısımdan tekrar eden sayının hangi parametrelerde olacağı değiştirilir
        boolean stat=false;
        for(int f=0;f<repeaters2.length;f++){
            if(repeaters2[f]==array[a]){
                stat=true;
            } 
            
        }
        if(stat==false){
        repeaters2[index2]=array[a];
            index2++;
            System.out.println(array[a]+" sayısı "+(sayac+1)+" kere geçiyor");}

    }
    }
    }

}
