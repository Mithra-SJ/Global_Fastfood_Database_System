package youtube;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;

public class jtabdemo extends JFrame {
    DefaultTableModel model,model2,model3,model4,model5,model6,model7,model8,model9;

private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;


private static final String DB_URL = "jdbc:oracle:thin:@192.168.1.18:1521:orcl";
    private static final String DB_USER = "csa4084";
    private static final String DB_PASSWORD = "licet";
    private JTable table_1;
    private JTable table_2;
    private JTable table_3;
    private JTable table_4;
    private JTable table_5;
    private JTable table_6;
    private JTable table_7;
    private JTable table_8;
    private JTable table_9;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_20;
    private JTextField textField_24;
    private JTextField textField_25;
    private JTextField textField_26;
    private JTextField textField_27;
    private JTextField textField_28;
    private JTextField textField_32;
    private JTextField textField_33;
    private JTextField textField_34;
    private JTextField textField_40;
    private JTextField textField_41;
    private JTextField textField_42;
    private JTextField textField_43;
    private JTextField textField_44;
    private JTextField textField_72;
    private JTextField textField_73;
    private JTextField textField_74;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_29;
    private JTextField textField_30;
    private JTextField textField_31;
    private JTextField textField_21;
    private JTextField textField_35;
    private JTextField textField_36;
    private JTable table;
    public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
jtabdemo frame = new jtabdemo();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});

    }


public jtabdemo() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 1020, 633);
contentPane = new JPanel();
contentPane.setBackground(new Color(216, 191, 216));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
tabbedPane.setBackground(new Color(255, 255, 255));
tabbedPane.setBounds(10, 34, 984, 549);
contentPane.add(tabbedPane);

JPanel panel1 = new JPanel();
panel1.setBackground(new Color(128, 0, 128));
tabbedPane.addTab("Customers", null, panel1, null);
panel1.setLayout(null);
JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(350, 11, 619, 499);
panel1.add(scrollPane);


table_1 = new JTable();
table_1.setBounds(350, 13, 619, 497);
table_1.setBackground(new Color(216, 191, 216));
        model = new DefaultTableModel();
        Object[] column = {"ID", "First name", "Last name", "Address", "City", "State", "ZIP", "Phone no"};
        final Object[] row = new Object[8];
        model.setColumnIdentifiers(column);
        table_1.setModel(model);
        scrollPane.setViewportView(table_1);
table_1.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int i = table_1.getSelectedRow();
                textField.setText(model.getValueAt(i, 0).toString());
                textField_1.setText(model.getValueAt(i, 1).toString());
                textField_2.setText(model.getValueAt(i, 2).toString());
                textField_3.setText(model.getValueAt(i, 3).toString());
                textField_4.setText(model.getValueAt(i, 4).toString());
                textField_5.setText(model.getValueAt(i, 5).toString());
                textField_6.setText(model.getValueAt(i, 6).toString());
                textField_7.setText(model.getValueAt(i, 7).toString());
}
});

JLabel label1 = new JLabel("ID:");
label1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label1.setForeground(Color.WHITE);
label1.setBounds(10, 36, 93, 14);
panel1.add(label1);

JLabel label2 = new JLabel("First name:");
label2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label2.setForeground(Color.WHITE);
label2.setBounds(10, 61, 93, 14);
panel1.add(label2);

JLabel label3 = new JLabel("Last name:");
label3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label3.setForeground(Color.WHITE);
label3.setBounds(10, 86, 93, 14);
panel1.add(label3);

JLabel label4 = new JLabel("Address:");
label4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label4.setForeground(Color.WHITE);
label4.setBounds(10, 111, 93, 14);
panel1.add(label4);

JLabel label5 = new JLabel("City:");
label5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label5.setForeground(Color.WHITE);
label5.setBounds(10, 136, 93, 14);
panel1.add(label5);

JLabel label6 = new JLabel("State:");
label6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label6.setForeground(Color.WHITE);
label6.setBounds(10, 161, 93, 14);
panel1.add(label6);

JLabel label7 = new JLabel("ZIP:");
label7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label7.setForeground(Color.WHITE);
label7.setBounds(10, 186, 93, 14);
panel1.add(label7);

JLabel label8 = new JLabel("Phone no:");
label8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label8.setForeground(Color.WHITE);
label8.setBounds(10, 211, 93, 14);
panel1.add(label8);

textField = new JTextField();
textField.setColumns(10);
textField.setBounds(98, 36, 242, 20);
panel1.add(textField);

textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(98, 61, 242, 20);
panel1.add(textField_1);

textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(98, 86, 242, 20);
panel1.add(textField_2);

textField_3 = new JTextField();
textField_3.setColumns(10);
textField_3.setBounds(98, 111, 242, 20);
panel1.add(textField_3);

textField_4 = new JTextField();
textField_4.setColumns(10);
textField_4.setBounds(98, 136, 242, 20);
panel1.add(textField_4);

textField_5 = new JTextField();
textField_5.setColumns(10);
textField_5.setBounds(98, 161, 242, 20);
panel1.add(textField_5);

textField_6 = new JTextField();
textField_6.setColumns(10);
textField_6.setBounds(98, 186, 242, 20);
panel1.add(textField_6);

textField_7 = new JTextField();
textField_7.setColumns(10);
textField_7.setBounds(98, 211, 242, 20);
panel1.add(textField_7);

JButton btnNewButton = new JButton("Add");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("")||textField_4.getText().equals("")||textField_5.getText().equals("")||textField_6.getText().equals("")||textField_7.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please fill complete information");
}
else {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                 String query = "INSERT INTO f_customers (ID, FIRST_NAME, LAST_NAME, ADDRESS, CITY, STATE, ZIP, PHONE_NUMBER) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                 PreparedStatement pst = conn.prepareStatement(query);
                 pst.setString(1, textField.getText());
                 pst.setString(2, textField_1.getText());
                 pst.setString(3, textField_2.getText());
                 pst.setString(4, textField_3.getText());
                 pst.setString(5, textField_4.getText());
                 pst.setString(6, textField_5.getText());
                 pst.setString(7, textField_6.getText());
                 pst.setString(8, textField_7.getText());
                 pst.executeUpdate();
row[0]=textField.getText();
row[1]=textField_1.getText();
row[2]=textField_2.getText();
row[3]=textField_3.getText();
row[4]=textField_4.getText();
row[5]=textField_5.getText();
row[6]=textField_6.getText();
row[7]=textField_7.getText();
model.addRow(row);
textField.setText("");
textField_1.setText("");
textField_2.setText("");
textField_3.setText("");
textField_4.setText("");
textField_5.setText("");
textField_6.setText("");
textField_7.setText("");
JOptionPane.showMessageDialog(null,"Saved sucessfully!");} catch (SQLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}}
}

});
btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnNewButton.setBounds(27, 295, 117, 47);
panel1.add(btnNewButton);

JButton btnDelete = new JButton("Delete");
btnDelete.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
       int i = table_1.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "DELETE FROM f_customers WHERE ID=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, model.getValueAt(i, 0).toString());
               pst.executeUpdate();
               model.removeRow(i);
               JOptionPane.showMessageDialog(null, "Deleted successfully!");
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
   }
});

btnDelete.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnDelete.setBounds(27, 367, 117, 45);
panel1.add(btnDelete);

JButton btnView = new JButton("View All");
btnView.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
           String query = "SELECT * FROM f_customers";
           PreparedStatement pst = conn.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           model.setRowCount(0); // Clear existing rows in the table
           while (rs.next()) {
               Object[] row = {
                   rs.getString("ID"),
                   rs.getString("FIRST_NAME"),
                   rs.getString("LAST_NAME"),
                   rs.getString("ADDRESS"),
                   rs.getString("CITY"),
                   rs.getString("STATE"),
                   rs.getString("ZIP"),
                   rs.getString("PHONE_NUMBER")
               };
               model.addRow(row);
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
       }
   }
});
btnView.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnView.setBounds(124, 434, 104, 47);
panel1.add(btnView);

JButton btnClear = new JButton("Clear");
btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnClear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
       textField.setText("");
       textField_1.setText("");
       textField_2.setText("");
       textField_3.setText("");
       textField_4.setText("");
       textField_5.setText("");
       textField_6.setText("");
       textField_7.setText("");
   }
});
btnClear.setBounds(199, 367, 104, 45);
panel1.add(btnClear);

JButton btnUpdate = new JButton("Update");
btnUpdate.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_1.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "UPDATE f_customers SET ID=?, FIRST_NAME=?, LAST_NAME=?, ADDRESS=?, CITY=?, STATE=?, ZIP=?, PHONE_NUMBER=? WHERE ID=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, textField.getText()); // Assuming textField is a JTextField
               pst.setString(2, textField_1.getText());
               pst.setString(3, textField_2.getText());
               pst.setString(4, textField_3.getText());
               pst.setString(5, textField_4.getText());
               pst.setString(6, textField_5.getText());
               pst.setString(7, textField_6.getText());
               pst.setString(8, textField_7.getText());
               
               // Use the ID from the table model at index i
               pst.setString(9, model.getValueAt(i, 0).toString()); // Assuming ID is at column index 0
               
               pst.executeUpdate();

               // Update the table model with new values
               model.setValueAt(textField.getText(), i, 0);
               model.setValueAt(textField_1.getText(), i, 1);
               model.setValueAt(textField_2.getText(), i, 2);
               model.setValueAt(textField_3.getText(), i, 3);
               model.setValueAt(textField_4.getText(), i, 4);
               model.setValueAt(textField_5.getText(), i, 5);
               model.setValueAt(textField_6.getText(), i, 6);
               model.setValueAt(textField_7.getText(), i, 7);
               
               JOptionPane.showMessageDialog(null, "Updated successfully!");

           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
   }
});
btnUpdate.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnUpdate.setBounds(199, 295, 104, 47);
panel1.add(btnUpdate);

JLabel lblNewLabel_1_1 = new JLabel("CUSTOMERS TABLE");
lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1_1.setForeground(Color.WHITE);
lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
lblNewLabel_1_1.setBounds(80, 11, 191, 14);
panel1.add(lblNewLabel_1_1);

JPanel panel2 = new JPanel();
panel2.setBackground(new Color(128, 0, 128));
tabbedPane.addTab("Staff", null, panel2, null);
panel2.setLayout(null);
JScrollPane scrollPane_1 = new JScrollPane();
scrollPane_1.setBounds(350, 8, 619, 499);
panel2.add(scrollPane_1);

table_2 = new JTable();
table_2.setBounds(350, 13, 619, 497);
table_2.setBackground(new Color(216, 191, 216));
        model2 = new DefaultTableModel();
        Object[] column2 = {"ID", "First name", "Last name", "Birthdate", "Salary", "Overtime rate", "Trainig","Staff type","Manager ID","Manager budget","Manager target"};
        final Object[] row2 = new Object[11];
        model2.setColumnIdentifiers(column2);
        table_2.setModel(model2);
        scrollPane_1.setViewportView(table_2);
table_2.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int i = table_2.getSelectedRow();
       
                textField_8.setText(model2.getValueAt(i, 0).toString());
                textField_9.setText(model2.getValueAt(i, 1).toString());
                textField_10.setText(model2.getValueAt(i, 2).toString());
                textField_11.setText(model2.getValueAt(i, 3).toString());
                textField_12.setText(model2.getValueAt(i, 4).toString());
                textField_13.setText(model2.getValueAt(i, 5).toString());
                textField_14.setText(model2.getValueAt(i, 6).toString());
                textField_15.setText(model2.getValueAt(i, 7).toString());
                textField_72.setText(model2.getValueAt(i, 8).toString());
                textField_73.setText(model2.getValueAt(i, 9).toString());
                textField_74.setText(model2.getValueAt(i, 10).toString());
}
});

JLabel lblNewLabel_1_1_1 = new JLabel("STAFF TABLE");
lblNewLabel_1_1_1.setBounds(74, 11, 191, 14);
lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1_1_1.setForeground(Color.WHITE);
lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel2.add(lblNewLabel_1_1_1);

JButton btnNewButton_1 = new JButton("Add");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(textField_8.getText().equals("")||textField_9.getText().equals("")||textField_10.getText().equals("")||textField_11.getText().equals("")||textField_12.getText().equals("")||textField_13.getText().equals("")||textField_14.getText().equals("")||textField_15.getText().equals("")||textField_72.getText().equals("")||textField_73.getText().equals("")||textField_74.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please fill complete information");
}
else {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String query = "INSERT INTO f_staffs (ID, FIRST_NAME, LAST_NAME, BIRTHDATE, SALARY, OVERTIME_RATE, TRAINING, STAFF_TYPE,MANAGER_ID,MANAGER_BUDGET,MANAGER_TARGET) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, textField_8.getText());
                pst.setString(2, textField_9.getText());
                pst.setString(3, textField_10.getText());
                pst.setString(4, textField_11.getText());
                pst.setString(5, textField_12.getText());
                pst.setString(6, textField_13.getText());
                pst.setString(7, textField_14.getText());
                pst.setString(8, textField_15.getText());
                pst.setString(9, textField_72.getText());
                pst.setString(10, textField_73.getText());
                pst.setString(11, textField_74.getText());
                pst.executeUpdate();
row2[0]=textField_8.getText();
row2[1]=textField_9.getText();
row2[2]=textField_10.getText();
row2[3]=textField_11.getText();
row2[4]=textField_12.getText();
row2[5]=textField_13.getText();
row2[6]=textField_14.getText();
row2[7]=textField_15.getText();
row2[8]=textField_72.getText();
row2[9]=textField_73.getText();
row2[10]=textField_74.getText();
model2.addRow(row2);
textField_8.setText("");
textField_9.setText("");
textField_10.setText("");
textField_11.setText("");
textField_12.setText("");
textField_13.setText("");
textField_14.setText("");
textField_15.setText("");
textField_72.setText("");
textField_73.setText("");
textField_74.setText("");
JOptionPane.showMessageDialog(null,"Saved sucessfully!");} catch (SQLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}}
}
});
btnNewButton_1.setBounds(30, 346, 117, 47);
btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel2.add(btnNewButton_1);

JButton btnDelete_1 = new JButton("Delete");
btnDelete_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_2.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "DELETE FROM f_staffs WHERE ID=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, model2.getValueAt(i, 0).toString());
               pst.executeUpdate();
               model2.removeRow(i);
               JOptionPane.showMessageDialog(null, "Deleted successfully!");
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnDelete_1.setBounds(30, 404, 117, 45);
btnDelete_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel2.add(btnDelete_1);

JButton btnView_1 = new JButton("View All");
btnView_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
           String query = "SELECT * FROM f_staffs";
           PreparedStatement pst = conn.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           model2.setRowCount(0);
           while (rs.next()) {
               Object[] row2 = {
                   rs.getString("ID"),
                   rs.getString("FIRST_NAME"),
                   rs.getString("LAST_NAME"),
                   rs.getString("BIRTHDATE"),
                   rs.getString("SALARY"),
                   rs.getString("OVERTIME_RATE"),
                   rs.getString("TRAINING"),
                   rs.getString("STAFF_TYPE"),
                   rs.getString("MANAGER_ID"),
                   rs.getString("MANAGER_BUDGET"),
                   rs.getString("MANAGER_TARGET")
               };
               model2.addRow(row2);
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
       }
}
});
btnView_1.setBounds(127, 460, 104, 47);
btnView_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel2.add(btnView_1);

JButton btnClear_1 = new JButton("Clear");
btnClear_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_8.setText("");
textField_9.setText("");
textField_10.setText("");
textField_11.setText("");
textField_12.setText("");
textField_13.setText("");
textField_14.setText("");
textField_15.setText("");
textField_72.setText("");
textField_73.setText("");
textField_74.setText("");

}
});
btnClear_1.setBounds(202, 404, 104, 45);
btnClear_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel2.add(btnClear_1);

JButton btnUpdate_1 = new JButton("Update");
btnUpdate_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_2.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "UPDATE f_staffs SET ID=?, FIRST_NAME=?, LAST_NAME=?, BIRTHDATE=?, SALARY=?, OVERTIME_RATE=?, TRAINING=?, STAFF_TYPE=? ,MANAGER_ID=?,MANAGER_BUDGET=?,MANAGER_TARGET=? WHERE ID=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, textField_8.getText()); // Assuming textField is a JTextField
               pst.setString(2, textField_9.getText());
               pst.setString(3, textField_10.getText());
               pst.setString(4, textField_11.getText());
               pst.setString(5, textField_12.getText());
               pst.setString(6, textField_13.getText());
               pst.setString(7, textField_14.getText());
               pst.setString(8, textField_15.getText());
               pst.setString(9, textField_72.getText());
               pst.setString(10, textField_73.getText());
               pst.setString(11, textField_74.getText());
               
             
               pst.setString(12, model2.getValueAt(i, 0).toString());
               
               pst.executeUpdate();

           
               model2.setValueAt(textField_8.getText(), i, 0);
               model2.setValueAt(textField_9.getText(), i, 1);
               model2.setValueAt(textField_10.getText(), i, 2);
               model2.setValueAt(textField_11.getText(), i, 3);
               model2.setValueAt(textField_12.getText(), i, 4);
               model2.setValueAt(textField_13.getText(), i, 5);
               model2.setValueAt(textField_14.getText(), i, 6);
               model2.setValueAt(textField_15.getText(), i, 7);
               model2.setValueAt(textField_72.getText(), i, 8);
               model2.setValueAt(textField_73.getText(), i, 9);
               model2.setValueAt(textField_74.getText(), i, 10);
               
               JOptionPane.showMessageDialog(null, "Updated successfully!");

           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnUpdate_1.setBounds(202, 346, 104, 47);
btnUpdate_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel2.add(btnUpdate_1);



JLabel label1_1 = new JLabel("ID:");
label1_1.setBounds(10, 47, 93, 14);
label1_1.setForeground(Color.WHITE);
label1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(label1_1);

JLabel label2_1 = new JLabel("First name:");
label2_1.setBounds(10, 72, 93, 14);
label2_1.setForeground(Color.WHITE);
label2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(label2_1);

JLabel label3_1 = new JLabel("Last name:");
label3_1.setBounds(10, 97, 93, 14);
label3_1.setForeground(Color.WHITE);
label3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(label3_1);

JLabel lblBirthdate = new JLabel("Birthdate:");
lblBirthdate.setBounds(10, 122, 93, 14);
lblBirthdate.setForeground(Color.WHITE);
lblBirthdate.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(lblBirthdate);

JLabel lblSalary = new JLabel("Salary: ");
lblSalary.setBounds(10, 141, 93, 20);
lblSalary.setForeground(Color.WHITE);
lblSalary.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(lblSalary);

JLabel lblOvertimeRate = new JLabel("Overtime rate:");
lblOvertimeRate.setBounds(10, 167, 104, 14);
lblOvertimeRate.setForeground(Color.WHITE);
lblOvertimeRate.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(lblOvertimeRate);

JLabel lblTraining = new JLabel("Training:");
lblTraining.setBounds(10, 189, 93, 20);
lblTraining.setForeground(Color.WHITE);
lblTraining.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(lblTraining);

JLabel lblStaffType = new JLabel("Staff type:");
lblStaffType.setBounds(10, 211, 93, 27);
lblStaffType.setForeground(Color.WHITE);
lblStaffType.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(lblStaffType);

textField_8 = new JTextField();
textField_8.setBounds(132, 41, 208, 20);
textField_8.setColumns(10);
panel2.add(textField_8);

textField_9 = new JTextField();
textField_9.setBounds(132, 66, 208, 20);
textField_9.setColumns(10);
panel2.add(textField_9);

textField_10 = new JTextField();
textField_10.setBounds(132, 91, 208, 20);
textField_10.setColumns(10);
panel2.add(textField_10);

textField_11 = new JTextField();
textField_11.setBounds(132, 116, 208, 20);
textField_11.setColumns(10);
panel2.add(textField_11);

textField_12 = new JTextField();
textField_12.setBounds(132, 141, 208, 20);
textField_12.setColumns(10);
panel2.add(textField_12);

textField_13 = new JTextField();
textField_13.setBounds(132, 166, 208, 20);
textField_13.setColumns(10);
panel2.add(textField_13);

textField_14 = new JTextField();
textField_14.setBounds(132, 191, 208, 20);
textField_14.setColumns(10);
panel2.add(textField_14);

textField_15 = new JTextField();
textField_15.setBounds(132, 216, 208, 20);
textField_15.setColumns(10);
panel2.add(textField_15);

JLabel lblManagerId = new JLabel("Manager ID: ");
lblManagerId.setBounds(10, 243, 93, 14);
lblManagerId.setForeground(Color.WHITE);
lblManagerId.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(lblManagerId);

JLabel lblManagerBudget = new JLabel("Manager budget: ");
lblManagerBudget.setBounds(10, 268, 122, 19);
lblManagerBudget.setForeground(Color.WHITE);
lblManagerBudget.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(lblManagerBudget);

JLabel lblManagerTarget = new JLabel("Manager target: ");
lblManagerTarget.setBounds(10, 293, 117, 19);
lblManagerTarget.setForeground(Color.WHITE);
lblManagerTarget.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
panel2.add(lblManagerTarget);

textField_72 = new JTextField();
textField_72.setBounds(132, 242, 208, 20);
textField_72.setColumns(10);
panel2.add(textField_72);

textField_73 = new JTextField();
textField_73.setBounds(132, 267, 208, 20);
textField_73.setColumns(10);
panel2.add(textField_73);

textField_74 = new JTextField();
textField_74.setBounds(132, 292, 208, 20);
textField_74.setColumns(10);
panel2.add(textField_74);

JPanel panel3 = new JPanel();
panel3.setBackground(new Color(128, 0, 128));
tabbedPane.addTab("Food items", null, panel3, null);
panel3.setLayout(null);

JScrollPane scrollPane_2 = new JScrollPane();
scrollPane_2.setBounds(350, 11, 619, 499);
panel3.add(scrollPane_2);

table_3 = new JTable();
table_3.setBounds(350, 13, 619, 497);
table_3.setBackground(new Color(216, 191, 216));
        model3 = new DefaultTableModel();
        Object[] column3 = {"Food item number", "Description", "Price", "Regular code", "Promo code"};
        final Object[] row3 = new Object[5];
        model3.setColumnIdentifiers(column3);
        table_3.setModel(model3);
        scrollPane_2.setViewportView(table_3);
table_3.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int i = table_3.getSelectedRow();
                textField_16.setText(model3.getValueAt(i, 0).toString());
                textField_17.setText(model3.getValueAt(i, 1).toString());
                textField_18.setText(model3.getValueAt(i, 2).toString());
                textField_19.setText(model3.getValueAt(i, 3).toString());
                textField_20.setText(model3.getValueAt(i, 4).toString());
}
});

JButton btnNewButton_1_1 = new JButton("Add");
btnNewButton_1_1.setBounds(36, 310, 117, 47);
btnNewButton_1_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(textField_16.getText().equals("")||textField_17.getText().equals("")||textField_18.getText().equals("")||textField_19.getText().equals("")||textField_20.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please fill complete information");
}
else {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String query = "INSERT INTO f_food_items (FOOD_ITEM_NUMBER,DESCRIPTION,PRICE,REGULAR_CODE,PROMO_CODE) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, textField_16.getText());
                pst.setString(2, textField_17.getText());
                pst.setString(3, textField_18.getText());
                pst.setString(4, textField_19.getText());
                pst.setString(5, textField_20.getText());
                pst.executeUpdate();
row3[0]=textField_16.getText();
row3[1]=textField_17.getText();
row3[2]=textField_18.getText();
row3[3]=textField_19.getText();
row3[4]=textField_20.getText();
model3.addRow(row3);
textField_16.setText("");
textField_17.setText("");
textField_18.setText("");
textField_19.setText("");
textField_20.setText("");
JOptionPane.showMessageDialog(null,"Saved sucessfully!");} catch (SQLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}}
}
});
btnNewButton_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(btnNewButton_1_1);

JButton btnDelete_1_1 = new JButton("Delete");
btnDelete_1_1.setBounds(36, 382, 117, 45);
btnDelete_1_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_3.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "DELETE FROM f_food_items WHERE FOOD_ITEM_NUMBER=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, model3.getValueAt(i, 0).toString());
               pst.executeUpdate();
               model3.removeRow(i);
               JOptionPane.showMessageDialog(null, "Deleted successfully!");
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnDelete_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(btnDelete_1_1);

JButton btnView_1_1 = new JButton("View All");
btnView_1_1.setBounds(133, 449, 104, 47);
btnView_1_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
           String query = "SELECT * FROM f_food_items";
           PreparedStatement pst = conn.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           model3.setRowCount(0);
           while (rs.next()) {
               Object[] row3 = {
                   rs.getString("FOOD_ITEM_NUMBER"),
                   rs.getString("DESCRIPTION"),
                   rs.getString("PRICE"),
                   rs.getString("REGULAR_CODE"),
                   rs.getString("PROMO_CODE"),
               };
               model3.addRow(row3);
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
       }

}
});
btnView_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(btnView_1_1);

JButton btnClear_1_1 = new JButton("Clear");
btnClear_1_1.setBounds(208, 382, 104, 45);
btnClear_1_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_16.setText("");
textField_17.setText("");
textField_18.setText("");
textField_19.setText("");
textField_20.setText("");
}
});
btnClear_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(btnClear_1_1);

JButton btnUpdate_1_1 = new JButton("Update");
btnUpdate_1_1.setBounds(208, 310, 104, 47);
btnUpdate_1_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_3.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "UPDATE f_food_items SET FOOD_ITEM_NUMBER=?,DESCRIPTION=?,PRICE=?,REGULAR_CODE=?,PROMO_CODE=? WHERE FOOD_ITEM_NUMBER=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, textField_16.getText()); // Assuming textField is a JTextField
               pst.setString(2, textField_17.getText());
               pst.setString(3, textField_18.getText());
               pst.setString(4, textField_19.getText());
               pst.setString(5, textField_20.getText());
             
               pst.setString(6, model3.getValueAt(i, 0).toString());
               
               pst.executeUpdate();

           
               model3.setValueAt(textField_16.getText(), i, 0);
               model3.setValueAt(textField_17.getText(), i, 1);
               model3.setValueAt(textField_18.getText(), i, 2);
               model3.setValueAt(textField_19.getText(), i, 3);
               model3.setValueAt(textField_20.getText(), i, 4);
           
               
               JOptionPane.showMessageDialog(null, "Updated successfully!");

           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }

}
});
btnUpdate_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(btnUpdate_1_1);

JLabel lblNewLabel_1_1_1_1 = new JLabel("FOOD ITEMS TABLE");
lblNewLabel_1_1_1_1.setBounds(77, 11, 191, 14);
lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
lblNewLabel_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(lblNewLabel_1_1_1_1);

JLabel label1_2 = new JLabel("Food item no:");
label1_2.setBounds(7, 87, 104, 14);
label1_2.setForeground(Color.WHITE);
label1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(label1_2);

JLabel label2_2 = new JLabel("Description:");
label2_2.setBounds(7, 106, 93, 20);
label2_2.setForeground(Color.WHITE);
label2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(label2_2);

JLabel label3_2 = new JLabel("Price:");
label3_2.setBounds(7, 132, 93, 19);
label3_2.setForeground(Color.WHITE);
label3_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(label3_2);

JLabel label4_2 = new JLabel("Regular code:");
label4_2.setBounds(7, 156, 104, 20);
label4_2.setForeground(Color.WHITE);
label4_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(label4_2);

JLabel label5_2 = new JLabel("Promo code:");
label5_2.setBounds(7, 182, 93, 14);
label5_2.setForeground(Color.WHITE);
label5_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
panel3.add(label5_2);

textField_16 = new JTextField();
textField_16.setBounds(110, 81, 230, 20);
textField_16.setColumns(10);
panel3.add(textField_16);

textField_17 = new JTextField();
textField_17.setBounds(110, 106, 230, 20);
textField_17.setColumns(10);
panel3.add(textField_17);

textField_18 = new JTextField();
textField_18.setBounds(110, 131, 230, 20);
textField_18.setColumns(10);
panel3.add(textField_18);

textField_19 = new JTextField();
textField_19.setBounds(110, 156, 230, 20);
textField_19.setColumns(10);
panel3.add(textField_19);

textField_20 = new JTextField();
textField_20.setBounds(110, 181, 230, 20);
textField_20.setColumns(10);
panel3.add(textField_20);

JPanel panel4 = new JPanel();
panel4.setBackground(new Color(128, 0, 128));
tabbedPane.addTab("Orders", null, panel4, null);
panel4.setLayout(null);

JScrollPane scrollPane_3 = new JScrollPane();
scrollPane_3.setBounds(350, 11, 619, 499);
panel4.add(scrollPane_3);

table_4 = new JTable();
table_4.setBounds(350, 13, 619, 497);
table_4.setBackground(new Color(216, 191, 216));
        model4 = new DefaultTableModel();
        Object[] column4 = {"Order number", "Order date", "Order total", "Cust ID", "Staff ID"};
        final Object[] row4 = new Object[5];
        model4.setColumnIdentifiers(column4);
        table_4.setModel(model4);
        scrollPane_3.setViewportView(table_4);
table_4.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int i = table_4.getSelectedRow();
                textField_24.setText(model4.getValueAt(i, 0).toString());
                textField_25.setText(model4.getValueAt(i, 1).toString());
                textField_26.setText(model4.getValueAt(i, 2).toString());
                textField_27.setText(model4.getValueAt(i, 3).toString());
                textField_28.setText(model4.getValueAt(i, 4).toString());
}
});

JButton btnNewButton_1_2 = new JButton("Add");
btnNewButton_1_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(textField_24.getText().equals("")||textField_25.getText().equals("")||textField_26.getText().equals("")||textField_27.getText().equals("")||textField_28.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please fill complete information");
}
else {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String query = "INSERT INTO F_ORDERS (ORDER_NUMBER,ORDER_DATE,ORDER_TOTAL,CUST_ID,STAFF_ID) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, textField_24.getText());
                pst.setString(2, textField_25.getText());
                pst.setString(3, textField_26.getText());
                pst.setString(4, textField_27.getText());
                pst.setString(5, textField_28.getText());
                pst.executeUpdate();
row4[0]=textField_24.getText();
row4[1]=textField_25.getText();
row4[2]=textField_26.getText();
row4[3]=textField_27.getText();
row4[4]=textField_28.getText();
model4.addRow(row4);
textField_24.setText("");
textField_25.setText("");
textField_26.setText("");
textField_27.setText("");
textField_28.setText("");
JOptionPane.showMessageDialog(null,"Saved sucessfully!");} catch (SQLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}}
}
});
btnNewButton_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnNewButton_1_2.setBounds(36, 321, 117, 47);
panel4.add(btnNewButton_1_2);

JButton btnDelete_1_2 = new JButton("Delete");
btnDelete_1_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_4.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "DELETE FROM F_ORDERS WHERE ORDER_NUMBER=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, model4.getValueAt(i, 0).toString());
               pst.executeUpdate();
               model4.removeRow(i);
               JOptionPane.showMessageDialog(null, "Deleted successfully!");
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnDelete_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnDelete_1_2.setBounds(36, 393, 117, 45);
panel4.add(btnDelete_1_2);

JButton btnView_1_2 = new JButton("View All");
btnView_1_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
           String query = "SELECT * FROM F_ORDERS";
           PreparedStatement pst = conn.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           model4.setRowCount(0);
           while (rs.next()) {
               Object[] row4 = {
                   rs.getString("ORDER_NUMBER"),
                   rs.getString("ORDER_DATE"),
                   rs.getString("ORDER_TOTAL"),
                   rs.getString("CUST_ID"),
                   rs.getString("STAFF_ID"),
               };
               model4.addRow(row4);
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
       }
}

});
btnView_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnView_1_2.setBounds(133, 460, 104, 47);
panel4.add(btnView_1_2);

JButton btnClear_1_2 = new JButton("Clear");
btnClear_1_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_24.setText("");
textField_25.setText("");
textField_26.setText("");
textField_27.setText("");
textField_28.setText("");
}
});
btnClear_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnClear_1_2.setBounds(208, 393, 104, 45);
panel4.add(btnClear_1_2);

JButton btnUpdate_1_2 = new JButton("Update");
btnUpdate_1_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_4.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "UPDATE F_ORDERS SET ORDER_NUMBER=?,ORDER_DATE=?,ORDER_TOTAL=?,CUST_ID=?,STAFF_ID=? WHERE ORDER_NUMBER=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, textField_24.getText());
               pst.setString(2, textField_25.getText());
               pst.setString(3, textField_26.getText());
               pst.setString(4, textField_27.getText());
               pst.setString(5, textField_28.getText());
             
               pst.setString(6, model4.getValueAt(i, 0).toString());
               
               pst.executeUpdate();

           
               model4.setValueAt(textField_24.getText(), i, 0);
               model4.setValueAt(textField_25.getText(), i, 1);
               model4.setValueAt(textField_26.getText(), i, 2);
               model4.setValueAt(textField_27.getText(), i, 3);
               model4.setValueAt(textField_28.getText(), i, 4);
           
               
               JOptionPane.showMessageDialog(null, "Updated successfully!");

           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnUpdate_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnUpdate_1_2.setBounds(208, 321, 104, 47);
panel4.add(btnUpdate_1_2);

JLabel lblNewLabel_1_1_1_2 = new JLabel("ORDERS TABLE");
lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
lblNewLabel_1_1_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
lblNewLabel_1_1_1_2.setBounds(80, 11, 191, 14);
panel4.add(lblNewLabel_1_1_1_2);

JLabel label1_3 = new JLabel("Order no:");
label1_3.setForeground(Color.WHITE);
label1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label1_3.setBounds(10, 103, 93, 14);
panel4.add(label1_3);

JLabel label2_3 = new JLabel("Order date:");
label2_3.setForeground(Color.WHITE);
label2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label2_3.setBounds(10, 128, 93, 14);
panel4.add(label2_3);

JLabel label3_3 = new JLabel("Order total:");
label3_3.setForeground(Color.WHITE);
label3_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label3_3.setBounds(10, 153, 93, 14);
panel4.add(label3_3);

JLabel label4_3 = new JLabel("Cust ID:");
label4_3.setForeground(Color.WHITE);
label4_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label4_3.setBounds(10, 178, 93, 14);
panel4.add(label4_3);

JLabel label5_3 = new JLabel("Staff ID:");
label5_3.setForeground(Color.WHITE);
label5_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label5_3.setBounds(10, 203, 93, 14);
panel4.add(label5_3);

textField_24 = new JTextField();
textField_24.setColumns(10);
textField_24.setBounds(111, 97, 229, 20);
panel4.add(textField_24);

textField_25 = new JTextField();
textField_25.setColumns(10);
textField_25.setBounds(111, 122, 229, 20);
panel4.add(textField_25);

textField_26 = new JTextField();
textField_26.setColumns(10);
textField_26.setBounds(111, 147, 229, 20);
panel4.add(textField_26);

textField_27 = new JTextField();
textField_27.setColumns(10);
textField_27.setBounds(111, 172, 229, 20);
panel4.add(textField_27);

textField_28 = new JTextField();
textField_28.setColumns(10);
textField_28.setBounds(111, 197, 229, 20);
panel4.add(textField_28);

JPanel panel5 = new JPanel();
panel5.setBackground(new Color(128, 0, 128));
tabbedPane.addTab("Order lines", null, panel5, null);
panel5.setLayout(null);

JScrollPane scrollPane_4 = new JScrollPane();
scrollPane_4.setBounds(350, 11, 619, 499);
panel5.add(scrollPane_4);

table_5 = new JTable();
table_5.setBounds(350, 13, 619, 497);
table_5.setBackground(new Color(216, 191, 216));
        model5 = new DefaultTableModel();
        Object[] column5 = {"Order number", "Food item number", "Quantity"};
        final Object[] row5 = new Object[3];
        model5.setColumnIdentifiers(column5);
        table_5.setModel(model5);
        scrollPane_4.setViewportView(table_5);
table_5.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int i = table_5.getSelectedRow();
                textField_32.setText(model5.getValueAt(i, 0).toString());
                textField_33.setText(model5.getValueAt(i, 1).toString());
                textField_34.setText(model5.getValueAt(i, 2).toString());
}
});


JButton btnNewButton_1_3 = new JButton("Add");
btnNewButton_1_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(textField_32.getText().equals("")||textField_33.getText().equals("")||textField_34.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please fill complete information");
}
else {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String query = "INSERT INTO F_ORDER_LINES (ORDER_NUMBER,FOOD_ITEM_NUMBER,QUANTITY) VALUES (?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, textField_32.getText());
                pst.setString(2, textField_33.getText());
                pst.setString(3, textField_34.getText());
                pst.executeUpdate();
row5[0]=textField_32.getText();
row5[1]=textField_33.getText();
row5[2]=textField_34.getText();
model5.addRow(row5);
textField_32.setText("");
textField_33.setText("");
textField_34.setText("");
JOptionPane.showMessageDialog(null,"Saved sucessfully!");} catch (SQLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}}
}
});
btnNewButton_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnNewButton_1_3.setBounds(40, 321, 117, 47);
panel5.add(btnNewButton_1_3);

JButton btnDelete_1_3 = new JButton("Delete");
btnDelete_1_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_5.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "DELETE FROM F_ORDER_LINES WHERE ORDER_NUMBER=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, model5.getValueAt(i, 0).toString());
               pst.executeUpdate();
               model5.removeRow(i);
               JOptionPane.showMessageDialog(null, "Deleted successfully!");
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnDelete_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnDelete_1_3.setBounds(40, 393, 117, 45);
panel5.add(btnDelete_1_3);

JButton btnView_1_3 = new JButton("View All");
btnView_1_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
           String query = "SELECT * FROM F_ORDER_LINES";
           PreparedStatement pst = conn.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           model5.setRowCount(0);
           while (rs.next()) {
               Object[] row5 = {
                   rs.getString("ORDER_NUMBER"),
                   rs.getString("FOOD_ITEM_NUMBER"),
                   rs.getString("QUANTITY"),
               };
               model5.addRow(row5);
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
       }
}
});
btnView_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnView_1_3.setBounds(137, 460, 104, 47);
panel5.add(btnView_1_3);

JButton btnClear_1_3 = new JButton("Clear");
btnClear_1_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_32.setText("");
textField_33.setText("");
textField_34.setText("");
}
});
btnClear_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnClear_1_3.setBounds(212, 393, 104, 45);
panel5.add(btnClear_1_3);

JButton btnUpdate_1_3 = new JButton("Update");
btnUpdate_1_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_5.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "UPDATE F_ORDER_LINES SET ORDER_NUMBER=?,FOOD_ITEM_NUMBER=?,QUANTITY=? WHERE ORDER_NUMBER=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, textField_32.getText());
               pst.setString(2, textField_33.getText());
               pst.setString(3, textField_34.getText());
             
               pst.setString(4, model5.getValueAt(i, 0).toString());
               
               pst.executeUpdate();

           
               model5.setValueAt(textField_32.getText(), i, 0);
               model5.setValueAt(textField_33.getText(), i, 1);
               model5.setValueAt(textField_34.getText(), i, 2);
             
               
               JOptionPane.showMessageDialog(null, "Updated successfully!");

           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnUpdate_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnUpdate_1_3.setBounds(212, 321, 104, 47);
panel5.add(btnUpdate_1_3);

JLabel lblNewLabel_1_1_1_3 = new JLabel("ORDER LINES TABLE");
lblNewLabel_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1_1_1_3.setForeground(Color.WHITE);
lblNewLabel_1_1_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
lblNewLabel_1_1_1_3.setBounds(67, 11, 191, 14);
panel5.add(lblNewLabel_1_1_1_3);

JLabel label1_4 = new JLabel("Order no:");
label1_4.setForeground(Color.WHITE);
label1_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label1_4.setBounds(10, 115, 93, 14);
panel5.add(label1_4);

JLabel label2_4 = new JLabel("Food item no:");
label2_4.setForeground(Color.WHITE);
label2_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label2_4.setBounds(10, 140, 104, 14);
panel5.add(label2_4);

JLabel label3_4 = new JLabel("Quantity:");
label3_4.setForeground(Color.WHITE);
label3_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label3_4.setBounds(10, 165, 93, 20);
panel5.add(label3_4);

textField_32 = new JTextField();
textField_32.setColumns(10);
textField_32.setBounds(124, 109, 216, 20);
panel5.add(textField_32);

textField_33 = new JTextField();
textField_33.setColumns(10);
textField_33.setBounds(124, 134, 216, 20);
panel5.add(textField_33);

textField_34 = new JTextField();
textField_34.setColumns(10);
textField_34.setBounds(124, 159, 216, 20);
panel5.add(textField_34);

JPanel panel6 = new JPanel();
panel6.setBackground(new Color(128, 0, 128));
tabbedPane.addTab("Promotional menus", null, panel6, null);
panel6.setLayout(null);

JScrollPane scrollPane_5 = new JScrollPane();
scrollPane_5.setBounds(350, 11, 619, 499);
panel6.add(scrollPane_5);

table_6 = new JTable();
table_6.setBounds(350, 13, 619, 497);
table_6.setBackground(new Color(216, 191, 216));
        model6 = new DefaultTableModel();
        Object[] column6 = {"Code", "Name", "Start date", "End date", "Give away"};
        final Object[] row6 = new Object[5];
        model6.setColumnIdentifiers(column6);
        table_6.setModel(model6);
        scrollPane_5.setViewportView(table_6);
table_6.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int i = table_6.getSelectedRow();
                textField_40.setText(model6.getValueAt(i, 0).toString());
                textField_41.setText(model6.getValueAt(i, 1).toString());
                textField_42.setText(model6.getValueAt(i, 2).toString());
                textField_43.setText(model6.getValueAt(i, 3).toString());
                textField_44.setText(model6.getValueAt(i, 4).toString());
}
});

JButton btnNewButton_1_4 = new JButton("Add");
btnNewButton_1_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(textField_40.getText().equals("")||textField_41.getText().equals("")||textField_42.getText().equals("")||textField_43.getText().equals("")||textField_44.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please fill complete information");
}
else {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String query = "INSERT INTO F_PROMOTIONAL_MENUS (CODE,NAME,START_DATE,END_DATE,GIVE_AWAY) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, textField_40.getText());
                pst.setString(2, textField_41.getText());
                pst.setString(3, textField_42.getText());
                pst.setString(4, textField_43.getText());
                pst.setString(5, textField_44.getText());
                pst.executeUpdate();
row6[0]=textField_40.getText();
row6[1]=textField_41.getText();
row6[2]=textField_42.getText();
row6[3]=textField_43.getText();
row6[4]=textField_44.getText();
model6.addRow(row6);
textField_40.setText("");
textField_41.setText("");
textField_42.setText("");
textField_43.setText("");
textField_44.setText("");
JOptionPane.showMessageDialog(null,"Saved sucessfully!");} catch (SQLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}}
}
});
btnNewButton_1_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnNewButton_1_4.setBounds(34, 321, 117, 47);
panel6.add(btnNewButton_1_4);

JButton btnDelete_1_4 = new JButton("Delete");
btnDelete_1_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_6.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "DELETE FROM F_PROMOTIONAL_MENUS WHERE CODE=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, model6.getValueAt(i, 0).toString());
               pst.executeUpdate();
               model6.removeRow(i);
               JOptionPane.showMessageDialog(null, "Deleted successfully!");
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnDelete_1_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnDelete_1_4.setBounds(34, 393, 117, 45);
panel6.add(btnDelete_1_4);

JButton btnView_1_4 = new JButton("View All");
btnView_1_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
           String query = "SELECT * FROM F_PROMOTIONAL_MENUS";
           PreparedStatement pst = conn.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           model6.setRowCount(0);
           while (rs.next()) {
               Object[] row6 = {
                   rs.getString("CODE"),
                   rs.getString("NAME"),
                   rs.getString("START_DATE"),
                   rs.getString("END_DATE"),
                   rs.getString("GIVE_AWAY")
               };
               model6.addRow(row6);
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
       }
}
});
btnView_1_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnView_1_4.setBounds(131, 460, 104, 47);
panel6.add(btnView_1_4);

JButton btnClear_1_4 = new JButton("Clear");
btnClear_1_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_40.setText("");
textField_41.setText("");
textField_42.setText("");
textField_43.setText("");
textField_44.setText("");

}
});
btnClear_1_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnClear_1_4.setBounds(206, 393, 104, 45);
panel6.add(btnClear_1_4);

JButton btnUpdate_1_4 = new JButton("Update");
btnUpdate_1_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_6.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "UPDATE F_PROMOTIONAL_MENUS SET CODE=?,NAME=?,START_DATE=?,END_DATE=?,GIVE_AWAY=? WHERE CODE=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, textField_40.getText());
               pst.setString(2, textField_41.getText());
               pst.setString(3, textField_42.getText());
               pst.setString(4, textField_43.getText());
               pst.setString(5, textField_44.getText());
             
               pst.setString(6, model6.getValueAt(i, 0).toString());
               
               pst.executeUpdate();

           
               model6.setValueAt(textField_40.getText(), i, 0);
               model6.setValueAt(textField_41.getText(), i, 1);
               model6.setValueAt(textField_42.getText(), i, 2);
               model6.setValueAt(textField_43.getText(), i, 3);
               model6.setValueAt(textField_44.getText(), i, 4);
           
               
               JOptionPane.showMessageDialog(null, "Updated successfully!");

           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnUpdate_1_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnUpdate_1_4.setBounds(206, 321, 104, 47);
panel6.add(btnUpdate_1_4);

JLabel lblNewLabel_1_1_1_4 = new JLabel("PROMOTIONAL MENUS TABLE");
lblNewLabel_1_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1_1_1_4.setForeground(Color.WHITE);
lblNewLabel_1_1_1_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
lblNewLabel_1_1_1_4.setBounds(34, 11, 276, 14);
panel6.add(lblNewLabel_1_1_1_4);

JLabel label1_5 = new JLabel("Code:");
label1_5.setForeground(Color.WHITE);
label1_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label1_5.setBounds(10, 99, 93, 14);
panel6.add(label1_5);

JLabel label2_5 = new JLabel("Name:");
label2_5.setForeground(Color.WHITE);
label2_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label2_5.setBounds(10, 124, 93, 14);
panel6.add(label2_5);

JLabel label3_5 = new JLabel("Start date:");
label3_5.setForeground(Color.WHITE);
label3_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label3_5.setBounds(10, 149, 93, 14);
panel6.add(label3_5);

JLabel label4_5 = new JLabel("End date:");
label4_5.setForeground(Color.WHITE);
label4_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label4_5.setBounds(10, 174, 93, 14);
panel6.add(label4_5);

JLabel label5_5 = new JLabel("Give away:");
label5_5.setForeground(Color.WHITE);
label5_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label5_5.setBounds(10, 199, 93, 14);
panel6.add(label5_5);

textField_40 = new JTextField();
textField_40.setColumns(10);
textField_40.setBounds(99, 93, 242, 20);
panel6.add(textField_40);

textField_41 = new JTextField();
textField_41.setColumns(10);
textField_41.setBounds(99, 118, 242, 20);
panel6.add(textField_41);

textField_42 = new JTextField();
textField_42.setColumns(10);
textField_42.setBounds(99, 143, 242, 20);
panel6.add(textField_42);

textField_43 = new JTextField();
textField_43.setColumns(10);
textField_43.setBounds(99, 168, 242, 20);
panel6.add(textField_43);

textField_44 = new JTextField();
textField_44.setColumns(10);
textField_44.setBounds(99, 193, 242, 20);
panel6.add(textField_44);

JPanel panel7 = new JPanel();
panel7.setBackground(new Color(128, 0, 128));
tabbedPane.addTab("Regular menus", null, panel7, null);
panel7.setLayout(null);

JScrollPane scrollPane_6 = new JScrollPane();
scrollPane_6.setBounds(350, 11, 619, 499);
panel7.add(scrollPane_6);

table_7 = new JTable();
table_7.setBounds(350, 13, 619, 497);
table_7.setBackground(new Color(216, 191, 216));
        model7 = new DefaultTableModel();
        Object[] column7 = {"Code", "Type", "Hours served"};
        final Object[] row7 = new Object[3];
        model7.setColumnIdentifiers(column7);
        table_7.setModel(model7);
        scrollPane_6.setViewportView(table_7);
table_7.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int i = table_7.getSelectedRow();
                textField_31.setText(model7.getValueAt(i, 0).toString());
                textField_30.setText(model7.getValueAt(i, 1).toString());
                textField_29.setText(model7.getValueAt(i, 2).toString());
}
});

JButton btnNewButton_1_5 = new JButton("Add");
btnNewButton_1_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(textField_31.getText().equals("")||textField_30.getText().equals("")||textField_29.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please fill complete information");
}
else {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String query = "INSERT INTO F_REGULAR_MENUS (CODE,TYPE,HOURS_SERVED) VALUES (?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, textField_31.getText());
                pst.setString(2, textField_30.getText());
                pst.setString(3, textField_29.getText());
                pst.executeUpdate();
row7[0]=textField_31.getText();
row7[1]=textField_30.getText();
row7[2]=textField_29.getText();
model7.addRow(row7);
textField_31.setText("");
textField_30.setText("");
textField_29.setText("");
JOptionPane.showMessageDialog(null,"Saved sucessfully!");} catch (SQLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}}
}
});
btnNewButton_1_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnNewButton_1_5.setBounds(42, 321, 117, 47);
panel7.add(btnNewButton_1_5);

JButton btnDelete_1_5 = new JButton("Delete");
btnDelete_1_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_7.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "DELETE FROM F_REGULAR_MENUS WHERE CODE=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, model7.getValueAt(i, 0).toString());
               pst.executeUpdate();
               model7.removeRow(i);
               JOptionPane.showMessageDialog(null, "Deleted successfully!");
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnDelete_1_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnDelete_1_5.setBounds(42, 393, 117, 45);
panel7.add(btnDelete_1_5);

JButton btnView_1_5 = new JButton("View All");
btnView_1_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
           String query = "SELECT * FROM F_REGULAR_MENUS";
           PreparedStatement pst = conn.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           model7.setRowCount(0);
           while (rs.next()) {
               Object[] row7 = {
                   rs.getString("CODE"),
                   rs.getString("TYPE"),
                   rs.getString("HOURS_SERVED"),
               };
               model7.addRow(row7);
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
       }
}
});
btnView_1_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnView_1_5.setBounds(139, 460, 104, 47);
panel7.add(btnView_1_5);

JButton btnClear_1_5 = new JButton("Clear");
btnClear_1_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_31.setText("");
textField_30.setText("");
textField_29.setText("");
}
});
btnClear_1_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnClear_1_5.setBounds(214, 393, 104, 45);
panel7.add(btnClear_1_5);

JButton btnUpdate_1_5 = new JButton("Update");
btnUpdate_1_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_7.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "UPDATE F_REGULAR_MENUS SET CODE=?,TYPE=?,HOURS_SERVED=? WHERE CODE=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, textField_31.getText());
               pst.setString(2, textField_30.getText());
               pst.setString(3, textField_29.getText());
             
               pst.setString(4, model7.getValueAt(i, 0).toString());
               
               pst.executeUpdate();

           
               model7.setValueAt(textField_31.getText(), i, 0);
               model7.setValueAt(textField_30.getText(), i, 1);
               model7.setValueAt(textField_29.getText(), i, 2);
             
               
               JOptionPane.showMessageDialog(null, "Updated successfully!");

           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnUpdate_1_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnUpdate_1_5.setBounds(214, 321, 104, 47);
panel7.add(btnUpdate_1_5);

JLabel lblNewLabel_1_1_1_5 = new JLabel("REGULAR MENUS TABLE");
lblNewLabel_1_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1_1_1_5.setForeground(Color.WHITE);
lblNewLabel_1_1_1_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
lblNewLabel_1_1_1_5.setBounds(75, 11, 191, 14);
panel7.add(lblNewLabel_1_1_1_5);

JLabel label1_4_2 = new JLabel("Code:");
label1_4_2.setForeground(Color.WHITE);
label1_4_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label1_4_2.setBounds(10, 124, 93, 14);
panel7.add(label1_4_2);

JLabel label2_4_2 = new JLabel("Type:");
label2_4_2.setForeground(Color.WHITE);
label2_4_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label2_4_2.setBounds(10, 149, 104, 14);
panel7.add(label2_4_2);

JLabel label3_4_2 = new JLabel("Hours served:");
label3_4_2.setForeground(Color.WHITE);
label3_4_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label3_4_2.setBounds(10, 174, 117, 14);
panel7.add(label3_4_2);

textField_29 = new JTextField();
textField_29.setColumns(10);
textField_29.setBounds(124, 168, 216, 20);
panel7.add(textField_29);

textField_30 = new JTextField();
textField_30.setColumns(10);
textField_30.setBounds(124, 143, 216, 20);
panel7.add(textField_30);

textField_31 = new JTextField();
textField_31.setColumns(10);
textField_31.setBounds(124, 118, 216, 20);
panel7.add(textField_31);

JPanel panel8 = new JPanel();
panel8.setBackground(new Color(128, 0, 128));
tabbedPane.addTab("Shifts", null, panel8, null);
panel8.setLayout(null);

JScrollPane scrollPane_7 = new JScrollPane();
scrollPane_7.setBounds(350, 11, 619, 499);
panel8.add(scrollPane_7);

table_8 = new JTable();
table_8.setBounds(350, 13, 619, 497);
table_8.setBackground(new Color(216, 191, 216));
        model8 = new DefaultTableModel();
        Object[] column8 = {"Code", "Type", "Hours served"};
        final Object[] row8 = new Object[3];
        model8.setColumnIdentifiers(column8);
        table_8.setModel(model8);
        scrollPane_7.setViewportView(table_8);
table_8.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int i = table_8.getSelectedRow();
                textField_23.setText(model8.getValueAt(i, 0).toString());
                textField_22.setText(model8.getValueAt(i, 1).toString());
}
});

JButton btnNewButton_1_6 = new JButton("Add");
btnNewButton_1_6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(textField_23.getText().equals("")||textField_22.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please fill complete information");
}
else {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String query = "INSERT INTO F_SHIFTS (CODE,DESCRIPTION) VALUES (?, ?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, textField_23.getText());
                pst.setString(2, textField_22.getText());
             
                pst.executeUpdate();
row8[0]=textField_23.getText();
row8[1]=textField_22.getText();

model8.addRow(row8);
textField_23.setText("");
textField_22.setText("");

JOptionPane.showMessageDialog(null,"Saved sucessfully!");} catch (SQLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}}
}
});
btnNewButton_1_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnNewButton_1_6.setBounds(46, 321, 117, 47);
panel8.add(btnNewButton_1_6);

JButton btnDelete_1_6 = new JButton("Delete");
btnDelete_1_6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_8.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "DELETE FROM F_SHIFTS WHERE CODE=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, model8.getValueAt(i, 0).toString());
               pst.executeUpdate();
               model8.removeRow(i);
               JOptionPane.showMessageDialog(null, "Deleted successfully!");
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnDelete_1_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnDelete_1_6.setBounds(46, 393, 117, 45);
panel8.add(btnDelete_1_6);

JButton btnView_1_6 = new JButton("View All");
btnView_1_6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
           String query = "SELECT * FROM F_SHIFTS";
           PreparedStatement pst = conn.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           model8.setRowCount(0);
           while (rs.next()) {
               Object[] row8 = {
                   rs.getString("CODE"),
                   rs.getString("DESCRIPTION"),
                   
               };
               model8.addRow(row8);
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
       }
}
});
btnView_1_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnView_1_6.setBounds(143, 460, 104, 47);
panel8.add(btnView_1_6);

JButton btnClear_1_6 = new JButton("Clear");
btnClear_1_6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_23.setText("");
textField_22.setText("");
}
});
btnClear_1_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnClear_1_6.setBounds(218, 393, 104, 45);
panel8.add(btnClear_1_6);

JButton btnUpdate_1_6 = new JButton("Update");
btnUpdate_1_6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_8.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "UPDATE F_SHIFTS SET CODE=?,DESCRIPTION=? WHERE CODE=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, textField_23.getText());
               pst.setString(2, textField_22.getText());
             
             
               pst.setString(3, model8.getValueAt(i, 0).toString());
               
               pst.executeUpdate();

           
               model8.setValueAt(textField_23.getText(), i, 0);
               model8.setValueAt(textField_22.getText(), i, 1);
             
             
               
               JOptionPane.showMessageDialog(null, "Updated successfully!");

           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }

}
});
btnUpdate_1_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnUpdate_1_6.setBounds(218, 321, 104, 47);
panel8.add(btnUpdate_1_6);

JLabel lblNewLabel_1_1_1_6 = new JLabel("SHIFTS TABLE");
lblNewLabel_1_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1_1_1_6.setForeground(Color.WHITE);
lblNewLabel_1_1_1_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
lblNewLabel_1_1_1_6.setBounds(72, 11, 191, 14);
panel8.add(lblNewLabel_1_1_1_6);

JLabel label1_4_1 = new JLabel("Code:");
label1_4_1.setForeground(Color.WHITE);
label1_4_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label1_4_1.setBounds(10, 111, 93, 14);
panel8.add(label1_4_1);

JLabel label2_4_1 = new JLabel("Description:");
label2_4_1.setForeground(Color.WHITE);
label2_4_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label2_4_1.setBounds(10, 136, 104, 14);
panel8.add(label2_4_1);

textField_22 = new JTextField();
textField_22.setColumns(10);
textField_22.setBounds(124, 130, 216, 20);
panel8.add(textField_22);

textField_23 = new JTextField();
textField_23.setColumns(10);
textField_23.setBounds(124, 105, 216, 20);
panel8.add(textField_23);

JPanel panel9 = new JPanel();
panel9.setBackground(new Color(128, 0, 128));
tabbedPane.addTab("Shift assignments", null, panel9, null);
panel9.setLayout(null);

JScrollPane scrollPane_8 = new JScrollPane();
scrollPane_8.setBounds(350, 11, 619, 499);
panel9.add(scrollPane_8);

table_9 = new JTable();
table_9.setBounds(350, 13, 619, 497);
table_9.setBackground(new Color(216, 191, 216));
        model9 = new DefaultTableModel();
        Object[] column9 = {"Code", "ID", "SHIFT_ASSIGN_DATE"};
        final Object[] row9 = new Object[3];
        model9.setColumnIdentifiers(column9);
        table_9.setModel(model9);
        scrollPane_8.setViewportView(table_9);
table_9.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int i = table_9.getSelectedRow();
                textField_36.setText(model9.getValueAt(i, 0).toString());
                textField_35.setText(model9.getValueAt(i, 1).toString());
                textField_21.setText(model9.getValueAt(i, 2).toString());
}
});

JButton btnNewButton_1_7 = new JButton("Add");
btnNewButton_1_7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(textField_36.getText().equals("")||textField_35.getText().equals("")||textField_21.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please fill complete information");
}
else {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String query = "INSERT INTO F_SHIFT_ASSIGNMENTS (CODE,ID,SHIFT_ASSIGN_DATE) VALUES (?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, textField_36.getText());
                pst.setString(2, textField_35.getText());
                pst.setString(3, textField_21.getText());
                pst.executeUpdate();
row9[0]=textField_36.getText();
row9[1]=textField_35.getText();
row9[2]=textField_21.getText();
model9.addRow(row9);
textField_36.setText("");
textField_35.setText("");
textField_21.setText("");
JOptionPane.showMessageDialog(null,"Saved sucessfully!");} catch (SQLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}}
}
});
btnNewButton_1_7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnNewButton_1_7.setBounds(33, 324, 117, 47);
panel9.add(btnNewButton_1_7);

JButton btnDelete_1_7 = new JButton("Delete");
btnDelete_1_7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_9.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "DELETE FROM F_SHIFT_ASSIGNMENTS WHERE CODE=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, model9.getValueAt(i, 0).toString());
               pst.executeUpdate();
               model9.removeRow(i);
               JOptionPane.showMessageDialog(null, "Deleted successfully!");
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnDelete_1_7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnDelete_1_7.setBounds(33, 396, 117, 45);
panel9.add(btnDelete_1_7);

JButton btnView_1_7 = new JButton("View All");
btnView_1_7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
           String query = "SELECT * FROM F_SHIFT_ASSIGNMENTS";
           PreparedStatement pst = conn.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           model9.setRowCount(0);
           while (rs.next()) {
               Object[] row9 = {
                   rs.getString("CODE"),
                   rs.getString("ID"),
                   rs.getString("SHIFT_ASSIGN_DATE"),
               };
               model9.addRow(row9);
           }
       } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
       }
}
});
btnView_1_7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnView_1_7.setBounds(130, 463, 104, 47);
panel9.add(btnView_1_7);

JButton btnClear_1_7 = new JButton("Clear");
btnClear_1_7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_36.setText("");
textField_35.setText("");
textField_21.setText("");
}
});
btnClear_1_7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnClear_1_7.setBounds(205, 396, 104, 45);
panel9.add(btnClear_1_7);

JButton btnUpdate_1_7 = new JButton("Update");
btnUpdate_1_7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int i = table_9.getSelectedRow();
       if (i >= 0) {
           try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
               String query = "UPDATE F_SHIFT_ASSIGNMENTS SET CODE=?,ID=?,SHIFT_ASSIGN_DATE=? WHERE CODE=?";
               PreparedStatement pst = conn.prepareStatement(query);
               pst.setString(1, textField_36.getText());
               pst.setString(2, textField_35.getText());
               pst.setString(3, textField_21.getText());
             
               pst.setString(4, model9.getValueAt(i, 0).toString());
               
               pst.executeUpdate();

           
               model9.setValueAt(textField_36.getText(), i, 0);
               model9.setValueAt(textField_35.getText(), i, 1);
               model9.setValueAt(textField_21.getText(), i, 2);
             
               
               JOptionPane.showMessageDialog(null, "Updated successfully!");

           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } else {
           JOptionPane.showMessageDialog(null, "Please select a row first");
       }
}
});
btnUpdate_1_7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
btnUpdate_1_7.setBounds(205, 324, 104, 47);
panel9.add(btnUpdate_1_7);

JLabel lblNewLabel_1_1_1_7 = new JLabel("SHIFT ASSIGNMENTS TABLE");
lblNewLabel_1_1_1_7.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1_1_1_7.setForeground(Color.WHITE);
lblNewLabel_1_1_1_7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
lblNewLabel_1_1_1_7.setBounds(56, 11, 234, 14);
panel9.add(lblNewLabel_1_1_1_7);

JLabel label1_4_2_1 = new JLabel("Code:");
label1_4_2_1.setForeground(Color.WHITE);
label1_4_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label1_4_2_1.setBounds(10, 134, 93, 14);
panel9.add(label1_4_2_1);

JLabel label2_4_2_1 = new JLabel("ID:");
label2_4_2_1.setForeground(Color.WHITE);
label2_4_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label2_4_2_1.setBounds(10, 159, 104, 14);
panel9.add(label2_4_2_1);

JLabel label3_4_2_1 = new JLabel("Shift assign date:");
label3_4_2_1.setForeground(Color.WHITE);
label3_4_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
label3_4_2_1.setBounds(10, 184, 140, 14);
panel9.add(label3_4_2_1);

textField_21 = new JTextField();
textField_21.setColumns(10);
textField_21.setBounds(145, 178, 195, 20);
panel9.add(textField_21);

textField_35 = new JTextField();
textField_35.setColumns(10);
textField_35.setBounds(145, 153, 195, 20);
panel9.add(textField_35);

textField_36 = new JTextField();
textField_36.setColumns(10);
textField_36.setBounds(145, 128, 195, 20);
panel9.add(textField_36);

JLabel lblNewLabel = new JLabel("Global Fast Food");
lblNewLabel.setForeground(new Color(128, 0, 128));
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
lblNewLabel.setBounds(367, 11, 273, 24);
contentPane.add(lblNewLabel);
}
}<table><tr><td></td></tr></table>