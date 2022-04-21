package ShopOThoiTrangNam.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column(name = "user_address")
	private String userAddress;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_phone")
	private String userPhone;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_password")
	private String userPassword;
	
	@OneToMany(mappedBy = "user")
	private List<Order> orders;

	
	
	public User() {
		super();
	}

	public User(int userId, String userAddress, String userName, String userPhone, String userEmail,
			String userPassword, List<Order> orders) {
		super();
		this.userId = userId;
		this.userAddress = userAddress;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.orders = orders;
	}


	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUserAddress() {
		return userAddress;
	}



	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPhone() {
		return userPhone;
	}



	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<Order> getOrders() {
		return orders;
	}



	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
