package utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import entities.NhanVienEntity;
import lombok.Data;
import org.apache.log4j.Logger;



@ManagedBean(name = "danhmucUtils")
@ViewScoped
@Data
public class Utils implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(Utils.class);

	public List<NhanVienEntity> listGoiDichVu;


	public static void facesError(String message) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
	}

	public static void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Thành công!", summary);
		FacesContext.getCurrentInstance().addMessage("Thành công!", message);
	}

	public static void errMessage(String errMsg) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Thất bại!", errMsg);
		FacesContext.getCurrentInstance().addMessage("Lỗi!", message);
	}



}
