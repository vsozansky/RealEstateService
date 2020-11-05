
CREATE TABLE `contact` (
  `id_contact` int(10) UNSIGNED NOT NULL,
  `email` varchar(255) NOT NULL,
  `customer_service` tinyint(1) NOT NULL DEFAULT '0',
  `position` tinyint(2) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `contact` (`id_contact`, `email`, `customer_service`, `position`) VALUES
(1, 'vsozansky@gmail.com', 1, 0),
(2, 'vsozansky@gmail.com', 1, 0);
