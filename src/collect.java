import java.util.Scanner;
public class collect {
    int no;
    
    public void create(){
    new createfile();
    }
    public void insert(){
    new first();
    }
    public void directory(){
    new createdirectory();
    }
    public void cam()
    {
    Scanner s1=new Scanner(System.in);
    System.out.println("***********File Handling*********************");
    System.out.println("press 1 to create file");
    System.out.println("press 2 to insert data");
    System.out.println("press 3 to get the data");////////////////////
    System.out.println("press 4 to delete any existing file");/////////////////////
    System.out.println("press 4 to create directories");/////////////////////

    System.out.println("enter no");
    no=s1.nextInt();
    
   
    switch(no){
        case 1:create();
        break;
        case 2: insert();
        break;
        case 5: directory();
        break;
        default:System.out.println("invalid input");

    }

    }
    public static void main(String p[]){
    collect k=new collect();
    k.cam();
    
    }
}
