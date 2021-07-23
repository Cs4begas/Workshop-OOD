public class MyRange {
    private final String inputNumber;
    private static final char ASCII_VALUE = 48;
    private int indexOfComma;
    public MyRange(String inputNumber){
        this.inputNumber = inputNumber;
        this.indexOfComma = inputNumber.indexOf(",");
    }
    public String FindNumberInput(){
        String result = "";
        if(inputNumber != null) {
            int firstNumber = getFirstNumber();
            int lastNumber = getLastNumber();
            if(!isStartWithInclude(inputNumber)){
                firstNumber++;
            }
            if(!isEndWithInclude(inputNumber)){
                lastNumber--;
            }
            result = generateResult(result, firstNumber, lastNumber);
        }
        return result;
    }

    public int getFirstNumber(){
        char firstCharacterNumber = inputNumber.charAt(this.indexOfComma-1);
        return convertCharacterToInteger(firstCharacterNumber);
    }

    public int getLastNumber(){
        char lastCharacterNumber = inputNumber.charAt(this.indexOfComma+1);
        return convertCharacterToInteger(lastCharacterNumber);
    }

    private String generateResult(String result, int firstNumber, int lastNumber) {
        for(int i = firstNumber; i <= lastNumber; i++){
            if(i == lastNumber){
                result += i ;
            }
            else {
                result += i + ",";
            }
        }
        return result;
    }

    public boolean isStartWithInclude(String input){
        return input.startsWith("[");
    }
    public boolean isEndWithInclude(String input){
        return input.endsWith("]");
    }
    public int convertCharacterToInteger(char character){
        return character - ASCII_VALUE;
    }

}
