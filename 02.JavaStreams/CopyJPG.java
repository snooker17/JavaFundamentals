import java.io.*;

public class CopyJPG {
    private static final String PICTURE_PATH="E://1.SoftUni/JavaFundamentals/JavaStreamsHomeWork/src/Scenery-HD.jpg";
    private static final String COPIED_PATH="E://1.SoftUni/JavaFundamentals/JavaStreamsHomeWork/src/my-copied-picture.jpg";

    public static void main(String[] args) {
        File origin=new File(PICTURE_PATH);
        File copy=new File(COPIED_PATH);
        try {
            FileInputStream fit=new FileInputStream(origin);
            int length=(int)origin.length();
            byte[] buffer=new byte[length];
            fit.read(buffer);
            FileOutputStream out =new FileOutputStream(copy);
            out.write(buffer);
            fit.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
