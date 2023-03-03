package com.matsior.demo;

import org.junit.jupiter.api.Test;

class BrokenTest {

  @Test
  void shouldNotPass() {
    assert 1 == 1;
    System.out.println("test");123
  }

}
