import java.io.*;
public class care1{
 public static void main(String p[]){
 String a1="sindhu.txt";
 try{
 File f1=new File(a1);
 boolean success=f1.delete();
 
 if(!success){
 System.out.println("deletion failed");
 System.exit(0);
 }
 else{
 System.out.println("file deleted");
 }
 
 }
 catch(Exception ee){
 System.out.println(ee);
 }



 }

}