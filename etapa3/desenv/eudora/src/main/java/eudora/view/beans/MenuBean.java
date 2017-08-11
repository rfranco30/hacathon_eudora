package eudora.view.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import eudora.model.Usuario;

@ManagedBean
@ViewScoped
public class MenuBean  extends BaseBean<Usuario>{
	
	@PostConstruct
	public void init() {
		
	}
	
	public String getSaudacao(){
		return "";
	}
}