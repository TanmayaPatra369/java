import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 public class s1 implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;



public s1()
{
	f1=new JFrame("My Calc");
	f1.setVisible(true);
	f1.setSize(400,400);
	p1=new JPanel();
	f1.getContentPane().add(p1);
	l1=new Label("Enter First Number:");
	t1=new TextField(10);
	l2=new Label("Enter Second Number:");
	t2=new TextField(10);
	l3=new Label("Result");
	t3=new TextField(10);
	b1=new JButton("Add");
	b2=new JButton("Subtract");
	b3=new JButton("Multiply");
	b4=new JButton("Reset");

    p1.add();
    l1.add();
    t1.add();
    l2.add();
    t2.add();
    l3.add();
    t3.add();
    b1.add();
    b2.add();
    b3.add();
    b4.add();

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);

}
}


 void actionPerformed(ActionEvent e)
{
	int n1=Integer.parseInt(t1.getTxt());
	int n2=Integer.parseInt(t2.getTxt());

	if (e.getSource()==b1)
	{
		t3.setTxt(String.valueOf(n1+n2));
     }
     if (e.getSource()==b2)
	 	{
	 		t3.setTxt(String.valueOf(n1-n2));
     }
      if (e.getSource()==b3)
	 	{
	 		t3.setTxt(String.valueOf(n1*n2));
     }
    if (e.getSource()==b4)
	{
		system.exit(0);
     }
}

 public static void main(String args[])
 {
	 new s1();
 }


