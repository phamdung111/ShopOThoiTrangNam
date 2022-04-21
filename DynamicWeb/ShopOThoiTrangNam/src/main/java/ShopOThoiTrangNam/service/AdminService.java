package ShopOThoiTrangNam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ShopOThoiTrangNam.entity.Admin;
import ShopOThoiTrangNam.entity.Order;
import ShopOThoiTrangNam.entity.ProductDetailsRepository;
@Repository
@Transactional
public interface AdminService extends JpaRepository<Admin, String>{
	@Query("select c from Admin c where c.admin = ?1 and c.adminPassword = ?2")
	Admin getAdmin(String admin, String password);
	
	@Query("select c from Order c order by c.date desc")
	List<Order> getOrderSortTime();
	
	@Query("select c.orderDetailsProductDetailsRepository from OrderDetails c "
			+ "group by c.orderDetailsProductDetailsRepository order by c.amount desc")
	List<ProductDetailsRepository> topSales();
	@Query("select sum(c.totalMoney) from Order c")
	int sales();
}
