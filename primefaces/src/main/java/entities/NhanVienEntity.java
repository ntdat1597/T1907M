package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "nhanvien")
@Getter
@Setter
public class NhanVienEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "HoVaTen")
    private String fullName;

    @Column(name = "TenTaiKhoan")
    private String userName;

    @Column(name = "MatKhau")
    private String passWord;

    @Column(name = "VaiTro")
    private Integer role;

    @Column(name = "Email")
    private String email;

    @Column(name = "GioiTinh")
    private Integer gender;

    @Column(name = "SDT")
    private String phone;

    @Column(name = "CaLamViec")
    private Integer caLamViec;

    @Column(name = "NgayLamViec")
    private Date created;

    @Column(name = "TrangThai")
    private Integer status;

}
