import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {
    @Test
    @DisplayName("ทดสอบเคส [1,5] ขึ้นด้วย [ ผลที่ได้คือ false")
    public  void caseCheckStartWithInclude(){
        String inputNumber = "[1,5]";
        MyRange myRange = new MyRange(inputNumber);
        boolean result = myRange.isStartWithExclude(inputNumber);
        assertEquals(false,result);
    }

    @Test
    @DisplayName("ทดสอบเคส [1,5] ลงท้ายด้วย ] ผลที่ได้คือ false")
    public  void caseCheckEndWithInclude(){
        String inputNumber = "[1,5]";
        MyRange myRange = new MyRange(inputNumber);
        boolean result = myRange.isStartWithExclude(inputNumber);
        assertEquals(false,result);
    }

    @Test
    @DisplayName("ทดสอบเคส [1,5]")
    public  void caseAllNumber(){
        String inputNumber = "[1,5]";
        MyRange myRange = new MyRange(inputNumber);
        String result = myRange.FindNumberInput();
        assertEquals("1,2,3,4,5",result);
    }
    @Test
    @DisplayName("ทดสอบเคส [1,5)")
    public  void caseExcludeLast(){
        String inputNumber = "[1,5)";
        MyRange myRange = new MyRange(inputNumber);
        String result = myRange.FindNumberInput();
        assertEquals("1,2,3,4",result);
    }
    @Test
    @DisplayName("ทดสอบเคส (1,5]")
    public  void caseExcludeFirst(){
        String inputNumber = "(1,5]";
        MyRange myRange = new MyRange(inputNumber);
        String result = myRange.FindNumberInput();
        assertEquals("2,3,4,5",result);
    }

    @Test
    @DisplayName("ทดสอบเคส (1,5)")
    public  void caseExcludeFirstAndLast(){
        String inputNumber = "(1,5)";
        MyRange myRange = new MyRange(inputNumber);
        String result = myRange.FindNumberInput();
        assertEquals("2,3,4",result);
    }
}