package ShopOThoiTrangNam.service;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ShopOThoiTrangNam.entity.User;
@Repository
@Transactional
public interface UserService extends JpaRepository<User, Integer>{
	@Query("select c from User c where c.userEmail = ?1")
	User checkUser(String email);
	
	User findByUserPhone(String phone);
}
