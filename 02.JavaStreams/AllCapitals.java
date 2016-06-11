import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AllCapitals {
    public static final String FILE_PATH="E://1.SoftUni/JavaFundamentals/JavaStreamsHomeWork/src/AllCapitals.txt";
    public static void main(String[] args) {
        File file=new File(FILE_PATH);

        try {
            //READING FROM FILE
            BufferedReader br=new BufferedReader(new FileReader(file));

            String line=null;
            String wholeText="";
            while ((line=br.readLine())!=null){
                wholeText+=line.toUpperCase()+"\r\n";
            }
            //WRITING IN FILE
            FileWriter fw=new FileWriter(file,false);//OVERWRITING
            PrintWriter writer=new PrintWriter(fw);
            writer.print(wholeText);
            br.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
