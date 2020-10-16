public class main {
    public static void main(String[] args) {
        System.out.println(toRoman(2553));;
    }
    private static String toRoman(int inputNumber){
        StringBuilder answer = new StringBuilder();
        String[] options = {"I", "V", "X", "L", "C", "D", "M"};
        String[] badOptions = {options[0]+options[1],options[0]+options[2],options[2]+options[3],options[2]+options[4],options[2]+options[5],options[2]+options[6]};
        int refernce = inputNumber;

        for (int i = 0; i <= refernce;) {
            if(inputNumber-1000 >= 0){
                answer.append(options[6]);
                i += 1000;
                inputNumber -= 1000;
            }else if(inputNumber-990 >= 0){
                answer.append(badOptions[5]);
                i += 990;
                inputNumber -= 990;
            }else if(inputNumber-500 >= 0){
                answer.append(options[5]);
                i += 500;
                inputNumber -= 500;
            }else if(inputNumber-490 >= 0){
                answer.append(badOptions[4]);
                i += 490;
                inputNumber -= 500;
            }else if(inputNumber-100 >= 0){
                answer.append(options[4]);
                i += 100;
                inputNumber -= 100;
            }else if(inputNumber-90 >= 0){
                answer.append(badOptions[3]);
                i += 90;
                inputNumber -= 90;
            }else if(inputNumber-50 >= 0){
                answer.append(options[3]);
                i += 50;
                inputNumber -= 50;
            }else if(inputNumber-40 >= 0){
                answer.append(badOptions[2]);
                i += 40;
                inputNumber -= 40;
            }else if(inputNumber-10 >= 0){
                answer.append(options[2]);
                i += 10;
                inputNumber -= 10;
            }else if(inputNumber-9 >= 0){
                answer.append(badOptions[1]);
                i += 9;
                inputNumber -= 9;
            }else if(inputNumber-5 >= 0){
                answer.append(options[1]);
                i += 5;
                inputNumber -= 5;
            }else if(inputNumber-4 >= 0){
                answer.append(badOptions[0]);
                i += 4;
                inputNumber -= 4;
            }else if(inputNumber-1 >= 0){
                answer.append(options[0]);
                i += 1;
                inputNumber -= 1;
            }else{
                return answer.toString();
            }
        }
        return answer.toString();
    }
}
