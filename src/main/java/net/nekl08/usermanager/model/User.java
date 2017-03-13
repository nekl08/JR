package net.nekl08.usermanager.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
//    @Id
//    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "USER_TITLE")
//    private String userTitle;
//
//    @Column(name = "USER_AUTHOR")
//    private String userAuthor;
//
//    @Column(name = "USER_PRICE")
//    private int price;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getUserTitle() {
//        return userTitle;
//    }
//
//    public void setUserTitle(String userTitle) {
//        this.userTitle = userTitle;
//    }
//
//    public String getUserAuthor() {
//        return userAuthor;
//    }
//
//    public void setUserAuthor(String userAuthor) {
//        this.userAuthor = userAuthor;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", userTitle='" + userTitle + '\'' +
//                ", userAuthor='" + userAuthor + '\'' +
//                ", price=" + price +
//                '}';
//    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "isAdmin")
    private boolean isAdmin;

    @Column(name = "createdDate")
    private String createdDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", isAdmin=" + isAdmin +
                ", createdDate=" + createdDate +
                '}';
    }
}
