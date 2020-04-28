package zy.smybatis.entity;

import java.util.Date;

public class Employees {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.employee_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private Integer employeeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.first_name
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.last_name
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.email
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.phone_number
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private String phoneNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.hire_date
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private Date hireDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.job_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private String jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.salary
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private Float salary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.commission_pct
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private Float commissionPct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.manager_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private Integer managerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMPLOYEES.department_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    private Integer departmentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.employee_id
     *
     * @return the value of EMPLOYEES.employee_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.employee_id
     *
     * @param employeeId the value for EMPLOYEES.employee_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.first_name
     *
     * @return the value of EMPLOYEES.first_name
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.first_name
     *
     * @param firstName the value for EMPLOYEES.first_name
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.last_name
     *
     * @return the value of EMPLOYEES.last_name
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.last_name
     *
     * @param lastName the value for EMPLOYEES.last_name
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.email
     *
     * @return the value of EMPLOYEES.email
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.email
     *
     * @param email the value for EMPLOYEES.email
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.phone_number
     *
     * @return the value of EMPLOYEES.phone_number
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.phone_number
     *
     * @param phoneNumber the value for EMPLOYEES.phone_number
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.hire_date
     *
     * @return the value of EMPLOYEES.hire_date
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.hire_date
     *
     * @param hireDate the value for EMPLOYEES.hire_date
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.job_id
     *
     * @return the value of EMPLOYEES.job_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.job_id
     *
     * @param jobId the value for EMPLOYEES.job_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.salary
     *
     * @return the value of EMPLOYEES.salary
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public Float getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.salary
     *
     * @param salary the value for EMPLOYEES.salary
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setSalary(Float salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.commission_pct
     *
     * @return the value of EMPLOYEES.commission_pct
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public Float getCommissionPct() {
        return commissionPct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.commission_pct
     *
     * @param commissionPct the value for EMPLOYEES.commission_pct
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setCommissionPct(Float commissionPct) {
        this.commissionPct = commissionPct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.manager_id
     *
     * @return the value of EMPLOYEES.manager_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.manager_id
     *
     * @param managerId the value for EMPLOYEES.manager_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMPLOYEES.department_id
     *
     * @return the value of EMPLOYEES.department_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMPLOYEES.department_id
     *
     * @param departmentId the value for EMPLOYEES.department_id
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}