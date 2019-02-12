package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddAllTest {

  @Test
  void dontGiveMeFive() {
    assertEquals(8, AddAll.dontGiveMeFive(1,9));
    assertEquals(12, AddAll.dontGiveMeFive(4,17));
    assertEquals(90, AddAll.dontGiveMeFive(1,100));
  }

  @Test
  void getSum() {
    assertEquals(44, AddAll.getSum(2, 9));
    assertEquals(68, AddAll.getSum(5, 12));
    assertEquals(-1, AddAll.getSum(0, -1));
  }

  @Test
  void testSolution() {
      assertEquals("############5616", AddAll.maskify("4556364607935616"));
      assertEquals("#######5616",      AddAll.maskify(     "64607935616"));
      assertEquals("1",                AddAll.maskify(               "1"));
      assertEquals("",                 AddAll.maskify(                ""));

      // "What was the name of your first pet?"
      assertEquals("##ippy",                                    AddAll.maskify("Skippy")                                  );
      assertEquals("####################################man!",  AddAll.maskify("Nananananananananananananananana Batman!"));
    }

  @Test
  void testSomething() {

    assertEquals(0, AddAll.cubeOdd(new int[] {-5, -5, 5, 5}));
    assertEquals(28, AddAll.cubeOdd(new int[] {1, 2, 3, 4}));
    assertEquals(0, AddAll.cubeOdd(new int[] {-3, -2, 2, 3}));

  }

  @Test
  void test() {
    assertEquals("Most Trees Are Blue", AddAll.toJadenCase("most trees are blue"));
  }

  @Test
  void testNullArg() {
    assertNull("Must return null when the arg is null", AddAll.toJadenCase(null));
  }

  @Test
  void testEmptyArg() {
    assertNull("Must return null when the arg is empty string", AddAll.toJadenCase(""));
  }

  @Test
  void toMilesPerHour() {
    assertEquals(6, AddAll.toMilesPerHour(10.25));
    assertEquals(-1, AddAll.toMilesPerHour(-5.6));
  }

  @Test
  void repeatSeparator() {
    assertEquals("ABABABABA", AddAll.repeatSeparator("A", "B", 5));
    assertEquals("ThisAndThis", AddAll.repeatSeparator("This", "And", 2));
    assertEquals("MeAndMeAndMe", AddAll.repeatSeparator("Me", "And", 3));
  }
}