import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class je_ma_stack implements ActionListener{
    JList<String> jlst;
    JLabel jlab;
    JTextField jtf;
    JScrollPane jscrlp;
    DefaultListModel<String> model;
    je_ma_stack(){
        JFrame jfrm = new JFrame("JList Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 500);
        
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        model = new DefaultListModel<>();
        jlst = new JList<String>(model);

        JButton jbtn = new JButton("Push");
        jbtn.setActionCommand("push");
        jbtn.addActionListener(this);

        JButton jbtn1 = new JButton("Pop");
        jbtn1.setActionCommand("pop");
        jbtn1.addActionListener(this);

        jtf = new JTextField(10);
        
        jfrm.add(jlst);
        jfrm.add(jtf);
        jfrm.add(jbtn);
        jfrm.add(jbtn1);
        
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("push"))
        {
            if (!jtf.getText().isEmpty())
            {
                model.addElement(jtf.getText());
                jtf.setText("");
            }
        }
        if (ae.getActionCommand().equals("pop"))
        {
            JFrame jFrame = new JFrame();
            if (model.getSize() > 0)
            {
                JOptionPane.showMessageDialog(jFrame, "Popped: "+model.elementAt(model.getSize()-1));
                model.removeElementAt(model.getSize()-1);
            }
            else{
                
                JOptionPane.showMessageDialog(jFrame, "Dear respectful blind bitch,\nThe Stack is empty");
            }
            
        }
    
    }
    
    // public void valueChanged(ListSelectionEvent le){
        
    //     int idx = jlst.getSelectedIndex();
        
    //     if (idx != -1){
    //         model.addElement("bdosuudbs");
            
    //     }else{
    //         jlab.setText("Please choose a name");
    //     }
    // }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               new je_ma_stack();
           }
        });
    }
}
