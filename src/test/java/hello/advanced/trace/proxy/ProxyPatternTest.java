package hello.advanced.trace.proxy;

import hello.advanced.trace.proxy.code.CacheProxy;
import hello.advanced.trace.proxy.code.ProxyPatternClient;
import hello.advanced.trace.proxy.code.RealSubject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {


    @Test
    void noProxyText(){
        //given
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        client.execute();
        client.execute();
        client.execute();
        //when

        //then
    }

    @Test
    void cacheProxyText(){
        //given
        RealSubject realSubject = new RealSubject();
        CacheProxy cacheProxy = new CacheProxy(realSubject);
        ProxyPatternClient client = new ProxyPatternClient(cacheProxy);
        client.execute();
        client.execute();
        client.execute();

        //when

        //then
    }
}
