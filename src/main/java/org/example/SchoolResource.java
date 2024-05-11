package org.example;

import lombok.*;
@Setter
@Getter
abstract public class SchoolResource {
    private int resourceID;
    protected String resourceName;
    public String description;
    public static int totalResources;

    public SchoolResource(int resourceID, String resourceName, String description) {
        this.resourceID = resourceID;
        this.resourceName = resourceName;
        this.description = description;
    }

    public abstract String getResourceDetails();
    protected abstract void allocateResource();


}
