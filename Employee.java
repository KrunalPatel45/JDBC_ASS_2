import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.sql.*;
public class Employee extends JFrame implements ActionListener
{
    JButton a,ed,d,s,cl,cl1,in,up,del,cl2,se,cl3;
    JPanel p1,p2,p3,p4,p5;
    JLabel n,nm,ag,ct,n1,nm1,ag1,ct1,n2,n3,rn,rnm,rag,rct;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,rt1,rt2,rt3,rt4;
    JTextArea ta;
    public Employee()
    {
        a = new JButton("Add");
        a.setBounds(150,50,90,30);
        ed = new JButton("Edit");
        ed.setBounds(240,50,90,30);
        d = new JButton("Delete");
        d.setBounds(330,50,90,30);
        s = new JButton("Search");
        s.setBounds(420,50,90,30);
        
        
      
        p1 = new JPanel(new GridLayout(5,2));
        p1.setBackground(Color.WHITE);
        p1.setBounds(150,90,360,100);
        
        p2 = new JPanel(new GridLayout(5,2));
        p2.setBackground(Color.WHITE);
        p2.setBounds(150,90,360,100);
        
        p3 = new JPanel(new GridLayout(2,2));
        p3.setBackground(Color.WHITE);
        p3.setBounds(150,90,360,50);
        
        p4 = new JPanel(new GridLayout(2,2));
        p4.setBackground(Color.WHITE);
        p4.setBounds(150,90,360,50);
        
        p5 = new JPanel(new GridLayout(4,2));
        p5.setBackground(Color.WHITE);
        p5.setBounds(190,150,250,80);
        
        
        n = new JLabel("No : ");
        nm = new JLabel("Name : ");
        ag = new JLabel("Age");
        ct = new JLabel("City");
        
        t1 = new JTextField(13);
        t2 = new JTextField(13);
        t3 = new JTextField(13);
        t4 = new JTextField(13);
        in = new JButton("INSERT");
        cl = new JButton("CLEAR");
        
        n1 = new JLabel("No : ");
        nm1 = new JLabel("Name : ");
        ag1 = new JLabel("Age");
        ct1 = new JLabel("City");
        
        t5 = new JTextField(13);
        t6 = new JTextField(13);
        t7 = new JTextField(13);
        t8 = new JTextField(13);
        
        up = new JButton("UPDATE");
        cl1 = new JButton("CLEAR");
        
        n2 = new JLabel("   Enter The No : ");
        t9 = new JTextField(13);
        
        del= new JButton("DELETE");
        cl2 = new JButton("CLEAR");
        
        
        n3 = new JLabel("   Enter The No : ");
        t10 = new JTextField(13);
        
        se= new JButton("SEARCH");
        cl3 = new JButton("CLEAR");
        
        
        rn = new JLabel("No : ");
        rnm = new JLabel("Name : ");
        rag = new JLabel("Age");
        rct = new JLabel("City");
    
        rt1 = new JTextField(13);
        rt2 = new JTextField(13);
        rt3 = new JTextField(13);
        rt4 = new JTextField(13);
    
        
        p1.add(n);
        p1.add(t1);
        p1.add(nm);
        p1.add(t2);
        p1.add(ag);
        p1.add(t3);
        p1.add(ct);
        p1.add(t4);
        p1.add(in);
        p1.add(cl);
        
        p2.add(n1);
        p2.add(t5);
        p2.add(nm1);
        p2.add(t6);
        p2.add(ag1);
        p2.add(t7);
        p2.add(ct1);
        p2.add(t8);
        p2.add(up);
        p2.add(cl1);
        
        p3.add(n2);
        p3.add(t9);
        p3.add(del);
        p3.add(cl2);
        
        p4.add(n3);
        p4.add(t10);
        p4.add(se);
        p4.add(cl3);
      
        p5.add(rn);
        p5.add(rt1);
        p5.add(rnm);
        p5.add(rt2);
        p5.add(rag);
        p5.add(rt3);
        p5.add(rct);
        p5.add(rt4);
        
        
        
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(a);
        add(ed);
        add(d);
        add(s);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        a.addActionListener(this);
        ed.addActionListener(this);
        d.addActionListener(this);
        s.addActionListener(this);
        cl.addActionListener(this);
        cl1.addActionListener(this);
        cl2.addActionListener(this);
        cl3.addActionListener(this);
        in.addActionListener(this);
        up.addActionListener(this);
        del.addActionListener(this);
        se.addActionListener(this);
         setLayout(null);
         setSize(630,370);
         setVisible(true);
        
       

    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
         if(ae.getSource()==a)
         {
             p1.setVisible(true);
             p2.setVisible(false);
             p3.setVisible(false);
             p4.setVisible(false);
             p5.setVisible(false);
         }
         if(ae.getSource()==ed)
         {
             p2.setVisible(true);
             p1.setVisible(false);
             p3.setVisible(false);
             p4.setVisible(false);
             p5.setVisible(false);
         }
         if(ae.getSource()==d)
         {
             p1.setVisible(false);
             p2.setVisible(false);
             p3.setVisible(true);
             p4.setVisible(false);
             p5.setVisible(false);
         }
         if(ae.getSource()==s)
         {
             p1.setVisible(false);
             p2.setVisible(false);
             p3.setVisible(false);
             p4.setVisible(true);
             p5.setVisible(true);
         }
         if(ae.getSource()==cl)
         {
              t1.setText("");
              t2.setText("");
              t3.setText("");
              t4.setText("");
              
         }
         if(ae.getSource()==cl1)
         {
              t5.setText("");
              t6.setText("");
              t7.setText("");
              t8.setText("");
              
         }
         if(ae.getSource()==cl2)
         {
              t9.setText("");
              
         }
         if(ae.getSource()==cl3)
         {
              t10.setText("");
              
         }
         if(ae.getSource()==in)
         {
          
           int no =Integer.parseInt(t1.getText());
           String name =t2.getText();
           int age =Integer.parseInt(t3.getText());
           String city =t4.getText();
          try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","krunu2025");
                   
                   PreparedStatement pt = con.prepareStatement("insert into table1 values(?,?,?,?) ");
                   pt.setInt(1, no);
                   pt.setString(2, name);
                   pt.setInt(3, age);
                   pt.setString(4,city);
                   pt.executeUpdate();
                   JOptionPane.showMessageDialog(this,"ADD SUCCESSFULLY...");
                   t1.setText("");
                   t2.setText("");
                   t3.setText("");
                   t4.setText("");
                   con.close();   
               
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
             
      }
         
    if(ae.getSource()==up)
    {
           int no =Integer.parseInt(t5.getText());
           String name =t6.getText();
           int age =Integer.parseInt(t7.getText());
           String city =t8.getText();
          try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","krunu2025");
                   
                   PreparedStatement pt = con.prepareStatement("update table1 set nm=? , age=? , city=? where no=? ");
                   
                   pt.setString(1, name);
                   pt.setInt(2, age);
                   pt.setString(3,city);
                   pt.setInt(4, no);
                   pt.executeUpdate(); 
                   JOptionPane.showMessageDialog(this,"UPDATE SUCCESSFULLY...");
                   t5.setText("");
                   t6.setText("");
                   t7.setText("");
                   t8.setText("");
                   con.close();   
               
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
             
    }
    if(ae.getSource()==del)
    {
           int no =Integer.parseInt(t9.getText());
           try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","krunu2025");
                   
                   PreparedStatement pt = con.prepareStatement("delete from table1 where no=? ");                   
                   pt.setInt(1, no);
                   pt.executeUpdate(); 
                   JOptionPane.showMessageDialog(this,"DELETE SUCCESSFULLY...");
                   t9.setText("");
                   con.close();   
               
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
    }
    if(ae.getSource()==se)
    {
         int no =Integer.parseInt(t10.getText());
         int no1=0,age=0;
         String name="";
         String city="";
         if(t10.equals(""))
         {
              JOptionPane.showMessageDialog(this,"Plase Enter The Number...");
         }
         else
         {
             
             try{
                 
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","krunu2025");
                       Statement st = con.createStatement();
                       ResultSet rs = st.executeQuery("select * from table1 where no="+no+"");
                       if(rs.next()==false)
                       {
                            JOptionPane.showMessageDialog(this,"NO RECORED FOUND..");
                       }
                       else
                       {
                              rt1.setText(""+rs.getInt(1));
                              rt2.setText(""+rs.getString(2));
                              rt3.setText(""+rs.getInt(3));
                              rt4.setText(""+rs.getString(4));
                              
                              
                       }
                 
             }
             catch(Exception e)
             {
                e.printStackTrace();
             } 
                 
             
             
         }
    }
  }
    public static void main(String[] args) 
    {
        new Employee();
    }

    
}
