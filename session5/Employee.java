package com.upgrad.c1.session5;

public class Employee {
    private int employeeCode;
    private String name;

    public Employee(int employeeCode, String name) {
        this.employeeCode = employeeCode;
        this.name = name;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class SoftwareDeveloper extends Employee {
    private String programmingLanguage;

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public SoftwareDeveloper(int employeeCode, String name, String programmingLanguage) {
        super(employeeCode, name);
        this.programmingLanguage = programmingLanguage;
    }

    /*
     * String name = super.getName();
     * int employeeCode = super.getEmployeeCode();
     * String prolang = this.getProgrammingLanguage();
     * 
     * public String getdetails() {
     * return (name + " (" + employeeCode + ") " +
     * "Software Developer with Programming Language: " + prolang);
     * }
     */

    public String getdetails() {
        return (super.getName() + " (" + super.getEmployeeCode() + ") "
                + "Software Developer with Programming Language: " + this.programmingLanguage);
    }
}

class Source {
    public static void main(String[] args) {
        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(1001, "Ishwar", "Java");
        System.out.println(softwareDeveloper.getdetails());
    }
}
