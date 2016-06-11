import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    private static final String FILE_PATH="E://1.SoftUni/JavaFundamentals/JavaStreamsHomeWork/src/";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter file name!!!");
        String fileName=scanner.nextLine();
        WriteInFile(fileName);
    }

    public static void WriteInFile(String fileName){
        Scanner scanner=new Scanner(System.in);
        File file=new File(FILE_PATH+fileName+".txt");
        FileWriter fw;
        PrintWriter writer;

        try {
            fw=new FileWriter(file,true);
            writer=new PrintWriter(fw,true);

            System.out.println("Enter text to write in the file\nWord \"STOP\" ends the input!!!");
            String input=scanner.nextLine();
            while(!(input.equals("STOP"))){
                writer.println(input);
                input=scanner.nextLine();
            }
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
