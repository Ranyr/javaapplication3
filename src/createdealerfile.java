import java.io.*;
public class createdealerfile {
    String dealername;
    String dealeraddress;
    String dealerphone;
    String dealerservices;
    
InputStreamReader keyreader;
BufferedReader bfreader;
FileOutputStream fswriter;

public createdealerfile(){
try{
keyreader=new InputStreamReader(System.in);
bfreader=new BufferedReader(keyreader);

System.out.println("enter dealer name:");
dealername=bfreader.readLine();
System.out.println("enter dealer address:");
dealeraddress=bfreader.readLine();
System.out.println("enter dealer phno.:");
dealerphone=bfreader.readLine();
System.out.println("enter dealer services:");
dealername=bfreader.readLine();

fswriter=new FileOutputStream("details.txt",true);
String t1=dealername+":"+dealeraddress+":"+dealerphone+":"+dealerservices;
fswriter.write(t1.getBytes());
System.out.println("finished writing dealer details");

}
catch(Exception ee)
{
System.out.println(ee);
}

}

 public static void main(String p[]){
 new createdealerfile();
 
 }   
    
}
