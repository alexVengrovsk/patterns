package structural;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.composition.AntiTankArtilery;
import structural.composition.Artilery;
import structural.composition.ArtileryComposition;
import structural.composition.Hovitzer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by 1 on 15.04.2016.
 */
public class CompositionTest {

    @Test
    public void compositionTest() {
        ArtileryComposition artileryComposition = new ArtileryComposition();
        artileryComposition.addArtilery(new AntiTankArtilery());
        artileryComposition.addArtilery(new Hovitzer());

        Artilery artilery = artileryComposition;
        String result = artilery.fire(12, 32);

        assertEquals(result, "AntitankArtilery shout to 12x32\nHowitzer shout to 12x32");
    }
}
