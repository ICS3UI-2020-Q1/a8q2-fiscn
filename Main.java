import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  

  JPanel mainPanel; 
  
  JLabel firstLabel; 
  JLabel secondLabel; 
  JLabel resultLabel; 

  JTextField firstInput; 
  JTextField secondInput; 
  JTextField resultbox; 

  JButton divisButton; 
  JButton addButton; 
  JButton subButton; 
  JButton multButton; 



  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true); 

    //initalize the main panel 
    mainPanel = new JPanel(); 
    //disable layout helpers 
    mainPanel.setLayout(null); 

    //Cretae the side labels 
    firstLabel = new JLabel("First number"); 
    secondLabel = new JLabel("Second number"); 
    resultLabel = new JLabel("Result"); 

    //set location for Labels 
    firstLabel.setBounds(180,90,150,20); 
    secondLabel.setBounds(180,130,150,20); 
    resultLabel.setBounds(180,170,150,20); 

    //output labels to panel 
    mainPanel.add(firstLabel); 
    mainPanel.add(secondLabel); 
    mainPanel.add(resultLabel); 

    //create text boxes for integers 
    firstInput = new JTextField(); 
    secondInput = new JTextField(); 
    resultbox = new JTextField(); 

    //set location for text boxes
    firstInput.setBounds(300,90,150,20); 
    secondInput.setBounds(300,130,150,20); 
    resultbox.setBounds(300,170,150,20); 

    //output text boxes to panel 
    mainPanel.add(firstInput); 
    mainPanel.add(secondInput); 
    mainPanel.add(resultbox); 

    //make sure user can't write in result box 
    resultbox.setEnabled(false); 

    //create buttons for calculations 
    divisButton = new JButton("Div"); 
    addButton = new JButton("Add"); 
    subButton = new JButton("Sub"); 
    multButton = new JButton("Mul"); 

    //add action listener 
    divisButton.addActionListener(this);
    addButton.addActionListener(this); 
    subButton.addActionListener(this); 
    multButton.addActionListener(this); 

    //set locations for buttons 
    addButton.setBounds(180,250,60,45); 
    subButton.setBounds(250,250,60,45); 
    multButton.setBounds(320,250,60,45); 
    divisButton.setBounds(390,250,60,45); 

    //output buttons to screen  
    mainPanel.add(addButton); 
    mainPanel.add(subButton); 
    mainPanel.add(multButton); 
    mainPanel.add(divisButton);
      

    //add panel to the window 
    frame.add(mainPanel);


 
    

  } 
 

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("Add")){
      //get numbers from Text box 
      String firstText = firstInput.getText(); 
      String secondText = secondInput.getText(); 

      //change the strings into integers then add them
      int sideA = Integer.parseInt(firstText);
      int sideB = Integer.parseInt(secondText); 

      int resultC = sideA + sideB; 

      //output answer in text box 
      resultbox.setText("" + resultC); 
    }if(command.equals("Sub")){
      String firstText = firstInput.getText(); 
      String secondText = secondInput.getText();

      int sideA = Integer.parseInt(firstText);
      int sideB = Integer.parseInt(secondText); 

      int resultC = sideA - sideB;

      resultbox.setText("" + resultC);
    }if(command.equals("Mul")){
      String firstText = firstInput.getText(); 
      String secondText = secondInput.getText();

      int sideA = Integer.parseInt(firstText);
      int sideB = Integer.parseInt(secondText); 

      int resultC = sideA * sideB; 

      resultbox.setText("" + resultC);
    }if(command.equals("Div")){
      String firstText = firstInput.getText(); 
      String secondText = secondInput.getText();

      int sideA = Integer.parseInt(firstText);
      int sideB = Integer.parseInt(secondText); 

      int resultC = sideA / sideB; 

      resultbox.setText("" + resultC);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
