package org.iceberg.model.base;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {
	
	@Id
	@Column(name="ID",unique=true,length=64)
	protected String id;

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}
	
}
