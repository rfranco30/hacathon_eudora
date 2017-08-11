package eudora.view.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ocpsoft.pretty.faces.annotation.URLMapping;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@SessionScoped
public class TimelineBean {
	@Getter
	@Setter
	private String teste = "aquiloMesmo";
}
