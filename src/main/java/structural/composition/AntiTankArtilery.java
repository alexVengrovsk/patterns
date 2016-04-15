package structural.composition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 1 on 15.04.2016.
 */
public class AntiTankArtilery implements Artilery {

    private static final Logger LOG = LoggerFactory.getLogger(AntiTankArtilery.class);

    @Override
    public String fire(int latitude, int longitude) {
        String result = "AntitankArtilery shout to " + latitude + "x" + longitude;
        LOG.info(result);
        return result;
    }
}
