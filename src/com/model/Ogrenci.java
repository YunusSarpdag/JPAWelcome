package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ogrenci database table.
 * 
 */
@Entity
@NamedQuery(name="Ogrenci.findAll", query="SELECT o FROM Ogrenci o")
public class Ogrenci implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int idogrenci;

	private String ogrencibolum;

	private String ogrenciname;

	private String ogrencisurename;

	public Ogrenci() {
	}

	public int getIdogrenci() {
		return this.idogrenci;
	}

	public void setIdogrenci(int idogrenci) {
		this.idogrenci = idogrenci;
	}

	public String getOgrencibolum() {
		return this.ogrencibolum;
	}

	public void setOgrencibolum(String ogrencibolum) {
		this.ogrencibolum = ogrencibolum;
	}

	public String getOgrenciname() {
		return this.ogrenciname;
	}

	public void setOgrenciname(String ogrenciname) {
		this.ogrenciname = ogrenciname;
	}

	public String getOgrencisurename() {
		return this.ogrencisurename;
	}

	public void setOgrencisurename(String ogrencisurename) {
		this.ogrencisurename = ogrencisurename;
	}

}