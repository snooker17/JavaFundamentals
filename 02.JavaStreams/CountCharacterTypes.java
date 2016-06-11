import java.io.*;

public class CountCharacterTypes {
    private static final String WORDS_PATH="E://1.SoftUni/JavaFundamentals/JavaStreamsHomeWork/src/words.txt";
    private static final String RESULT_PATH="E://1.SoftUni/JavaFundamentals/JavaStreamsHomeWork/src/count-chars.txt";
    public static void main(String[] args) {
        File file =new File(WORDS_PATH);
        File fileRes=new File(RESULT_PATH);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            FileWriter fw=new FileWriter(fileRes,true);
            PrintWriter writer=new PrintWriter(fw,true);
            String line =null;
            long vowels=0;
            long punctuation=0;
            long consonants=0;
            while((line=br.readLine())!=null){
                for (int i = 0; i <line.length() ; i++) {
                    char c=line.charAt(i);
                    switch (c){
                        case 'a':
                        case 'o':
                        case 'u':
                        case 'e':
                        case 'i':vowels++;break;
                        case '!':
                        case '.':
                        case '?':
                        case ',':punctuation++;break;
                        default:
                            if((int)c!=32){
                            consonants++;
                        }break;
                    }
                }
            }
            writer.println("Vowels: "+vowels);
            writer.println("Consonants: "+consonants);
            writer.println("Punctuations: "+punctuation);
            br.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
