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
            int firstNumber = firstCharacterNumber- '0';
            int lastNumber = lastCharacterNumber - '0';
            if(isStartWithExclude(inputNumber)){
                firstNumber++;
            }
            if(isEndWithExclude(inputNumber)){
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
    public boolean isStartWithExclude(String input){
        return input.startsWith("(");
    }
    public boolean isEndWithExclude(String input){
        return input.endsWith(")");
    }

}
