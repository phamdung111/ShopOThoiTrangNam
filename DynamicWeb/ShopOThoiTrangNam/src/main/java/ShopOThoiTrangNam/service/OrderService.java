package ShopOThoiTrangNam.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ShopOThoiTrangNam.entity.Order;
import ShopOThoiTrangNam.entity.User;
@Repository
@Transactional
public interface OrderService extends JpaRepository<Order, Integer>{
	@Query("select c from Order c where c.user = ?1")
	List<Order> order(User user);
	@Query("select c from Order c where c.orderId = ?1")
	Order findOrderId(int id);
	
	List<Order> findByDate(Date date);// get order by date
}
