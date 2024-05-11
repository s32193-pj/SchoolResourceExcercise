package org.example;

import lombok.*;
@Getter
@Setter

public class Employee extends SchoolResource{

    private double salary;
    public String department;

    public Employee(int resourceID, String resourceName, String description, double salary, String department) {
        super(resourceID, resourceName, description);
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String getResourceDetails(){
        return  "ResourceID=" + getResourceID() + "\n" +
                "ResourceName=" + resourceName + '\n' +
                "Salary=" + salary + '\n' +
                "Department=" + department;
    }

    public void getDetails(){
        System.out.print(getResourceDetails());
    }

    @Override
    protected void allocateResource() {
    }

    public void work(){
        System.out.print(description);
    }
}
