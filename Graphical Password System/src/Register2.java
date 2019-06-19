

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.*;
import java.applet.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register2 extends JFrame implements ActionListener,MouseListener,MouseMotionListener {
	Image img1,img2,img3,img4;
	//Signup x=new Signup();
	 int mx=0;
	 int my=0;
	 String user;
	 String pass="";
	 JPasswordField t1;
	 JButton sub;
	 JPanel p2;
JButton b1;
int y=0;
int p=0;
int c=0;
	Register2() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("my first frame");
		
		
		setLayout(null);
	    setContentPane(new JLabel(new ImageIcon("D:\\\\passphoto\\\\pp11.jpg")));
	   addMouseListener(this);
	   JLabel l5=new JLabel("password");
	   t1= new JPasswordField();
	   b1=new JButton("set");
	   sub=new JButton("submit");
	   
	   JLabel in=new JLabel("Click on color box and set the password you can click on single or series of boxes ");
	   in.setForeground(Color.cyan);
	   in.setFont(new Font("Monospaced",Font.BOLD,20));
	   in.setBounds(140,10,1200,30);
	  
	   
	   l5.setForeground(Color.white);
	   l5.setFont(new Font("Monospaced",Font.BOLD,20));
	   b1.setForeground(Color.white);
	   b1.setFont(new Font("Monospaced",Font.BOLD,20));
	   sub.setForeground(Color.white);
	   sub.setFont(new Font("Monospaced",Font.BOLD,20));
	   b1.setBackground(Color.BLACK);
	   sub.setBackground(Color.BLACK);
	   
	   l5.setBounds(350,450,100,40);
	   t1.setBounds(550,450,250,40);
	   b1.setBounds(820,450,80,40);
	   sub.setBounds(950,600,200,40);
	   b1.setFont(new Font("Monospaced",Font.BOLD,20));
	   sub.setFont(new Font("Monospaced",Font.BOLD,20));
	  add(in);
	   add(l5);
	   add(t1);
	   add(b1);
	   add(sub);
	   b1.addActionListener(this);
	   sub.addActionListener(this);
	   Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
		 
		 setBounds(0,0,s.width,s.height);
		 setVisible(true);

	  
		   
	}
	public void paint(Graphics g)
	{
	super.paint(g);
		Toolkit t=Toolkit.getDefaultToolkit();
		//img1=t.getImage("D:////st////one.jpg");
		//g.drawImage(img1,600,100,300,300,this);
		g.setColor(Color.red);
		g.fillRect(350, 100, 100, 100);
		g.setColor(Color.blue);
		g.fillRect(500, 100, 100, 100);
		g.setColor(Color.cyan);
		g.fillRect(650, 100, 100, 100);
		g.setColor(Color.pink);
		g.fillRect(800, 100, 100, 100);
		g.setColor(Color.green);
		g.fillRect(350, 250, 100, 100);
		g.setColor(Color.lightGray);
		g.fillRect(500, 250, 100, 100);
		g.setColor(Color.magenta);
		g.fillRect(650, 250, 100, 100);
		g.setColor(Color.yellow);
		g.fillRect(800, 250, 100, 100);
		 g.setColor(Color.cyan);
		   g.drawRect(330,460,600,100);

		
	}

	public static void main(String a[])
	{
		new Register2();
	}
	@Override
	public void mouseDragged(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent m) {
		// TODO Auto-generated method stub
		mx=m.getX();
		my=m.getY();
		//System.out.println(" "+mx+my);
		if(mx>=350&&mx<=450&&my>=100&&my<=200)
		{
			//t1= new JPasswordField("red");
			pass+="red";
		}
		if(mx>=500&&mx<=600&&my>=100&&my<=200)
		{
			pass+="blue";
		}
		if(mx>=650&&mx<=750&&my>=100&&my<=200)
		{
			//t1= new JPasswordField("red");
			pass="cyan";
		}
		if(mx>=800&&mx<=900&&my>=100&&my<=200)
		{
			pass+="pink";
		}
		if(mx>=350&&mx<=450&&my>=250&&my<=350)
		{
			//t1= new JPasswordField("red");
			pass+="green";
		}
		if(mx>=500&&mx<=600&&my>=250&&my<=350)
		{
			pass+="lightgray";
		}
		if(mx>=650&&mx<=750&&my>=250&&my<=350)
		{
			//t1= new JPasswordField("red");
			pass="magneta";
		}
		if(mx>=800&&mx<=900&&my>=250&&my<=350)
		{
			pass+="yellow";
		}
		
		
	}
	@Override
	public void mouseEntered(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			t1.setText(pass);
			
			}
		if(e.getSource()==sub)
		{
			char[] sp2=t1.getPassword();
			String s8=new String(sp2);
			
		user=Login.user1;
		// System.out.println(user);
		
		if(s8.equals(""))
			{
				JOptionPane.showMessageDialog(sub, "please enter password");
			}
			if(s8.equals("")==false)
			{
				c++;
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","user");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select email,pas2 from gp2");
					while(rs.next())
					{
						String un=rs.getString(1);
						String pas2=rs.getString(2);
						
						if(un.equals(user)&&pas2.equals(s8))
						{
							
							p++;

							new Secondpass2();
			                dispose();
			                

						}

						
						}
			
					con.close();
				
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
if(p==0)
{
	JOptionPane.showMessageDialog(sub, "password does not matched");
	pass="";
	t1.setText("");
	
	
}
if(c==3)
{
	JOptionPane.showMessageDialog(sub, "you have reached maximum login attempts");
	new Login();
	dispose();
	
	
}

			}
			
		}
		
	}
}

	


