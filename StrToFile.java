import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StrToFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=null;
        try{
            fileOutputStream=new FileOutputStream(args[2]);
            byte[] bytes=Test.str.getBytes();
            fileOutputStream.write(bytes);
        }catch (FileNotFoundException e){
            System.out.println(e);
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
