import Lesson_6.Calculator;
import org.junit.*;

public class TestCalc {

    Calculator calculator;

    @Before
    public void init() {
        System.out.println("new Calculator");
        calculator = new Calculator();
    }

    @Test
    public void test1() {
        Assert.assertEquals(4, calculator.add(2,2));
    }

//    @Test
//    public void test2() {
//        Assert.assertEquals(5, calculator.add(3,2));
//    }
//
//    @Test
//    public void test3() {
//        Assert.assertEquals(6, calculator.add(3,2));
//    }
//
//    @Test(timeout = 500)
//    @Ignore(value = "Я уверен, что данный тест работает правильно!")
//    public void testDiv1() {
//        Assert.assertEquals(10, calculator.div(10,1));
//    }

    @After
    public void shutdown() {
        System.out.println("end");
    }
}
