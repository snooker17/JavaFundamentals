import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class _7_CreateZipArchieve {
    public static void main(String[] args) {
        try {
            ZipOutputStream zip=new ZipOutputStream(new FileOutputStream("text-files.zip"));
            FileInputStream fis=new FileInputStream(new File("E://1.SoftUni/JavaFundamentals/03.JavaStreams/JavaStreamsHomeWork/src/words.txt"));
            int byteContainer;

            zip.putNextEntry(new ZipEntry("words.txt"));
            while ((byteContainer=fis.read())!=-1){
                zip.write(byteContainer);
            }
            zip.closeEntry();

            zip.putNextEntry(new ZipEntry("count-chars.txt"));
            fis=new FileInputStream(new File("E://1.SoftUni/JavaFundamentals/03.JavaStreams/JavaStreamsHomeWork/src/count-chars.txt"));
            while((byteContainer=fis.read())!=-1){
                zip.write(byteContainer);
            }
            zip.closeEntry();

            zip.putNextEntry(new ZipEntry("lines.txt"));
            fis=new FileInputStream(new File("E://1.SoftUni/JavaFundamentals/03.JavaStreams/JavaStreamsHomeWork/src/SumLines.txt"));
            while((byteContainer=fis.read())!=-1){
                zip.write(byteContainer);
            }
            zip.closeEntry();
            zip.finish();
            zip.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
