package com.testCode;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class PrismTester extends JFrame{
    // frame
    static JFrame f;

    // label
    static JLabel l, heightLabel, lengthLabel, widthLabel, area1, area2, volume1, volume2, equalOrNot, largestVolume, smallestArea;

    // spinner
    static JSpinner s, s1, s2, s3, s4, s5;

    // Button
    static JButton button;

    // Create Objects
    static Prism prism1 = new Prism();
    static Prism prism2 = new Prism();
    static Prism computerPrism = new Prism();


    // default constructor
    PrismTester()
    {
    }

    // main class
    public static void main(String[] args)
    {
        // create an object of the class
        PrismTester sp1 = new PrismTester();

        // create a new frame
        f = new JFrame("Jeffords Unit 3 Test");

        // Create a Button
        button =new JButton("Update Prism Size");

        // create a label
        l = new JLabel("Enter Height, Length, and Width");
        heightLabel = new JLabel("Height");
        widthLabel = new JLabel("Width");
        lengthLabel = new JLabel("Length");
        area1 = new JLabel("Area of First Prism: ");
        area2 = new JLabel("Area of Second Prism: ");
        volume1 = new JLabel("Volume of First Prism: ");
        volume2 = new JLabel("Volume of Second Prism: ");
        equalOrNot = new JLabel();
        smallestArea = new JLabel();
        largestVolume = new JLabel();

        // create a JSpinner with a minimum, maximum and step value
        s = new JSpinner(new SpinnerNumberModel(0, 0, 2147483647, 1));
        s1 = new JSpinner(new SpinnerNumberModel(0, 0, 2147483647, 1));
        s2 = new JSpinner(new SpinnerNumberModel(0, 0, 2147483647, 1));
        s3 = new JSpinner(new SpinnerNumberModel(0, 0, 2147483647, 1));
        s4 = new JSpinner(new SpinnerNumberModel(0, 0, 2147483647, 1));
        s5 = new JSpinner(new SpinnerNumberModel(0, 0, 2147483647, 1));

        // Warning Message
        JOptionPane.showMessageDialog(f, "Your computer has been hacked","Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(f, "I am joking your not being hacked", "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(f, "Or are you HAHAHAHAHAHA!!!", "Warning", JOptionPane.WARNING_MESSAGE);

        // add change listener to spinner
        s.addChangeListener(listener1);
        s1.addChangeListener(listener1);
        s2.addChangeListener(listener1);
        s3.addChangeListener(listener2);
        s4.addChangeListener(listener2);
        s5.addChangeListener(listener2);
        button.addChangeListener(listener3);

        // set Bounds for spinner/number counter/Button
        s.setBounds(70, 70, 90, 40);
        s1.setBounds(70, 130, 90, 40);
        s2.setBounds(70, 200, 90, 40);
        s3.setBounds(290, 70, 90, 40);
        s4.setBounds(290, 130, 90, 40);
        s5.setBounds(290, 200, 90, 40);
        button.setBounds(100, 470, 275, 20);

        // set bounds for label
        l.setBounds(10, 10, 300, 20);
        lengthLabel.setBounds(5, 78, 275, 20);
        heightLabel.setBounds(5, 140, 275, 20);
        widthLabel.setBounds(4, 210, 275, 20);
        area1.setBounds(10, 300, 275, 20);
        area2.setBounds(250, 300, 275, 20);
        volume1.setBounds(10, 350,275,20);
        volume2.setBounds(250,350,275,20);
        equalOrNot.setBounds(160, 400, 275, 20);
        largestVolume.setBounds(160, 420, 300, 20);
        smallestArea.setBounds(160, 440, 300, 20);


        // set layout for frame
        f.setLayout(null);

        // Add Fields
        f.add(l); f.add(area1); f.add(area2); f.add(volume1); f.add(volume2); f.add(button); f.add(smallestArea);
        f.add(s); f.add(s1); f.add(s2); f.add(s3); f.add(s4); f.add(s5); f.add(equalOrNot); f.add(largestVolume);
        f.add(heightLabel); f.add(widthLabel); f.add(lengthLabel);

        // add panel to frame
        f.add(s);

        // set frame size
        f.setSize(500, 550);

        f.getContentPane().setBackground(Color.lightGray);
        s.getEditor().getComponent(0).setBackground(Color.green);
        s1.getEditor().getComponent(0).setBackground(Color.white);
        s2.getEditor().getComponent(0).setBackground(Color.yellow);
        s3.getEditor().getComponent(0).setBackground(Color.red);
        s4.getEditor().getComponent(0).setBackground(Color.magenta);
        s5.getEditor().getComponent(0).setBackground(Color.cyan);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }

    // if the state is changed
    static ChangeListener listener1 = new ChangeListener() {
        public void stateChanged(ChangeEvent e)
        {
            double prismField = (int) s.getValue(); //Length
            double prismField1 = (int) s1.getValue(); //Height
            double prismField2 = (int) s2.getValue(); //Width
            prism1 = new Prism(prismField, prismField1, prismField2);
            String volumePrism1 = prism1.getVolume()+"";
            String areaPrism1 = prism1.getArea()+"";
            area1.setText("Area of First Prism: " + areaPrism1 + " in^2");
            volume1.setText("Volume of First Prism: " + volumePrism1 + " in^3");
            //System.out.println(areaPrism1);
        }
    };

    static ChangeListener listener2 = new ChangeListener() {
        public void stateChanged(ChangeEvent e)
        {
            double prismField3 = (int) s3.getValue();
            double prismField4 = (int) s4.getValue();
            double prismField5 = (int) s5.getValue();
            prism2 = new Prism(prismField3, prismField4, prismField5);
            String volumePrism2 = prism2.getVolume()+"";
            String areaPrism2 = prism2.getArea()+"";
            volume2.setText("Volume of Second Prism: " + volumePrism2 + " in^3");
            area2.setText("Area of Second Prism: " + areaPrism2 + " in^2");
            //System.out.println(area2);
        }
    };

    static ChangeListener listener3 = new ChangeListener() {
        public void stateChanged(ChangeEvent e)
        {
            //System.out.println(computerPrism.getArea());

            double maxVolume = Math.max(Math.max(prism1.getVolume(), prism2.getVolume()), computerPrism.getVolume());
            if(maxVolume == prism1.getVolume()) {
                largestVolume.setText("The Prism on the left has the largest volume");
            } else if (maxVolume == prism2.getVolume()) {
                largestVolume.setText("The Prism on the right has the largest volume");
            } else if (maxVolume == computerPrism.getVolume()) {
                largestVolume.setText("The computer prism has the largest volume");
            }

            double minArea = Math.min(Math.min(prism1.getArea(), prism2.getArea()), computerPrism.getArea());
            if(minArea == prism1.getArea()) {
                smallestArea.setText("The prism on the left has the smallest area");
            } else if (minArea == prism2.getArea()) {
                smallestArea.setText("The prism on the right has the smallest area");
            } else if (minArea == computerPrism.getArea()) {
                //System.out.println(computerPrism.getArea());
                smallestArea.setText("The computer prism has the smallest area");
            }

            boolean isEqualOneTwo = prism1.isEqual(prism2);

            if(isEqualOneTwo) {
                equalOrNot.setText("Left and Right Prisms are equal");
            } else{
                equalOrNot.setText("None are equal");
            }

            //System.out.println(isEqualOneTwo);
        }
    };



}
