import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Fetch implements ActionListener{
    JFrame f1;
    JPanel p1;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    Fetch(){
    
    f1=new JFrame("my app");
    f1.setSize(200,300);
    
    p1=new JPanel();
    f1.add(p1);
    
    String a1;
   l1=new JLabel("id");
   l2=new JLabel("name");
   l3=new JLabel("city");
   
   t1=new JTextField(20);
      t2=new JTextField(20);
   t3=new JTextField(20);
b1=new JButton("click");

p1.add(l1);
p1.add(t1);
p1.add(l2);
p1.add(t2);
p1.add(l3);
p1.add(t3);
p1.add(b1);
f1.add(p1);
b1.addActionListener(this);
    }
    public void actionperformed(ActionEvent e){
      if(e.getSource()==b1){
      String a1,a2,a3;
      a1=t1.getText();
      a2=t2.getText();
      a3=t3.getText();
      
      try{
      //driver name
      Class.forName("org.apache.derby.jdbc.ClientDrive");//services---database--rgtclick on driver---properties--driver name
      Connection con=DriverManager.getConnection("jdbc:odbc:niit","app ","123"); //driver url
      PreparedStatement stat=con.prepareStatement("Insert into student values(?,?,?)");
      stat.setString(1,a1);
      stat.setString(2, a2);
      stat.setString(3, a3);
stat.executeUpdate();
JOptionPane n1=new JOptionPane();
 n1.showMessageDialog(null,"data inserted","msg box",1);
 }
      catch(Exception ee){
      System.out.println(ee);
      
      }
      }
    
    
    }
    public static void main(String args[]){
    Fetch fg=new  Fetch();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
