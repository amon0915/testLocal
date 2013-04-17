package dynamic_proxy;

public class FTPDownloadProcess implements DownloadIntf{

	public void downloadAction() {
		System.out.println("Downloading~~");
		
	}

	@Override
	public void uploadAction() {
		System.out.println("Uploading~~");
		
	}
	
}
