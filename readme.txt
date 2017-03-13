За инициализацию базы отвечает класс InitDB.
В его конструкторе захардкожены подключение к базе, создание и наполнение таблицы.
Имя базы test  (jdbc:mysql://localhost:3306/test"/)
логин root
пароль root

Пейджинг пока не готов.
Собираюсь его сделать так

Query q = session.createQuery("from User");
	int usersFromPage = 10;
        q.setFirstResult(page * usersFromPage);
        q.setMaxResults(usersFromPage);
        List<User> userList = q.list();

выкачивать не всю базу, а диапазоны
Проект под java 1.8