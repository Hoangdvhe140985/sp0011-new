/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        Validation v = new Validation();

        while (true) {
            String inBase = v.inputBase("Enter the base number in: ",
                    "Only choose 2 or 10 or 16");
            String outBase = v.inputBase("Enter the base number out: ",
                    "Only choose 2 or 10 or 16");
            String value = v.inputValue("Enter the input value: ",
                    "Invalid value,please input again", inBase);
            System.out.println("Output value: ");
            changeBase(inBase, outBase, value.toUpperCase());

            // check Yes/No
            if (!chooseYesNo()) {
                return;
            }
        }
    }

    // changeBase
    public static void changeBase(String iBase, String oBase, String value) {
        ChangeBaseManager cb = new ChangeBaseManager();

        if (iBase.equals("10")) {
            System.out.println(cb.convertDecToOther(value, oBase));
        } else {
            String dec = cb.convertOtherToDec(value, iBase);
            System.out.println(cb.convertDecToOther(dec, oBase));
        }
    }

    // lựa chọn y/n
    public static boolean chooseYesNo() {
        Validation getInput = new Validation();
        String yesNo;
        yesNo = getInput.inputYesNo("Do you want to continue? Yes/No: ",
                "Must enter Y/y for yes,N/n for no !");
        return yesNo.equalsIgnoreCase("y");
    }
}
