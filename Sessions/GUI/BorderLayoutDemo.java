import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BorderLayoutDemo extends JFrame{
    public static void main(String[] args) {
        BorderLayoutDemo bld = new BorderLayoutDemo();
        bld.setVisible(true);
        bld.setSize(400,500);
        bld.setTitle("Border Layout");
    }
    JButton jb1 = null;
    JButton jb2 = null;
    JButton jb3 = null;
    JButton jb4 = null;
   // JButton jb5 = null;
    public BorderLayoutDemo(){
        jb1 = new JButton("Center");
        ad(jb1,BorderLayout.CENTER);

        jb2 = new JButton("Wesdt");
        ad(jb2,BorderLayout.WEST);
        jb3 = new JButton("SOUTH");
        ad(jb3,BorderLayout.SOUTH);
       jb4 = new JButton("EAST");
        ad(jb4,BorderLayout.EAST);
        pflow = new JPanel();
        pflow.setLayout(new FlowLayout());
        jta = new JTextArea(10,10);
        jtf = new JtextField(10);
        jl = new JLabel("Welcome");
        pflow.add(jta);
        pflow.add(jtf);
        pflow.add(jl);
       pgrid = new JPanel();
       pgrid.setLayout(new GridLayout(3,3));
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           // pgrid.add(new JButton)
        }
       }

    }
    
}

