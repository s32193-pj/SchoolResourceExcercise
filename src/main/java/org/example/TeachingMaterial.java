package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeachingMaterial extends SchoolResource {
    private String subject;
    public boolean isInUse;

    public TeachingMaterial(int resourceID, String resourceName, String description, String subject, boolean isInUse) {
        super(resourceID, resourceName, description);
        setSubject(subject);
        this.isInUse = isInUse;
    }

    public void checkout(){
        if(!isInUse){
            isInUse = true;
        }else {
            System.out.println("Unavailable");
        }
    }
    public void checkIn(){
        if (isInUse){
            isInUse = false;
        }else {
            System.out.println("Resource not in your possession");
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
