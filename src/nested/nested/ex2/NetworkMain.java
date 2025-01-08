package nested.nested.ex2;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");

        //new Network.NetworkMessage(); // private 이라서 생성 불가
    }
}
