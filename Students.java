package com.Sharad;

public class Students {

    private int rollNumber;

    private int maths;
    private int science;
    private int computer;

    private String name;

    public Students(int rollNumber,String name, int maths,int science ,int computer){
        this.rollNumber = rollNumber;
        this.name = name;
       this.maths = maths;
       this.science = science;
       this.computer = computer;
    }

    public String toString(){

        return "Roll-NO: "+rollNumber + " " +"Name: "+ name + " " + "Maths: " + maths + " Science: " + science + " computer: " + computer + "\n";

    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
