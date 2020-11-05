
CREATE TABLE `customer_group` (
  `id_customer` int(10) UNSIGNED NOT NULL,
  `id_group` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `customer_group` (`id_customer`, `id_group`) VALUES
(1, 3),
(2, 3);
