// enums/Burrito2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {java enums.Burrito2}

import enums.SpicinessEnum;

import static enums.SpicinessEnum.HOT;
import static enums.SpicinessEnum.MEDIUM;
import static enums.SpicinessEnum.NOT;

public class Burrito2 {
    SpicinessEnum degree;

    public Burrito2(SpicinessEnum degree) {
        this.degree = degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito2(NOT));
        System.out.println(new Burrito2(MEDIUM));
        System.out.println(new Burrito2(HOT));
    }

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }
}
/* Output:
Burrito is NOT
Burrito is MEDIUM
Burrito is HOT
*/
