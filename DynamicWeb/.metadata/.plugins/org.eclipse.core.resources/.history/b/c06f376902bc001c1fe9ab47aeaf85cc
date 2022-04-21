package ShopOThoiTrangNam.entity;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "productdetails")
public class ProductDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "p_dt_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productDetailsId;
	
	@Column(name = "p_color")
	private String productDetailsColor;
	
	@Column(name = "p_url")
	private String productDetailsUrl;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "p_id")
	private Product product;
	
	@OneToMany(mappedBy = "productDetails")
	private List<ProductDetailsRepository> productDetailsRepositories;
	
	public ProductDetails() {
		super();
	}

	

	public ProductDetails(int productDetailsId, String productDetailsColor, String productDetailsUrl, Product product,
			List<ProductDetailsRepository> productDetailsRepositories) {
		super();
		this.productDetailsId = productDetailsId;
		this.productDetailsColor = productDetailsColor;
		this.productDetailsUrl = productDetailsUrl;
		this.product = product;
		this.productDetailsRepositories = productDetailsRepositories;
	}



	public int getProductDetailsId() {
		return productDetailsId;
	}

	public void setProductDetailsId(int productDetailsId) {
		this.productDetailsId = productDetailsId;
	}

	public String getProductDetailsColor() {
		return productDetailsColor;
	}

	public void setProductDetailsColor(String productDetailsColor) {
		this.productDetailsColor = productDetailsColor;
	}

	public String getProductDetailsUrl() {
		return productDetailsUrl;
	}

	public void setProductDetailsUrl(String productDetailsUrl) {
		this.productDetailsUrl = productDetailsUrl;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	

	public List<ProductDetailsRepository> getProductDetailsRepositories() {
		return productDetailsRepositories;
	}

	public void setProductDetailsRepositories(List<ProductDetailsRepository> productDetailsRepositories) {
		this.productDetailsRepositories = productDetailsRepositories;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
