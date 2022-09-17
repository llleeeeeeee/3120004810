import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static String str; //用来传递结果
    public static void main(String[] args) {
        try {
            FileToStr.main(args);
            String a = FileToStr.a;//接收原文件
            String b = FileToStr.b;//接收待检测文件
            Float f = Distance.Levenshtein(a, b);//计算相似度
            str = String.valueOf(f);
            str=String.format("%.2f",f);
            StrToFile.main(args);//输出
        } catch (FileNotFoundException e) {//异常处理
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}