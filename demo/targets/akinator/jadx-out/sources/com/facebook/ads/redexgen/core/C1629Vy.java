package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1629Vy {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C1629Vy> A02 = new ThreadLocal<>();
    public final C1612Vh A00 = new C1612Vh();

    public static C1612Vh A00() {
        return A02().A00;
    }

    public static C1612Vh A01(C1628Vx c1628Vx) {
        C1612Vh currentStackTraces = new C1612Vh(A00());
        currentStackTraces.add(c1628Vx);
        return currentStackTraces;
    }

    public static C1629Vy A02() {
        C1629Vy c1629Vy = A02.get();
        if (c1629Vy == null) {
            C1629Vy c1629Vy2 = new C1629Vy();
            A02.set(c1629Vy2);
            return c1629Vy2;
        }
        return c1629Vy;
    }

    public static void A03(AbstractRunnableC1624Vt abstractRunnableC1624Vt) {
        C1612Vh c1612VhA06 = abstractRunnableC1624Vt.A06();
        if (c1612VhA06 != null) {
            C1612Vh createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(c1612VhA06);
        }
    }

    public static void A04(AbstractRunnableC1624Vt abstractRunnableC1624Vt) {
        C1612Vh c1612VhA06 = abstractRunnableC1624Vt.A06();
        if (c1612VhA06 != null) {
            C1612Vh c1612Vh = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c1612Vh.removeAll(c1612VhA06);
        }
    }
}
