package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1305Jg {
    public static byte[] A03;
    public static String[] A04 = {"", "Q0QXG7UXIASt6u", "Y6SVRxSvJsGy", "wBfOUWbjS5LHnahIVXYrmUjJKL6", "ipHEpqQaRUeTeVi", "GLcEQz2dRHwid1MPYevx9K5BLffqxfdD", "Wfr02cBS22Xusns9ZD5ofvGEf4mY", "O3Zlf7dyK7vHpITYdVNftiUJDGPL2j8I"};
    public static final AbstractC1080Al<String> A05;
    public static final AbstractC1080Al<String> A06;
    public static final AbstractC1080Al<String> A07;
    public static final AbstractC1080Al<String> A08;
    public static final Pattern A09;
    public final int A00;
    public final int A01;
    public final int A02;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C1305Jg A00(com.facebook.ads.redexgen.core.AbstractC1080Al<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1305Jg.A00(com.facebook.ads.redexgen.X.Al):com.facebook.ads.redexgen.X.Jg");
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{56, 23, 79, 98, 101, 119, 102, 113, 9, 29, 28, 7, 65, 70, 69, 76, 81, 70, 66, 72, 83, 66, 77, 68, 85, 94, 69, 27, 20, 17, 17, 24, 25, 95, 94, 95, 84, 94, 65, 84, 95, 72, 82, 83, 84, 78, 67, 66, 121, 111, 121, 107, 103, 111};
    }

    static {
        A03();
        A09 = Pattern.compile(A02(0, 3, 59));
        A08 = AbstractC1080Al.A05(A02(8, 4, 55), A02(33, 4, 110));
        A06 = AbstractC1080Al.A06(A02(24, 3, 110), A02(48, 6, 85), A02(18, 6, 126));
        A05 = AbstractC1080Al.A05(A02(27, 6, 34), A02(37, 4, 110));
        A07 = AbstractC1080Al.A06(A02(3, 5, 92), A02(12, 6, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), A02(41, 7, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
    }

    public C1305Jg(int i10, int i11, int i12) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = i12;
    }

    public static C1305Jg A01(String str) {
        if (str == null) {
            return null;
        }
        String parsingValue = AbstractC2244iY.A01(str.trim());
        if (parsingValue.isEmpty()) {
            return null;
        }
        AbstractC1080Al abstractC1080AlA08 = AbstractC1080Al.A08(TextUtils.split(parsingValue, A09));
        String[] strArr = A04;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A04[5] = "GSUJCg4XeXOvDUAO5uYW1LZcLl5OFxUg";
        return A00(abstractC1080AlA08);
    }
}
