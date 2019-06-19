



import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class Secondpass2 extends JFrame implements MouseListener,MouseMotionListener,ActionListener {

	JLabel label,poi;
	  JTextField px,py;
	  int c=0;
int pp=0;
int mx=0;
	 int my=0;
	 Image Simg1,Simg2,Simg3;
	 Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
	 JButton p,n;
     int i=1;
int z=0;
	String path,user;

	private JButton set;
	Secondpass2()
	{
		
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setTitle("second step ");
	     //getContentPane().setBackground(Color.black);
	     setContentPane(new JLabel(new ImageIcon("D:\\\\slide\\\\secondp.jpg")));
	    
	     JLabel in=new JLabel("Select image by clicking on prev and next button and click on any object and press set button ");
		   in.setForeground(Color.cyan);
		   in.setFont(new Font("Monospaced",Font.BOLD,18));
		   in.setBounds(80,10,1200,30);
		
	     
	     p=new JButton("prev");
	     n=new JButton("next");
	     set=new JButton("set");
	    	
	     p.setBounds(120,600,150,30);
	     n.setBounds(670,600,150,30);
	     
	     
	     px=new JTextField();
	     py=new JTextField();
	     px.setBounds(1000,450,100,60);
	     py.setBounds(1130,450,100,60);
	     set.setBounds(860,600,150,30);
	     
	     px.setForeground(new Color(0,255,255));
	     py.setForeground(new Color(0,255,255));
	     px.setFont(new Font("Monospaced",Font.BOLD,18));
	     py.setFont(new Font("Monospaced",Font.BOLD,18));
		   px.setBackground(Color.black);
		   py.setBackground(Color.black);
		   poi=new JLabel("cued points");
		   poi.setForeground(new Color(0,255,255));
		   poi.setFont(new Font("Monospaced",Font.BOLD,18));
		   poi.setBounds(860,450,150,30);
		
	     
	     
	     
	     p.setForeground(new Color(0,255,255));
		    n.setForeground(new Color(0,255,255));
		    set.setForeground(new Color(0,255,255));
		    p.setBackground(Color.black);
		    n.setBackground(Color.black);
		    set.setBackground(Color.black);
		    p.setFont(new Font("Monospaced",Font.BOLD,20));
		    n.setFont(new Font("Monospaced",Font.BOLD,20));
		    set.setFont(new Font("Monospaced",Font.BOLD,20));
		
	     p.addActionListener(this);
	     n.addActionListener(this);
	     set.addActionListener(this);
		    
	     label = new JLabel();  
	     
	     label.setBounds(120, 60,700,500);
	       add(in);
	        //add(label);
	        add(p);
	        add(n);
	        add(set);
	        add(label);
	        add(px);
		       add(py);
		       add(poi);
		      
	        label.setIcon(ResizeImage("D:////slide////slide"+i+".jpg"));
			path="D:////slide////slide"+i+".jpg";
	        
	     setBounds(0,0,s.width,s.height);
	     
		 setVisible(true);
		addMouseListener(this);
		
	}
	private ImageIcon ResizeImage(String ImagePath) {
		// TODO Auto-generated method stub
		ImageIcon MyImage=new ImageIcon(ImagePath);
		Image img=MyImage.getImage();
		Image newImg=img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image=new ImageIcon(newImg);
		
		return image;
	}
	
		public static void main(String a[])
	{
		
		new Secondpass2();
		
		}
		public void paint(Graphics g)
		{
		super.paint(g);
			Toolkit t=Toolkit.getDefaultToolkit();
			//Image img = t.getImage("D:/log1.jpg");
		  
		  g.setColor(Color.cyan);
		   g.drawRect(110,80,740,520);
		   g.setColor(Color.black);
		   for(int x=130;x<=790;x+=70)
			   for(int y=95;y<=565;y+=70)
			   {
				   g.drawRect(x,y,70,70);
			   }
					

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
		px.setText("  "+mx);
		py.setText("  "+my);
		
		
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
		user=Login.user1;
		if(e.getSource()==p)
		{
			//label.setIcon(ResizeImage("D:////slide////slide"+i+".jpg"));
			
			if(i>1)
			{
				i--;
			label.setIcon(ResizeImage("D:////slide////slide"+i+".jpg"));
			path="D:////slide////slide"+i+".jpg";
			repaint();
	        
	        
		}
		}
		if(e.getSource()==n)
		{
			//label.setIcon(ResizeImage("D:////slide////slide"+i+".jpg"));
			
			if(i<3)
			{
			i++;
			label.setIcon(ResizeImage("D:////slide////slide"+i+".jpg"));
			path="D:////slide////slide"+i+".jpg";
			repaint();
	        
	        }
		}
		if(e.getSource()==set)
		{
			if(mx!=0&&my!=0)
			{
				c++;
			try
			{
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","user");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select email,imgadd,pointx,pointy from gp3");
				while(rs.next())
				{
					String email=rs.getString(1);
					String imgadd=rs.getString(2);
					int pointx=rs.getInt(3);
					int pointy=rs.getInt(4);
					
					
					if(email.equals(user)&&imgadd.equals(path)&&(mx>=(pointx-20)&&mx<=(pointx+20))&&(my>=(pointy-20)&&my<=(pointy+20)))
					{
						pp++;
						
						new End();
		                dispose();

					}

					
					}

				con.close();
			
			}
			
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			}
			if(mx==0&&my==0)
			{
				JOptionPane.showMessageDialog(set, "please click on image");
				
			}
			if(pp==0)
			{
				JOptionPane.showMessageDialog(set, "points does not matched");
				
				px.setText("");
				py.setText("");
				
			}

			if(c==4)
			{
				JOptionPane.showMessageDialog(set, "you have reached maximum login attempts");
				new Login();
				dispose();
				
				
			}
			


			
		}
			
	}
		
	

}

