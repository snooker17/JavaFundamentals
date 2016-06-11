import java.io.*;

public class SumLines {
    private static final String READ_PATH="E://1.SoftUni/JavaFundamentals/JavaStreamsHomeWork/src/SumLines.txt";
    public static void main(String[] args) {
        File file=new File(READ_PATH);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line=br.readLine();
            long resultInLine=0;
            while(line!=null){
                for (int i = 0; i < line.length() ; i++) {
                    resultInLine+=(int)line.charAt(i);
                }
                System.out.println(resultInLine);
                resultInLine=0;

               line=br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception\nYour problem might be the directory!!!");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Input Output Exception!!!");
            e.printStackTrace();
        }

    }
}
