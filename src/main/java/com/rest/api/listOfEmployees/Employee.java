package com.rest.api.listOfEmployees;


// define the Employee entity
public class Employee {
    //Parameterized Constructor have one or more than one argument
    // and allows more than one parameterized constructor in a class
public Employee(){}
    public Employee(
            Integer id, String first_Name,
            String last_Name, String email_Id)
    {

        super();// calling parent class constructor object.

        this.id = id;// with reference to object, if we use same name, to differentiate we use this keyword.

        this.first_Name = first_Name;

        this.last_Name = last_Name;

        this.email_Id = email_Id;


    }
    private Integer id;

    private String first_Name;

    private String last_Name;

    private String email_Id;
    // Overriding the toString method
    // The default toString() method in Object prints “class name @ hash code”.
    // We can override the toString() method in our class to print proper output.
@Override
    public String toString() {


        return "Employee [id="
                + id + ", first_Name="
                + first_Name + ", last_Name="
                + last_Name + ", email_Id="
                + email_Id + "]";


    }
    //Getters and setters of the properties
    //we can pass input by 2 methods one by constructor and 2nd by getters and setters
    public Integer getId()
    {

        return id;
    }

    public void setId(Integer id)
    {

        this.id = id;
    }

    public String getFirstName()
    {

        return first_Name;
    }

    public void setFirstName(
            String first_Name)
    {

        this.first_Name = first_Name;
    }

    public String getLast_Name()
    {

        return last_Name;
    }

    public void setLastName(
            String last_Name)
    {

        this.last_Name = last_Name;
    }

    public String getEmail()
    {

        return email_Id;
    }

    public void setEmail(String email_Id)
    {

        this.email_Id = email_Id;
    }
}


