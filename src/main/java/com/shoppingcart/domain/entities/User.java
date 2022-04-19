package com.shoppingcart.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	public String Id;
	public String Username;
	public String Password;
	public String Salt;
	public String Name;
	public 
}
