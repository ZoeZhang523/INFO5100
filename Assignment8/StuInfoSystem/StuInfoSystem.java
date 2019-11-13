package StuInfoSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

enum Gender {
    MALE, FEMALE
}

public class StuInfoSystem extends JFrame {
    public ArrayList<Students> students;
    public JTable table;
    public JTextField newStuInfo;
    public JButton add;
    public JScrollPane pane;
    StuList sl;


    public static void main(String[] args){
        StuInfoSystem sis = new StuInfoSystem();
        Students s1 = new Students("Edward", Gender.MALE, 1);
        Students s2 = new Students("Lily", Gender.FEMALE,2);
        sis.addStu(s1);
        sis.addStu(s2);
    }
    public StuInfoSystem(){
        students = new ArrayList();
        createInfo();
        addInfo();
        setLayout();
        addListeners();
        display();
    }
    public void createInfo(){
        add = new JButton("Add");
        newStuInfo = new JTextField();
        sl = new StuList(students);
        table = new JTable(sl);
        table.setRowHeight(20);
        pane = new JScrollPane(table);
    }
    public void addInfo(){
        Container con = getContentPane();
        con.add(pane);
        con.add(newStuInfo);
        con.add(add);
    }
    public void setLayout(){
        GridLayout gl = new GridLayout(3,1);
        Container con = getContentPane();
        con.setLayout(gl);
    }
    public void addListeners(){
        AddListener al = new AddListener();
        add.addActionListener(al);
    }
    public void display(){
        setSize(500, 500);
        setVisible(true);
    }
    public void addStu(Students stu){
        students.add(stu);
    }
    class AddListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String[] newStudent = newStuInfo.getText().split(" ");
            if (e.getSource() == add) {
                if (newStudent[1].equals("MALE")) {
                    students.add(new Students(newStudent[0], Gender.FEMALE, Integer.parseInt(newStudent[2])));
                }
                if (newStudent[1].equals("FEMALE")) {
                    students.add(new Students(newStudent[0], Gender.FEMALE, Integer.parseInt(newStudent[2])));
                }
            }

            pane.repaint();
            getContentPane().add(pane);
            getContentPane().repaint();
        }
    }

}

