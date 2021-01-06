
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class ChangeBaseManager {
    //convert from 2,16 to 10
    public String convertOtherToDec(String value, String ibase){
        BigInteger result = BigInteger.ZERO;
        String hex = "0123456789ABCDEF";
        BigInteger inBase = new BigInteger(ibase);
        for (int i = 0; i < value.length(); i++) {
            // change to biginteger
            BigInteger num = BigInteger.valueOf(hex.indexOf(value.charAt(i))); 
             // num là giá trị ứng với từng phần tử trong chuỗi nhập vào
             //num is the value for each element in the input string
            // kết quả sẽ là tổng của số num vừa get được x hệ lũy thùy với số mũ tương ứng
            //result will is sum of num just got given x with power with corresponding exponent
            result = result.add(num.multiply(inBase.pow(value.length() - 1 - i)));
        }
        return result.toString();
    }
    
    //convert from 10 to 2,16
    public String convertDecToOther(String decNumber, String obase){
        String result = "";
        String hex = "0123456789ABCDEF";
        BigInteger dec = new BigInteger(decNumber);
        BigInteger outbase = new BigInteger(obase);
        
        while(dec.compareTo(BigInteger.ZERO) > 0){
            // value of index is the residual divisor obtained (là value dư thu được)
            int index = dec.mod(outbase).intValue();
            result = hex.charAt(index) + result;
            //divide number to decrease the original number 
            //chia nguyên để giảm số ban đầu
            dec = dec.divide(outbase);
        }
        return result;
    }
}
