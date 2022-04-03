public class BClazz {

    private SocketClient socketClient;
    //디폴트 생성자
    public BClazz(){

        this.socketClient = SocketClient.getInstance();
    }
    public SocketClient getSocketClient(){

        return this.socketClient;
    }
}
