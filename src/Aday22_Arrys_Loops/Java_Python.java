package Aday22_Arrys_Loops;

public class Java_Python {
    public static void main(String[] args) {
        /*
3. write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
			(it’s similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
 */
        String sentence="i like java and javascript python python";
        int countjava=0;
        int countpython=0;
        String [] word=sentence.split(" ");

        for (String each: word){
            if (each.contains("java")){
                countjava++;
            }
            if (each.contains("python")){
                countpython++;
            }
        }
        System.out.println(countjava);
        System.out.println(countpython);
        System.out.println(countjava==countpython);
    }
}
