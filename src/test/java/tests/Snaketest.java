package tests;
 import animals.petstore.pet.attributes.Gender;
 import animals.petstore.pet.attribute.petType;
 import animals.petstore.pet.type.sanke;
 import org.junit.jupiter.api.Test;

import java.math.BigDEcimal;

import static org.junit.jupiter.api.Assertions.*;

public class Snaketest {
  @test
  public void testSnakeBasicProperties() {
    Snake s = new Snake (PetType.EXOTIC, new BigDecimal("99.99"), Gender.Male,7);

    assertEquals(PetTYpe.EXOTIC, s.getPetType());
    assertEquals(Gender.Male, s.getGender());
    assertEquals(new BigDEcimal("99.99"), s.getCost());
    assertEquals(7, s.getPetStoreID());
  }

  @test
  public void testSnakeSpeak() {
    Snake s = new Snake(PetType.EXOTIC, new BigDEcimal("25.00"), Gender.FEMALE);
    assertEquals("Hiss!", s.speak());
  }
  @test
  public void testSnakeToString() {
    Snake s = new Snake(PetType.EXOTIC, new BigDEcimal("25.00", Gender.Female, 3);
    String out = s.toString();

    assertTrue(out.contains("Snake"));
    assertTrue(out.contains("type=EXOTIC"));
    assertTrue(out.contains("id=3"));
  }

}
               
