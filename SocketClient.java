public class SocketClient {

    private static SocketClient socketClient = null;
    //싱글톤은 생성자가 필수다
    private SocketClient(){

    }
    public static SocketClient getInstance(){
        if(socketClient== null){
           socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
