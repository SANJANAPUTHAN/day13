package day13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
public static void main(String[] args) throws Exception {
	ExecutorService es=Executors.newFixedThreadPool(2);
	Future<String> future=es.submit(new Callableclass());
	System.out.println(future.get());
	
	
	Future<String> future1=es.submit(()->{ return "anu";});
	System.out.println(future1.get());
	es.shutdown();
	
	
}
}
class Callableclass implements Callable<String>
{
	@Override
	public String call() throws Exception {
		return "sanjana";
	}
}