 
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class Validation {

    Scanner sc = new Scanner(System.in);

    // validate inputBase
    public String inputBase(String msg, String err) {
        while (true) {
            System.out.print(msg);
            String base = sc.nextLine();
            if (base.equals("2") || base.equals("10") || base.equals("16")) {
                return base;
            }
            System.out.println(err);
        }
    }

    
    // validate input value
    public String inputValue(String msg, String err, String inBase) {
        while (true) {
            System.out.print(msg);
            String value = sc.nextLine();
            if (inBase.equals("2")) {
                //from 0-1 is repeated many times
                if (value.matches("[0-1]+")) {
                    return value;
                }
            }
            if (inBase.equals("10")) {
                //from 0-9 is repeated many times
                if (value.matches("[0-9]+")) {
                    return value;
                }
            }
            if (inBase.equals("16")) {
                //from 0-9 and a-f is repeated many times
                if (value.matches("[0-9a-fA-F]+")) {
                    return value;
                }
            }
            System.out.println(err);
        }
    }

    // validate input yes/no
    public String inputYesNo(String msg, String err) {
        while (true) {
            System.out.print(msg);
            String yesNo = sc.nextLine();
            if (yesNo.matches("[yYnN]")) {
                return yesNo;
            }
            System.out.println(err);
        }
    }
}
