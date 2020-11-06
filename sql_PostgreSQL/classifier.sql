DROP TABLE IF EXISTS classifier;
CREATE TABLE IF NOT EXISTS classifier (
id_classifier integer NOT NULL,
id_country integer NOT NULL,
id_lang integer NOT NULL,
name_classifier varchar(64) NOT NULL,
active boolean NOT NULL DEFAULT true,
PRIMARY KEY (id_classifier)
) ;
INSERT INTO classifier (id_classifier, id_country, id_lang, name_classifier, active) VALUES
(1, 2, 2, 'KLADR', true),
(2, 3, 2, 'NovaPost',  true);
CREATE SEQUENCE classifier_id_classifier_seq;
ALTER TABLE classifier ALTER COLUMN id_classifier SET DEFAULT nextval('classifier_id_classifier_seq');
ALTER SEQUENCE classifier_id_classifier_seq OWNED BY "classifier"."id_classifier";

DROP TABLE IF EXISTS classifier_lang;
CREATE TABLE IF NOT EXISTS classifier_lang (
id_classifier integer NOT NULL,
id_lang integer NOT NULL,
name varchar(64) NOT NULL,
PRIMARY KEY (id_classifier,id_lang)
);
INSERT INTO classifier_lang (id_classifier, id_lang, name) VALUES
(1, 1, 'KLADR'),
(1, 2, 'KLADR'),
(1, 3, 'KLADR'),
(1, 4, 'KLADR'),
(1, 5, 'KLADR'),
(2, 1, 'Nova Post'),
(2, 2, 'Nova Post'),
(2, 3, 'Nova Post'),
(2, 4, 'Nova Post'),
(2, 5, 'Nova Post');



DROP TABLE IF EXISTS state_ref;
CREATE TABLE IF NOT EXISTS state_ref (
id_state integer NOT NULL,
id_classifier integer NOT NULL,
id_state_classifier integer NOT NULL,
PRIMARY KEY (id_state,id_classifier,id_state_classifier)
);
INSERT INTO state_ref (id_state, id_classifier, id_state_classifier) VALUES
(1, 1, 1),
(2, 2, 2);



DROP TABLE IF EXISTS city_ref;
CREATE TABLE IF NOT EXISTS city_ref (
id_city integer NOT NULL,
id_classifier integer NOT NULL,
id_state_classifier integer NOT NULL,
PRIMARY KEY (id_city, id_classifier, id_state_classifier)
);
INSERT INTO city_ref (id_city, id_classifier, id_state_classifier) VALUES
(2, 1, 1),
(3, 2, 1);



DROP TABLE IF EXISTS street_ref;
CREATE TABLE IF NOT EXISTS street_ref (
id_street integer NOT NULL,
id_classifier integer NOT NULL,
id_state_classifier integer NOT NULL,
PRIMARY KEY (id_street, id_classifier, id_state_classifier)
);
INSERT INTO street_ref (id_street, id_classifier, id_state_classifier) VALUES
(1, 2, 1),
(2, 2, 2),
(3, 2, 3);