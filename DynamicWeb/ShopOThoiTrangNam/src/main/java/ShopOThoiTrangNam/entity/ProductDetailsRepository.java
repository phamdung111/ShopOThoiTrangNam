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
@Table(name = "product_details_repository")
public class ProductDetailsRepository implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "p_dt_rp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productDetailsRepositoryId;
	
	@Column(name = "p_size")
	private String productDetailsRepositorySize;
	
	@Column(name = "p_amount")
	private int productDetailsRepositoryAmount;
	
	@Column(name = "p_sales")
	private int productDetailsRepositorySales;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fkproductdetails")
	private ProductDetails productDetails;
	
	@OneToMany(mappedBy = "productDetailsRepository")
	private Set<CartDetails> cartDetails;

//	@OneToMany(mappedBy = "orderDetailsProductDetailsRepository")
//	private Set<ProductDetailsRepository> productDetailsRepositories;
	
	public ProductDetailsRepository() {
		super();
	}

	public ProductDetailsRepository(int productDetailsRepositoryId, String productDetailsRepositorySize,
			int productDetailsRepositoryAmount, int productDetailsRepositorySales, ProductDetails productDetails,
			Set<CartDetails> cartDetails) {
		super();
		this.productDetailsRepositoryId = productDetailsRepositoryId;
		this.productDetailsRepositorySize = productDetailsRepositorySize;
		this.productDetailsRepositoryAmount = productDetailsRepositoryAmount;
		this.productDetailsRepositorySales = productDetailsRepositorySales;
		this.productDetails = productDetails;
		this.cartDetails = cartDetails;
	}

	public int getProductDetailsRepositoryId() {
		return productDetailsRepositoryId;
	}

	public void setProductDetailsRepositoryId(int productDetailsRepositoryId) {
		this.productDetailsRepositoryId = productDetailsRepositoryId;
	}

	public String getProductDetailsRepositorySize() {
		return productDetailsRepositorySize;
	}

	public void setProductDetailsRepositorySize(String productDetailsRepositorySize) {
		this.productDetailsRepositorySize = productDetailsRepositorySize;
	}

	public int getProductDetailsRepositoryAmount() {
		return productDetailsRepositoryAmount;
	}

	public void setProductDetailsRepositoryAmount(int productDetailsRepositoryAmount) {
		this.productDetailsRepositoryAmount = productDetailsRepositoryAmount;
	}

	public int getProductDetailsRepositorySales() {
		return productDetailsRepositorySales;
	}

	public void setProductDetailsRepositorySales(int productDetailsRepositorySales) {
		this.productDetailsRepositorySales = productDetailsRepositorySales;
	}

	public ProductDetails getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
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
