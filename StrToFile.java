
import java.io.FileOutputStream;
import java.io.IOException;

public class StrToFile {
    public static void main(String[] args)throws IOException  {
        FileOutputStream fileOutputStream=null;
        try{
            fileOutputStream=new FileOutputStream(args[2]);//将字符输出到args[2]中，也就是要求的位置
            byte[] bytes=Test.str.getBytes();//将Test中保留的待输出字符串转换成bytes数组以便输出
            fileOutputStream.write(bytes);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fileOutputStream!=null)
                try{
            fileOutputStream.close();
            } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
