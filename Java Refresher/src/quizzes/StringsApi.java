package quizzes;

public class StringsApi {

    public static void main(String[] args) {

        String c = "abd".substring(1,3);

        //System.out.println(c);

        StringBuilder sb = new StringBuilder("Good Morning");
        sb.insert(0, "Friend ");
        System.out.println(sb.toString()); 

    }
}
