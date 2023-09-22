CREATE TABLE `users`
(
    `id`            bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `name`          varchar(100) COLLATE utf8_swedish_ci NOT NULL,
    `surname`       varchar(100) COLLATE utf8_swedish_ci NOT NULL,
    `sex`           enum('male','female') COLLATE utf8_swedish_ci DEFAULT NULL,
    `birth_date`    date                                 NOT NULL,
    `biography`     text COLLATE utf8_swedish_ci,
    `city`          varchar(100) COLLATE utf8_swedish_ci NOT NULL,
    `password_hash` varchar(100) COLLATE utf8_swedish_ci NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci