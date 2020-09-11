package controller;

import dao.QLTaiKhoanDAO;
import entities.NhanVienEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;
import sun.management.Util;
import utils.BaseController;
import utils.Constants;
import utils.ExecuteObjectController;
import utils.Utils;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

//View lấy dữ liệu qua cái này @ManagedBean
@ManagedBean(name = "qlTaiKhoanController")
@ViewScoped
@Getter
@Setter
public class QLTaiKhoanController extends BaseController implements
        Serializable, ExecuteObjectController<NhanVienEntity> {
    private NhanVienEntity nhanVienEntity = new NhanVienEntity();
    private QLTaiKhoanDAO service = new QLTaiKhoanDAO();
    //List dữ liệu đón từ DAO - danh sách dữ liệu trong bảng
    private List<NhanVienEntity> list = new ArrayList<>();
    //Hàm khởi tạo sẽ nhảy vào đầu tiên khi bắt đầu vào chức năng
    private int flag;
    private String nhanVien;

    @PostConstruct
    public void init() {
        //Hiển thị dữ liệu ra bảng ngay khi vào chức năng
        onShowData();
    }

    //Hàm lấy dữ liệu ra List từ DAO
    public void onShowData() {
        list = service.onShowData();
    }

    public void onSearch() {
        list = service.onSearchData(getNhanVienEntity());
    }

    public void prepareInsert() {
        flag = 1;
        nhanVienEntity = new NhanVienEntity();
    }

    @Override
    public void onInsert() {
        nhanVienEntity.setPassWord(nhanVien);
        if (service.InsertData(nhanVienEntity)) {
            Utils.addMessage(Constants.INS_SUCCESS);
            onShowData();
            PrimeFaces.current().executeScript("PF('dlgAddEdit').hide()");
        } else {
            Utils.errMessage(Constants.INS_FAIL);
        }
    }

    @Override
    public void onUpdate(NhanVienEntity entity) {
        nhanVienEntity = service.reloadUser(entity);
        flag = 2;
    }

    @Override
    public void onDelete(NhanVienEntity nhanVienEntity) {
        if (service.DeleteData(nhanVienEntity)) {
            Utils.addMessage(Constants.DEL_SUCCESS);
            onShowData();
        } else {
            Utils.errMessage(Constants.DEL_FAIL);
        }
    }


    @Override
    public void resetDialogForm() {
        onShowData();
        nhanVienEntity = new NhanVienEntity();
    }

    @Override
    public void onComfirmUpdate() {
        nhanVienEntity.setPassWord(nhanVien);

        if (service.UpdateData(nhanVienEntity)) {
            Utils.addMessage(Constants.INS_SUCCESS);
            onShowData();
            PrimeFaces.current().executeScript("PF('dlgAddEdit').hide()");
            nhanVienEntity = new NhanVienEntity();
        } else {
            Utils.errMessage(Constants.INS_FAIL);
        }
    }


}
