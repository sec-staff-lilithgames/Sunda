package com.facebook.ads.redexgen.core;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1499Qv<T> implements InvocationHandler {
    public static byte[] A02;
    public ClassLoader A00;
    public T A01;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{49, 32, 57};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qv != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public C1499Qv(T impl, ClassLoader classLoader) {
        this.A01 = impl;
        this.A00 = classLoader;
    }

    public static Object A00(ClassLoader classLoader, Method method) throws NegativeArraySizeException {
        Class<?> returnType = method.getReturnType();
        Object result = Void.TYPE;
        if (returnType.equals(result)) {
            return null;
        }
        if (returnType.isPrimitive()) {
            Object result2 = Array.newInstance(method.getReturnType(), 1);
            return Array.get(result2, 0);
        }
        if (returnType.equals(String.class)) {
            return A02(0, 0, 70);
        }
        if (!returnType.isInterface()) {
            return null;
        }
        return Proxy.newProxyInstance(classLoader, new Class[]{returnType}, new C1498Qu(classLoader));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qv != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public final T A04() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qv != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws NegativeArraySizeException {
        try {
            return method.invoke(this.A01, objArr);
        } catch (Throwable t10) {
            if (t10 instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) t10).getTargetException();
                if (targetException instanceof C1403Nb) {
                    throw new IllegalStateException(targetException.getMessage());
                }
            }
            Object objA00 = A00(this.A00, method);
            C1911cu c1911cuA00 = SP.A00();
            if (c1911cuA00 != null) {
                c1911cuA00.A08().AAy(A02(0, 3, 54), AbstractC1550Sv.A0O, new C1551Sw(t10));
                return objA00;
            }
            return objA00;
        }
    }
}
