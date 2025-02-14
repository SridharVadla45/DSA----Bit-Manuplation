package src;

public class DecimalToBinary {

    public static String decimalToBinary(int decimal) {
        String result ="";
        while(decimal!=1){
            if(decimal%2==1)result="1"+result;
            else result="0"+result;
            decimal/=2;
        }
        result="1"+result;
        return result;
    }
}
