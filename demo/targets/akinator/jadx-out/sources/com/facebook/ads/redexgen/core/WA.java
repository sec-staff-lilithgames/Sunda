package com.facebook.ads.redexgen.core;

import android.app.Activity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class WA {
    public static byte[] A00;
    public static String[] A01 = {"sZHdN6DnxhyjInuuwKT0RhtuIDa6RijQ", "8cuc4SRnt52u8A", "2WFcqn3uWqeuESEsgYZMEltW", "X9bY0baThRQoxJWrF88Q", "LV97W74qtL9kCw5aLEufLebev1Dp02F", "HRzTSkX2nkKPhEUot3qqZNsXHT", "Bu0g", "NlYn9LsIhiHyd3xbWzs6ij1u9O30FtmN"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Activity A01() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = Class.forName(A02(8, 26, 55));
        Object objInvoke = cls.getMethod(A02(34, 21, 49), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(A02(55, 11, 91));
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(objInvoke);
        if (map == null) {
            return null;
        }
        for (Object obj : map.values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(A02(66, 6, 4));
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField(A02(0, 8, 61));
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(obj);
            }
        }
        return null;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[6].length() != 4) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "tITZfrjeKeNOj3ZL7JO2M2Srx7";
            strArr[2] = "270Z6IsJIOKvltqMP1US5A2c";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 57);
            i13++;
        }
    }

    public static void A03() {
        A00 = new byte[]{101, 103, 112, 109, 114, 109, 112, 125, 111, 96, 106, 124, 97, 103, 106, 32, 111, 126, 126, 32, 79, 109, 122, 103, 120, 103, 122, 119, 90, 102, 124, 107, 111, 106, 107, 125, 122, 122, 109, 102, 124, 73, 107, 124, 97, 126, 97, 124, 113, 92, 96, 122, 109, 105, 108, 15, 35, 1, 22, 11, 20, 11, 22, 11, 7, 17, 77, 92, 72, 78, 88, 89};
    }

    static {
        A03();
    }

    public static Activity A00() {
        try {
            return A01();
        } catch (Exception unused) {
            return null;
        }
    }
}
