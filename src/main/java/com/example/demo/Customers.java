package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@component is used for spring to be awared that this class depends on beans as set up in application context
public class Customers {
    private  int custId;
    private String courseName;
    private String custName;
    @Autowired
//    auto wired is used in other for class imlementing another class be aware of the class being implemented e.g
//    technologies class is being implemented here within Customer class @autowired is placed so as to get technologies class

    private Technologies techDetails;


    public Technologies getTechDetails() {
        return techDetails;
    }

    public void setTechDetails(Technologies techDetails) {
        this.techDetails = techDetails;
    }


    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
public void displayResult(){
        System.out.println("Customers objects returned successfully");
        techDetails.tech();
}


}
