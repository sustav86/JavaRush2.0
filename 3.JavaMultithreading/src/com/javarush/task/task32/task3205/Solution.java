package task32.task3205;

import java.lang.reflect.Proxy;

/**
 * Created by ukr-sustavov on 30.06.2017.
 */
public class Solution {
    public static void main(String[] args) {
        SomeInterfaceWithMethods obj = getProxy();
        obj.stringMethodWithoutArgs();
        obj.voidMethodWithIntArg(1);

        /* expected output
        stringMethodWithoutArgs in
        inside stringMethodWithoutArgs
        stringMethodWithoutArgs out
        voidMethodWithIntArg in
        inside voidMethodWithIntArg
        inside voidMethodWithoutArgs
        voidMethodWithIntArg out
        */
    }

    public static SomeInterfaceWithMethods getProxy() {
        SomeInterfaceWithMethods obj = new SomeInterfaceWithMethodsImpl();
        SomeInterfaceWithMethods proxyObj = (SomeInterfaceWithMethods) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new CustomInvocationHandler(obj)
        );

        return proxyObj;
    }
}
