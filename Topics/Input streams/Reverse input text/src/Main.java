import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        StringBuilder inputText = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            inputText.append(line);
        }

        // Reverse the input text and print it out
        String reversedText = inputText.reverse().toString();
        System.out.println(reversedText);
        reader.close();
    }
}