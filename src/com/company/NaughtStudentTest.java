package com.company;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NaughtStudentTest {

    @Test
    public void NaughtyStudentTest(){
      NaughtyStudent naughtyStudent1 = new NaughtyStudent("Pepe",4474473,Year.THIRD, List.of(70.0,70.0,70.0));
      assertEquals((Double)70.0,naughtyStudent1.getAverageGrade());


    }

}
