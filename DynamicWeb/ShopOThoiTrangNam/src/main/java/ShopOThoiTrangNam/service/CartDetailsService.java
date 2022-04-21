package ShopOThoiTrangNam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ShopOThoiTrangNam.entity.Cart;
import ShopOThoiTrangNam.entity.CartDetails;
import ShopOThoiTrangNam.entity.ProductDetailsRepository;

@Repository
@Transactional
public interface CartDetailsService extends JpaRepository<CartDetails, Integer>{
	@Query("select c from CartDetails c where c.cart = ?1 and c.productDetailsRepository = ?2")
	CartDetails getCartDetailsByProductDetailsRepository(Cart cart, ProductDetailsRepository productDetailsRepository);
	
	@Query("select c from CartDetails c where c.cart = ?1")
	List<CartDetails> getListCartDetailsByUser(Cart cart);
}
