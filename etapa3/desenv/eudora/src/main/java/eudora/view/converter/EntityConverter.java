package eudora.view.converter;
//package eudora.view.converter;
//
//import java.lang.reflect.Field;
//
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//
//import eudora.model.ID.ID;
//
//@FacesConverter(value = "entityConverter")
//public class EntityConverter implements Converter {
//	public Object getAsObject(FacesContext ctx, UIComponent component,
//			String value) {
//		if (value != null) {
//			return component.getAttributes().get(value);
//		}
//		return null;
//	}
//	public String getAsString(FacesContext ctx, UIComponent component,
//			Object obj) {
//		if (obj != null && !"".equals(obj)) {
//			String id;
//			try {
//				id = this.getId(getClazz(ctx, component), obj);
//				if (id == null){
//					id = "";
//				}
//				id = id.trim();
//				component.getAttributes().put(id,
//						getClazz(ctx, component).cast(obj));
//				return id;
//			} catch (SecurityException e) {
//				e.printStackTrace(); // seu log aqui
//			} catch (IllegalArgumentException e) {
//				e.printStackTrace(); // seu log aqui
//			} catch (NoSuchFieldException e) {
//				e.printStackTrace(); // seu log aqui
//			} catch (IllegalAccessException e) {
//				e.printStackTrace(); // seu log aqui
//			}
//		}
//		return null;
//	}
//	private Class<?> getClazz(FacesContext facesContext, UIComponent component) {
//		return component.getValueExpression("value").getType(
//				facesContext.getELContext());
//	}
//	public String getId(Class<?> clazz, Object obj) throws SecurityException,
//			NoSuchFieldException, IllegalArgumentException,
//			IllegalAccessException {
//		for (Field field : clazz.getSuperclass().getDeclaredFields()) {
//			if ((field.getName().equals("id"))) {
//				Field privateField = clazz.getSuperclass().getDeclaredField(field.getName());
//				privateField.setAccessible(true);
//				if (privateField.get(clazz.cast(obj)) != null) {
//					return (String)field.getType()
//							.cast(privateField.get(clazz.cast(obj))).toString();
//				} else {
//					return null;
//				}
//			}
//		}
//		return null;
//	}
//}