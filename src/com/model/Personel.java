package com.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personel
 *
 */
@Entity

@NamedQueries({ 
	@NamedQuery(name = "getAllPersonel", query = "Select p from Personel p"), 
	@NamedQuery(name = "getSelectyedPersonelByName", 
	query = "Select p from Personel p where p.personelName  =  :personelName") 
})
public class Personel implements Serializable {

	   
	@Id
	@GeneratedValue
	private int personelID;
	private String personelName;
	private String personelSurname;
	private static final long serialVersionUID = 1L;

	public Personel() {
		super();
	}   
	
	public Personel(String personelName, String personelSurname) {
		this.personelName = personelName;
		this.personelSurname = personelSurname;
	}




	public int getPersonelID() {
		return this.personelID;
	}

	public void setPersonelID(int personelID) {
		this.personelID = personelID;
	}   
	public String getPersonelName() {
		return this.personelName;
	}

	public void setPersonelName(String personelName) {
		this.personelName = personelName;
	}   
	public String getPersonelSurename() {
		return this.personelSurname;
	}

	public void setPersonelSurename(String personelSurename) {
		this.personelSurname = personelSurename;
	}
   
}
