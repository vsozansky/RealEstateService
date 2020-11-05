
CREATE TABLE `currency_lang` (
  `id_currency` int(10) UNSIGNED NOT NULL,
  `id_lang` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `symbol` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `currency_lang` (`id_currency`, `id_lang`, `name`, `symbol`) VALUES
(1, 1, 'украинская гривна', '₴'),
(1, 2, 'українська гривня', '₴'),
(2, 1, 'Евро', '€'),
(2, 2, 'Евро', '€'),
(3, 1, 'Доллар США', '$'),
(3, 2, 'Доллар США', '$');
