package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public final class UP {
    public static byte[] A07;
    public final double A00;
    public final double A01 = System.currentTimeMillis() / 1000.0d;
    public final UU A02;
    public final UV A03;
    public final String A04;
    public final String A05;
    public final Map<String, String> A06;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Map<String, String> A01(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                map2.put(key, value);
            }
        }
        return map2;
    }

    public static void A02() {
        A07 = new byte[]{36, 43, 36, 41, 42, 34, 107, 118, 109, 99, 109, 106, 101, 104, 91, 103, 104, 109, 97, 106, 112, 91, 112, 107, 111, 97, 106, 75, 80, 87, 77, 84, 92, 103, 81, 86, 91, 84, 77, 92, 93, 103, 81, 86, 103, 94, 77, 86, 86, 93, 84};
    }

    public UP(SQ sq2, String str, double d10, String str2, Map<String, String> map, UU uu2, UV uv2, boolean z10) throws JSONException {
        this.A05 = str;
        this.A00 = d10;
        this.A04 = str2;
        this.A02 = uu2;
        this.A03 = uv2;
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        if (z10) {
            map2.put(A00(27, 24, 18), String.valueOf(z10));
        }
        String strA01 = AbstractC1582Uc.A01(str);
        if (!TextUtils.isEmpty(strA01) && (z10 || uv2 == UV.A0C)) {
            map2.put(A00(6, 21, 46), strA01);
        }
        if (A0B()) {
            Map<String, String> extraData = sq2.A04().A6o();
            map2.put(A00(0, 6, 111), AbstractC1646Wr.A01(extraData));
        }
        Map<String, String> extraData2 = A01(map2);
        this.A06 = extraData2;
    }

    public final double A03() {
        return this.A00;
    }

    public final double A04() {
        return this.A01;
    }

    public final UU A05() {
        return this.A02;
    }

    public final UV A06() {
        return this.A03;
    }

    public final String A07() {
        return this.A04;
    }

    public final String A08() {
        return this.A05;
    }

    public final Map<String, String> A09() {
        return this.A06;
    }

    public final boolean A0A() {
        return !TextUtils.isEmpty(this.A05);
    }

    public final boolean A0B() {
        return this.A02 == UU.A05;
    }
}
