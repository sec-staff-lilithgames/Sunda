package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Wn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1642Wn implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ SQ A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{40, 42, 33, 42, 61, 38, 44, 43, 41, 56, 31, 60, 32, 37, 56, 2, 45, 33, 41, 43, 41, 56, 24, 53, 60, 41, 73, 75, 90, 120, 79, 66, 91, 75, 29, 28, 49, 26, 23, 17, 25, 1, 7, 31, 1, 32, 23, 19, 22, 11};
    }

    public C1642Wn(int i10, LinkedBlockingQueue linkedBlockingQueue, SQ sq2) {
        this.A00 = i10;
        this.A02 = linkedBlockingQueue;
        this.A01 = sq2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c10 : (List) objArr[0]) {
                    String str = (String) c10.getClass().getMethod(A00(7, 12, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL), new Class[0]).invoke(c10, new Object[0]);
                    int iIntValue = ((Integer) c10.getClass().getMethod(A00(19, 7, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL), new Class[0]).invoke(c10, new Object[0])).intValue();
                    if (str == null && iIntValue == this.A00) {
                        byte[] value = (byte[]) c10.getClass().getMethod(A00(26, 8, 26), new Class[0]).invoke(c10, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t10) {
            this.A01.A08().AAy(A00(0, 7, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), AbstractC1550Sv.A1G, new C1551Sw(t10));
        }
        return null;
    }
}
