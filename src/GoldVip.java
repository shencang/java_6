public class GoldVip implements CalPrice {
    @Override
    public double calPrice(double orgnicPrice) {
        return orgnicPrice*0.7;
    }
}
