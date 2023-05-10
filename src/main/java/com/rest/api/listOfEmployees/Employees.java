package com.rest.api.listOfEmployees;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    //to store the list of all the employees in an Array List
        private List<Employee> employeeList;

        // Method to return the list of employees
        public List<Employee> getEmployeeList()
        {

            if (employeeList == null) {

                employeeList
                        = new ArrayList<>();

            }

            return employeeList;

        }
        public void
        setEmployeeList(
                List<Employee> employeeList)
        {
            this.employeeList
                    = employeeList;
        }
    }


