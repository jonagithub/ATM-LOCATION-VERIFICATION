/*
SQLyog Community v12.4.3 (64 bit)
MySQL - 10.1.31-MariaDB : Database - simulationatm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`simulationatm` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `simulationatm`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `accountnumber` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) DEFAULT NULL,
  `address` varchar(80) DEFAULT NULL,
  `numberoftransaction` int(11) DEFAULT NULL,
  PRIMARY KEY (`accountnumber`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`accountnumber`,`name`,`address`,`numberoftransaction`) values 
(1,'ram','sinamangal',2),
(2,'shyam','sinamangal',4),
(3,'hari','sinamangal',5),
(4,'gita','sinamangal',1),
(5,'sita','sinamangal',2),
(6,'ramesh','sinamangal',3),
(7,'kritika','sinamangal',2),
(8,'aditya','sinamangal',3),
(9,'ankur','sinamangal',3),
(10,'rabindra','sinamangal',2),
(11,'nikhil','sinamangal',4),
(12,'pratik','sinamangal',2),
(13,'prerita','baneshwor',2),
(14,'bhavna','baneshwor',4),
(15,'roshni','baneshwor',2),
(16,'rekha','baneshwor',4),
(17,'rupal','baneshwor',2),
(18,'anup','baneshwor',1),
(19,'santosh','gaushala',4),
(20,'prakash','gaushala',2),
(21,'raj','gaushala',5),
(22,'grace','gaushala',3),
(23,'abhi','chabahil',4),
(24,'kristina','chabahil',3),
(25,'kristina','chabahil',4),
(26,'radha','chabahil',5),
(27,'roman','chabahil',2),
(28,'abhishek','baneshwor',2),
(29,'anisha','bhaktapur',4);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
