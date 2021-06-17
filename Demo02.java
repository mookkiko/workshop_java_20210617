import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args){
        //String
        String name1 = "Tanyaluk";
        String name2 = new String("Tanyaluk");

        //System.out.println(name1.length());

        if("Tanyaluk".equals(name1)){
            System.out.println("OK 1");
        }
        if("Tanyaluk".equals(name2)){
            System.out.println("OK 2");
        }

        for (int i = 0; i < name1.length(); i++){
            System.out.println(name1.charAt(i));

        }

        int[] scores = new int[5];
        scores[0] = 0;
        scores[1] = 10;
        scores[2] = 20;
        scores[3] = 30;
        scores[4] = 40;
        for (int score : scores){
            //For each
            System.out.println(score);
        }

        for(int i = 0; i<scores.length;i++){
            System.out.println(i+"="+scores[i]);
        }

        Arrays.stream(scores).forEach(score ->System.out.println(score));
    }
}
