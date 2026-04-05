package com.facebook.ads.redexgen.core;

import android.os.Trace;

/* renamed from: com.facebook.ads.redexgen.X.4S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4S {
    public static String[] A00 = {"7ZVLLLKotIssX7jIl4vcZbH2L8FdxFJV", "SxO2qeNEuV3f0DZtyJG1CBA8lii4pttK", "tZ3ZWPQHUjR7YcQrex4qppGHSv95fJPs", "tGxcWQDnkHfhjSyxWcnIumjGlzcgaNzU", "u1LglbRx5QWkMnO0PnxbrtbpZSVqvkfW", "Df2h2T1n3Ma5KhbTq7fRBbIZbgR3yEJ2", "bMIjl1KVP4eS7CUXJ3WtWMmLtshOtNUd", "tvDgJhdkdCUqYfoEPuxkvSqWZaZJ8Ie3"};

    public static void A00() {
        if (C2T.A00) {
            int i10 = AbstractC09264a.A02;
            String[] strArr = A00;
            if (strArr[2].charAt(4) != strArr[3].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[0] = "iUwdoG5qeVYPDF5bqwZgwnZjrQnFy6Jg";
            strArr2[5] = "4uzT312piC2APoYDeL25SkVImiZpxCJZ";
            if (i10 >= 18) {
                A01();
            }
        }
    }

    public static void A01() {
        Trace.endSection();
    }

    public static void A02(String str) {
        if (C2T.A00 && AbstractC09264a.A02 >= 18) {
            A03(str);
        }
    }

    public static void A03(String str) {
        Trace.beginSection(str);
    }
}
