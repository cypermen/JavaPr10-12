package Task3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;


public class Menu extends JFrame
{
    TexrDocument files = (TexrDocument) new CreateTextDocument().CreateNew();

    public Menu()
    {
        super("Системное меню");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(500, 400);
        setVisible(true);
    }

    private JMenu createFileMenu()
    {
        JMenu file = new JMenu("Файл");
        JMenuItem new1 = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");

        JMenuItem exit = new JMenuItem("Exit",new ImageIcon("images/exit.png"));
        file.add(new1);
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);

        new1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                files.New();
            }
        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                files.Open();
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                files.Save();
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                files.Exit();
            }
        });
        return file;
    }


}