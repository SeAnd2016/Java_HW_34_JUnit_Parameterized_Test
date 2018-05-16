package core;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Add2ParameterizedTest {
	   // Test data generator
       @Parameters(name = "Parameter # {index}: {1} + {2} = {0}")
       public static Collection<Double[]> addNumbers() {
              return Arrays.asList(new Double[][] {
                           { 3.0, 1.0, 2.0 }, 
                           { 5.0, 2.0, 3.0 }, 
                           { 7.0, 3.0, 4.0 }, 
                           { 9.0, 4.0, 5.0 },
              });}
       // @Parameter for Field injection
       @Parameter(value = 0) public Double expected;
       @Parameter(value = 1) public Double first;
       @Parameter(value = 2) public Double second;
       
       @Category(AcceptanceTest.class)
       @Test
       public void add() {
              System.out.println(first + " + " + second + " = " + expected);
              assertEquals("Result of addition of 2 parameters is wrong", Calculator.add(first, second), expected, 0.09);
       }
 }

