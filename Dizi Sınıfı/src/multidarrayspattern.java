public class multidarrayspattern {
    public static void main(String[] args) {
        patternB();
    }

    static void patternB(){
        String[][] patt = new String[7][7];
        for(int b=0;b<7;b++){
        if(b==0||b==3||b==6){
            for(int a=0;a<7;a++){
                patt[b][a]="*";
            if(a==6){
                patt[b][a]=" ";
            }
        }}else{
        patt[b][0]="*";
        for(int a=1;a<7;a++){
            patt[b][a]=" ";
        }
        patt[b][6]="*";
    }
        }
        for(String[] row : patt){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
/* 

******
*     *
*     *
******
*     *
*     *
******

*/