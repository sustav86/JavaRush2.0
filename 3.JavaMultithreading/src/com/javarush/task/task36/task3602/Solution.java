package task36.task3602;

import java.lang.reflect.*;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ukr-sustavov on 14.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());

    }

    public static Class getExpectedClass() {
        int indexOfModifier;
        Class[] clazz = Collections.class.getDeclaredClasses();
        for (Class cl : clazz) {
            indexOfModifier = cl.getModifiers();
            if (List.class.isAssignableFrom(cl) && Modifier.isPrivate(indexOfModifier) && Modifier.isStatic(indexOfModifier)) {
                Method[] methods = cl.getDeclaredMethods();
                for (Method meth : methods) {
                    if (meth.getName().equals("get")) {
                        try {
                            meth.setAccessible(true);
//                            Object of = cl.newInstance();
//                            Constructor constructor = cl.getConstructor();
//                            constructor.setAccessible(true);
//                            Object obj = constructor.newInstance(1);
//                            meth.setAccessible(true);
                            Object o = meth.invoke(cl.newInstance(), 1);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(meth.getName());
                        }catch (Exception e) {

                        }
                    }

                }
//                try {
//                    Method method = cl.getMethod("get");
//                    Class[] ex = method.getExceptionTypes();
//                    for (Class cle :
//                            ex) {
//                        System.out.println(cle.toString());
//                    }
//                } catch (NoSuchMethodException e) {
//
//                }
                System.out.println(cl.getName());
            }
        }
        return null;
    }
}
