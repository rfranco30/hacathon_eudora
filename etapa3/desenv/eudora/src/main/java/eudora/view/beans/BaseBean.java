package eudora.view.beans;

import java.lang.reflect.ParameterizedType;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import eudora.model.BaseModel;
import eudora.model.Usuario;
import eudora.util.Constantes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseBean<T extends BaseModel> {

	private T entity;

	private Class<?> paramTypeEntity;
	private Class<?> paramTypeConection;
	private Long id;

	@PostConstruct
	public void init() {

	}

	public Usuario getUsuarioLogado() {

		return (Usuario) getSession().getAttribute(Constantes.USUARIO_LOGADO);
	}

	public HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	}

	public Object obterERemoverAtributoSession(String nm) {
		Object o = getSession().getAttribute(nm);
		getSession().removeAttribute(nm);
		return o;
	}

	public Object getAtributoSession(String nm) {
		return getSession().getAttribute(nm);
	}

	public String returnHome() {
		return "pretty:home";
	}

	public void doSalvar() {
	//	conection.salvar(entity);
		addMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso", "");
	}

	public void addMessage(FacesMessage.Severity facMesg, String titulo, String msg) {
		if (facMesg == null)
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, titulo, msg));
		else
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(facMesg, titulo, msg));
	}

	protected BaseBean() {

		this.paramTypeEntity = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
		this.paramTypeConection = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];

		try {
			entity = (T) this.paramTypeEntity.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
