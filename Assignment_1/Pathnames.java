import java.io.File;
import java.util.Scanner;
import java.util.regex.*;

public class Pathnames {
    public static void main(String[] args) {
        File file = new File("C:\\OneDrive\\Desktop\\Demo");
        Scanner KeyBoard = new Scanner(System.in);
        System.out.println("Enter the file to be search ");
        String fileToSearch = KeyBoard.nextLine();
        int flag = 0;
        Pattern pattern = Pattern.compile(fileToSearch);


        for (File listOfFiles : file.listFiles()) {
            //System.out.println("----"+listOfFiles);
            Matcher matcher = pattern.matcher(String.valueOf(listOfFiles));
            boolean matchFound = matcher.find();
            if (matchFound==true) {
                File f=new File(file,fileToSearch);

                System.out.println("file found path is : " +  f.getAbsolutePath());
                flag = 1;
                break;
            }
        }
        if(flag==0)
            System.out.println("file not found");
    }

}