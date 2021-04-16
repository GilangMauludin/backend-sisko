package com.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jurusan")
public class Jurusan {
	@Id
	
	@Column(name = "id")
	private int id;
	@Column(name = "KD_JURUSAN", length = 40)
	private String kode;
	@Column(name = "NM_JURUSAN", length = 50)
	private String nama;
	@Column(name = "STATUS", length = 40)
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
		return "Jurusan [id=" + id + ", kode=" + kode + ", nama=" + nama + ", status=" + status + "]";
	}
	
	

}
