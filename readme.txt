�� ������������� ���� �������� ����� InitDB.
� ��� ������������ ������������ ����������� � ����, �������� � ���������� �������.
��� ���� test  (jdbc:mysql://localhost:3306/test"/)
����� root
������ root

�������� ���� �� �����.
��������� ��� ������� ���

Query q = session.createQuery("from User");
	int usersFromPafe = 10;
        q.setFirstResult(page * usersFromPafe);
        q.setMaxResults(usersFromPafe);
        List<User> userList = q.list();

���������� �� ��� ����, � ���������
������ ��� java 1.8