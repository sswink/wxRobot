/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.1.68-community : Database - batis
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`batis` /*!40100 DEFAULT CHARACTER SET gbk COLLATE gbk_bin */;

USE `batis`;

/*Table structure for table `command` */

DROP TABLE IF EXISTS `command`;

CREATE TABLE `command` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(16) COLLATE utf8_bin DEFAULT NULL,
  `DESCRIPTION` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_bin CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `command` */

insert  into `command`(`ID`,`NAME`,`DESCRIPTION`) values (12,'前期','问问'),(13,'奥多姆','109奥多姆'),(15,'段子','随机一条段子');

/*Table structure for table `command_contend` */

DROP TABLE IF EXISTS `command_contend`;

CREATE TABLE `command_contend` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CONTENT` varchar(2048) COLLATE utf8_bin DEFAULT NULL,
  `COMMANDID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_command_contend` (`COMMANDID`),
  CONSTRAINT `FK_command_contend` FOREIGN KEY (`COMMANDID`) REFERENCES `command` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COLLATE=utf8_bin CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `command_contend` */

insert  into `command_contend`(`ID`,`CONTENT`,`COMMANDID`) values (23,'二位',12),(24,'s',13),(25,'b',13),(27,'',15);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
