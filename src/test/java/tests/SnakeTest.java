package tests;

import animals.AnimalType;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Snake;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class SnakeTest {


  @Test
  public void snakeConstructorTest() {
    Snake s = new Snake(
            AnimalType.DOMESTIC,
            Skin.SCALES,
            Gender.FEMALE,
            new BigDecimal("55.00"),
            10
    );

    assertEquals(Gender.FEMALE, s.getGender());
    assertEquals(10, s.getPetStoreId());
    assertEquals(0, new BigDecimal("55.00").compareTo(s.getCost()));
  }

  @Test
  public void snakeToStringNoStoreIdTest() {
    Snake s = new Snake(
            AnimalType.DOMESTIC,
            Skin.SCALES,
            Gender.MALE,
            new BigDecimal("12.00")
    );

    String out = s.toString();
    assertTrue(out.contains("gender"));
    assertFalse(out.contains("pet store id"));
  }

  @Test
  public void snakeToStringWithStoreIdTest() {
    Snake s = new Snake(
            AnimalType.DOMESTIC,
            Skin.SCALES,
            Gender.FEMALE,
            new BigDecimal("12.00"),
            44
    );

    String out = s.toString();
    assertFalse(out.contains("pet store id"));
    assertTrue(out.contains("44"));
  }
}
