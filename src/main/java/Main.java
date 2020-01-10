import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Output(System.out, 100);
    }

    public static void Output(PrintStream out, int n){
        for(int i = 1; i <= n; i++){
            out.println(Logic(i));
        }
    }

    public static String Logic(int i){
        String output =  String.valueOf(i);

        if(i % 3 == 0) {
            output = "fizz";
        }

        if(i % 5 == 0) {
            output = "buzz";
        }

        if(i % 3 == 0 & i % 5 == 0){
            output = "fizzbuzz";
        }

        return output;
    }
}
