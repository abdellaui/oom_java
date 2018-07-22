package u11_proxy;

public class ProxyInternetConnection implements InternetConnection{
	private NetworkInternetConnection con = new NetworkInternetConnection();
	@Override
	public void connectToHost(String host) {
		// TODO Auto-generated method stub
		con.connectToHost(host);
	}

}
