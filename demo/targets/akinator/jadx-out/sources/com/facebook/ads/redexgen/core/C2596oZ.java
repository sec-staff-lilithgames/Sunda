package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.oZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2596oZ implements C1S {
    public final C2B A00;
    public static String[] A01 = {"mula3CidaM", "QXZvrsMqvoQg77WBvlve", "clHaL9AVxqL", "4", "dTVzaj3Js", "vbPIPyw6rptXOUyrUErD6RaDDuBNyqsV", "dqUk2BmO1rRhKnsvPvl2vnYni3", "mE8b9jVFwC8HjBTnnlrMONG37KhdcP6J"};
    public static final C2596oZ A03 = new C08872n().A04();
    public static final String A04 = AbstractC09264a.A0h(0);
    public static final C1R<C2596oZ> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oa
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2596oZ.A01(bundle);
        }
    };

    public C2596oZ(C2B c2b) {
        this.A00 = c2b;
    }

    public static C2596oZ A01(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(A04);
        if (integerArrayList == null) {
            return A03;
        }
        C08872n c08872n = new C08872n();
        int i10 = 0;
        while (true) {
            int size = integerArrayList.size();
            if (A01[7].charAt(28) != 'c') {
                throw new RuntimeException();
            }
            A01[7] = "mp2TMNIiilctnlK0CRpdI2bFoWxScr6M";
            if (i10 < size) {
                c08872n.A00(integerArrayList.get(i10).intValue());
                i10++;
            } else {
                return c08872n.A04();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2596oZ)) {
                return false;
            }
            return this.A00.equals(((C2596oZ) obj).A00);
        }
        if (A01[5].charAt(22) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "64Urjp6xISM";
        strArr[0] = "9byEEtKTR1";
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
