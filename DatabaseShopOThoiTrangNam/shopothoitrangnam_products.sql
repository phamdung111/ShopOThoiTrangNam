-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: shopothoitrangnam
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `p_id` int NOT NULL AUTO_INCREMENT,
  `p_date` date DEFAULT NULL,
  `price_later_promotion` int DEFAULT NULL,
  `p_description` varchar(2001) DEFAULT NULL,
  `p_name` varchar(255) DEFAULT NULL,
  `p_price` int DEFAULT NULL,
  `p_promotion` int DEFAULT NULL,
  `p_type` varchar(255) DEFAULT NULL,
  `p_url_main` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'2022-04-20',0,'– Chất liệu: lacoste mắt nhỏ\n– Dáng: Regular\n– Đặc tính: Mềm mại, co giãn tốt, có độ thấm hút mồ hôi và hút ẩm cao, thoáng mát.\n– Màu: đen, trắng\n+ Hướng dẫn sử dụng:\n– Giặt ở nhiệt độ bình thường, với đồ có màu tương tự.\n– Không được dùng hóa chất tẩy.\n– Hạn chế sử dụng máy sấy, ủi ở nhiệt độ bình thường.\n– Sản phẩm đã có mặt ở toàn bộ các cửa hàng trên hệ thống.','Áo polo nam POTTK315',265000,10,'Áo polo','POTTK305-QIDTK241-GIATK230-1.jpg'),(2,'2022-04-20',0,'– Chất liệu: lacoste mắt nhỏ\n– Dáng: Regular\n– Đặc tính: Mềm mại, co giãn tốt, có độ thấm hút mồ hôi và hút ẩm cao, thoáng mát.\n– Màu: đen, trắng\n+ Hướng dẫn sử dụng:\n– Giặt ở nhiệt độ bình thường, với đồ có màu tương tự.\n– Không được dùng hóa chất tẩy.\n– Hạn chế sử dụng máy sấy, ủi ở nhiệt độ bình thường.\n– Sản phẩm đã có mặt ở toàn bộ các cửa hàng trên hệ thống.','Áo polo nam POTTK304',350000,10,'Áo polo','POTTK305-QIDTK241-GIATK230-1.jpg'),(3,'2022-04-20',0,'– Chất liệu: 100% Cotton\n– Dáng: Regular\n– Đặc tính: Mềm mại, co giãn tốt, có độ thấm hút mồ hôi và hút ẩm cao, thoáng mát.\n– Màu: đen, trắng, be\n+ Hướng dẫn sử dụng:\n– Giặt ở nhiệt độ bình thường, với đồ có màu tương tự.\n– Không được dùng hóa chất tẩy.\n– Hạn chế sử dụng máy sấy, ủi ở nhiệt độ bình thường.\n– Sản phẩm đã có mặt ở toàn bộ các cửa hàng trên hệ thống.\n\nHƯỚNG DẪN CHỌN SIZE\nSize M: 50-57kg / Cao 1m53 – 1m68\nSize L: 58-64kg / Cao 1m57 – 1m70\nSize XL: 65-70kg / Cao 1m66 – 1m76\nSize XXL: 71-76kg / Cao 1m70 – 1m85.\nTùy mỗi người thích body hoặc vừa người thì tăng hoặc giảm 1 size, chỉ số trên là tương đối mặc','Áo polo nam POTTK305',350000,10,'Áo polo','POTTK305-QIDTK241-GIATK230-1.jpg'),(4,'2022-04-20',0,'– Chất liệu: Lacoste mắt nhỏ\n– Dáng: Regular\n– Đặc tính: Mềm mại, co giãn tốt, có độ thấm hút mồ hôi và hút ẩm cao, thoáng mát.\n– Màu: đen, trắng, be, xanh ngọc\n+ Hướng dẫn sử dụng:\n– Giặt ở nhiệt độ bình thường, với đồ có màu tương tự.\n– Không được dùng hóa chất tẩy.\n– Hạn chế sử dụng máy sấy, ủi ở nhiệt độ bình thường.','Áo polo nam POTTK301',340000,20,'Áo polo','POTTK301-QKLTK209-GIATK230-1.jpg'),(5,'2022-04-20',0,'– Chất liệu: 100% Cotton\n– Dáng: Regular\n– Đặc tính: Mềm mại, co giãn tốt, có độ thấm hút mồ hôi và hút ẩm cao, thoáng mát.\n– Màu: xanh lá, nâu, trắng\n+ Hướng dẫn sử dụng:\n– Giặt ở nhiệt độ bình thường, với đồ có màu tương tự.\n– Không được dùng hóa chất tẩy.\n– Hạn chế sử dụng máy sấy, ủi ở nhiệt độ bình thường.','Áo polo nam POHTK302',360000,20,'Áo polo','POHTK302-QKLTK209-GIATK230-1.jpg'),(6,'2022-04-20',0,'– Chất liệu: 100% Cotton\n– Dáng: Regular\n– Đặc tính: Mềm mại, co giãn tốt, có độ thấm hút mồ hôi và hút ẩm cao, thoáng mát.\n– Màu: xanh lá, nâu, trắng\n+ Hướng dẫn sử dụng:\n– Giặt ở nhiệt độ bình thường, với đồ có màu tương tự.\n– Không được dùng hóa chất tẩy.\n– Hạn chế sử dụng máy sấy, ủi ở nhiệt độ bình thường.','Áo polo nam POTTK308',290000,10,'Áo polo','POTTK308-QJDTK241-GIATK230-4.jpg'),(7,'2022-04-20',0,'– Chất liệu: 100% Cotton\n– Dáng: Regular\n– Đặc tính: Mềm mại, co giãn tốt, có độ thấm hút mồ hôi và hút ẩm cao, thoáng mát.\n– Màu: xanh lá, nâu, trắng\n+ Hướng dẫn sử dụng:\n– Giặt ở nhiệt độ bình thường, với đồ có màu tương tự.\n– Không được dùng hóa chất tẩy.\n– Hạn chế sử dụng máy sấy, ủi ở nhiệt độ bình thường.','Áo polo nam POTTK306',330000,10,'Áo polo','POTTK306-QKBTK208-GIATK230-1.jpg'),(8,'2022-04-20',0,'– Chất liệu: 100% Cotton\n– Dáng: Regular\n– Đặc tính: Mềm mại, co giãn tốt, có độ thấm hút mồ hôi và hút ẩm cao, thoáng mát.\n– Màu: xanh lá, nâu, trắng\n+ Hướng dẫn sử dụng:\n– Giặt ở nhiệt độ bình thường, với đồ có màu tương tự.\n– Không được dùng hóa chất tẩy.\n– Hạn chế sử dụng máy sấy, ủi ở nhiệt độ bình thường.','Áo polo nam POTTK307',340000,10,'Áo polo','POKTK307-QJDTK229-GIATK230-1-1.jpg'),(9,'2022-04-20',0,'– Chất liệu: 100% Cotton\n– Dáng: Regular\n– Đặc tính: Mềm mại, co giãn tốt, có độ thấm hút mồ hôi và hút ẩm cao, thoáng mát.\n– Màu: xanh lá, nâu, trắng\n+ Hướng dẫn sử dụng:\n– Giặt ở nhiệt độ bình thường, với đồ có màu tương tự.\n– Không được dùng hóa chất tẩy.\n– Hạn chế sử dụng máy sấy, ủi ở nhiệt độ bình thường.','Áo polo nam POKTK212',340000,10,'Áo polo','POKTK212-QKLTK209-GIATK230-4.jpg');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-21 14:06:45
