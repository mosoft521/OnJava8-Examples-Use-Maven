// typeinfo/PetCount4.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import onjava.TypeCounter;
import typeinfo.pets.Pet;
import typeinfo.pets.LiteralPetCreator;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        new LiteralPetCreator().stream()
                .limit(20)
                .peek(counter::count)
                .forEach(p -> System.out.print(
                        p.getClass().getSimpleName() + " "));
        System.out.println("\n" + counter);
    }
}
/* Output:
Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat
EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse
Pug Mouse Cymric
{Rodent=5, Mouse=2, Hamster=1, Cymric=5, Dog=6,
EgyptianMau=2, Pet=20, Rat=2, Pug=3, Manx=7, Cat=9,
Mutt=3}
*/
