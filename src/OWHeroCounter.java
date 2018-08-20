import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class OWHeroCounter implements ListSelectionListener, ActionListener {

  JButton close;
  JList jlst;
  JLabel jlab;
  JScrollPane jscrlp;

  // Create an array of names
  String keywords[] = { "D.va", "Wrecking ball", "Bastion",
                     "Moira", "Brigette",  "Winston",
                     "Pharah", "Junkrat", "Genji",
                     "Doomfist", "Sombra", "Roadhog",
                     "Solider 76", "Ana", "Mccree",
                     "Orisa", "Symmetra", "Lucio",
                     "Tracer", "Torbjorn", "Zenyatta", 
                     "Mercy", "Reaper", "Reinhardt", 
                      "Hanzo", "Mei", "Widowmaker" };

  OWHeroCounter() {
    // Create a new JFrame container
    JFrame jfrm = new JFrame("Help");

    // Specify a flow Layout
    jfrm.setLayout(new FlowLayout());

    // Give the frame an initial size
    jfrm.setSize(400, 300);

    // Terminate the program when the user closes the application
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a JList
    jlst = new JList(keywords);

    // Set the list selection mode to single-selection
    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Add list to a scroll pane
    jscrlp = new JScrollPane(jlst);

    // Set the preferred size of the scroll pane
    jscrlp.setPreferredSize(new Dimension(120, 90));

    // Make a label that displays the selection
    jlab = new JLabel("Please choose a keyword");

    // Create a button that exits the program on command
    close = new JButton("Close");

    // Add list selection handler
    jlst.addListSelectionListener(this);

    // Add exit button handler
    close.addActionListener(this);

    // Add the list and label to the content pane
    jfrm.add(jscrlp);
    jfrm.add(jlab);
    jfrm.add(close);

    // Display the frame
    jfrm.setVisible(true);
  }

  // Handle list selection events
  public void valueChanged(ListSelectionEvent le) {
    // Get the index of the changed item
    int idx = jlst.getSelectedIndex();

    // Display abstract implementation description for selected keyword
    if(idx != -1)
        switch(idx) {
        case 0:
            jlab.setText("<html>Weak Against:<br>Brigette, Reaper, Mei, Genji, McCree, Zarya, Junkrat:<br>;</html>");
            break;
        case 1:
            jlab.setText("<html>Weak against:<br>McCree, Sombra, Pharah, Bastion, Mei:<br></html>");
            break;
        case 2:
            jlab.setText("<html>Weak Against:<br>Genji, Windowmaker, Hanzo<br></html>");
            break;
        case 3:
            jlab.setText("<html>Weak Against:<br>Pharah, Bastion, Torbjorn</html>");
            break;
        case 4:
            jlab.setText("<html>Weak Against:<br>Symmetra, Pharah, Widowmaker, Junkrat</html>");
            break;
        case 5:
            jlab.setText("<html>Weak Against:<br>Bastion, Reaper, Mei</html>");
            break;
        case 6:
            jlab.setText("<html>Weak Against:<br>Soldier 76, Roadhog, Widowmaker;</html>");
            break;
        case 7:
            jlab.setText("<html>Weak Against:<br>Pharah, Genji, Reaper, Widowmaker;</html>");
            break;  
        case 8:
            jlab.setText("<html>Weak Against:<br>Brigette, Moira, Mei, Zarya;</html>");
            break;  
        case 9:
            jlab.setText("<html>Weak Against:<br>Orisa, Sombra, Widowmaker,Reaper;</html>");
            break;  
        case 10:
            jlab.setText("<html>Weak Against:<br>Symmetra, Mei, Roadhog;</html>");
            break;  
        case 11:
            jlab.setText("<html>Weak Against:<br>Ana, Tracer, Lucio, Mei, Pharah ;</html>");
            break;  
        case 12:
            jlab.setText("<html>Weak Against:<br>Genji, Reinhardt, Mei, Roadhog ;</html>");
            break;  
        case 13:
            jlab.setText("<html>Weak Against:<br>Genji, Reaper. DV.a, Winston ;</html>");
            break;  
        case 14:
            jlab.setText("<html>Weak Against:<br>Genji, Pharah. Bastion, Reinhardt, Sombra ;</html>");
            break;  
        case 15:
            jlab.setText("<html>Weak Against:<br>Genji, Pharah. Genji, Sombra ;</html>");
            break;  
        case 16:
            jlab.setText("<html>Weak Against:<br>Pharah, Junkrat, Mccree, Roadhog, Reaper, Soldier 76 ;</html>");
            break;  
        case 17:
            jlab.setText("<html>Weak Against:<br>Mccree, Mei, Tracer;</html>");
            break;  
        case 18:
            jlab.setText("<html>Weak Against:<br>Mccree, Torbjorn, Brigette, Mei;</html>");
            break;  
        case 19:
            jlab.setText("<html>Weak Against:<br>Zarya, DV.A. Reinhardt;</html>");
            break;
        case 20:
            jlab.setText("<html>Weak Against:<br>Widowmaker, Tracer, Reaper;</html>");
            break;  
        case 21:
            jlab.setText("<html>Weak Against:<br>Sombra, Tracer, Soldier 76, McCree;</html>");
            break;
        case 22:
            jlab.setText("<html>Weak Against:<br>Genji, Pharah, Zarya, McCree;</html>");
            break;  
        case 23:
            jlab.setText("<html>Weak Against:<br>Reaper, Pharah, Bastion, McCree;</html>");
            break;  
        case 24:
            jlab.setText("<html>Weak Against:<br>Genji, Winston, Tracer, Sombra;</html>");
            break; 
        case 25:
	jlab.setText("<html>Weak Against:<br>Pharah, Widowmaker, Orisa;</html>");
	    break; 
	case 26:
	jlab.setText("<html>Weak Against:<br>Pharah, Genji, Winston, Reinhardt, DV.a;</html>");
	    break;       
        } // end switch
    else
        jlab.setText("Please choose a Hero to counter");
  } // end if

  public void actionPerformed(ActionEvent ae) {
      System.exit(0);
  }

  public static void main(String args[]) {
    // Create the frame on the event dispatching thread
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new OWHeroCounter();
      }
    });
  }
}