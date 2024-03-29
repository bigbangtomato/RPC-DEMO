package com.xxx.demo.client;

import com.xxx.demo.demo.MyServicePrx;
import com.xxx.demo.demo.MyServicePrxHelper;
import com.xxx.demo.demo.Order;

/**
 * Created by magicdoom on 2015/7/11.
 */
public class Myclient
{


    public void      start(int perCount)
    {
        int status = 0;
        Ice.Communicator ic = null;
        try {
            // 初始化通信器
            ic = Ice.Util.initialize();
            // 传入远程服务单元的名称、网络协议、IP以及端口，获取OnlineBook的远程代理，这里使用stringToProxy方式
            Ice.ObjectPrx base = ic
                    .stringToProxy("IcehelloBook:default -p 10000");
            // 通过checkedCast向下转型，获取OnlineBook接口的远程，并同时检测根据传入的名称获取服务单元是否OnlineBook的代理接口，如果不是则返回null对象
            MyServicePrx onlinBook = MyServicePrxHelper.checkedCast(base);
            if (onlinBook == null) {
                throw new Error("Invalid proxy");
            }


            long start=System.currentTimeMillis();
            int count=perCount;
            String x=null;
			Order order = new Order();
			order.orderId = 1;
            for(int i=0;i<count;i++)
            {
				onlinBook.hello(order);
               // x=   onlinBook.hello(String.valueOf(i));
                //System.out.println(x);
            }
            long used=System.currentTimeMillis()-start;
           // System.out.println(x);
            System.out.println("tps "+count*1000.0/used);
        } catch (Exception e) {
            e.printStackTrace();
            status = 1;
        } finally {
            if (ic != null) {
                ic.destroy();
            }
        }
      //  System.exit(status);
    }






    public static void main(String[] args) {
        new Myclient().start(300000);
    }
}
