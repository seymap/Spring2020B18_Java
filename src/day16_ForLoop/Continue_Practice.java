package day16_ForLoop;

public class Continue_Practice {

    public static void main(String[] args) {

        for(char i ='a'; i<='z'; i++){
            if(i=='y'||i=='h'||i=='j'||i=='d'){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i = 1; i<=100 ; i++){
            if(i%3==0||i%5==0){
                continue;
            }
            System.out.println(i+" ");
        }


    }
}
