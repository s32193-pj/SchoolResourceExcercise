package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Equipment extends SchoolResource{
    protected String location;
    public boolean isFunctional;

    public Equipment(int resourceID, String resourceName, String description, String location, boolean isFunctional) {
        super(resourceID, resourceName, description);
        this.location = location;
        this.isFunctional = isFunctional;
    }

    public void relocate(String newLocation){
        location = newLocation;
    }
    public void repair(){
        if(!isFunctional){
            isFunctional = true;
        }else {
            System.out.print("No need to repair equipment");
        }
    }


    @Override
    public String getResourceDetails() {
        return "";
    }

    @Override
    protected void allocateResource() {
    }
}
