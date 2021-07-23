public class MyRange {
    private String inputNumber;
    public MyRange(String inputNumber){
        this.inputNumber = inputNumber;
    }
    public String FindNumberInput(){
        String result = "";
        if(inputNumber != null) {
            int indexOfComma = inputNumber.indexOf(",");
            char firstCharacterNumber = inputNumber.charAt(indexOfComma-1);
            char lastCharacterNumber = inputNumber.charAt(indexOfComma+1);
            int firstNumber = convertCharacterToInteger(firstCharacterNumber);
            int lastNumber = convertCharacterToInteger(lastCharacterNumber);
            if(!isStartWithInclude(inputNumber)){
                firstNumber++;
            }
            if(!isEndWithInclude(inputNumber)){
                lastNumber--;
            }
            for(int i = firstNumber; i <= lastNumber; i++){
                if(i == lastNumber){
                    result += i ;
                }
                else {
                    result += i + ",";
                }
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
        return character - '0';
    }

}
