package com.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lokasi")
public class Lokasi {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "KD_LOKASI")
	private String kode;
	@Column(name = "NM_LOKASI")
	private String nama;
	@Column(name = "STATUS")
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Lokasi [id=" + id + ", kode=" + kode + ", nama=" + nama + ", status=" + status + "]";
	}
	
	

}
