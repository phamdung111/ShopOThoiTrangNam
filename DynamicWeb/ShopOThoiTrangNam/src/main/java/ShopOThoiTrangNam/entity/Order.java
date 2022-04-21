package ShopOThoiTrangNam.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "order_product")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_order")
	private Date date;

//	@Column(name = "order_total_money")
	private int totalMoney;
	@Column(name = "order_note")
	private String note;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fkuser")
	private User user;

	@OneToMany(mappedBy = "order")
	private Set<OrderDetails> orderDetails;

	public Order() {
		super();
	}

	public Order(int orderId, Date date, int totalMoney, String note, User user, Set<OrderDetails> orderDetails) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.totalMoney = totalMoney;
		this.note = note;
		this.user = user;
		this.orderDetails = orderDetails;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotalMoney() {
		Set<OrderDetails> orderDetails = this.orderDetails;
		int total = 0;
		for (OrderDetails orderDetails2 : orderDetails) {
			total += orderDetails2.getAmount() * orderDetails2.getOrderDetailsProductDetailsRepository()
					.getProductDetails().getProduct().getPriceLaterPromotion();
		}
		return total;
	}

	public void setTotalMoney(int totalMoney) {

		this.totalMoney = totalMoney;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
