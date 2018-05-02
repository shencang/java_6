public class SuperVip implements CalPrice {
    @Override
    public double calPrice(double orgnicPrice) {
        return orgnicPrice*0.8;
    }
}
