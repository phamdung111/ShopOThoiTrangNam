package ShopOThoiTrangNam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "adminid")
	private String admin;
	
	@Column(name = "adminpassword")
	private String adminPassword;

	public Admin() {
		super();
	}

	public Admin(String admin, String adminPassword) {
		super();
		this.admin = admin;
		this.adminPassword = adminPassword;
	}

	

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
