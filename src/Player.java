public class Player {
    private double totalAmount =0;
    private double amount =0;
    private  CalPrice calPrice = new Orgnic();

    public void buy(double amount){
        this.amount=amount;
        totalAmount +=amount;
        if (totalAmount > 30000) {//30000则改为金牌会员计算方式
            calPrice = new GoldVip();
        } else if (totalAmount > 20000) {//类似
            calPrice = new SuperVip();
        } else if (totalAmount > 10000) {//类似
            calPrice = new Vip();
        }

    }
    //计算客户最终要付的钱
    public Double calLastAmount() {
        return calPrice.calPrice(amount);
    }


}
