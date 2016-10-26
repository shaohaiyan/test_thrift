package test_thrift.test_thrift.server;

import org.apache.thrift.TException;

public class HelloServiceImpl implements HelloWorldService.Iface  {

	@Override
	public String sayHello(String username) throws TException {
		// TODO Auto-generated method stub
		System.out.println("已经到达服务端");
		return "hi "+username;
	}

}
