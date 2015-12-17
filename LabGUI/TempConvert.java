import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConvert extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConvert() {
	this.setTitle("Convert Temperature GUI");
	this.setSize(400,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("CtoF");
	b.addActionListener(this);
	b.setActionCommand("CtoF");
	JButton b2 = new JButton("FtoC");
	b2.addActionListener(this);
	b2.setActionCommand("FtoC");


	t = new JTextField(5);

	//JCheckBox c = new JCheckBox("OverClock");
	j = new JLabel("Your temperature converted is ");
	//pane.add(c);
	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(j);
    }

    public void actionPerformed(ActionEvent e){
	ConvertTemp function = new ConvertTemp();
	String event = e.getActionCommand();
	if(event.equals("CtoF")){
	    String s  = t.getText();
	    Double num = Double.parseDouble(s);
	    num = function.CtoF(num);
	    s = new Double(num).toString();
	    j.setText("Your temperature converted is " + s);
	}
	if(event.equals("FtoC")){
	    String s  = t.getText();
	    Double num = Double.parseDouble(s);
	    num = function.FtoC(num);
	    s = new Double(num).toString();
	    j.setText("Your temperature converted is " + s);
    	}
 
 
    }
}
