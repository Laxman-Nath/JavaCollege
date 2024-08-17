import javax.swing.JFrame;
public class MyFrame extends JFrame{
Public MyFrame(){
JLabel l1;
JTextField t1;
JButton b1;
public MyFrame(){
super("Swing demo");
l1=new JLabel("Name");
t1=new JTextField(30);
b1=new JButton("OK");
setLayout(new FlowLayout());
add(l1);
add(t1);
add(b1);
}


public static void main(String [] args)
{
MyFrame f=new MyFrame();
b.setSize(300,300);
b.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}