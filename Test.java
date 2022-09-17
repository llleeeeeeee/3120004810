import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static String str;

    public static void main(String[] args) {
        try {
            FileToStr.main(args);
            String a = FileToStr.a;
            String b = FileToStr.b;
            Float f = Distance.Levenshtein(a, b);
            str = String.valueOf(f);
            str=String.format("%.2f",f);
            StrToFile.main(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}