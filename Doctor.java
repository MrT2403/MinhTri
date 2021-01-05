/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.TUAN
 */
public class Doctor {
    private String name;
    private String DoctorID;
    private String Department;
    private String visitTiming;
    private String days;

    public void setName(String name) {
        this.name = name;
    }

    public void setDoctorID(String DoctorID) {
        this.DoctorID = DoctorID;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setVisitTiming(String visitTiming) {
        this.visitTiming = visitTiming;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public Doctor(String DoctorID,String name, String Department, String visitTiming, String days) {
       
        this.DoctorID = DoctorID;
        this.name = name;
        this.Department = Department;
        this.visitTiming = visitTiming;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public String getDoctorID() {
        return DoctorID;
    }

    public String getDepartment() {
        return Department;
    }

    public String getVisitTiming() {
        return visitTiming;
    }

    public String getDays() {
        return days;
    }
}
