package animals.petstore.pet.type;
import animals.petstore.pet.Pet;
import animals.petsotre.pet.attributes.Gender;
import animals.petsotre.pet.attribute.PetType

import java.math.BigDecimal;

public class Snake extends pet {
  public Snake(PetType petType, BigDecimals cost, Gender gender, int petStored) {
    super(petType, cost, gender, petStoredID);
  }
  public String speak() {
    retyrn "Hiss";
  }

@Override 
  public String toString() {
    return "Snake{" +
      "type=" + getPetType() +
      ", id=" + getGender() +
      ", gender=" + getGender() +
      ", cost=" + getCost() +
      '}' ;
  }

}
