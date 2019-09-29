package com.example.eam;

import com.example.eam.domain.Employee;
import com.example.eam.domain.Login;
import com.example.eam.mapper.EmployeeMapper;
import com.example.eam.mapper.LoginMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @version 1.0.0
 * @Author 凌波水月
 * @date 2019/9/28 13:31
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class EamApplicationTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 一开始测试的时候跑一下空方法，跑的通说明基本没问题
     */
    @Test
    public void test(){

    }


    @Test
    public void testEmployee(){
        Employee employee = new Employee();

        employee.setEmployeeName("");
        employee.setEmployeeSex(false);
        employee.setDepartmentId(1L);
        employee.setEmployeePhone("");
        employee.setEmployeeStatus(false);
        employee.setEmployeeEmail("");
        employee.setEmployeeIdentify("");
        employee.setEmployeeEducation("");
        employee.setEmployeeNativePlace("");
        employee.setEmployeeMaritalStatus(false);
        employee.setBirthdate("");
        employee.setEntrydate("");
        employeeMapper.insert(employee);

    }

}
