// collections/NonCollectionSequence.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import typeinfo.pets.Pet;
import typeinfo.pets.LiteralPetCreator;

import java.util.Iterator;

class PetSequence {
    protected Pet[] pets = new LiteralPetCreator().array(8);
}

public class NonCollectionSequence extends PetSequence {
    public static void main(String[] args) {
        NonCollectionSequence nc =
                new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
}
/* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug
7:Manx
*/
