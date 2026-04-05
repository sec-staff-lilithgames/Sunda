package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class GT {
    public static byte[] A03;
    public final GS A00;
    public final Constructor<? extends GX> A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{55, 0, 0, 29, 0, 82, 27, 28, 1, 6, 19, 28, 6, 27, 19, 6, 27, 28, 21, 82, 23, 10, 6, 23, 28, 1, 27, 29, 28, 37, 30, 21, 8, 0, 21, 19, 4, 21, 20, 80, 21, 2, 2, 31, 2, 80, 19, 2, 21, 17, 4, 25, 30, 23, 80, 21, 8, 4, 2, 17, 19, 4, 31, 2};
    }

    public GT(GS gs) {
        this.A00 = gs;
    }

    private Constructor<? extends GX> A01() {
        synchronized (this.A02) {
            if (this.A02.get()) {
                return this.A01;
            }
            try {
                return this.A00.A7J();
            } catch (ClassNotFoundException unused) {
                this.A02.set(true);
                return this.A01;
            } catch (Exception e10) {
                throw new RuntimeException(A00(0, 29, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), e10);
            }
        }
    }

    public final GX A03(Object... objArr) {
        Constructor<? extends GX> constructorA01 = A01();
        if (constructorA01 == null) {
            return null;
        }
        try {
            return constructorA01.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException(A00(29, 35, 126), e10);
        }
    }
}
