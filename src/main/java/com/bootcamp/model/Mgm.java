package com.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mapel_guru_map")
public class Mgm {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "KD_MAPEL",length = 10)
	private String kMapel;
	@Column(name = "KD_GURU", length = 10)
	private String kGuru;
	@Column(name = "STATUS", length = 20)
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getkMapel() {
		return kMapel;
	}
	public void setkMapel(String kMapel) {
		this.kMapel = kMapel;
	}
	public String getkGuru() {
		return kGuru;
	}
	public void setkGuru(String kGuru) {
		this.kGuru = kGuru;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Mgm [id=" + id + ", kMapel=" + kMapel + ", kGuru=" + kGuru + ", status=" + status + "]";
	}
	
	

}
