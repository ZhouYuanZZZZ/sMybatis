package zy.smybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zy.smybatis.entity.Employees;
import zy.smybatis.entity.EmployeesExample;

public interface EmployeesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    int countByExample(EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    int deleteByExample(EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    int deleteByPrimaryKey(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    int insert(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    int insertSelective(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    List<Employees> selectByExample(EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    Employees selectByPrimaryKey(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    int updateByExampleSelective(@Param("record") Employees record, @Param("example") EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    int updateByExample(@Param("record") Employees record, @Param("example") EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    int updateByPrimaryKeySelective(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMPLOYEES
     *
     * @mbggenerated Wed Apr 29 00:14:08 CST 2020
     */
    int updateByPrimaryKey(Employees record);
}