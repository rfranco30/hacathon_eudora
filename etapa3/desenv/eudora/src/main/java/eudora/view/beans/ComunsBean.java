package eudora.view.beans;

import java.util.Locale;

import javax.faces.bean.ManagedBean;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter
@Setter
public class ComunsBean {
	private Locale locale = new Locale("pt", "BR");
	
	
}
