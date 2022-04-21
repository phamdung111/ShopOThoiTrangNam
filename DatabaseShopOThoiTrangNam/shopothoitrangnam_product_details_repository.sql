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
-- Table structure for table `product_details_repository`
--

DROP TABLE IF EXISTS `product_details_repository`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_details_repository` (
  `p_dt_rp_id` int NOT NULL AUTO_INCREMENT,
  `p_amount` int DEFAULT NULL,
  `p_sales` int DEFAULT NULL,
  `p_size` varchar(255) DEFAULT NULL,
  `fkproductdetails` int DEFAULT NULL,
  PRIMARY KEY (`p_dt_rp_id`),
  KEY `FK1vd2vid7bgqsdgj99bvh7fp2b` (`fkproductdetails`),
  CONSTRAINT `FK1vd2vid7bgqsdgj99bvh7fp2b` FOREIGN KEY (`fkproductdetails`) REFERENCES `productdetails` (`p_dt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_details_repository`
--

LOCK TABLES `product_details_repository` WRITE;
/*!40000 ALTER TABLE `product_details_repository` DISABLE KEYS */;
INSERT INTO `product_details_repository` VALUES (1,50,0,'M',1),(2,50,0,'X',1),(3,50,0,'L',1),(4,50,0,'M',2),(5,49,1,'X',2),(6,50,0,'L',2),(7,50,0,'M',3),(8,50,0,'X',3),(9,50,0,'L',3),(10,50,0,'M',4),(11,50,0,'X',4),(12,50,0,'L',4),(13,50,0,'M',5),(14,50,0,'L',5),(15,50,0,'X',5),(16,50,0,'M',6),(17,50,0,'L',6),(18,50,0,'X',6),(19,50,0,'M',7),(20,50,0,'X',7),(21,50,0,'L',7),(22,50,0,'M',8),(23,50,0,'X',8),(24,50,0,'L',8),(25,50,0,'M',9),(26,50,0,'X',9),(27,50,0,'L',9),(28,50,0,'M',10),(29,50,0,'X',10),(30,50,0,'L',10),(31,50,0,'M',11),(32,50,0,'X',11),(33,50,0,'L',11),(34,50,0,'M',12),(35,50,0,'X',12),(36,50,0,'L',12),(37,50,0,'M',13),(38,50,0,'X',13),(39,50,0,'L',13),(40,50,0,'M',14),(41,50,0,'X',14),(42,50,0,'L',14),(43,50,0,'M',15),(44,50,0,'X',15),(45,50,0,'L',15),(46,50,0,'M',16),(47,50,0,'X',16),(48,50,0,'L',16),(49,50,0,'M',17),(50,50,0,'X',17),(51,50,0,'L',17),(52,50,0,'M',18),(53,50,0,'X',18),(54,50,0,'L',18),(55,50,0,'M',19),(56,50,0,'X',19),(57,50,0,'L',19),(58,50,0,'M',20),(59,50,0,'X',20),(60,50,0,'L',20),(61,50,0,'M',21),(62,50,0,'X',21),(63,50,0,'L',21),(64,50,0,'M',22),(65,50,0,'X',22),(66,50,0,'L',22);
/*!40000 ALTER TABLE `product_details_repository` ENABLE KEYS */;
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
