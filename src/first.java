
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.RandomAccessFile;
public class first implements ActionListener{
    JFrame f;
    JPanel p1;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    
    
    first(){
      f=new JFrame("my app");
      f.setSize(700,700);
      
       p1=new JPanel();
      f.add(p1);
      
      l1=new JLabel("enter username");
      l2=new JLabel("enter password");

    t1=new JTextField(20);
    t2=new JTextField(20);
    
    b1=new JButton("submit");
    p1.add(l1);
        p1.add(t1);
    p1.add(l2);
    p1.add(t2);
    p1.add(b1);
    b1.addActionListener(this);
f.show();

    }
  public void actionPerformed(ActionEvent e){
  if(e.getSource()==b1){
  String a1,a2,a3;
  a1=t1.getText();
  a2=t2.getText();
  a3=a1+"   "+a2; 
  
  try {
  RandomAccessFile f=new RandomAccessFile("damini.txt","rw");
        f.seek(f.length());
        f.writeBytes(a3);
        System.out.println("file created");
  }
  catch(Exception ee){
  
  System.out.println(ee);
  }
  }  
  }
public static void main(String p[]){
new first();

}  
    
}
       
