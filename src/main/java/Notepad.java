



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Notepad extends JFrame implements ActionListener{
    private JTextArea area;
    private JScrollPane pane;
    public Notepad()
    {
        setBounds(0,0,1200,800);
        JMenuBar jMenuBar=new JMenuBar();

        JMenu file=new JMenu("File");
        JMenuItem newDoc=new JMenuItem("New");
        newDoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newDoc.addActionListener(this);
        JMenuItem newOpen=new JMenuItem("Open");
        newOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        newOpen.addActionListener(this);
        JMenuItem newSave=new JMenuItem("Save");
        newSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        newSave.addActionListener(this);
        JMenuItem newSaveAs=new JMenuItem("Save As");
        newSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        newSaveAs.addActionListener(this);
        JMenuItem newPrint=new JMenuItem("Print");
        newPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        newPrint.addActionListener(this);

        JMenuItem newExit=new JMenuItem("Exit");
        newExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0));
        newExit.addActionListener(this);
        file.add(newDoc);
        file.add(newSave);
        file.add(newSaveAs);
        file.add(newPrint);
        file.add(newExit);

        JMenu edit=new JMenu("Edit");
        JMenuItem copy=new JMenuItem("Copy");
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        copy.addActionListener(this);
        JMenuItem cut=new JMenuItem("Cut");
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        cut.addActionListener(this);
        JMenuItem paste=new JMenuItem("Paste");
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        paste.addActionListener(this);
        JMenuItem selecte=new JMenuItem("Select All");
        selecte.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        selecte.addActionListener(this);
        JMenuItem timedate=new JMenuItem("Time/Date");
        timedate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
        timedate.addActionListener(this);
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        edit.add(selecte);
        edit.add(timedate);

        JMenu help=new JMenu("View");
        JMenuItem zoom=new JMenuItem("Zoom");
        help.add(zoom);

        JMenu about=new JMenu("Help");

        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(help);
        jMenuBar.add(about);

        setJMenuBar(jMenuBar);


        area=new JTextArea();
        area.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        pane=new JScrollPane(area);
        pane.setBorder(BorderFactory.createEmptyBorder());
        add(pane,BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Notepad().setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
