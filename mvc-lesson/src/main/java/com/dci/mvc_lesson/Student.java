package com.dci.mvc_lesson;

public class Student {


    private int id;
    private String name;
    private String email;
    private boolean isSQLExpert;

    public Student(int id, String name, String email, boolean isSQLExpert) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.isSQLExpert = isSQLExpert;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSQLExpert() {
        return isSQLExpert;
    }

    public void setSQLExpert(boolean SQLExpert) {
        isSQLExpert = SQLExpert;
    }
}
