package eudora.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseModel implements Cloneable  {

	/**
	 * 
	 */
	private Long id;

	@JsonIgnore
	// This method calls Object's clone().
	public BaseModel getClone() {
		try {
			// call clone in Object.
			return (BaseModel) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(" Cloning not allowed. ");
			return this;
		}
	}
}
