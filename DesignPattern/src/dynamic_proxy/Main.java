package dynamic_proxy;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		FTPDownloadProcess ftp = new FTPDownloadProcess();
		FTPDownloadProxy ftpprox = new FTPDownloadProxy(ftp);
		
		DownloadIntf downIntf = (DownloadIntf) Proxy.newProxyInstance(ftp.getClass().getClassLoader(),
																	  ftp.getClass().getInterfaces(),
																	  ftpprox);
		downIntf.downloadAction();
		downIntf.uploadAction();
	}

}
