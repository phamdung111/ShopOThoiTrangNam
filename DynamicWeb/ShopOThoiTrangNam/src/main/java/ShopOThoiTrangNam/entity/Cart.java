package ShopOThoiTrangNam.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cart_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fkuser")
	private User users;
	
	@OneToMany(mappedBy = "cart")
	private Set<CartDetails> cartDetails;

	public Cart() {
		super();
	}

	public Cart(int cartId, User users, Set<CartDetails> cartDetails) {
		super();
		this.cartId = cartId;
		this.users = users;
		this.cartDetails = cartDetails;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Set<CartDetails> getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(Set<CartDetails> cartDetails) {
		this.cartDetails = cartDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
