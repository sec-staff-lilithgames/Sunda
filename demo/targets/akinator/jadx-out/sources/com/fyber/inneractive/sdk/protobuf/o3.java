package com.fyber.inneractive.sdk.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o3 {
    public static void a(Object obj, Object obj2) {
        ((z0) obj).unknownFields = (n3) obj2;
    }

    public static boolean a(Object obj, s2 s2Var) throws n1 {
        int iE = s2Var.e();
        int i10 = iE >>> 3;
        int i11 = iE & 7;
        if (i11 == 0) {
            ((n3) obj).a(i10 << 3, Long.valueOf(s2Var.o()));
            return true;
        }
        if (i11 == 1) {
            ((n3) obj).a((i10 << 3) | 1, Long.valueOf(s2Var.g()));
            return true;
        }
        if (i11 == 2) {
            ((n3) obj).a((i10 << 3) | 2, s2Var.a());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 == 5) {
                ((n3) obj).a((i10 << 3) | 5, Integer.valueOf(s2Var.q()));
                return true;
            }
            int i12 = n1.f26441a;
            throw new m1();
        }
        n3 n3Var = new n3();
        int i13 = i10 << 3;
        int i14 = i13 | 4;
        while (s2Var.s() != Integer.MAX_VALUE && a((Object) n3Var, s2Var)) {
        }
        if (i14 == s2Var.e()) {
            n3Var.f26447e = false;
            ((n3) obj).a(i13 | 3, n3Var);
            return true;
        }
        throw new n1("Protocol message end-group tag did not match expected tag.");
    }
}
