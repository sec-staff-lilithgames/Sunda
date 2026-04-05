package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class N3 implements Serializable {
    public static byte[] A05 = null;
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static N3 A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(A04(0, 6, 78));
        String strOptString2 = jSONObject.optString(A04(36, 8, 81));
        String strOptString3 = jSONObject.optString(A04(24, 12, 84));
        int iOptInt = jSONObject.optInt(A04(44, 14, 5), -1);
        boolean zOptBoolean = jSONObject.optBoolean(A04(6, 18, 35), false);
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3) || iOptInt == -1) {
            return null;
        }
        return new N3(strOptString, strOptString2, strOptString3, iOptInt, zOptBoolean);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{46, 61, 61, 44, 54, 49, 8, 3, 14, 14, 4, 3, 5, 13, 1, 11, 16, 21, 22, 3, 9, 20, 3, 15, 67, 52, 54, 62, 52, 58, 56, 50, 65, 52, 64, 56, 66, 53, 54, 53, 66, 66, 53, 66, -10, -23, -12, -13, -10, -8, -19, -14, -21, -29, -15, -13, -24, -23};
    }

    public N3(String str, String str2, String str3, int i10, boolean z10) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i10;
        this.A04 = z10;
    }

    private final String A01() {
        return this.A01;
    }

    private final String A02() {
        return this.A02;
    }

    private final String A03() {
        return this.A03;
    }

    public static void A06(N3 n32, C1937dL c1937dL) {
        if (n32 != null && n32.A09()) {
            new UY(c1937dL).A04(true, n32.A01(), n32.A03(), n32.A02(), System.currentTimeMillis(), n32.A08());
        }
    }

    public static void A07(N3 n32, C1937dL c1937dL) {
        if (n32 != null && n32.A0A()) {
            new UY(c1937dL).A04(false, n32.A01(), n32.A03(), n32.A02(), System.currentTimeMillis(), n32.A08());
        }
    }

    private final boolean A08() {
        return this.A04;
    }

    private final boolean A09() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A0A() {
        return (this.A00 & 1) != 0;
    }
}
