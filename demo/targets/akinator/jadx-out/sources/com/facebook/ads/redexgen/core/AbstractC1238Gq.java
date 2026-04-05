package com.facebook.ads.redexgen.core;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1238Gq {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"unNLyNh5FR3GyMG68d", "fnHIAbwwkFQ1ZGNlnsc", "DMpYp1jOlcNpO4pJgPWh22Zerf91QM8t", "RZoQ8h3", "L8G6Aqwau6BJqNFKfla", "ElXYWWCxJdBggdMs0Hio0yCYqdZAyfAp", "A3sl", "vST53OIiICW6hrmD3wtDRemD3zmWyZSx"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1235Gn A06(byte[] bArr, int i10, int i11) {
        C1240Gs c1240Gs = new C1240Gs(bArr, i10, i11);
        int iA00 = -1;
        int i12 = -1;
        int iA01 = -1;
        c1240Gs.A07(4);
        int iA05 = c1240Gs.A05(3);
        c1240Gs.A06();
        int iA052 = c1240Gs.A05(2);
        boolean zA0A = c1240Gs.A0A();
        int iA053 = c1240Gs.A05(5);
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (A02[0].length() == 10) {
                break;
            }
            String[] strArr = A02;
            strArr[2] = "xkwe1O9uU2dqAY7xWUY4fbTlKQKyvcwL";
            strArr[7] = "HeYhRuPqM40BhEn67WYdTTzYcbU6v3bu";
            if (i14 < 32) {
                if (c1240Gs.A0A()) {
                    i13 |= 1 << i14;
                }
                i14++;
            } else {
                int[] iArr = new int[6];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr[i15] = c1240Gs.A05(8);
                }
                int iA054 = c1240Gs.A05(8);
                int i16 = 0;
                for (int i17 = 0; i17 < iA05; i17++) {
                    if (c1240Gs.A0A()) {
                        i16 += 89;
                    }
                    if (c1240Gs.A0A()) {
                        i16 += 8;
                    }
                }
                c1240Gs.A07(i16);
                if (iA05 > 0) {
                    c1240Gs.A07((8 - iA05) * 2);
                }
                int iA04 = c1240Gs.A04();
                int iA042 = c1240Gs.A04();
                if (iA042 == 3) {
                    c1240Gs.A06();
                }
                int iA043 = c1240Gs.A04();
                int iA044 = c1240Gs.A04();
                if (c1240Gs.A0A()) {
                    int iA045 = c1240Gs.A04();
                    int iA046 = c1240Gs.A04();
                    int iA047 = c1240Gs.A04();
                    int iA048 = c1240Gs.A04();
                    iA043 -= (iA045 + iA046) * ((iA042 == 1 || iA042 == 2) ? 2 : 1);
                    int i18 = (iA047 + iA048) * (iA042 == 1 ? 2 : 1);
                    String[] strArr2 = A02;
                    if (strArr2[4].length() != strArr2[1].length()) {
                        A02[6] = "Hn3sdMz19WVmWCBK";
                        iA044 -= i18;
                    } else {
                        A02[3] = "Jz4JSkPN0248kFDgiRzzjLGO7q";
                        iA044 -= i18;
                    }
                }
                c1240Gs.A04();
                c1240Gs.A04();
                int iA049 = c1240Gs.A04();
                for (int i19 = c1240Gs.A0A() ? 0 : iA05; i19 <= iA05; i19++) {
                    c1240Gs.A04();
                    c1240Gs.A04();
                    c1240Gs.A04();
                }
                c1240Gs.A04();
                c1240Gs.A04();
                c1240Gs.A04();
                c1240Gs.A04();
                c1240Gs.A04();
                c1240Gs.A04();
                if (c1240Gs.A0A() && c1240Gs.A0A()) {
                    A0D(c1240Gs);
                }
                c1240Gs.A07(2);
                if (c1240Gs.A0A()) {
                    c1240Gs.A07(8);
                    c1240Gs.A04();
                    c1240Gs.A04();
                    c1240Gs.A06();
                }
                A0E(c1240Gs);
                if (c1240Gs.A0A()) {
                    for (int i20 = 0; i20 < c1240Gs.A04(); i20++) {
                        c1240Gs.A07(iA049 + 4 + 1);
                    }
                }
                c1240Gs.A07(2);
                float f10 = 1.0f;
                boolean zA0A2 = c1240Gs.A0A();
                if (A02[0].length() != 10) {
                    String[] strArr3 = A02;
                    strArr3[2] = "CMlgeA8zQVByZrA2VMXzsS0jeMyo18qQ";
                    strArr3[7] = "QAK33uwHUZwexufQvU3o8DPmyRQmvUMz";
                    if (zA0A2) {
                        if (c1240Gs.A0A()) {
                            int iA055 = c1240Gs.A05(8);
                            if (iA055 == 255) {
                                int iA056 = c1240Gs.A05(16);
                                int iA057 = c1240Gs.A05(16);
                                if (iA056 != 0 && iA057 != 0) {
                                    f10 = iA056 / iA057;
                                }
                            } else if (iA055 < A04.length) {
                                f10 = A04[iA055];
                            } else {
                                AnonymousClass44.A07(A0B(0, 11, 63), A0B(11, 35, 126) + iA055);
                            }
                        }
                        if (c1240Gs.A0A()) {
                            c1240Gs.A06();
                        }
                        if (c1240Gs.A0A()) {
                            c1240Gs.A07(3);
                            boolean zA0A3 = c1240Gs.A0A();
                            if (c1240Gs.A0A()) {
                                int iA058 = c1240Gs.A05(8);
                                int iA059 = c1240Gs.A05(8);
                                c1240Gs.A07(8);
                                iA00 = ColorInfo.A00(iA058);
                                i12 = zA0A3 ? 1 : 2;
                                if (A02[6].length() != 3) {
                                    A02[0] = "HGrGkdvIc2AkT14Ejxxa4aXBUNVha";
                                    iA01 = ColorInfo.A01(iA059);
                                } else {
                                    iA01 = ColorInfo.A01(iA059);
                                }
                            }
                        }
                        if (c1240Gs.A0A()) {
                            c1240Gs.A04();
                            c1240Gs.A04();
                        }
                        c1240Gs.A06();
                        if (c1240Gs.A0A()) {
                            iA044 *= 2;
                        }
                    }
                    return new C1235Gn(iA052, zA0A, iA053, i13, iArr, iA054, iA04, iA043, iA044, f10, iA00, i12, iA01);
                }
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C1237Gp A0A(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1238Gq.A0A(byte[], int, int):com.facebook.ads.redexgen.X.Gp");
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{-7, 12, 23, 0, 25, 20, 31, 0, 31, 20, 23, Utf8.REPLACEMENT_BYTE, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 75, 93, 90, 79, 77, 94, 73, 92, 75, 94, 83, 89, 73, 83, 78, 77, 10, 96, 75, 86, 95, 79, 36, 10, 66, 53, 48, 49, 59, -5, 45, 66, 47, 23, 10, 5, 6, 16, -48, 9, 6, 23, 4};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0E(com.facebook.ads.redexgen.core.C1240Gs r18) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1238Gq.A0E(com.facebook.ads.redexgen.X.Gs):void");
    }

    static {
        A0C();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static int A02(byte[] bArr, int i10) {
        int i11;
        synchronized (A05) {
            int scratchEscapeCount = 0;
            int i12 = 0;
            while (scratchEscapeCount < i10) {
                scratchEscapeCount = A03(bArr, scratchEscapeCount, i10);
                if (scratchEscapeCount < i10) {
                    if (A01.length <= i12) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[i12] = scratchEscapeCount;
                    scratchEscapeCount += 3;
                    i12++;
                }
            }
            i11 = i10 - i12;
            int unescapedPosition = 0;
            int escapedPosition = 0;
            for (int unescapedLength = 0; unescapedLength < i12; unescapedLength++) {
                int scratchEscapeCount2 = A01[unescapedLength];
                int scratchEscapeCount3 = scratchEscapeCount2 - unescapedPosition;
                System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, scratchEscapeCount3);
                int escapedPosition2 = escapedPosition + scratchEscapeCount3;
                int position = escapedPosition2 + 1;
                bArr[escapedPosition2] = 0;
                escapedPosition = position + 1;
                bArr[position] = 0;
                unescapedPosition += scratchEscapeCount3 + 3;
            }
            System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, i11 - escapedPosition);
        }
        return i11;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0002 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(byte[] r2, int r3, int r4) {
        /*
        L0:
            int r0 = r4 + (-2)
            if (r3 >= r0) goto L19
            r0 = r2[r3]
            if (r0 != 0) goto L16
            int r0 = r3 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L16
            int r0 = r3 + 2
            r1 = r2[r0]
            r0 = 3
            if (r1 != r0) goto L16
            return r3
        L16:
            int r3 = r3 + 1
            goto L0
        L19:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1238Gq.A03(byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1238Gq.A04(byte[], int, int, boolean[]):int");
    }

    public static C1235Gn A05(byte[] bArr, int i10, int i11) {
        return A06(bArr, i10 + 2, i11);
    }

    public static C1236Go A07(byte[] bArr, int i10, int i11) {
        return A08(bArr, i10 + 1, i11);
    }

    public static C1236Go A08(byte[] bArr, int i10, int i11) {
        C1240Gs data = new C1240Gs(bArr, i10, i11);
        int iA04 = data.A04();
        int seqParameterSetId = data.A04();
        data.A06();
        return new C1236Go(iA04, seqParameterSetId, data.A0A());
    }

    public static C1237Gp A09(byte[] bArr, int i10, int i11) {
        return A0A(bArr, i10 + 1, i11);
    }

    public static void A0D(C1240Gs c1240Gs) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int matrixId = 1;
                if (!c1240Gs.A0A()) {
                    c1240Gs.A04();
                } else {
                    int sizeId = i10 << 1;
                    int iMin = Math.min(64, 1 << (sizeId + 4));
                    if (i10 > 1) {
                        c1240Gs.A03();
                    }
                    for (int sizeId2 = 0; sizeId2 < iMin; sizeId2++) {
                        c1240Gs.A03();
                    }
                }
                if (i10 == 3) {
                    matrixId = 3;
                }
                i11 += matrixId;
            }
        }
    }

    public static void A0F(C1240Gs c1240Gs, int i10) {
        int i11 = 8;
        int lastScale = 8;
        for (int nextScale = 0; nextScale < i10; nextScale++) {
            if (lastScale != 0) {
                int lastScale2 = c1240Gs.A03();
                lastScale = ((lastScale2 + i11) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (lastScale != 0) {
                i11 = lastScale;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0G(java.nio.ByteBuffer r6) {
        /*
            int r5 = r6.position()
            r4 = 0
            r3 = 0
        L6:
            int r0 = r3 + 1
            if (r0 >= r5) goto L3f
            byte r0 = r6.get(r3)
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = 3
            if (r4 != r0) goto L35
            r0 = 1
            if (r2 != r0) goto L39
            int r0 = r3 + 1
            byte r0 = r6.get(r0)
            r1 = r0 & 31
            r0 = 7
            if (r1 != r0) goto L39
            java.nio.ByteBuffer r1 = r6.duplicate()
            int r0 = r3 + (-3)
            r1.position(r0)
            r1.limit(r5)
            r0 = 0
            r6.position(r0)
            r6.put(r1)
            return
        L35:
            if (r2 != 0) goto L39
            int r4 = r4 + 1
        L39:
            if (r2 == 0) goto L3c
            r4 = 0
        L3c:
            int r3 = r3 + 1
            goto L6
        L3f:
            r6.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1238Gq.A0G(java.nio.ByteBuffer):void");
    }

    public static void A0H(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0I(String str, byte b10) {
        if (A0B(46, 9, 96).equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return A0B(55, 10, 53).equals(str) && ((b10 & 126) >> 1) == 39;
    }
}
