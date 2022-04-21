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
-- Table structure for table `productdetails`
--

DROP TABLE IF EXISTS `productdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productdetails` (
  `p_dt_id` int NOT NULL AUTO_INCREMENT,
  `p_color` varchar(255) DEFAULT NULL,
  `p_url` varchar(255) DEFAULT NULL,
  `p_id` int DEFAULT NULL,
  PRIMARY KEY (`p_dt_id`),
  KEY `FK1yd7ucuk1gpk592673wi8uvt8` (`p_id`),
  CONSTRAINT `FK1yd7ucuk1gpk592673wi8uvt8` FOREIGN KEY (`p_id`) REFERENCES `products` (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productdetails`
--

LOCK TABLES `productdetails` WRITE;
/*!40000 ALTER TABLE `productdetails` DISABLE KEYS */;
INSERT INTO `productdetails` VALUES (1,'Đen','POTTK315-QKLTK209-1.jpg',1),(2,'Trắng','POTTK315-QACTK203.jpg',1),(3,'Cam','POTTK304-QKLTK209.jpg',2),(4,'Be','POTTK305-QIDTK241-GIATK230-1.jpg',3),(5,'Trắng','POTTK305-QJDTK241-GIATK230-1.jpg',3),(6,'Đen','POTTK305-QJDTK241-GIATK230-6.jpg',3),(7,'Đen','POTTK301-QKLTK209-GIATK230-1.jpg',4),(8,'Trắng','POTTK301-QATK207-13.jpg',4),(9,'Xanh ngọc','POTTK301-QATK207-7.jpg',4),(10,'Be','POTTK301-QATK207-1.jpg',4),(11,'Be','POHTK302-QKLTK209-GIATK230-1.jpg',5),(12,'Xanh lá','POHTK302-QKLTK209-GIATK230-6.jpg',5),(13,'Trắng','POHTK302-QKBTK208-GIATK230-1.jpg',5),(14,'Trắng','POTTK308-QJDTK241-GIATK230-4.jpg',6),(15,'Trắng','POTTK306-QKBTK208-GIATK230-1.jpg',7),(16,'Be','POTTK306-QKBTK208-1.jpg',7),(17,'Xanh lá','POTTK306-QKLTK209-GIATK230-1.jpg',7),(18,'Xanh than','POKTK307-QJDTK229-GIATK230-1-1.jpg',8),(19,'Xám','POKTK307-QJDTK229-GIATK230-1-15.jpg',8),(20,'Đỏ','POKTK212-QKLTK209-GIATK230-4.jpg',9),(21,'Cam','POKTK212-QKLTK209-GIATK230-6.jpg',9),(22,'Trắng','POKTK212-QJDTK241-GIATK230-1.jpg',9);
/*!40000 ALTER TABLE `productdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-21 14:06:46
