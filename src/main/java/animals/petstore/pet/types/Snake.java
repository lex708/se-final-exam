
package animals.petstore.pet.types;

import animals.AnimalType;
import animals.petstore.pet.Pet;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.PetType;
import animals.petstore.pet.attributes.Skin;

import java.math.BigDecimal;

public class Snake extends Pet {

    private final AnimalType animalType;
    private final Skin skinType;

    private static final String SOUND = "Hiss";

    // No petStoreId
    public Snake(AnimalType animalType,
                 Skin skinType,
                 Gender gender,
                 BigDecimal cost)

    {
        super(PetType.SNAKE,cost,gender);
        this.animalType = animalType;
        this.skinType = skinType;
    }

    // With petStoreId
    public Snake(AnimalType animalType,
                 Skin skinType,
                 Gender gender,
                 BigDecimal cost,
                 int petStoreId)
    {
        super(PetType.SNAKE, cost, gender, petStoreId);
        this.animalType = animalType;
        this.skinType = skinType;
    }

    public AnimalType getAnimalType() { return animalType; }
    public Skin getSkinType() { return skinType; }

    @Override
    public String toString() {
        return "Snake {" +
                "petType=" + getPetType() +
                ", gender=" + getGender() +
                ", cost=" + getCost() +
                ", animalType=" + animalType +
                ", skin=" + skinType +
                ", petStoreId=" + getPetStoreId() +
                ", sound=" + SOUND +
                '}';
    }
}


