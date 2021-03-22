import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 


public class Counter implements ActionListener  {
    JLabel leftLabel;
    JLabel rightLabel;
   
    int leftCount;
    int rightCount;

   Counter(){
       JFrame frame = new JFrame("Les's Count");
       frame.setLayout(new FlowLayout());
       frame.setSize(200, 110);
       //JButton button;
       JButton left = new JButton("Left");
       JButton right = new JButton("Right");

       int leftCount = 0;
       int rightCount = 0;

       left.addActionListener(this);
            frame.add(left);

       right.addActionListener(this);
            frame.add(right);

       leftLabel = new JLabel("Count: " + leftCount);
             frame.add(leftLabel);
       rightLabel = new JLabel("Count: " + rightCount);
            frame.add(rightLabel);

        JButton reset = new JButton("Reset");
            reset.addActionListener(this);
            frame.add(reset);
        frame.setVisible(true);
    }
  public void actionPerformed(ActionEvent e){
      if(e.getActionCommand().equals("Left")){
          leftCount++;
          leftLabel.setText(String.valueOf("Count: " + leftCount));
        
         }
    if(e.getActionCommand().equals("Right")){
        rightCount++;
        rightLabel.setText(String.valueOf("Count: " + rightCount));
    }
    if(e.getActionCommand().equals("Reset")){
        leftCount = 0;
        rightCount = 0;
        leftLabel.setText(String.valueOf("Count: " + leftCount));
        rightLabel.setText(String.valueOf("Count: " + rightCount));
    }
         

    }
      
  }
    

