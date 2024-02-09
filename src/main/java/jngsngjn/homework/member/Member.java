package jngsngjn.homework.member;

import java.time.LocalDate;

//@Entity
public class Member {

    //@Id
    private int id;
    private String name;
    private String password;

    private int role; // 뭐지 이건?!

    private LocalDate register;
    private LocalDate update;
    private LocalDate remove;

//  getter, setter 다 만들어주는 게 맞겠지..?

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public LocalDate getRegister() {
        return register;
    }

    public void setRegister(LocalDate register) {
        this.register = register;
    }

    public LocalDate getUpdate() {
        return update;
    }

    public void setUpdate(LocalDate update) {
        this.update = update;
    }

    public LocalDate getRemove() {
        return remove;
    }

    public void setRemove(LocalDate remove) {
        this.remove = remove;
    }
}