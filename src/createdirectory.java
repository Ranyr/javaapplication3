import java.io.*;
public class createdirectory {
    public static void main(String p[]){
     try{
       String str1="javatest";
       String str2="d1/d2/d3";
        boolean hh=(new File(str1)).mkdir();
        
        if(hh){
        System.out.println("directory:"+str1+"created");
        hh=(new File(str2)).mkdirs();
        }
 hh=(new File(str2)).mkdirs();
     if(hh){
             System.out.println("directory:"+str2+"created");
     }
     
     }
    
    catch(Exception e){
    System.out.println(e);
    
    }
    
    }
    
    
    
    
}
