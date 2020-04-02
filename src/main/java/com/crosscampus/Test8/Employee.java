package com.crosscampus.Test8;



public class Employee {

    public int EmpNo;
    public String EmpNm;
    public int Sal;

    public Employee(int empNo, String empNm, int sal, int deptno) {
        EmpNo = empNo;
        EmpNm = empNm;
        Sal = sal;
        this.deptno = deptno;
    }

    public int deptno;



    @Override
    public String toString() {
        return "Employee{" +
                "EmpNo=" + EmpNo +
                ", EmpNm='" + EmpNm + '\'' +
                ", Sal=" + Sal +
                ", deptno=" + deptno +
                '}';
    }





    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int empNo) {
        EmpNo = empNo;
    }

    public String getEmpNm() {
        return EmpNm;
    }

    public void setEmpNm(String empNm) {
        EmpNm = empNm;
    }

    public int getSal() {
        return Sal;
    }

    public void setSal(int sal) {
        Sal = sal;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }



}
