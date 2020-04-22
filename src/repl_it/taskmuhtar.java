package repl_it;

public class taskmuhtar {
    public static void main(String[] args) {
       evenodd();
        System.out.println("=============");
        oddeven();


    }
    public static void evenodd(){

        for (int i=0; i<=100 ;i++){
            if (i%2!=0){
                i++;


            }System.out.println(i);

        }
    }
    public static void oddeven(){
        for (int i=0; i<=100 ;i++){
            if (i%2==0){
                i++;


            }System.out.println(i);

    }
}}
