package ShopOThoiTrangNam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart_details")
public class CartDetails implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cart_dt_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartDetailsId;
	
	@Column(name = "amount")
	private int amount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fkcart")
	private Cart cart;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fkproductDetailsRepository")
	private ProductDetailsRepository productDetailsRepository;

	public CartDetails() {
		super();
	}
	
	

	public CartDetails(int cartDetailsId, int amount, Cart cart, ProductDetailsRepository productDetailsRepository) {
		super();
		this.cartDetailsId = cartDetailsId;
		this.amount = amount;
		this.cart = cart;
		this.productDetailsRepository = productDetailsRepository;
	}



	public int getCartDetailsId() {
		return cartDetailsId;
	}

	public void setCartDetailsId(int cartDetailsId) {
		this.cartDetailsId = cartDetailsId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public ProductDetailsRepository getProductDetailsRepository() {
		return productDetailsRepository;
	}

	public void setProductDetailsRepository(ProductDetailsRepository productDetailsRepository) {
		this.productDetailsRepository = productDetailsRepository;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
