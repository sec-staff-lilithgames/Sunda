package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2605oi implements C1S {
    public final C2609om A00;

    @Deprecated
    public final C10609r A01;
    public final C2607ok A02;
    public final C2Q A03;

    @Deprecated
    public final C2606oj A04;
    public final C2603og A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C2605oi A09 = new C2I().A05();
    public static final C1R<C2605oi> A08 = new C1R() { // from class: com.facebook.ads.redexgen.X.oo
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2605oi.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C2605oi A00(Bundle bundle) {
        String str = (String) C3M.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C2607ok c2607ok = bundle2 == null ? C2607ok.A07 : (C2607ok) C2607ok.A06.A6X(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C2603og c2603og = bundle3 == null ? C2603og.A0Z : (C2603og) C2603og.A0Y.A6X(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C2605oi(str, bundle4 == null ? C10609r.A00 : (C10609r) C2609om.A05.A6X(bundle4), null, c2607ok, c2603og);
    }

    public C2605oi(String str, C10609r c10609r, C2606oj c2606oj, C2607ok c2607ok, C2603og c2603og) {
        this.A06 = str;
        this.A03 = c2606oj;
        this.A04 = c2606oj;
        this.A02 = c2607ok;
        this.A05 = c2603og;
        this.A00 = c10609r;
        this.A01 = c10609r;
    }

    public static String A02(int i10) {
        return Integer.toString(i10, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2605oi)) {
            return false;
        }
        C2605oi c2605oi = (C2605oi) obj;
        if (AbstractC09264a.A1E(this.A06, c2605oi.A06)) {
            C2609om c2609om = this.A00;
            C2609om c2609om2 = c2605oi.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c2609om.equals(c2609om2) && AbstractC09264a.A1E(this.A03, c2605oi.A03) && AbstractC09264a.A1E(this.A02, c2605oi.A02) && AbstractC09264a.A1E(this.A05, c2605oi.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i10 = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int iHashCode = (((i10 + result2) * 31) + this.A02.hashCode()) * 31;
        C2609om c2609om = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int iCharAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (iCharAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c2609om.hashCode();
        return ((iHashCode + result4) * 31) + this.A05.hashCode();
    }
}
