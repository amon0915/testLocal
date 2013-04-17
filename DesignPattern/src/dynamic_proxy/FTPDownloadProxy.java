package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javax.script.Invocable;
import javax.script.ScriptException;

public class FTPDownloadProxy implements InvocationHandler {

	private Object dele;
	public FTPDownloadProxy(FTPDownloadProcess dele){
		this.dele = dele;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before");
		Object result = method.invoke(dele, args);
		System.out.println("after");
		return result;
	}
}
