
CREATE TABLE `contact_lang` (
  `id_contact` int(10) UNSIGNED NOT NULL,
  `id_lang` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `contact_lang` (`id_contact`, `id_lang`, `name`, `description`) VALUES
(1, 1, 'Вебмастер', 'Если на сайте возникнут технические проблемы'),
(1, 2, 'Вебмайстер', 'Якщо виникають технічні помилки на сайті'),
(2, 1, 'Служба поддержки', 'По всем вопросам касательно товаров или заказов'),
(2, 2, 'Служба підтримки клієнтів', 'Стосовно запитань по товарах чи замовленнях');
