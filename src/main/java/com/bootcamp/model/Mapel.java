package com.bootcamp.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mata_pelajaran")
public class Mapel {
	@Id
	
	@Column(name = "ID")
	
	private int id ;

	@Column(name = "KD_MAPEL", length = 10)
	private String kode;
	@Column(name = "NM_MAPEL", length = 100)
	private String nama;
	
	@Column(name = "STATUS", length = 20)
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
		return "Mapel [id=" + id + ", kode=" + kode + ", nama=" + nama + ", status=" + status
				+ "]";
	}
	
}
