
//Separating char, int and String
public class InputParser {
    public static void main(String[] args) {
        String input = "12123chatgpt@#$%^";
        String regex = "[a-zA-Z]+|\\d+|\\W+"; // pattern to match alphabets, digits, and symbols
        String[] output = input.split(regex); // split the input based on the pattern
        for (String segment : output) {
            System.out.println(segment);
        }
    }
}

output:
12123
chatgpt
@#$%^
