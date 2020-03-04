package Interface;
import java.sql.ResultSet;
import java.sql.SQLException;
import Proccess.LoaiSP;//Lớp LoaiSP trong Proccess đã thực hiện
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public final class frmCapnhatLoaiSP extends javax.swing.JFrame {
    private final LoaiSP lsp = new LoaiSP();
    private boolean cothem=true;
    private final DefaultTableModel tableModel = new DefaultTableModel();
    private JLabel txtMaloai;
    private JLabel txtTenloai;
    private ButtonModel btThem;
    private ButtonModel btXoa;
    private ButtonModel btSua;
    private ButtonModel btLuu;
    private ButtonModel btKLuu;
    private ButtonModel btThoat;

    //Ham do du lieu vao tableModel
    public void ShowData() throws SQLException{
        ResultSet result= lsp.ShowLoaiSP();
        try {
            while(result.next()){ // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[2];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel
                //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        }
        catch (SQLException e) {
        }
    }
    //Ham xoa du lieu trong tableModel
    public void ClearData() throws SQLException{
        //Lay chi so dong cuoi cung
        int n=tableModel.getRowCount()-1;
        for(int i=n;i>=0;i--)
            tableModel.removeRow(i);//Remove tung dong
    }
    //Ham xoa cac TextField
    private void setNull()
    {
        //Xoa trang cac JtextField
        this.txtMaloai.setText(null);
        this.txtTenloai.setText(null);
        this.txtMaloai.requestFocus();
    }
    //Ham khoa cac TextField
    private void setKhoa(boolean a)
    {
        //Khoa hoac mo khoa cho Cac JTextField
        this.txtMaloai. setEnabled (!a);
        this.txtTenloai. setEnabled (!a);
    }
    //Ham khoa cac Button
    private void setButton(boolean a)
    {
        //Vo hieu hoac co hieu luc cho cac JButton
        this.btThem. setEnabled (a);
        this.btXoa. setEnabled (a);
        this.btSua. setEnabled (a);
        this.btLuu. setEnabled (!a);
        this.btKLuu. setEnabled (!a);
        this.btThoat. setEnabled (a);
    }
    public frmCapnhatLoaiSP() throws SQLException{
        initComponents(); // Khởi tạo các components trên JFrame
        String []colsName = {"Mã Loai", "Tên loai"};
        // đặt tiêu đề cột cho tableModel
        tableModel.setColumnIdentifiers(colsName);
        // kết nối jtable với tableModel
        AbstractButton jTableLoaiSP = null;
        jTableLoaiSP.setModel((ButtonModel) tableModel);
        //gọi hàm ShowData để đưa dữ liệu vào tableModel
        ShowData();
        //goi Ham xoa trang cac TextField
        setNull();
        //Goi ham Khoa cac TextField
        setKhoa(true);
        //Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao
        setButton(true);
    }

    private void initComponents() {

    }

    //Code tu sinh khi thiet ke giao dien va cac code khac ở đây…….
    public static void main(String args[]) throws SQLException {

        frmCapnhatLoaiSP f = new frmCapnhatLoaiSP();
        f.setVisible(true);
    }
}

