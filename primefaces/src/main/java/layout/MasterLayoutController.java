package layout;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DynamicMenuModel;
import org.primefaces.model.menu.MenuElement;
import org.primefaces.model.menu.MenuModel;
import utils.Constants;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

@ViewScoped
@ManagedBean(name = "masterLayoutController")
@Getter
@Setter
public class MasterLayoutController implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(MasterLayoutController.class);
    private MenuModel mainMenuModel;
    private DefaultMenuItem currentMenu;
    private String priMenu = "";
    public HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext()
            .getSession(true);
    private int activeTabIndex;

    @PostConstruct
    public void init() {
    }

    public MasterLayoutController() {
        if (mainMenuModel == null) {
            mainMenuModel = genMainMenu();
        }
        getCurrentMenu();
    }

    private MenuModel genMainMenu() {
        try {
            mainMenuModel = new DynamicMenuModel();
            mainMenuModel.addElement(
                    new DefaultMenuItem(Constants.HOME, "fa fa-fw fa-home", "index.xhtml"));


            return mainMenuModel;
        } catch (Exception e) {
            logger.error("KHONG LOAD DUOC MENU");
            return null;
        }
    }

    public DefaultMenuItem getCurrentMenu() {
        String path = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();

        if (!priMenu.equals(path)) {
            activeTabIndex = 0;
            priMenu = path;
        }

        List<MenuElement> menuItems = mainMenuModel.getElements();
        for (MenuElement me : menuItems) {
            DefaultMenuItem dmi = (DefaultMenuItem) me;
            if (path.equals(dmi.getUrl().split("\\?")[0])) {
                dmi.setContainerStyleClass("current-menu");
                dmi.setStyleClass("current-menu");
                currentMenu = dmi;
            } else {
                dmi.setStyleClass("uncurrent-menu");
            }
        }
        return currentMenu;
    }

}
