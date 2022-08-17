import java.util.*;
public class generics2 {
    public static void main(String p[]){
    
    ArrayList<Object>ar=new ArrayList<Object>(); //object class will accept any datatype
    Integer l1=new Integer(10);
    Integer l2=new Integer(20);
    Integer l3=new Integer(30);
    Integer l4=new Integer(40);
    Integer l5=new  Integer(50);
    String s1="tapan";
    System.out.println("the content of array list is:"+ar);
    System.out.println("the size of array list is:"+ar.size());
ar.add(l1);
ar.add(l2);
ar.add(s1);
    System.out.println("the content of array list is:"+ar);
    System.out.println("the size of array list is:"+ar.size());
ar.add(l1);
ar.add(l2);
ar.add(l3);
ar.add(l4);


ar.add(l5);
        System.out.println("the content of array list is:"+ar);
        System.out.println("the size of array list is:"+ar.size());
ar.remove(3);
Object a=ar.clone();
System.out.println("the clone is"+a);
System.out.println("the content of array list is:"+ar);
    System.out.println("the size of array list is:"+ar.size());
    }
    
    
}
