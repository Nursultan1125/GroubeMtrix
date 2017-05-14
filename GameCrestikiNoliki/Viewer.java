import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Viewer extends JFrame implements ActionListener {
    JButton[] buttons = new JButton[9];
    

    public Viewer(){
        
        this.setTitle("Крестики нолики");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setSize(400,400);


	JPanel mainPanel = new JPanel();
	BorderLayout bl = new BorderLayout();
	mainPanel.setLayout(bl);
	JPanel centralPanel = new JPanel();
	GridLayout gl = new GridLayout(3,3);
	centralPanel.setLayout(gl);

	for (int i=0; i<buttons.length; i++){
	    buttons[i]  = new JButton();
	    buttons[i].addActionListener(this);
	    centralPanel.add(new JButton()); 

	}

	mainPanel.add("Center", centralPanel);
	setContentPane(mainPanel);
		this.setVisible(true);

	System.out.println("Connect to Viewer() ");



    }
    
    public void ActionPerformed(ActionEvent event){

	//String command = event.getActionCommand();


	System.out.println("Connect to Performed() ");
	                
	for (int i=0; i<buttons.length; i++){
	    if( buttons[i]==event.getSource() ){
	        buttons[i].setText("X");
		buttons[i].setEnabled(false);
		buttons[i].setBackground(Color.RED);

		System.out.println("Connect to Performed() algoritm ");

	    }


	}



    }




}

