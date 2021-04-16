package com.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kelas_lokasi_map")
public class Klm {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="KD_KELAS", length = 10)
	private String kKelas;
	@Column(name = "KD_LOKASI", length = 10)
	private String kLok;
	@Column(name = "STATUS", length = 20)
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getkKelas() {
		return kKelas;
	}
	public void setkKelas(String kKelas) {
		this.kKelas = kKelas;
	}
	public String getkLok() {
		return kLok;
	}
	public void setkLok(String kLok) {
		this.kLok = kLok;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Klm [id=" + id + ", kKelas=" + kKelas + ", kLok=" + kLok + ", status=" + status + "]";
	}
	
	

}
