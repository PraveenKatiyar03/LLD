package org.example.LLD2.prototype;

public class Client {
    private static StudentRegistry studentRegistry = new StudentRegistry();

    private static void registerToRegistry(){
        Student morningBatchStudents = new Student();
        morningBatchStudents.setBatch("morning batch");
        morningBatchStudents.setBatchAvgMarks(80.3);
        morningBatchStudents.setCollege("SRM");

        Student eveningBatchStudents = new Student();
        eveningBatchStudents.setCollege("SRM");
        eveningBatchStudents.setBatch("evening batch");
        eveningBatchStudents.setBatchAvgMarks(75);

        BackStudents backStudents = new BackStudents();
        backStudents.setCollege("SRM");
        backStudents.setBatch("back batch");
        backStudents.setBatchAvgMarks(60);
        backStudents.setBacks(3);

        studentRegistry.register("morning batch", morningBatchStudents);
        studentRegistry.register("evening batch", eveningBatchStudents);
        studentRegistry.register("evening batch", backStudents);
    }

    public static void main(String[] args) {
        registerToRegistry();
        Student praveen = studentRegistry.getStudent("evening batch").clone();
        praveen.setName("Praveen");
        praveen.setAge(27);

        Student ankur = studentRegistry.getStudent("morning batch").clone();
        ankur.setAge(27);
        ankur.setName("Ankur");

        Student nitin = studentRegistry.getStudent("evening batch").clone();
        nitin.setName("Nitin");
        nitin.setAge(28);

        System.out.println("DEBUG");
    }
}
