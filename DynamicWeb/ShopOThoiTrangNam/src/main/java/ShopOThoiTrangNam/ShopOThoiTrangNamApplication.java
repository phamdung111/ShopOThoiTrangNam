package ShopOThoiTrangNam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "ShopOThoiTrangNam.entity")
public class ShopOThoiTrangNamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopOThoiTrangNamApplication.class, args);
	}

}
