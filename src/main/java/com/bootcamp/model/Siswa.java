
	package com.bootcamp.model;

	import java.util.Date;
	

	import javax.persistence.Column;
	import javax.persistence.Entity;

	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;
	@Entity
	@Table(name = "siswa")
	public class Siswa {
		
		@Id
		@Column(name = "id")
		private  int id;
	
		@Column(name = "NIS", length = 20)
		private int nis;
		@Column(name = "NAMA", length = 100)
		private String nama;
		@Column(name = "JENIS_KELAMIN", length = 10)
		private String jk;
		@Column(name = "TEMPAT_LAHIR", length = 20)
		private String tptLahir;
		@Temporal(TemporalType.DATE)
		@Column(name = "TANGGAL_LAHIR")
		private Date tglLahir;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNis() {
			return nis;
		}
		public void setNis(int nis) {
			this.nis = nis;
		}
		public String getNama() {
			return nama;
		}
		public void setNama(String nama) {
			this.nama = nama;
		}
		public String getJk() {
			return jk;
		}
		public void setJk(String jk) {
			this.jk = jk;
		}
		public String getTptLahir() {
			return tptLahir;
		}
		public void setTptLahir(String tptLahir) {
			this.tptLahir = tptLahir;
		}
		public Date getTglLahir() {
			return tglLahir;
		}
		public void setTglLahir(Date tglLahir) {
			this.tglLahir = tglLahir;
		}
		@Override
		public String toString() {
			return "Siswa [id=" + id + ", nis=" + nis + ", nama=" + nama + ", jk=" + jk + ", tptLahir=" + tptLahir
					+ ", tglLahir=" + tglLahir + "]";
		}
		
		

	}



