import java.io.*;

public class FileToStr {
    public static String a;//用main传a,main为static故声明时要加static
    public static String b;
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream1 = null;
        FileInputStream inputStream2 = null;
        try{
        inputStream1 =new FileInputStream(args[0]);//将两个文本字符读入
        inputStream2 =new FileInputStream(args[1]);
        byte[] bytes=new byte[inputStream1.available()];
        a =new String(bytes,0, inputStream1.read(bytes));
        bytes=new byte[inputStream2.available()];
        b =new String(bytes,0,inputStream2.read(bytes));
        }catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputStream1 !=null){
                try{
                inputStream1.close();
                }catch (IOException e){
                    System.out.println(e);
                }
            }
        }
    }
}