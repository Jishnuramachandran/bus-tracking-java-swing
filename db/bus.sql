/*
SQLyog Community Edition- MySQL GUI v8.03 
MySQL - 5.1.41 : Database - bus
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`bus` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bus`;

/*Table structure for table `booking` */

DROP TABLE IF EXISTS `booking`;

CREATE TABLE `booking` (
  `bookid` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `busid` int(15) NOT NULL,
  `place_from` varchar(30) NOT NULL,
  `place_to` varchar(30) NOT NULL,
  `date` date NOT NULL,
  `seats` int(3) NOT NULL,
  `amount` int(10) DEFAULT NULL,
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `booking` */

/*Table structure for table `busdetail` */

DROP TABLE IF EXISTS `busdetail`;

CREATE TABLE `busdetail` (
  `busid` int(10) NOT NULL AUTO_INCREMENT,
  `place_from` varchar(30) NOT NULL,
  `place_to` varchar(30) NOT NULL,
  `arrival` varchar(10) NOT NULL,
  `departure` varchar(10) NOT NULL,
  `fare` int(10) NOT NULL,
  `type` varchar(10) NOT NULL,
  `seats` int(10) NOT NULL,
  PRIMARY KEY (`busid`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;

/*Data for the table `busdetail` */

insert  into `busdetail`(`busid`,`place_from`,`place_to`,`arrival`,`departure`,`fare`,`type`,`seats`) values (101,'Chennai','Bangalore','2 pm','3 am',1000,'non a/c',50),(102,'Mumbai','Chennai','7 pm','8 pm',1800,'a/c',50),(103,'Pune','Goa','5 am','3 am',1500,'a/c',49);

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `userid` varchar(15) NOT NULL,
  `name` varchar(50) NOT NULL,
  `password` varchar(16) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`userid`,`name`,`password`) values ('user1','safvan','safu123'),('user2','sreenil','dany123'),('user3','vishnu','mattaz123');

/*Table structure for table `passdt` */

DROP TABLE IF EXISTS `passdt`;

CREATE TABLE `passdt` (
  `Trans_id` int(10) NOT NULL,
  `Bus_ID` int(10) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `mobile` varchar(10) DEFAULT NULL,
  `aadhar` int(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `passdt` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
