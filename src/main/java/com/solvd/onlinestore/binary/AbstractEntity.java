package com.solvd.onlinestore.binary;

public class AbstractEntity {
    private long id;

	public AbstractEntity() {
	}
	
	public AbstractEntity(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
