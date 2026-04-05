package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public abstract class P3 {
    public static final P2 A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new AnonymousClass05() { // from class: com.facebook.ads.redexgen.X.02
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A00 = new AnonymousClass05();
        } else if (Build.VERSION.SDK_INT >= 23) {
            A00 = new AnonymousClass08();
        } else {
            A00 = new C0B();
        }
    }

    public static int A00(View view) {
        return A00.A02(view);
    }

    public static int A01(View view) {
        return A00.A03(view);
    }

    public static int A02(View view) {
        return A00.A04(view);
    }

    public static int A03(View view) {
        return A00.A05(view);
    }

    public static Display A04(View view) {
        return A00.A06(view);
    }

    public static PK A05(View view, PK pk2) {
        return A00.A07(view, pk2);
    }

    public static PK A06(View view, PK pk2) {
        return A00.A08(view, pk2);
    }

    public static void A07(View view) {
        A00.A09(view);
    }

    public static void A08(View view) {
        A00.A0A(view);
    }

    public static void A09(View view, int i10) {
        A00.A0B(view, i10);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0C(view, drawable);
    }

    public static void A0B(View view, AbstractC1433Oh abstractC1433Oh) {
        A00.A0D(view, abstractC1433Oh);
    }

    public static void A0C(View view, InterfaceC1439On interfaceC1439On) {
        A00.A0E(view, interfaceC1439On);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0F(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j10) {
        A00.A0G(view, runnable, j10);
    }

    public static boolean A0F(View view) {
        return A00.A0H(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
