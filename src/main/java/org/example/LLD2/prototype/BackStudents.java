package org.example.LLD2.prototype;

public class BackStudents extends Student{

    int backs;

    public int getBacks() {
        return backs;
    }

    public void setBacks(int backs) {
        this.backs = backs;
    }

    public BackStudents(){

    }

    public BackStudents(BackStudents backStudents){
        super(backStudents);
        this.backs=backStudents.backs;
    }

    public BackStudents clone(){
        return new BackStudents(this);
    }
}
