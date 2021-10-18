package com.secureBrowser.debianProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final JFrame frame = new JFrame("Debian");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        JButton button = new JButton("Click");
        button.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
        });
        frame.add(button);
        
        frame.pack();
    }
}
