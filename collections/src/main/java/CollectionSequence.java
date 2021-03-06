// collections/CollectionSequence.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import typeinfo.pets.Pet;
import typeinfo.pets.LiteralPetCreator;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence
        extends AbstractCollection<Pet> {
    private Pet[] pets = new LiteralPetCreator().array(8);

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {              // [1]
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
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug
7:Manx
*/
