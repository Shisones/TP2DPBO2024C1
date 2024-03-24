import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Objects;

public class Test extends JFrame {
    public static void main(String[] args) {
        Test window = new Test();

        window.setSize(400, 400);
        window.setContentPane(window.mainPanel);
        window.setVisible(true);
    }

    private JPanel mainPanel;
    private JTable table;

    private ArrayList<Human> vec;
    public Test() {
        vec = new ArrayList<>();

        vec.add(new Human("Rakha", "Hitam"));
        vec.add(new Human("Arya", "Cina"));

        table.setModel(SetTable());
    }

    public final DefaultTableModel SetTable() {
        Object[] column = {"No", "Nama", "Ras"};
        DefaultTableModel temp = new DefaultTableModel(null, column);

        for (int i = 0; i < vec.size(); i++) {
            Object[] row = new Object[3];
            row[0] = i;
            row[1] = vec.get(i).getNama();
            row[2] = vec.get(i).getRas();

            temp.addRow(row);
        }

        return temp;
    }
}
