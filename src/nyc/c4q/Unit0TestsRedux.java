package nyc.c4q;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Unit0TestsRedux {

    // http://stackoverflow.com/a/1119559/198348
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testPrintHelloWorld() throws Exception {
        Unit0Exercises.print();
        assertEquals("I'm sorry Dave, I'm afraid I can't let you do that.\n", outContent.toString());
    }

    @Test
    public void testReturnPrimitiveBooleanFalseType() throws Exception {
        Class returnType = Unit0Exercises.class.getMethod("returnPrimitiveBooleanFalse").getReturnType();
        assertEquals(boolean.class, returnType);
    }

    @Test
    public void testReturnPrimitiveBooleanFalse() throws Exception {
        assertEquals(false, Unit0Exercises.returnPrimitiveBooleanFalse());
    }

    @Test
    public void testReturnPrimitiveInt55Plus44Type() throws Exception {
        Class returnType = Unit0Exercises.class.getMethod("returnPrimitiveInt55Plus44", null).getReturnType();
        assertEquals(int.class, returnType);
    }

    @Test
    public void testReturnPrimitiveInt55Plus44() throws Exception {
        assertEquals(99, Unit0Exercises.returnPrimitiveInt55Plus44());
    }

    @Test
    public void testReturnPrimitiveDouble2Point718Type() throws Exception {
        Class returnType = Unit0Exercises.class.getMethod("returnPrimitiveDouble2Point718").getReturnType();
        assertEquals(double.class, returnType);
    }

    @Test
    public void testReturnPrimitiveDouble2Point718() throws Exception {
        assertNotEquals(null, Unit0Exercises.returnPrimitiveDouble2Point718());
        assertEquals(2.718, (Double) Unit0Exercises.returnPrimitiveDouble2Point718(), 0.01);
    }

    @Test
    public void testReturnPrimitiveCharASCII35Type() throws Exception {
        Class returnType = Unit0Exercises.class.getMethod("returnPrimitiveCharASCII35").getReturnType();
        assertEquals(char.class, returnType);
    }

    @Test
    public void testReturnPrimitiveCharASCII35() throws Exception {
        assertEquals('#', Unit0Exercises.returnPrimitiveCharASCII35());
    }

    @Test
    public void testIsEven() throws Exception {
        assertTrue(Unit0Exercises.isEven(0));
        assertFalse(Unit0Exercises.isEven(1));
        assertTrue(Unit0Exercises.isEven(2));
        assertFalse(Unit0Exercises.isEven(3));
        assertTrue(Unit0Exercises.isEven(4));
        assertFalse(Unit0Exercises.isEven(5));
        assertTrue(Unit0Exercises.isEven(6));
    }

    @Test
    public void testIsMultipleOfX() throws Exception {
        assertTrue(Unit0Exercises.isMultipleOfX(0, 3));
        assertFalse(Unit0Exercises.isMultipleOfX(1, 3));
        assertFalse(Unit0Exercises.isMultipleOfX(2, 3));
        assertTrue(Unit0Exercises.isMultipleOfX(3, 3));
        assertFalse(Unit0Exercises.isMultipleOfX(10, 3));
        assertTrue(Unit0Exercises.isMultipleOfX(28, 7));
        assertTrue(Unit0Exercises.isMultipleOfX(-14, 7));
        assertFalse(Unit0Exercises.isMultipleOfX(-6, 7));
    }

    @Test
    public void testReturnSumOfOddNumbersBetween1And100UsingForLoop(){
        assertEquals(2500, Unit0Exercises.returnSumOfOddNumbersBetween1And100UsingForLoop());
    }

    @Test
    public void testReturnSumOfTheFirst200MultiplesOf3UsingForLoop(){
        assertEquals(59700, Unit0Exercises.returnSumOfTheFirst200MultiplesOf3UsingForLoop());
    }

    @Test
    public void testReturnSumOfOddNumbersBetween1And100UsingWhileLoop(){
        assertEquals(2500, Unit0Exercises.returnSumOfOddNumbersBetween1And100UsingWhileLoop());
    }

    @Test
    public void testReturnSumOfTheFirst200MultiplesOf3UsingWhileLoop(){
        assertEquals(59700, Unit0Exercises.returnSumOfTheFirst200MultiplesOf3UsingWhileLoop());
    }


}
