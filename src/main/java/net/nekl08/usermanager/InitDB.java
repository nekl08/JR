package net.nekl08.usermanager;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by Zver on 07.03.2017.
 */
/*Класс нужен для создания и наполнения базы.
в mvc-dispatcher-servlet.xml определен его bean
в конструкторе подключаемся к базе, создаём и наполняем таблицу
 */

public class InitDB {
    public InitDB() {
        String URL = "jdbc:mysql://localhost:3306/test";
        String USERNAME = "root";
        String PASSWORD = "root";
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.err.println("--------------------------------------------Неудалось загрузить класс драйвера----------------------------------");
        }
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement statement =  connection.createStatement()) {


            statement.execute("CREATE TABLE test.users (\n" +
                    "  `id` INT(8) NOT NULL AUTO_INCREMENT,\n" +
                    "  `name` VARCHAR(25) NOT NULL,\n" +
                    "  `age` INT NOT NULL,\n" +
                    "  `isAdmin` BIT(1) NOT NULL,\n" +
                    "  `createdDate` TIMESTAMP(0) NOT NULL,\n" +
                    "  PRIMARY KEY (`id`));");
            statement.execute("INSERT INTO test.users (id, name, age, isAdmin, createdDate) VALUES ('1', 'Alex', '99', 1, null);");
            statement.execute("INSERT INTO test.users (id, name, age, isAdmin, createdDate) VALUES ('2', 'Dimon', '13', 0, null);");
            statement.execute("INSERT INTO test.users (id, name, age, isAdmin, createdDate) VALUES ('3', 'Amigo', '10', 0, null);");
            statement.execute("INSERT INTO test.users (id, name, age, isAdmin, createdDate) VALUES ('4', 'JavaRush', '4', 0, null);");
            statement.execute("INSERT INTO test.users (id, name, age, isAdmin, createdDate) VALUES ('5', 'Fry', '30', 0, null);");
            statement.execute("INSERT INTO test.users (id, name, age, isAdmin, createdDate) VALUES ('6', 'Bender', '11', 0, null);");
            statement.execute("INSERT INTO test.users (id, name, age, isAdmin, createdDate) VALUES ('7', 'Homer', '35', 0, null);");

        } catch (SQLException e) {
            System.err.println("-----------------Неудалось создать или заполнить базу--------------------------------------------------------------");
        }
    }
}
