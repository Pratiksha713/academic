
import javax.swing.*;
	import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
	class End extends JFrame 
	{ 
	JLabel l1;
	
	    public End()
	    {
	    setTitle("Background Color for JFrame");
	   
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    

	   setLayout(null);
	    setContentPane(new JLabel(new ImageIcon("D:\\\\slide\\\\end.jpg")));
	    //getContentPane().setBackground(Color.pink);
	    
	    
	    l1=new JLabel("successfully logged in");
	   	
	    l1.setForeground(Color.white);
	    l1.setFont(new Font("Monospaced",Font.BOLD,50));
	   
	    
	    l1.setBounds(430,400,700,80);
	    add(l1);
	    	 Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
	 	
	 setBounds(0,0,s.width,s.height);
	 setVisible(true);

	    
	    }
	  
	    
	    	    public static void main(String args[])
	    {
	    new End();
	    
	    }

}