package org.example.LLD2.prototype;

public class Student implements Prototype<Student>{

    private String name;
    private int age;
    private String batch;
    private String college;
    private double batchAvgMarks;

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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public double getBatchAvgMarks() {
        return batchAvgMarks;
    }

    public void setBatchAvgMarks(double batchAvgMarks) {
        this.batchAvgMarks = batchAvgMarks;
    }

    public Student(){
    }

    public Student(Student student1){
        this.age=student1.age;
        this.name=student1.name;
        this.college=student1.college;
        this.batch=student1.batch;
        this.batchAvgMarks=student1.batchAvgMarks;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
