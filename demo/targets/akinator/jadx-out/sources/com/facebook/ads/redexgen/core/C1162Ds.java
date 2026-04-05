package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ds, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1162Ds {
    public static String[] A02 = {"lLT4WSGDXAAEttN4WZpjnZW3EREZ5IUn", "X1LJmLkuKByNLD5", "9E9AvNKTbt", "HDUBXdTF0", "Y2br1ow9JJdQjV7", "Cljbn90LR6", "vevW4XIw", "R43W1WP4nPn8Vokax5r9eZsQvu5hcN6d"};
    public final long A00;
    public final long A01;

    public C1162Ds(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z10 = obj instanceof C1162Ds;
        String[] strArr = A02;
        if (strArr[0].charAt(21) != strArr[7].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "RWvSWN92NbOHtVZ";
        strArr2[1] = "5AykDqMn7i1NCR6";
        if (!z10) {
            return false;
        }
        C1162Ds c1162Ds = (C1162Ds) obj;
        return this.A01 == c1162Ds.A01 && this.A00 == c1162Ds.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
