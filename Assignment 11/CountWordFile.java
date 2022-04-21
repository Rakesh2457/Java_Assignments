import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Files;
public class CountWordFile
{
    public static void main(String[] args) throws Exception {
        String line,text;
        int count = 0;

        //Opens a file in read mode
        FileReader file = new FileReader("C:\\OneDrive\\Desktop\\Demo\\a.txt");
        BufferedReader br = new BufferedReader(file);
        while((line = br.readLine()) != null) {
            //Splits each line into words
            String words[] = line.split(" ");
            //Counts each word
            count = count + words.length;
        }
        text="Number of words present in given file: " + count;
        BufferedWriter out = new BufferedWriter(new FileWriter("C:\\OneDrive\\Desktop\\Demo\\b.txt", true));
        out.write(text);
        // Closing the connection
        out.close();
        br.close();
    }
}