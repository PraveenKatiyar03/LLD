package org.example.LLD2.builder;

public class Student {

    public int student_id;

    public String name;

    public long phoneNumber;

    public String city;

    private Student(Builder builder){

        this.student_id=builder.student_id;
        this.name= builder.name;
        this.city= builder.city;
        this.phoneNumber=builder.phoneNumber;

    }

    // method to get the builder object without creating a Student object first
    public static Builder getBuilder(){
        return new Builder();
    }

    // Inner class (builder)
    public static class Builder {

        public int student_id;

        public String name;

        public long phoneNumber;

        public String city;


        public Builder(){};

        public Builder setStudent_id(int student_id){
            this.student_id=student_id;
            return this;
        }
        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setPhoneNumber(long phoneNumber){
            this.phoneNumber=phoneNumber;
            return this;
        }
        public Builder setCity(String city){
            this.city=city;
            return this;
        }


        public Student build(){

            if(this.student_id<0){
                throw new IllegalArgumentException("student id should not be less than 1");
            }
            if(this.phoneNumber==0){
                throw new IllegalArgumentException("phone number should not be empty");
            }

            return new Student(this);
        }


    }


}
