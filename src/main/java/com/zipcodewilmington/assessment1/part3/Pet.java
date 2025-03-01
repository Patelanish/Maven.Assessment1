package com.zipcodewilmington.assessment1.part3;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {

String name;
Integer age;
PetOwner owner;
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {

        this.name = "";
        this.age = 0;

    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {

        this.name = name;
        this.age = 0;

    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {

        this.name = "";
        this.age = age;

    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {

        this.name = name;
        this.age = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {

        return age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {

        this.owner = newPetOwner;

    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {

        return owner;
    }
}
