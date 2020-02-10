package edu.peng.sort;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;



public class HeapSortTest{
    private final List<Integer> simpleSorted = Arrays.asList(1,2,3,4,5,6,7,8);
  
    
    public void test(){
      List<Integer> shuffled = new ArrayList<>(simpleSorted);
      Collections.shuffle(shuffled, new Random(System.currentTimeMillis()));
      new HeapSort().sort(shuffled);

  }
}