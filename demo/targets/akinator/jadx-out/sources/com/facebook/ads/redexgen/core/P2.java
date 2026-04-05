package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class P2 {
    public static Field A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"02HXzqXk73QVshK", "Vd3PIQVGbymKr1peOQp46bHqBe5g9xLl", "HcoaSp9EGPDRlMz", "LE49K9mUXs4bvL0Dhr0uWsVmH5LUwBm4", "LDPLoHz6UrHGmx6GMbvpIivkJ6REIOLV", "AJsKzOma0c3h", "nSSDOEXzoGvtoIqz4QDa0TtkmnPlbH1G", "jHxdDI4CDuwq"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-28, -72, -38, -38, -36, -22, -22, -32, -39, -32, -29, -32, -21, -16, -69, -36, -29, -36, -34, -40, -21, -36};
    }

    public abstract int A02(View view);

    public abstract int A03(View view);

    public abstract int A04(View view);

    public abstract int A05(View view);

    public abstract Display A06(View view);

    public abstract PK A07(View view, PK pk2);

    public abstract PK A08(View view, PK pk2);

    public abstract void A09(View view);

    public abstract void A0A(View view);

    public abstract void A0B(View view, int i10);

    public abstract void A0C(View view, Drawable drawable);

    public abstract void A0E(View view, InterfaceC1439On interfaceC1439On);

    public abstract void A0F(View view, Runnable runnable);

    public abstract void A0G(View view, Runnable runnable, long j10);

    public abstract boolean A0I(View view);

    public abstract boolean A0J(View view);

    static {
        A01();
        A01 = false;
    }

    public final void A0D(View view, AbstractC1433Oh abstractC1433Oh) {
        view.setAccessibilityDelegate(abstractC1433Oh == null ? null : abstractC1433Oh.A00());
    }

    public final boolean A0H(View view) {
        if (A01) {
            return false;
        }
        Field field = A00;
        if (A03[6].charAt(21) == 'T') {
            A03[1] = "Q1ruOHxOk6WILPvKf2GjHGHRzmp539Hk";
            if (field == null) {
                try {
                    A00 = View.class.getDeclaredField(A00(0, 22, 90));
                    A00.setAccessible(true);
                } catch (Throwable unused) {
                    A01 = true;
                    if (A03[6].charAt(21) == 'T') {
                        String[] strArr = A03;
                        strArr[0] = "nDS37f2fXP1nkU7";
                        strArr[2] = "CEc31ZmnNMQB0dp";
                        return false;
                    }
                }
            }
            try {
                return A00.get(view) != null;
            } catch (Throwable unused2) {
                A01 = true;
                return false;
            }
        }
        throw new RuntimeException();
    }
}
