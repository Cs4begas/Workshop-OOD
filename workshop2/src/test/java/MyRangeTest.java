import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {
    @Test
    @DisplayName("ทดสอบเคส (1,5) ต้องได้ตัวเลข 1")
    public  void caseGetFirstNumber(){
        String inputNumber = "(1,5)";
        MyRange myRange = new MyRange(inputNumber);
        int result = myRange.getFirstNumber();
        assertEquals(1,result);
    }
    @Test
    @DisplayName("ทดสอบเคส (1,5) ต้องได้ตัวเลข 5")
    public  void caseGetLastNumber(){
        String inputNumber = "(1,5)";
        MyRange myRange = new MyRange(inputNumber);
        int result = myRange.getLastNumber();
        assertEquals(5,result);
    }

    @Test
    @DisplayName("ทดสอบเคส [1,5] ขึ้นด้วย [ ผลที่ได้คือ true")
    public  void caseCheckStartWithInclude(){
        String inputNumber = "[1,5]";
        MyRange myRange = new MyRange(inputNumber);
        boolean result = myRange.isStartWithInclude(inputNumber);
        assertTrue(result);
    }

    @Test
    @DisplayName("ทดสอบเคส [1,5] ลงท้ายด้วย ] ผลที่ได้คือ true")
    public  void caseCheckEndWithInclude(){
        String inputNumber = "[1,5]";
        MyRange myRange = new MyRange(inputNumber);
        boolean result = myRange.isStartWithInclude(inputNumber);
        assertTrue(result);
    }

    @Test
    @DisplayName("ทดสอบแปลง character เป็น int '1' ผลที่ได้ต้องได้ 1")
    public  void caseConvertNumber(){
        String inputNumber = "[1,5]";
        MyRange myRange = new MyRange(inputNumber);
        int result = myRange.convertCharacterToInteger('1');
        assertEquals(result,1);
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