package Assign_3;

public class MainClass {
    public static void main(String[] args) {
        Assign_3Interface lambda = (s1, s2, s3, s4, s5, s6, s7) -> {
            StringBuilder result = new StringBuilder("");
            result.append(s1.toUpperCase());
            result.append(s2.toUpperCase());
            result.append(s3.toUpperCase());
            result.append(s4.toUpperCase());
            result.append(s5.toUpperCase());
            result.append(s6.toUpperCase());
            return new String(result);
        };

        System.out.println(lambda.concatenate("The", "lambda", "has", "too", "many", "string" ,"arguments."));
    }
}