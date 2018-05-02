public class Vip implements CalPrice {
    @Override
    public double calPrice(double orgnicPrice) {
        return orgnicPrice*0.9;
    }
}
