package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.facebook.ads.androidx.media3.exoplayer.offline.Download;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class BQ extends Handler {
    public static byte[] A0D;
    public static String[] A0E = {"iNmXvBj9FTihCrbZiC4S7zhCL1s9H33W", "EvGedAo1NbwIZrU2eJLjABwCKULHNO", "OhLMnivBPD1ct3YE1XOZQ5ppblACA0SV", "Bbpc8NZfeBPLrlsLcOoRpsaFZoo07Ukk", "cYMMpvUaIb0CtoOD5hU2j4Ih7c76pz", "QlCwnx", "3GDIv0eUOBpBneHy6OJWPXV1MBWevv42", "cGd21R9dzjO1"};
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final InterfaceC1101Bh A09;
    public final InterfaceC2469mT A0A;
    public final ArrayList<B8> A0B;
    public final HashMap<String, C2474mY> A0C;

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 73);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0D = new byte[]{-42, -54, -9, 34, 42, 33, 31, 34, 20, 23, 0, 20, 33, 20, 26, 24, 37, -61, -34, -26, -23, -30, -31, -99, -15, -20, -99, -23, -20, -34, -31, -99, -31, -20, -12, -21, -23, -20, -34, -31, -73, -99, -109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -71, -68, -82, -79, 109, -79, -68, -60, -69, -71, -68, -82, -79, -64, 123, -99, -72, -64, -61, -68, -69, 119, -53, -58, 119, -61, -58, -72, -69, 119, -64, -59, -69, -68, -49, -123, -87, -60, -52, -49, -56, -57, -125, -41, -46, -125, -43, -56, -48, -46, -39, -56, -125, -55, -43, -46, -48, -125, -57, -60, -41, -60, -59, -60, -42, -56, -109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -65, -78, -70, -68, -61, -78, 109, -69, -68, -69, -78, -59, -74, -64, -63, -78, -69, -63, 109, -79, -68, -60, -69, -71, -68, -82, -79, -121, 109, -12, 15, 23, 26, 19, 18, -50, 34, 29, -50, 33, 19, 34, -50, 27, 15, 28, 35, 15, 26, -50, 33, 34, 29, 30, -50, 32, 19, 15, 33, 29, 28, -113, -86, -78, -75, -82, -83, 105, -67, -72, 105, -68, -82, -67, 105, -74, -86, -73, -66, -86, -75, 105, -68, -67, -72, -71, 105, -69, -82, -86, -68, -72, -73, -125, 105, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -20, -25, -37, -40, -21, -36, -105, -32, -27, -37, -36, -17, -91, -13, 0, 18, 10, -65, 5, 0, 8, 11, 4, 3, -39, -65};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0Q(DownloadRequest downloadRequest, int i10) {
        B8 b8A06 = A06(downloadRequest.A02, true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (b8A06 != null) {
            A03(BT.A00(b8A06, downloadRequest, i10, jCurrentTimeMillis));
        } else {
            A03(new B8(downloadRequest, i10 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i10, 0));
        }
        A0B();
    }

    static {
        A0D();
    }

    public BQ(HandlerThread handlerThread, InterfaceC2469mT interfaceC2469mT, InterfaceC1101Bh interfaceC1101Bh, Handler handler, int i10, int i11, boolean z10) {
        super(handlerThread.getLooper());
        this.A08 = handlerThread;
        this.A0A = interfaceC2469mT;
        this.A09 = interfaceC1101Bh;
        this.A07 = handler;
        this.A02 = i10;
        this.A03 = i11;
        this.A05 = z10;
        this.A0B = new ArrayList<>();
        this.A0C = new HashMap<>();
    }

    public static int A00(B8 b82, B8 b83) {
        return AbstractC09264a.A08(b82.A05, b83.A05);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A02(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.B8> r0 = r5.A0B
            int r0 = r0.size()
            if (r4 >= r0) goto L3e
            java.util.ArrayList<com.facebook.ads.redexgen.X.B8> r0 = r5.A0B
            java.lang.Object r0 = r0.get(r4)
            com.facebook.ads.redexgen.X.B8 r0 = (com.facebook.ads.redexgen.core.B8) r0
            com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest r3 = r0.A07
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.BQ.A0E
            r0 = 4
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L38
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.BQ.A0E
            java.lang.String r1 = "id4WW5MNYn317aHfBDbhwYGK6MIHb4Bm"
            r0 = 6
            r2[r0] = r1
            java.lang.String r0 = r3.A02
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L35
            return r4
        L35:
            int r4 = r4 + 1
            goto L1
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.BQ.A02(java.lang.String):int");
    }

    private B8 A03(B8 b82) {
        C3M.A08((b82.A02 == 3 || b82.A02 == 4) ? false : true);
        int iA02 = A02(b82.A07.A02);
        if (iA02 == -1) {
            this.A0B.add(b82);
            Collections.sort(this.A0B, new BP());
        } else {
            boolean z10 = b82.A05 != this.A0B.get(iA02).A05;
            this.A0B.set(iA02, b82);
            if (z10) {
                Collections.sort(this.A0B, new BP());
            }
        }
        try {
            this.A0A.AGV(b82);
        } catch (IOException e10) {
            AnonymousClass44.A08(A08(2, 15, 106), A08(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 23, 46), e10);
        }
        this.A07.obtainMessage(2, new BO(b82, false, new ArrayList(this.A0B), null)).sendToTarget();
        return b82;
    }

    private B8 A04(B8 b82, int i10, int i11) {
        C3M.A08((i10 == 3 || i10 == 4) ? false : true);
        return A03(A05(b82, i10, i11));
    }

    public static B8 A05(B8 b82, int i10, int i11) {
        return new B8(b82.A07, i10, b82.A05, System.currentTimeMillis(), b82.A04, i11, 0, b82.A00);
    }

    private B8 A06(String str, boolean z10) {
        int iA02 = A02(str);
        if (iA02 != -1) {
            return this.A0B.get(iA02);
        }
        if (z10) {
            try {
                return this.A0A.A7i(str);
            } catch (IOException e10) {
                AnonymousClass44.A08(A08(2, 15, 106), A08(17, 25, 52) + str, e10);
                return null;
            }
        }
        return null;
    }

    private C2474mY A07(C2474mY c2474mY, B8 b82) {
        if (c2474mY == null) {
            if (A0U() && this.A01 < this.A02) {
                B8 b8A04 = A04(b82, 2, 0);
                C2474mY c2474mY2 = new C2474mY(b8A04.A07, this.A09.A5E(b8A04.A07), b8A04.A00, false, this.A03, this);
                this.A0C.put(b8A04.A07.A02, c2474mY2);
                int i10 = this.A01;
                this.A01 = i10 + 1;
                if (i10 == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                c2474mY2.start();
                return c2474mY2;
            }
            return null;
        }
        C3M.A08(!c2474mY.A06);
        c2474mY.A05(false);
        return c2474mY;
    }

    private void A09() {
        Iterator<C2474mY> it = this.A0C.values().iterator();
        while (it.hasNext()) {
            it.next().A05(true);
        }
        try {
            this.A0A.AIe();
        } catch (IOException e10) {
            AnonymousClass44.A08(A08(2, 15, 106), A08(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 23, 46), e10);
        }
        this.A0B.clear();
        this.A08.quit();
        synchronized (this) {
            this.A00 = true;
            notifyAll();
        }
    }

    private void A0A() {
        String strA08 = A08(2, 15, 106);
        ArrayList arrayList = new ArrayList();
        try {
            C2479md c2479mdA7j = this.A0A.A7j(3, 4);
            while (c2479mdA7j.A01()) {
                try {
                    arrayList.add(c2479mdA7j.A00());
                } finally {
                }
            }
            if (c2479mdA7j != null) {
                c2479mdA7j.close();
            }
        } catch (IOException unused) {
            AnonymousClass44.A05(strA08, A08(42, 25, 4));
        }
        for (int i10 = 0; i10 < this.A0B.size(); i10++) {
            this.A0B.set(i10, A05(this.A0B.get(i10), 5, 0));
        }
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            if (A0E[6].charAt(14) != 'H') {
                break;
            }
            String[] strArr = A0E;
            strArr[1] = "XqOejHHacjjZLx98zpLnY1LZJhfsrk";
            strArr[7] = "zG4BgrMO4aUj";
            if (i11 < size) {
                ArrayList<B8> arrayList2 = this.A0B;
                B8 b82 = (B8) arrayList.get(i11);
                String[] strArr2 = A0E;
                if (strArr2[4].length() == strArr2[2].length()) {
                    break;
                }
                A0E[3] = "KT3y83B5rUupwCjllTydcOADIPFLf4ae";
                arrayList2.add(A05(b82, 5, 0));
                i11++;
            } else {
                List<Download> terminalDownloads = this.A0B;
                Collections.sort(terminalDownloads, new BP());
                try {
                    this.A0A.AJ5();
                } catch (IOException e10) {
                    AnonymousClass44.A08(strA08, A08(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 23, 46), e10);
                }
                ArrayList arrayList3 = new ArrayList(this.A0B);
                for (int i12 = 0; i12 < this.A0B.size(); i12++) {
                    this.A07.obtainMessage(2, new BO(this.A0B.get(i12), false, arrayList3, null)).sendToTarget();
                }
                A0B();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0B() {
        /*
            r5 = this;
            r4 = 0
            r3 = 0
        L2:
            java.util.ArrayList<com.facebook.ads.redexgen.X.B8> r0 = r5.A0B
            int r0 = r0.size()
            if (r3 >= r0) goto L49
            java.util.ArrayList<com.facebook.ads.redexgen.X.B8> r0 = r5.A0B
            java.lang.Object r2 = r0.get(r3)
            com.facebook.ads.redexgen.X.B8 r2 = (com.facebook.ads.redexgen.core.B8) r2
            java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.X.mY> r1 = r5.A0C
            com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest r0 = r2.A07
            java.lang.String r0 = r0.A02
            java.lang.Object r1 = r1.get(r0)
            com.facebook.ads.redexgen.X.mY r1 = (com.facebook.ads.redexgen.core.C2474mY) r1
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L38;
                case 1: goto L34;
                case 2: goto L2d;
                case 3: goto L23;
                case 4: goto L23;
                case 5: goto L29;
                case 6: goto L23;
                case 7: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L29:
            r5.A0O(r1, r2)
            goto L3c
        L2d:
            com.facebook.ads.redexgen.core.C3M.A01(r1)
            r5.A0P(r1, r2, r4)
            goto L3c
        L34:
            r5.A0M(r1)
            goto L3c
        L38:
            com.facebook.ads.redexgen.X.mY r1 = r5.A07(r1, r2)
        L3c:
            if (r1 == 0) goto L46
            boolean r0 = com.facebook.ads.redexgen.core.C2474mY.A03(r1)
            if (r0 != 0) goto L46
            int r4 = r4 + 1
        L46:
            int r3 = r3 + 1
            goto L2
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.BQ.A0B():void");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C() {
        /*
            r6 = this;
            r5 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.B8> r0 = r6.A0B
            int r0 = r0.size()
            if (r5 >= r0) goto L36
            java.util.ArrayList<com.facebook.ads.redexgen.X.B8> r0 = r6.A0B
            java.lang.Object r2 = r0.get(r5)
            com.facebook.ads.redexgen.X.B8 r2 = (com.facebook.ads.redexgen.core.B8) r2
            int r1 = r2.A02
            r0 = 2
            if (r1 != r0) goto L33
            com.facebook.ads.redexgen.X.mT r0 = r6.A0A     // Catch: java.io.IOException -> L1c
            r0.AGV(r2)     // Catch: java.io.IOException -> L1c
            goto L33
        L1c:
            r4 = move-exception
            r2 = 2
            r1 = 15
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r3 = A08(r2, r1, r0)
            r2 = 223(0xdf, float:3.12E-43)
            r1 = 23
            r0 = 46
            java.lang.String r0 = A08(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A08(r3, r0, r4)
        L33:
            int r5 = r5 + 1
            goto L1
        L36:
            r2 = 11
            r0 = 5000(0x1388, double:2.4703E-320)
            r6.sendEmptyMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.BQ.A0C():void");
    }

    private void A0E(int i10) throws IOException {
        this.A04 = i10;
        C2479md c2479mdA7j = null;
        try {
            try {
                this.A0A.AIe();
                c2479mdA7j = this.A0A.A7j(0, 1, 2, 5, 7);
                while (c2479mdA7j.A01()) {
                    this.A0B.add(c2479mdA7j.A00());
                }
            } catch (IOException e10) {
                AnonymousClass44.A08(A08(2, 15, 106), A08(67, 21, 14), e10);
                this.A0B.clear();
            }
            AbstractC09264a.A10(c2479mdA7j);
            this.A07.obtainMessage(0, new ArrayList(this.A0B)).sendToTarget();
            A0B();
        } catch (Throwable th2) {
            AbstractC09264a.A10(c2479mdA7j);
            throw th2;
        }
    }

    private void A0F(int i10) {
        this.A02 = i10;
        A0B();
    }

    private void A0G(int i10) {
        this.A03 = i10;
    }

    private void A0H(int i10) {
        this.A04 = i10;
        A0B();
    }

    private void A0I(B8 b82) {
        if (b82.A02 == 7) {
            int i10 = b82.A03 == 0 ? 0 : 1;
            int state = b82.A03;
            A04(b82, i10, state);
            A0B();
            return;
        }
        this.A0B.remove(A02(b82.A07.A02));
        try {
            this.A0A.AHh(b82.A07.A02);
        } catch (IOException unused) {
            String strA08 = A08(2, 15, 106);
            String[] strArr = A0E;
            String str = strArr[1];
            String str2 = strArr[7];
            int length = str.length();
            int removeIndex = str2.length();
            if (length == removeIndex) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[4] = "0mOws7zeqclkbY70VWtV8amCVjdjwc";
            strArr2[2] = "5byiBwQrvMTmrLaxdcHCyvzuNe0iHvcw";
            AnonymousClass44.A05(strA08, A08(88, 30, 26));
        }
        this.A07.obtainMessage(2, new BO(b82, true, new ArrayList(this.A0B), null)).sendToTarget();
    }

    private void A0J(B8 b82, int i10) {
        if (i10 == 0) {
            if (b82.A02 == 1) {
                A04(b82, 0, 0);
                return;
            }
            return;
        }
        int i11 = b82.A03;
        if (A0E[6].charAt(14) != 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "qDoL4xVSTO8RDQU7ZVoZcH2BhkCOc4";
        strArr[2] = "ugBXxeG19GlyVlR2WcoXaVyqVtSsbrKH";
        if (i10 == i11) {
            return;
        }
        int i12 = b82.A02;
        if (i12 == 0 || i12 == 2) {
            i12 = 1;
        }
        A03(new B8(b82.A07, i12, b82.A05, System.currentTimeMillis(), b82.A04, i10, 0, b82.A00));
    }

    private void A0K(B8 b82, Exception exc) {
        int i10;
        DownloadRequest downloadRequest = b82.A07;
        int i11 = exc == null ? 3 : 4;
        long j10 = b82.A05;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = b82.A04;
        int i12 = b82.A03;
        if (exc == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        B8 b83 = new B8(downloadRequest, i11, j10, jCurrentTimeMillis, j11, i12, i10, b82.A00);
        this.A0B.remove(A02(b83.A07.A02));
        try {
            this.A0A.AGV(b83);
        } catch (IOException e10) {
            AnonymousClass44.A08(A08(2, 15, 106), A08(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 23, 46), e10);
        }
        this.A07.obtainMessage(2, new BO(b83, false, new ArrayList(this.A0B), exc)).sendToTarget();
    }

    private void A0L(C2474mY c2474mY) {
        String str = c2474mY.A04.A02;
        this.A0C.remove(str);
        boolean z10 = c2474mY.A06;
        if (z10) {
            this.A06 = false;
        } else {
            int i10 = this.A01 - 1;
            this.A01 = i10;
            if (i10 == 0) {
                removeMessages(11);
            }
        }
        if (c2474mY.A08) {
            A0B();
            return;
        }
        Exception finalException = c2474mY.A01;
        if (finalException != null) {
            StringBuilder sb2 = new StringBuilder();
            String downloadId = A08(246, 13, 86);
            StringBuilder sbAppend = sb2.append(downloadId).append(c2474mY.A04);
            String downloadId2 = A08(0, 2, 97);
            String string = sbAppend.append(downloadId2).append(z10).toString();
            String downloadId3 = A08(2, 15, 106);
            AnonymousClass44.A08(downloadId3, string, finalException);
        }
        B8 b8A06 = A06(str, false);
        if (A0E[3].charAt(4) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "ylCSlCHYxJLig8GFragBjcnbyuXWai";
        strArr[2] = "OMWcFhgpmCCD5KtgAO70M2kgxcAld7fK";
        B8 b82 = (B8) C3M.A01(b8A06);
        switch (b82.A02) {
            case 2:
                C3M.A08(!z10);
                A0K(b82, finalException);
                break;
            case 3:
            case 4:
            case 6:
            default:
                throw new IllegalStateException();
            case 5:
            case 7:
                C3M.A08(z10);
                A0I(b82);
                break;
        }
        A0B();
    }

    private void A0M(C2474mY c2474mY) {
        if (c2474mY == null) {
            return;
        }
        C3M.A08(!c2474mY.A06);
        c2474mY.A05(false);
    }

    private void A0N(C2474mY c2474mY, long j10) {
        B8 b82 = (B8) C3M.A01(A06(c2474mY.A04.A02, false));
        if (j10 == b82.A04 || j10 == -1) {
            return;
        }
        A03(new B8(b82.A07, b82.A02, b82.A05, System.currentTimeMillis(), j10, b82.A03, b82.A01, b82.A00));
    }

    private void A0O(C2474mY c2474mY, B8 b82) {
        if (c2474mY == null) {
            boolean z10 = this.A06;
            if (A0E[3].charAt(4) != '8') {
                throw new RuntimeException();
            }
            A0E[0] = "e4XXQnURg6mIpThj5jyh4wOBvzx0EgPt";
            if (z10) {
                return;
            }
            C2474mY c2474mY2 = new C2474mY(b82.A07, this.A09.A5E(b82.A07), b82.A00, true, this.A03, this);
            this.A0C.put(b82.A07.A02, c2474mY2);
            this.A06 = true;
            c2474mY2.start();
            return;
        }
        if (!c2474mY.A06) {
            c2474mY.A05(false);
        }
    }

    private void A0P(C2474mY c2474mY, B8 b82, int i10) {
        C3M.A08(!c2474mY.A06);
        if (!A0U() || i10 >= this.A02) {
            A04(b82, 0, 0);
            c2474mY.A05(false);
        }
    }

    private void A0R(String str) {
        B8 b8A06 = A06(str, true);
        if (b8A06 == null) {
            AnonymousClass44.A05(A08(2, 15, 106), A08(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 39, 4) + str);
        } else {
            A04(b8A06, 5, 0);
            A0B();
        }
    }

    private void A0S(String str, int i10) {
        String strA08 = A08(2, 15, 106);
        if (str == null) {
            for (int i11 = 0; i11 < this.A0B.size(); i11++) {
                A0J(this.A0B.get(i11), i10);
            }
            try {
                this.A0A.AJ6(i10);
            } catch (IOException e10) {
                AnonymousClass44.A08(strA08, A08(157, 32, 101), e10);
            }
        } else {
            B8 b8A06 = A06(str, false);
            if (b8A06 != null) {
                A0J(b8A06, i10);
            } else {
                try {
                    this.A0A.AJ7(str, i10);
                } catch (IOException e11) {
                    AnonymousClass44.A08(strA08, A08(PsExtractor.PRIVATE_STREAM_1, 34, 0) + str, e11);
                }
            }
        }
        A0B();
    }

    private void A0T(boolean z10) {
        this.A05 = z10;
        A0B();
    }

    private boolean A0U() {
        if (!this.A05) {
            int i10 = this.A04;
            if (A0E[6].charAt(14) != 'H') {
                throw new RuntimeException();
            }
            A0E[5] = "cfwXoVsCs";
            if (i10 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        boolean z10 = true;
        try {
            switch (message.what) {
                case 0:
                    A0E(message.arg1);
                    break;
                case 1:
                    A0T(message.arg1 != 0);
                    break;
                case 2:
                    A0H(message.arg1);
                    break;
                case 3:
                    A0S((String) message.obj, message.arg1);
                    break;
                case 4:
                    A0F(message.arg1);
                    break;
                case 5:
                    A0G(message.arg1);
                    break;
                case 6:
                    A0Q((DownloadRequest) message.obj, message.arg1);
                    break;
                case 7:
                    A0R((String) message.obj);
                    break;
                case 8:
                    A0A();
                    break;
                case 9:
                    A0L((C2474mY) message.obj);
                    z10 = false;
                    break;
                case 10:
                    A0N((C2474mY) message.obj, AbstractC09264a.A0N(message.arg1, message.arg2));
                    return;
                case 11:
                    A0C();
                    return;
                case 12:
                    A09();
                    return;
                default:
                    throw new IllegalStateException();
            }
            this.A07.obtainMessage(1, z10 ? 1 : 0, this.A0C.size()).sendToTarget();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
