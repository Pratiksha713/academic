


import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
	class Signup extends JFrame implements ActionListener
	{
		public static String s2;
int x=0;
int u=0;
int p=0;
	JButton rb1;
  	JLabel r1;
	JLabel r2;
	JLabel r3;
	JLabel r4;
	JLabel r5;
	JLabel r6;
	JLabel reg;
	JTextField rt1;
	JTextField rt2;
	JTextField rt3;
	JTextField rt4;
	
	JPanel p1;
	 Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
		
	JPasswordField pass;
	JPasswordField cpass;

	 JButton rb2;
	    public Signup()
	    {
	    setTitle("Registration form");
	   
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(null);
	    setContentPane(new JLabel(new ImageIcon("D:\\\\slide\\\\pp4.jpg")));
	    //getContentPane().setBackground(Color.pink);
	    r1=new JLabel("Name");
	    r2=new JLabel("Email");
	    r3=new JLabel("Password");
	    r4 = new JLabel("Confirm_password");
	    r5 = new JLabel("State");
	    r6 = new JLabel("Phone_no");
	    reg= new JLabel("Registration form");
		   
	    
	   rt1=new JTextField();
	    rt2=new JTextField();
	    rt3=new JTextField();
	    rt4=new JTextField();
	 
	    pass=new JPasswordField();
	    cpass=new JPasswordField();
		   
	    rb1=new JButton("Submit");
	    rb2=new JButton("Clear");
	    r1.setFont(new Font("Monospaced",Font.BOLD,20));
	    r2.setFont(new Font("Monospaced",Font.BOLD,20));
	    r3.setFont(new Font("Monospaced",Font.BOLD,20));
	    r4.setFont(new Font("Monospaced",Font.BOLD,20));
	    r5.setFont(new Font("Monospaced",Font.BOLD,20));
	    r6.setFont(new Font("Monospaced",Font.BOLD,20));
	    rb1.setFont(new Font("Monospaced",Font.BOLD,20));
	    rb2.setFont(new Font("Monospaced",Font.BOLD,20));
	    reg.setFont(new Font("Monospaced",Font.BOLD,25));
	    reg.setForeground(new Color(0,255,255));
		     
	    r1.setForeground(new Color(0,255,255));
	    r2.setForeground(new Color(0,255,255));
	    r3.setForeground(new Color(0,255,255));
	    r4.setForeground(new Color(0,255,255));
	    r5.setForeground(new Color(0,255,255));
	    r6.setForeground(new Color(0,255,255));
	    rb2.setForeground(Color.cyan);
	    rb2.setBounds(690,600,210,40);
	    
	       
	    rb1.setForeground(Color.cyan);
	    rb1.setBounds(420,600,210,40);
	    r1.setBounds(450,90,200,30);
	    r2.setBounds(450,150,200,30);
	    r3.setBounds(450,210,200,30);
	    r4.setBounds(450,270,200,30);
	    r5.setBounds(450,330,200,30);
	    r6.setBounds(450,390,200,30);
	 
		  rt1.setBounds(670,90,200,40); 
		  rt2.setBounds(670,150,200,40); 
		  pass.setBounds(670,210,200,40); 
		  cpass.setBounds(670,270,200,40); 
		  rt3.setBounds(670,330,200,40); 
		  rt4.setBounds(670,390,200,40); 
		  reg.setBounds(510,10,400,40); 
			
		  rb2.setBackground(Color.black);
		  rb1.setBackground(Color.black);
		  rt1.setBackground(new Color(0,0,0));
		  rt2.setBackground(Color.black);
		    rt3.setBackground(Color.black);
		    rt4.setBackground(Color.black);
		   
		    pass.setBackground(Color.black);
		    cpass.setBackground(Color.black);
		    rt1.setForeground(Color.white);
			  rt2.setForeground(Color.white);
			    rt3.setForeground(Color.white);
			    rt4.setForeground(Color.white);
			 
			    pass.setForeground(Color.white);
			    cpass.setForeground(Color.white);
			    p1=new JPanel();
			    p1.setBackground(new Color(255,255,255,30));
			    p1.setPreferredSize( new Dimension(500,500));
			    p1.setBounds(410,60,500,630);
			  add(p1);
		    add(reg);
		    add(r1);
		    add(rt1);
		    add(r2);
		    add(rt2);
		    add(r3);
		    add(pass);
		    add(r4);
		    add(cpass);
		    add(r5);
		    add(rt3);
		    add(r6);
		    add(rt4);
		    
		    add(rb1);
		    add(rb2);
		    rb1.addActionListener(this);
		    rb2.addActionListener(this);
			 
	 
	 setBounds(0,0,s.width,s.height);
	 setVisible(true);

	    
	    }
	    private Dimension Dimention(int i, int j) {
			// TODO Auto-generated method stub
			return null;
		}
	    
			  	    public static void main(String args[])
	    {
	    new Signup();
	    }
			  	  public String getStr()
					{
						return(rt2.getText());
					}
					
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==rb1)
			{
				String st="";
				String s1=rt1.getText();
				 s2=rt2.getText();
				char[] sp1=pass.getPassword();
				char[] sp2=cpass.getPassword();
				String s3=new String(sp1);
				String s4=new String(sp2);
				String s5=rt3.getText();
				String s6=rt4.getText();
				
				if(s1.equals(st))
				{
					JOptionPane.showMessageDialog(rb1, "enter name");
				}
				if(s2.equals(st))
						{
					JOptionPane.showMessageDialog(rb1, "enter email");
					
						}
				if(s3.equals(st))
				{
					JOptionPane.showMessageDialog(rb1, "enter password");
				}
				if(s4.equals(st))
						{
					JOptionPane.showMessageDialog(rb1, "enter confirm password");
					
						}
				if(s5.equals(st))
				{
					JOptionPane.showMessageDialog(rb1, "enter your state name");
				}
				if(s6.equals(st))
						{
					JOptionPane.showMessageDialog(rb1, "enter phone no");
					
						}
				
				if(s3.equals(s4)&&s1.equals(st)==false&&s2.equals(st)==false&&s3.equals(st)==false&&s4.equals(st)==false&&s5.equals(st)==false&&s6.equals(st)==false)
			{
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","user");
					Statement stmt=con.createStatement();
			
				
					ResultSet rs1=stmt.executeQuery("select email from gp1");
					while(rs1.next())
					{
						String un=rs1.getString(1);
						if(un.equals(s2))
						{
							JOptionPane.showMessageDialog(rb1, "user name exist");
							u++;
							rt2.setText("");
							break;
							
						}
						}
					if(s3.equals(s4)==false)
					{
						JOptionPane.showMessageDialog(rb1, "password does not matched");
						p++;
						pass.setText("");
						cpass.setText("");
						
					}
					if(u==0&&p==0)
					{
					PreparedStatement ps=con.prepareStatement("insert into gp1 values(?,?,?,?,?)");
					ps.setString(1, s2);
					ps.setString(2, s3);
					ps.setString(3, s1);
					ps.setString(4, s5);
					ps.setString(5, s6);
					ResultSet rs=ps.executeQuery();
					x++;
					}
					con.close();
				
				}
				
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
				if(x>0)
				{
					new Register1();
					dispose();
				}
				
			}
			if(e.getSource()==rb2)
			{
				rt1.setText("");
				rt2.setText("");
				pass.setText("");
				cpass.setText("");
				rt3.setText("");
				rt4.setText("");
			}
			
		}
	} 




