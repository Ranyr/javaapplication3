import java.io.*;
public class care {
  BufferedReader bf;
  FileInputStream fsr;
  InputStreamReader inp;
  
  public care(){
   try{
    fsr=new FileInputStream("sindhu.java");
   inp=new InputStreamReader(fsr);
   bf=new BufferedReader(inp);
   
   String record;
   while((record=bf.readLine())!=null){
   System.out.println(record);
       }
   }
   
  catch(Exception e){
     System.out.println(e);

  }
  
  
  }
  
  public static void main(String args[]){
  
  new care();
  }
}
