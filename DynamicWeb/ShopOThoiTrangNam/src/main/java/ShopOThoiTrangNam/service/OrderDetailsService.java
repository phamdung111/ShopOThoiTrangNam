package ShopOThoiTrangNam.service;

import org.springframework.data.jpa.repository.JpaRepository;

import ShopOThoiTrangNam.entity.OrderDetails;

public interface OrderDetailsService extends JpaRepository<OrderDetails, Integer>{
}
