import java.util.List;
import java.util.Objects;

public class KarateChop {

    private static final Integer NOT_FOUND = -1;

    public static Integer find(List<Integer> karatekas, Integer karateka) {

        //returns -1 if not founded.
        int foundAtIndex = NOT_FOUND;

        int firstKarateka = 0;
        int lastKarateka = karatekas.size() - 1;

        while (firstKarateka <= lastKarateka) {

            int middleKarateka = firstKarateka  + ((lastKarateka - firstKarateka) / 2);

            if (Objects.equals(karatekas.get(middleKarateka), karateka)) {
                return middleKarateka;
            }

            if (karatekas.get(middleKarateka) < karateka) {
                firstKarateka = middleKarateka + 1;
            } else if (karatekas.get(middleKarateka) > karateka) {
                lastKarateka = middleKarateka - 1;
            }
        }
        return foundAtIndex;
    }
}
