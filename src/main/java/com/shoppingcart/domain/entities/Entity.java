package com.shoppingcart.domain.entities;

import java.sql.Timestamp;


public class Entity<TPrimaryKey> {
	public TPrimaryKey Id;
	public Timestamp CreatedAt;
	public String CreatedBy;
	public Timestamp UpdatedAt;
	public String UpdatedBy;
	public TPrimaryKey getId() {
		return this.Id;
	}
	public void setId(TPrimaryKey id) {
		this.Id = id;
	}
	public void setCreatedBy(String createdBy) {
		this.CreatedBy = createdBy;
	}
	public String getCreatedBy() {
		return this.CreatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.UpdatedBy = updatedBy;
	}
	public String getUpdatedBy() {
		return this.UpdatedBy;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.CreatedAt = createdAt;
	}
	public Timestamp getCreatedAt() {
		return this.CreatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.UpdatedAt = updatedAt;
	}
	public Timestamp getUpdatedAt() {
		return this.UpdatedAt;
	}
}
