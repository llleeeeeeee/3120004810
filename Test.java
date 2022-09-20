
import java.io.IOException;

public class Test {
    public static String str; //用来传递结果
    public static void main(String[] args) {
        try {
            FileToStr.main(args);
            String a = FileToStr.a;//接收原文件
            String b = FileToStr.b;//接收待检测文件
            Float f = Distance.Levenshtein(a, b);//计算相似度
            System.out.println("结果预览");
            System.out.println(f);
            str = String.valueOf(f);
            str=String.format("%.2f",f);//保留两位小数
            StrToFile.main(args);//输出
        } catch (IOException e) {//异常处理
            e.printStackTrace();
        }
    }
}