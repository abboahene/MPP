package Week3.GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *   This frame includes one MenuBar, two Menu objects File and Edit,
 *   and eight MenuItem objects. When a menu item is selected, a string
 *   showing which menu choice is selected will appear on the frame.
 *
 */

class GUI_Swing1 extends JFrame implements ActionListener
{

//----------------------------------
//    Data Members
//----------------------------------

    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH    = 600;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT   = 250;

    /**
     * X coordinate of the frame default origin point
     */
    private static final int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
    private static final int FRAME_Y_ORIGIN = 250;


    /**
     * Inputs
     */
    private JTextField name;
    private JTextField street;
    private JTextField city;
    private JTextField state;
    private JTextField zip;
    private JButton submit;


    /**
     * Labels
     */
    private JLabel nameLabel;
    private JLabel streetLabel;
    private JLabel cityLabel;
    private JLabel stateLabel;
    private JLabel zipLabel;


    //----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        GUI_Swing1 frame = new GUI_Swing1();
        frame.setVisible(true);
    }

//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public GUI_Swing1()
    {
        Container contentPane;

        //set the frame properties
        setTitle     ("Swing Lab 1");
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);


        contentPane = getContentPane( );
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
        contentPane.setBackground( Color.white);


        //Initialize text fields
        name = new JTextField(15);
        street = new JTextField(15);
        city = new JTextField(15);
        state = new JTextField(15);
        zip = new JTextField(15);

        submit = new JButton("Submit");
        submit.addActionListener(this);

        //Initialize labels
        nameLabel = new JLabel("Name");
        streetLabel = new JLabel("Street");
        cityLabel = new JLabel("City");
        stateLabel = new JLabel("State");
        zipLabel = new JLabel("Zip:");

        Container nameContainer = new Container();
        Container streetContainer = new Container();
        Container cityContainer = new Container();
        Container stateContainer = new Container();
        Container zipContainer = new Container();

        Container submitContainer = new Container();


        nameContainer.setLayout(new BoxLayout(nameContainer, BoxLayout.Y_AXIS));
        streetContainer.setLayout(new BoxLayout(streetContainer, BoxLayout.Y_AXIS));
        cityContainer.setLayout(new BoxLayout(cityContainer, BoxLayout.Y_AXIS));
        stateContainer.setLayout(new BoxLayout(stateContainer, BoxLayout.Y_AXIS));
        zipContainer.setLayout(new BoxLayout(zipContainer, BoxLayout.Y_AXIS));

        submitContainer.setLayout(new BoxLayout(submitContainer, BoxLayout.X_AXIS));

        nameContainer.add(nameLabel);
        nameContainer.add(name);

        streetContainer.add(streetLabel);
        streetContainer.add(street);

        cityContainer.add(cityLabel);
        cityContainer.add(city);

        stateContainer.add(stateLabel);
        stateContainer.add(state);

        zipContainer.add(zipLabel);
        zipContainer.add(zip);

        submitContainer.add(submit);


        getContentPane().add(nameContainer);
        getContentPane().add(streetContainer);
        getContentPane().add(cityContainer);
        getContentPane().add(stateContainer);
        getContentPane().add(zipContainer);
        getContentPane().add(submitContainer);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        String  actionName;

        actionName = event.getActionCommand();

        if (actionName.equals("Submit")) {
            String nameText = name.getText();
            String streetText = street.getText();
            String cityText = city.getText();
            String stateText = state.getText();
            String zipText = zip.getText();

            System.out.println(nameText);
            System.out.println(streetText);
            System.out.println(cityText+ ", "+ stateText +" " +zipText );
        } else {
            System.out.println(actionName);
        }
    }

}


