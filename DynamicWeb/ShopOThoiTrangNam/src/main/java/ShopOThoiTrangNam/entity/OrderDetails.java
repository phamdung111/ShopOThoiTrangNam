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
@Table(name = "order_details")
public class OrderDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "order_details_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDetailsId;
	
	@Column(name = "amount")
	private int amount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fkorder")
	private Order order;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fkproductdetailsrepository")
	private ProductDetailsRepository orderDetailsProductDetailsRepository;

	public OrderDetails() {
		super();
	}

	public OrderDetails(int orderDetailsId, int amount, Order order,
			ProductDetailsRepository orderDetailsProductDetailsRepository) {
		super();
		this.orderDetailsId = orderDetailsId;
		this.amount = amount;
		this.order = order;
		this.orderDetailsProductDetailsRepository = orderDetailsProductDetailsRepository;
	}

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ProductDetailsRepository getOrderDetailsProductDetailsRepository() {
		return orderDetailsProductDetailsRepository;
	}

	public void setOrderDetailsProductDetailsRepository(ProductDetailsRepository orderDetailsProductDetailsRepository) {
		this.orderDetailsProductDetailsRepository = orderDetailsProductDetailsRepository;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
