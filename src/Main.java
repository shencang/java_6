public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.buy(5000);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
    }
}
