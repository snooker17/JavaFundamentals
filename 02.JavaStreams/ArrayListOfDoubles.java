import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfDoubles {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Double> doubleList=new ArrayList<>();
        doubleList.add(3.5);
        doubleList.add(123.64785);
        doubleList.add(50.6);
        doubleList.add(5.6);
        doubleList.add(5456.6789456);
        doubleList.add(8145.6456123);
        doubleList.add(6213.6);
        File file=new File("doubles.list");
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(file));
          out.writeObject(doubleList);
            out.flush();
            ObjectInputStream in=new ObjectInputStream(new FileInputStream(file));
            System.out.println(in.readObject());
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
