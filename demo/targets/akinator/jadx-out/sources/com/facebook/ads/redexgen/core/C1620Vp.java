package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1620Vp implements InterfaceC1563Tj {
    public static byte[] A03;
    public static String[] A04 = {"Mm6eOmxrkeU2", "MUq44yb", "oKRPVLX0GnKoqIxxSACkHhthyeGglJDi", "kpHGdbOqKKCIQYGNabgqln8bHLF6fw56", "0pAnM9hA2pxuChyanVmC1wYC", "qxO1zNdoKC3MMUxTs0mhMJ4wGZPx", "", "oKuuJ477mGyxhVSdv1rWN1Mids3hq7ZK"};
    public static final String A05;
    public final C1911cu A00;
    public final InterfaceC1574Tu<UP> A01;
    public final InterfaceC1574Tu<UP> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A04[4] = "X42DzCMkQ4HFIzVdD0OsfCNEPJzG";
            bArrCopyOfRange[i13] = (byte) (i14 - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        if (A04[4].length() == 9) {
            throw new RuntimeException();
        }
        A04[4] = "UWvzDGqGj7QUhJ5x6ip4Rlib";
        A03 = new byte[]{101, 99, -78, -87, 99, -73, -68, -77, -88, 125, 99, 115, -106, 119, -88, -105, -96, -90, -123, -90, -95, -92, -109, -103, -105, -124, -105, -107, -95, -92, -106, 118, -109, -90, -109, -108, -109, -91, -105, -110, -77, -70, -77, -62, -77, -78, 110, -77, -60, -77, -68, -62, -120, 110, 112, -90, -63, -55, -52, -59, -60, -128, -44, -49, -128, -61, -52, -59, -63, -46, -128, -59, -42, -59, -50, -44, -45, -128, -45, -44, -49, -46, -63, -57, -59, 107, -122, -114, -111, -118, -119, 69, -103, -108, 69, -119, -118, -104, -118, -105, -114, -122, -111, -114, -97, -118, 69, -122, -109, 69, -118, -101, -118, -109, -103, 69, -117, -105, -108, -110, 69, -119, -122, -103, -122, -121, -122, -104, -118, 69, -74, -47, -39, -36, -43, -44, -112, -28, -33, -112, -35, -33, -26, -43, -112, -43, -26, -43, -34, -28, -29, -112, -42, -30, -33, -35, -112, -39, -34, -99, -42, -36, -39, -41, -40, -28, -112, -29, -28, -33, -30, -47, -41, -43, -112, -46, -47, -45, -37, -112, -28, -33, -112, -43, -26, -43, -34, -28, -29, -112, -44, -47, -28, -47, -46, -47, -29, -43, -40, -13, -5, -2, -9, -10, -78, 6, 1, -78, 2, -13, 4, 5, -9, -78, -13, 0, -78, -9, 8, -9, 0, 6, -78, -8, 4, 1, -1, -78, -5, 0, -65, -8, -2, -5, -7, -6, 6, -78, 5, 6, 1, 4, -13, -7, -9, 112, -117, -109, -106, -113, -114, 74, -98, -103, 74, -100, -113, -117, -114, 74, -98, -110, -113, 74, -104, -97, -105, -116, -113, -100, 74, -103, -112, 74, -113, -96, -113, -104, -98, -99, 74, -112, -100, -103, -105, 74, -114, -117, -98, -117, -116, -117, -99, -113, -121, -94, -86, -83, -90, -91, 97, -75, -80, 97, -76, -90, -77, -86, -94, -83, -86, -69, -90, 97, -94, -91, 97, -90, -73, -90, -81, -75, -64, -27, -35, -29, -32, -34, -33, -21, -92, -72, -37, -68, -19, -36, -27, -21, -54, -21, -26, -23, -40, -34, -36, -55, -36, -38, -26, -23, -37, -69, -40, -21, -40, -39, -40, -22, -36, -37, -18, -20, -8, -5, -19, -87, -19, -22, -3, -22, -21, -22, -4, -18, -87, -17, -22, -14, -11, -2, -5, -18, -87, -8, -20, -20, -2, -5, -5, -18, -19, -87, 0, -15, -18, -9, -87, -5, -18, -22, -19, -14, -9, -16, -87, -18, -1, -18, -9, -3, -4, -73, -16, 3, 3, -12, -4, -1, 3, -78, -81, -62, -81, -14, -19, -116, AbstractJsonLexerKt.TC_INVALID, 125, -119, -116, 126, 121, 126, 123, -114, 123, 124, 123, -115, AbstractJsonLexerKt.TC_INVALID, -98, -112, -98, -98, -108, -102, -103, -118, -108, -113, 7, -7, 7, 7, -3, 3, 2, -13, 8, -3, 1, -7, -68, -79, -75, -83, -22, -27, -31, -37, -28, -93, -88, -97, -108, -3, -10, -13, -10, -9, -1, -10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2 A[Catch: U3 -> 0x0138, TryCatch #5 {U3 -> 0x0138, blocks: (B:33:0x00e6, B:35:0x00f2, B:36:0x0101, B:22:0x0089, B:24:0x008f, B:26:0x009b, B:27:0x00dc, B:39:0x010a, B:40:0x010e, B:42:0x0114, B:43:0x0124, B:44:0x0128, B:46:0x012e), top: B:61:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0B(int r13, java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1620Vp.A0B(int, java.util.Set, java.util.Set):int");
    }

    static {
        A03();
        A05 = C1620Vp.class.getSimpleName();
    }

    public C1620Vp(C1911cu c1911cu) throws IOException {
        this.A00 = c1911cu;
        this.A01 = new C1617Vm(C1571Tr.A00(A00(11, 28, 27), c1911cu), new W7(this));
        this.A02 = new C1617Vm(C1571Tr.A00(A00(322, 37, 96), c1911cu), new W3(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i10, i11));
            } catch (JSONException jsone) {
                if (this.A00.A05().AAF()) {
                    Log.e(A05, A00(85, 45, 14), jsone);
                }
                int start = AbstractC1550Sv.A2P;
                A05(start, jsone);
            }
            i10 += i11;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i10, int i11) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i10, i10 + i11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, String str) {
        C1551Sw c1551Sw = new C1551Sw(str);
        c1551Sw.A05(1);
        this.A00.A08().AAz(A00(425, 15, 3), i10, c1551Sw);
    }

    private void A05(int i10, Throwable th2) {
        this.A00.A08().AAy(A00(425, 15, 3), i10, new C1551Sw(th2));
    }

    public static byte[] A07(SQ sq2, String str, UP up2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(423, 2, 114), str);
            jSONObject.put(A00(466, 5, 95), up2.A08());
            jSONObject.put(A00(471, 4, 24), up2.A06().toString());
            jSONObject.put(A00(462, 4, 49), XG.A03(up2.A04()));
            jSONObject.put(A00(450, 12, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), XG.A03(up2.A03()));
            jSONObject.put(A00(440, 10, 20), up2.A07());
            jSONObject.put(A00(419, 4, 55), new JSONObject(up2.A09()));
            jSONObject.put(A00(TTAdConstant.IMAGE_URL_CODE, 7, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL), 0);
        } catch (JSONException e10) {
            if (sq2.A05().AAF()) {
                Log.e(A05, A00(294, 28, 42), e10);
            }
        }
        String string = jSONObject.toString();
        if (A04[3].charAt(18) == '3') {
            throw new RuntimeException();
        }
        A04[3] = "qXIRiOsc7TnqBEY389oLdIOolYF6NOqr";
        return string.getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A8k();
        } catch (U3 e10) {
            if (this.A00.A05().AAF()) {
                Log.e(A05, A00(245, 49, 19), e10);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0053 */
    /* JADX WARN: Incorrect condition in loop: B:21:0x006d */
    /* JADX WARN: Incorrect condition in loop: B:8:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<org.json.JSONObject> A0C(int r8) {
        /*
            r7 = this;
            r6 = 0
            r0 = -1
            if (r8 != r0) goto L7
            r6 = 1
            r8 = 30
        L7:
            int[] r1 = new int[r8]
            int r0 = r8 * 1000
            byte[] r4 = new byte[r0]
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.facebook.ads.redexgen.X.Tu<com.facebook.ads.redexgen.X.UP> r0 = r7.A01     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            com.facebook.ads.redexgen.X.Tt r0 = r0.A6O(r4, r1)     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            r3.add(r0)     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            int r2 = r0.A6P()     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
        L28:
            boolean r0 = r0.ABp()     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            if (r0 == 0) goto L4b
            if (r2 < r8) goto L32
            if (r6 == 0) goto L4b
        L32:
            if (r6 == 0) goto L39
            r0 = 0
            java.util.Arrays.fill(r1, r0)     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            goto L3d
        L39:
            int r0 = r8 - r2
            int[] r1 = new int[r0]     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
        L3d:
            com.facebook.ads.redexgen.X.Tu<com.facebook.ads.redexgen.X.UP> r0 = r7.A01     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            com.facebook.ads.redexgen.X.Tt r0 = r0.A6O(r4, r1)     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            r3.add(r0)     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            goto L28
        L4b:
            java.util.Iterator r2 = r5.iterator()     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
        L4f:
            boolean r0 = r2.hasNext()     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            if (r0 == 0) goto L65
            java.lang.Object r0 = r2.next()     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            com.facebook.ads.redexgen.X.Tu<com.facebook.ads.redexgen.X.UP> r1 = r7.A02     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            byte[] r0 = A09(r0)     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            r1.AJW(r0)     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            goto L4f
        L65:
            java.util.Iterator r1 = r3.iterator()     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
        L69:
            boolean r0 = r1.hasNext()     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r1.next()     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            com.facebook.ads.redexgen.X.Tt r0 = (com.facebook.ads.redexgen.core.InterfaceC1573Tt) r0     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            r0.A5h()     // Catch: com.facebook.ads.redexgen.core.U3 -> L79
            goto L69
        L79:
            r4 = move-exception
            com.facebook.ads.redexgen.X.cu r0 = r7.A00
            com.facebook.ads.redexgen.X.SV r0 = r0.A05()
            boolean r0 = r0.AAF()
            if (r0 == 0) goto L95
            java.lang.String r3 = com.facebook.ads.redexgen.core.C1620Vp.A05
            r2 = 359(0x167, float:5.03E-43)
            r1 = 53
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            android.util.Log.e(r3, r0, r4)
        L95:
            int r0 = com.facebook.ads.redexgen.core.AbstractC1550Sv.A2M
            r7.A05(r0, r4)
        L9a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1620Vp.A0C(int):java.util.List");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1563Tj
    public final void A4t() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (U3 e10) {
            if (this.A00.A05().AAF()) {
                Log.e(A05, A00(55, 30, 73), e10);
            }
            A05(AbstractC1550Sv.A2J, e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1563Tj
    public final void AKL(UP up2, AbstractC1561Tg<String> abstractC1561Tg) {
        XR.A00(XU.A07, new AsyncTaskC1564Tk(up2, abstractC1561Tg, this.A01, this.A00), new Void[0]);
    }
}
