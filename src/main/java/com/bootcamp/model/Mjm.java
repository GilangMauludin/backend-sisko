package com.bootcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mapel_jurusan_map")
public class Mjm {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;
	@Column(name = "KD_MAPEL", length  = 10)
	private String kmapel;
	@Column(name = "KD_JURUSAN", length = 10)
	private String kjur;
	@Column(name = "STATUS", length = 10)
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKmapel() {
		return kmapel;
	}
	public void setKmapel(String kmapel) {
		this.kmapel = kmapel;
	}
	public String getKjur() {
		return kjur;
	}
	public void setKjur(String kjur) {
		this.kjur = kjur;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Mjm [id=" + id + ", kmapel=" + kmapel + ", kjur=" + kjur + ", status=" + status + "]";
	}
	
	

}
