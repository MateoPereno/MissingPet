package ar.com.missingpets.rest.dto;

import ar.com.missingpets.entity.Dog;

public class DogDTO {

    private String id;
    private String name;
    private String breed;
    private String size;
    private String colour;
    private String gender;
    private Boolean active;
    private String description;

    public DogDTO() {
    }

    public DogDTO(Dog dog) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.gender = gender;
        this.active = active;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
