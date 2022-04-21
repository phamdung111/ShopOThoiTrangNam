package ShopOThoiTrangNam.service;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ShopOThoiTrangNam.entity.Cart;
import ShopOThoiTrangNam.entity.User;
@Repository
@Transactional
public interface CartService extends JpaRepository<Cart, Integer>{
	@Query("select c from Cart c where c.users = ?1")
	Cart getCartByUser(User user);
}
