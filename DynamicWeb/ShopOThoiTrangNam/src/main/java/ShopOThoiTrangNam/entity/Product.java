package ShopOThoiTrangNam.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "products")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "p_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "p_date")
	private Date date;
	
	
	@Column(name = "p_description")
	private String productDescription;
	
	@Column(name = "p_name")
	private String productName;
	
	@Column(name = "p_price")
	private int productPrice;

	@Column(name = "p_promotion")
	private int productPromotion;
	
	@Column(name = "p_type")
	private String productType;
	
	@Column(name = "p_url_main")
	private String productUrlMains;
	
	@OneToMany(mappedBy = "product")
	private Set<ProductDetails> productDetails;
	
	private int priceLaterPromotion;
	
	public Product() {
		super();
	}

	public Product(int productId, Date date, String productDescription, String productName, int productPrice,
			int productPromotion, String productType, String productUrlMains, Set<ProductDetails> productDetails,
			int priceLaterPromotion) {
		super();
		this.productId = productId;
		this.date = date;
		this.productDescription = productDescription;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productPromotion = productPromotion;
		this.productType = productType;
		this.productUrlMains = productUrlMains;
		this.productDetails = productDetails;
		this.setPriceLaterPromotion(priceLaterPromotion);
	}





	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public int getProductPromotion() {
		return productPromotion;
	}


	public void setProductPromotion(int productPromotion) {
		this.productPromotion = productPromotion;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getProductUrlMains() {
		return productUrlMains;
	}


	public void setProductUrlMains(String productUrlMains) {
		this.productUrlMains = productUrlMains;
	}


	public Set<ProductDetails> getProductDetails() {
		return productDetails;
	}


	public void setProductDetails(Set<ProductDetails> productDetails) {
		this.productDetails = productDetails;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getPriceLaterPromotion() {
		int priceLaterPromotion = this.productPrice - (this.productPrice * this.productPromotion/100);
		return priceLaterPromotion;
	}

	public void setPriceLaterPromotion(int priceLaterPromotion) {
		this.priceLaterPromotion = priceLaterPromotion;
	}
	
	
}
