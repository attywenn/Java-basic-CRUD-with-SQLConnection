DOWNLOAD XAMPP HERE:
https://www.apachefriends.org/
Install it.

If you have installed MySQL Workbench sa pc mo,
posibleng magkaroon ng port dispute ang XAMPP 
at MySQL mo, kaya if mangyari 'yon

Configure mo ang MySQL sa XAMPP Task Manager.
pagka-click mo ng Config sa MySQL, click mo ang "my.ini"
Ctrl + F ... type mo "3306"
tapos kada may existing na 3306, palitan mo ng 3307

tapos, punta ka sa C://xampp//phpMyAdmin
hanapin mo rito ang config.inc, PHP file ito

makikita mo doon ang 127.0.0.1
sa baba ng text na 'yan, paste mo ito:

$cfg['Servers'][$i]['port'] = '3307';

tapos, all set ka na! Paste mo na lang ito sa phpMyAdmin para
makagawa ka na ng database...

PM mo lang ako kapag nalilito ka pa rin, bayaran mo na lang
araw ko hahahahahaha


// MYSQL COMMAND

CREATE DATABASE inventory_db;

USE inventory_db;

CREATE TABLE inventory (
	ProductID INT AUTO_INCREMENT PRIMARY KEY,
	ProductName VARCHAR (255) NOT NULL,
	Quantity INT NOT NULL,
	Price DECIMAL(10,2) NOT NULL
);
