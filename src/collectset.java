import java.util.*;
public class collectset {
    
    public static void main(String p[]){
      Set t1=new HashSet();
      
      t1.add(new Integer(20));
      t1.add(new Integer(20));//in set interface values can't be duplicated.here 20 will be shown just once in the list
      t1.add("sindhu");
t1.add("bindhu");
t1.add("nit");
t1.add(new Float(90.4f));
t1.add(new Integer(88));
t1.add(new Integer(200));
t1.add(new Float(12.3f));
System.out.println(t1);
     }
    
    
    
}
