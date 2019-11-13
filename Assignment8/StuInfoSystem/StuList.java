package StuInfoSystem;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class StuList implements TableModel {
    private ArrayList<Students> students;

    public StuList(ArrayList<Students> students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0)
            return "Name";
        if (columnIndex == 1)
            return "Gender";
        if (columnIndex == 2)
            return "ID";
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int row = -1;
        for (Students student : students) {
            row++;
            if (row == rowIndex) {
                if (columnIndex == 0) {
                    return student.getName() + "";
                }
                if (columnIndex == 1) {
                    return student.getGender() + "";
                }
                if (columnIndex == 2) {
                    return student.getId() + "";
                }
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }
    @Override
    public void addTableModelListener(TableModelListener l) {
    }
    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
}
