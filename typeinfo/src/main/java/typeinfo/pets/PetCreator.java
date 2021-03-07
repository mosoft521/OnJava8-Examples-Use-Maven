// typeinfo/pets/Creator.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Creates random sequences of Pets
package typeinfo.pets;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class PetCreator implements Supplier<Pet> {
    private Random rand = new Random(47);

    // The different types of Pet to create:
    public abstract List<Class<? extends Pet>> types();

    @Override
    public Pet get() { // Create one random Pet
        int n = rand.nextInt(types().size());
        try {
            return types().get(n)
                    .getConstructor().newInstance();
        } catch (InstantiationException |
                NoSuchMethodException |
                InvocationTargetException |
                IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Stream<Pet> stream() {
        return Stream.generate(this);
    }

    public Pet[] array(int size) {
        return stream().limit(size).toArray(Pet[]::new);
    }

    public List<Pet> list(int size) {
        return stream().limit(size)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
