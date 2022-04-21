package ShopOThoiTrangNam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ShopOThoiTrangNam.entity.Product;
@Repository
@Transactional
public interface ProductService extends JpaRepository<Product, Long>{
	@Query("select distinct c.productType from Product c")
	List<String> getAllType();
	
	@Query("select c from Product c where c.productType = ?1")
	List<Product> productByType(String type);
	
	@Query("select c from Product c where c.productId = ?1")
	Product getProductById(int id);

	@Query("select c from Product c where c.productName Like %?1%")
	List<Product> searchProduct(String name);
}
