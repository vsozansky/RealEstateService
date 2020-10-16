# RealEstateService


Проект «Real Estate Service»
Электронная форма регистрации недвижимости.

Функционал: 
1.	Создание\редактирование\удаление сущности ”Регион”
2.	Создание\редактирование\удаление сущности ”область”
3.	Создание\редактирование\удаление сущности ”город”
4.	Создание\редактирование\удаление сущности ”район”
5.	Создание \редактирование\удаление сущности “Агентство по недвижимости”
6.	Создание\редактирование\удаление сущности “Риэлтор”
7.	Создание\редактирование\удаление сущности “Недвижимость”
8.	Иметь возможность в каждую сущность добавлять вложения, картинки и\или  видео контент.
9.	Должен быть реализован расширенный поиск по множеству критериев (цена (от .. по), этажность (от .. по), тип недвижимости, район, количество комнат(от .. по), состояние, общая площадь(от .. по), жилая площадь(от .. по))
10.	На форме должна быть сортировка: по дате создания, по дате создания + район, по цене, по дате + по цене
11.	Должен быть реализован функционал загрузки данных из подготовленного csv или xml или excel формата в базу данных
12.	Приложение должно предоставлять внешнее api, которое будет отдавать все данные по недвижимости с фильтрацией данных как в json формате так и в xml виде 
13.	Должна быть форма админки, для создания, редактирования удаления пользователей.
14.	Нужен функционал регистрации пользователей в системе (пользователь вводит нужные данные, ему приходит письмо с подтверждением), также смена пароля.
15.	Приложение должно писать аудит операций
16.	Приложение должно обладать секьюрностью и не давать неавторзированным пользователям возможность запрашивать неразрешенные ресурсы и страницы.
17.	У пользователей должны быть права на доступ к функционалу, и механизм гибкой настройки и управления.
18.	К приложению должна быть подключена одна из систем логирования.

Общие требования к окружению: java 8+, любой application server (tomcat, wildfly, tomee, glassfish), spring framework 5+, hibernate 5+, postgresql, maven, любой frontend framework или серверный движок шаблонов (jsp, thymeleaf, mustash, typescript, angular, react + reduce, zkoss, vaadin)
