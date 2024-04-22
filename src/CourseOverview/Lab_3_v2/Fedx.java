package CourseOverview.Lab_3_v2;

import java.util.HashMap;

public class Fedx extends Carrier{

    public static final HashMap<String, Double> zonePriceMap = new HashMap<>();
    static {
        zonePriceMap.put("IA", 0.35);
        zonePriceMap.put("MT", 0.35);
        zonePriceMap.put("OR", 0.35);
        zonePriceMap.put("CA", 0.35);

        zonePriceMap.put("TX", 0.30);
        zonePriceMap.put("UT", 0.30);

        zonePriceMap.put("FL", 0.55);
        zonePriceMap.put("MA", 0.55);
        zonePriceMap.put("OH", 0.55);

        zonePriceMap.put("OTHER", 0.43);
    }

    public Fedx() {
        super("FedEx");
    }

    @Override
    public double getSendingCost(Package p) {
        double zonePrice = zonePriceMap.get(p.getZone());
        return zonePrice * p.getWeight();
    }
}
