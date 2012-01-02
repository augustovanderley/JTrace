package org.jtrace.examples.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jtrace.PerspectiveTracer;
import org.jtrace.ViewPlane;
import org.jtrace.swing.TracerPanel;

public class MainWindow extends JFrame {

  public MainWindow() {
    setSize(700, 650);
    setTitle("JTrace");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    init();
  }

  private void init() {
    JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

    mainPanel.add(createTracerPanel());
    mainPanel.add(createTracerPanel());
    
    add(mainPanel);
  }

  private JPanel createTracerPanel() {
    return new TracerPanel(new PerspectiveTracer(), App.createScene(), new ViewPlane(1376, 768), 500, 500);
  }
  
}