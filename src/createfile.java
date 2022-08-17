import java.io.*;
public class createfile {
    public static void main(String p[]){
    String a1="are u happy";
     try{
        RandomAccessFile f1=new RandomAccessFile("damini.txt","rw");
        f1.seek(f1.length());
        f1.writeBytes(a1);
        System.out.println("file created");
        }
    catch(Exception e){
                    System.out.println(e); 
                     }
}
    
}
