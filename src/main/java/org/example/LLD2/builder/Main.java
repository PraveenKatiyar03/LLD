package org.example.LLD2.builder;

public class Main {

    public static void main(String[] args) {


        Student student = Student.getBuilder()
                        .setStudent_id(123)
                                .setName("Praveen")
                                        .setCity("Bangalore")
                                                .setPhoneNumber(1234)
                                                        .build();

        System.out.println("say hii to "+ student.name + " having sudent id = "+ student.student_id);



    }
}
