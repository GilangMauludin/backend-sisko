package com.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kelas")
public class Kelas {
	@Id
	
	private int id;
	@Column(name = "KD_KELAS", length = 10)
	private String kode;
	@Column(name = "NM_KELAS", length = 20)
	private String nama;
	@Column(name = "KD_JURUSAN",length = 10)
	private String jurusan;
	@Column(name = "STATUS", length = 10)
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
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Kelas [id=" + id + ", kode=" + kode + ", nama=" + nama + ", jurusan=" + jurusan + ", status=" + status
				+ "]";
	}
	
	

}
