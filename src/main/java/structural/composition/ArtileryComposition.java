package structural.composition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by 1 on 15.04.2016.
 */
public class ArtileryComposition implements Artilery {

    private Collection<Artilery> artileries = new ArrayList<>();

    @Override
    public String fire(int latitude, int longitude) {
        return artileries.stream().map(a -> a.fire(latitude, longitude)).collect(Collectors.joining("\n"));
    }

    public void addArtilery(Artilery artilery) {
        artileries.add(artilery);
    }

    public void removeAll() {
        artileries.clear();
    }
}
