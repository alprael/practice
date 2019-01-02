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
}