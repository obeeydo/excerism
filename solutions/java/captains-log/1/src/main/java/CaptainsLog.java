import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private char random;

    CaptainsLog(Random random) {
        this.random = randomPlanetClass();
    }

    char randomPlanetClass() {
        return 1;
    }

    String randomShipRegistryNumber() {
        throw new UnsupportedOperationException("Please implement the CaptainsLog.randomShipRegistryNumber() method");
    }

    double randomStardate() {
        throw new UnsupportedOperationException("Please implement the CaptainsLog.randomStardate() method");
    }
}
