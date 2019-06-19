


import javax.swing.*;

import com.sun.deploy.uitoolkit.impl.fx.ui.UITextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
	class Login extends JFrame implements ActionListener
	{ int x=0;
		JButton b1;
	    JButton b2;
	    JButton n;
	    public static String user1;
	String s10;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JTextField t1,t3,t4;
	JPasswordField t2;
	int r=100;
	int g=100;
	int b=150;
	int c=0;
	    public Login()
	    {
	    setTitle("Background Color for JFrame");
	   
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(null);
	    setContentPane(new JLabel(new ImageIcon("D:\\\\slide\\\\log1.jpg")));
	    //getContentPane().setBackground(Color.pink);
	    JLabel in=new JLabel("Graphical Password Authentication System");
		   in.setForeground(new Color(0,255,255));
		   in.setFont(new Font("Monospaced",Font.BOLD,25));
		   in.setBounds(370,10,1200,30);
		l1=new JLabel("USERNAME");
	    l2 = new JLabel("PASSWORD");
	    l3 = new JLabel("CAPTCHA");
	    t1=new JTextField();
	    t3=new JTextField();
	    t4=new JTextField();
	    t2=new JPasswordField();
	    b1=new JButton("LOGIN");
	   b2=new JButton("REGISTER");
	    
	    b1.setForeground(new Color(0,255,255));
	    b2.setForeground(new Color(0,255,255));
		   
	    b1.setFont(new Font("Monospaced",Font.BOLD,20));
	   // Color myblue=new Color(r,g,b);
	    t1.setBackground(Color.black);
	    t3.setBackground(Color.black);
	    //t4.setBackground(new ImageIcon("D:////reg1.jpg"));
	    t2.setBackground(Color.black);
	    t4.setBackground(new Color(0,0,0));
	  // t4.setOpaque(false);
	   //t4.setBorder(null);
	    b1.setBackground(Color.black);
	    b2.setFont(new Font("Monospaced",Font.BOLD,20));
		   
		    
		    b2.setBackground(Color.black);
		    t1.setForeground(Color.cyan);
		    t2.setForeground(Color.cyan);
		    t3.setForeground(Color.cyan);
		    t4.setForeground(new Color(224,255,255));
		
	    l1.setForeground(new Color(0,255,255));
	    l1.setFont(new Font("Monospaced",Font.BOLD,20));
	    l2.setForeground(new Color(0,255,255));
	    l2.setFont(new Font("Monospaced",Font.BOLD,20));
	    l3.setForeground(new Color(0,255,255));
	    l3.setFont(new Font("Monospaced",Font.BOLD,20));
	    
	    l1.setBounds(480,200,100,40);
	    l2.setBounds(480,270,100,40);
	    l3.setBounds(480,390,100,40);
	    t4.setFont(new Font("Monospaced",Font.BOLD,20)); 
	    t1.setBounds(680,200,200,40);
	    t3.setBounds(680,390,200,40);
	    t2.setBounds(680,270,200,40);
	    t4.setBounds(680,330,200,40);
	    b1.setBounds(520,450,300,40);
	    b2.setBounds(520,510,300,40);
		 add(l1);
	    add(l2);
	    add(t1);
	    add(t2);
	    add(l3);
	    add(t3);
	    add(t4);
	 add(b1);
	 add(b2);
	 add(in);

	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 
	 Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
	 captcha c=new captcha();
	    s10=c.Createcaptchavalue();
	    t4.setText(s10);
		
	 setBounds(0,0,s.width,s.height);
	 setVisible(true);

	    
	    }
	   /*public void paint(Graphics g)
		{
		super.paint(g);
			//Toolkit t=Toolkit.getDefaultToolkit();
			//Image img = t.getImage("D:/log1.jpg");
		  //g.drawImage(img,660,190,300,300,this);
		  g.setColor(Color.white);
		   g.drawRect(650,180,310,310);

		}
*/
	    public static void main(String args[])
	    {
	    new Login();
	    
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b1)
			{
				//JOptionPane.showMessageDialog(b1, "enter username");
				
				String s1=t1.getText();
				String s7=t3.getText();
				char[] s2=t2.getPassword();
				String s5="";
				String s3=new String(s2);
				//String s3=l3.getText();
				//String s4=l4.getText();
				if(s1.equals(s5))
				{
					JOptionPane.showMessageDialog(b1, "enter username");
					
				}
				if(s3.equals(s5))
						{
					JOptionPane.showMessageDialog(b1, "enter password");
					
						}
				if(s7.equals(s5))
				{
			JOptionPane.showMessageDialog(b1, "enter captcha");
		
				}
				if(!(s10.equals(s7)))
				{
			JOptionPane.showMessageDialog(b1, "captcha does not match");
			
				}
		
				if(s1.equals(s5)==false&&s3.equals(s5)==false&&s7.equals(s5)==false&&s10.equals(s7)==true)
				{
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","user");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select email,pas from gp1");
					while(rs.next())
					{
						String un=rs.getString(1);
						String pas=rs.getString(2);
						
						if(un.equals(s1)&&pas.equals(s3))
						{
							user1=un;
							
							new Register2();
			                dispose();
			                c++;
			
						}
						
					}
				}
				
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
				
				}
				if(c==0)
				{
				JOptionPane.showMessageDialog(b1, "enter valid user name or password");
				t1.setText("");
			    t2.setText("");
				}
				
			}
			/*if(c==0)
			{
			JOptionPane.showMessageDialog(b1, "enter valid user name or password");
			t1.setText("");
		    t2.setText("");
			}*/
			//if(e.getSource()==n)
			//{
			
			//new Signup();
			//dispose();
			//}
			if(e.getSource()==b2)
			{
				new Signup();
				dispose();
				
			}
		
	} 
	}




