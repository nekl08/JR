�� ������������� ���� �������� ����� InitDB.
� ��� ������������ ������������ ����������� � ����, �������� � ���������� �������.
��� ���� test  (jdbc:mysql://localhost:3306/test"/)
����� root
������ root

�������� ���� �� �����.
��������� ��� ������� ���

Query q = session.createQuery("from User");
	int usersFromPage = 10;
        q.setFirstResult(page * usersFromPage);
        q.setMaxResults(usersFromPage);
        List<User> userList = q.list();

���������� �� ��� ����, � ���������
������ ��� java 1.8