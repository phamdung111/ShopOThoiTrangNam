package ShopOThoiTrangNam.service;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ShopOThoiTrangNam.entity.Product;
import ShopOThoiTrangNam.entity.ProductDetails;

@Repository
@Transactional
public interface ProductDetailsService extends JpaRepository<ProductDetails, Long>{
	@Query("select c from ProductDetails c where c.product = ?1 and c.productDetailsColor = ?2")
	ProductDetails getProductDetailsForCart(Product productId,String color);
	
	
}
