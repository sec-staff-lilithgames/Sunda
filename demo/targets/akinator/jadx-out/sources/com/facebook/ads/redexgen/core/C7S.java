package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Log;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7S implements InterfaceC2549nl {
    public static byte[] A0M;
    public static String[] A0N = {"gtbAICrdQ5OiLd8QtlGJkysA4GOuQAyl", "NB4BeTTq5ijHDPStUBIG2cd4hjVw3Rms", "uuMr3aWTfRr6VJnGuPPVK2CIrmsp3XMP", "Eb6am5ksZvZ5Hz0HFQHbX0NWivmHdCO7", "qnDH", "QayiUw4ouBPhcoxDO7fR8OixzHh3DuJf", "V84YazX1IDZHbq2m95FMlzDl0u9g04ST", "S22pIk311xlkEmMZRooVtOw4dNPxaWRF"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public InterfaceC2549nl A06;
    public AnonymousClass56 A07;
    public AnonymousClass56 A08;

    @MetaExoPlayerCustomization
    public C1360Lj A09;
    public C1374Lx A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC2549nl A0D;
    public final InterfaceC2549nl A0E;
    public final InterfaceC2549nl A0F;
    public final InterfaceC1364Ln A0G;
    public final InterfaceC1367Lq A0H;
    public final InterfaceC1373Lw A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A0N[4].length() == 12) {
                throw new RuntimeException();
            }
            A0N[4] = "VXYuEglycDYgl";
            bArrCopyOfRange[i13] = (byte) ((b10 ^ i12) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0M = new byte[]{25, 59, 57, 50, Utf8.REPLACEMENT_BYTE, 30, 59, 46, 59, 9, 53, 47, 40, 57, Utf8.REPLACEMENT_BYTE, 22, 58, 32, 57, 49, 59, 114, 33, 117, 32, 37, 49, 52, 33, 48, 117, 39, 48, 49, 60, 39, 48, 54, 33, 48, 49, 117, 0, 7, 28, 123, 117, 1, 61, 60, 38, 117, 56, 60, 50, 61, 33, 117, 54, 52, 32, 38, 48, 117, 39, 48, 57, 52, 33, 60, 35, 48, 117, 0, 7, 28, 38, 117, 50, 48, 33, 117, 39, 48, 38, 58, 57, 35, 48, 49, 117, 60, 59, 54, 58, 39, 39, 48, 54, 33, 57, 44, 123, 95, 94, 115, 81, 83, 88, 85, 84, 114, 73, 68, 85, 67, 98, 85, 81, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
        try {
            String strA4d = this.A0I.A4d(anonymousClass56);
            AnonymousClass56 anonymousClass56A09 = anonymousClass56.A04().A08(strA4d).A09();
            this.A08 = anonymousClass56A09;
            this.A05 = A01(this.A0G, strA4d, anonymousClass56A09.A06);
            this.A03 = anonymousClass56.A04;
            this.A09 = new C1360Lj(anonymousClass56.A07);
            this.A0B = A00(anonymousClass56) != -1;
            boolean z10 = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = M7.A00(this.A0G.A7K(strA4d));
                if (this.A00 != -1) {
                    this.A00 -= anonymousClass56.A04;
                    if (this.A00 < 0) {
                        throw new C09514z(2008);
                    }
                }
            }
            boolean z11 = anonymousClass56.A07.A08 <= 0 && anonymousClass56.A07.A07 <= 0;
            if (anonymousClass56.A03 != -1) {
                this.A00 = this.A00 == -1 ? anonymousClass56.A03 : Math.min(this.A00, anonymousClass56.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(anonymousClass56A09, false, z11);
            }
            return anonymousClass56.A03 != -1 ? anonymousClass56.A03 : this.A00;
        } catch (Throwable th2) {
            A09(th2);
            throw th2;
        }
    }

    static {
        A05();
    }

    public C7S(InterfaceC1364Ln interfaceC1364Ln, final InterfaceC2549nl interfaceC2549nl, InterfaceC2549nl interfaceC2549nl2, final InterfaceC09464u interfaceC09464u, InterfaceC1373Lw interfaceC1373Lw, int i10, final AnonymousClass31 anonymousClass31, final int i11, InterfaceC1367Lq interfaceC1367Lq) {
        this.A0G = interfaceC1364Ln;
        this.A0D = interfaceC2549nl2;
        this.A0I = interfaceC1373Lw == null ? InterfaceC1373Lw.A00 : interfaceC1373Lw;
        this.A0J = (i10 & 1) != 0;
        this.A0L = (i10 & 2) != 0;
        this.A0K = (i10 & 4) != 0;
        if (interfaceC2549nl != null) {
            interfaceC2549nl = anonymousClass31 != null ? new InterfaceC2549nl(interfaceC2549nl, anonymousClass31, i11) { // from class: com.facebook.ads.redexgen.X.9c
                public static byte[] A03;
                public final int A00;
                public final AnonymousClass31 A01;
                public final InterfaceC2549nl A02;

                static {
                    A01();
                }

                public static String A00(int i12, int i13, int i14) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i12, i12 + i13);
                    for (int i15 = 0; i15 < bArrCopyOfRange.length; i15++) {
                        bArrCopyOfRange[i15] = (byte) ((bArrCopyOfRange[i15] - i14) - 41);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
                }

                {
                    this.A02 = (InterfaceC2549nl) C3M.A01(interfaceC2549nl);
                    C3M.A01(anonymousClass31);
                    this.A01 = null;
                    this.A00 = i11;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final void A3v(C5H c5h) {
                    C3M.A01(c5h);
                    this.A02.A3v(c5h);
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final Map<String, List<String>> A8l() {
                    return this.A02.A8l();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final Uri A9H() {
                    return this.A02.A9H();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
                    throw new NullPointerException(A00(0, 14, 104));
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final void close() throws IOException {
                    this.A02.close();
                }

                @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                public final int read(byte[] bArr, int i12, int i13) throws IOException {
                    throw new NullPointerException(A00(0, 14, 104));
                }
            } : interfaceC2549nl;
            this.A0F = interfaceC2549nl;
            this.A0E = interfaceC09464u != null ? new InterfaceC2549nl(interfaceC2549nl, interfaceC09464u) { // from class: com.facebook.ads.redexgen.X.9a
                public static String[] A04 = {"wbGAhFLyG1O1BXRQkdAsuvRwjcG0JvdY", "WIGHUXkmdMwjKtYrGQHAEajnCcLVhsJc", "71g9TI5vzncmEyYDsqHRZQ5IIDSVhuCU", "Of7gEliA8dohBLU5UePsnNPr9luYUKIX", "Ip7oB5coOYYSe2wQ3nHh7WYhGK", "mFyxGR7YA7Uh54mquru9LT9AFg", "iYrL5ZFnNwboLBDSkDK7D5rnh7HwI2GN", "DEMvAgZEfGNSxO1Scy7Mz579azioI4xU"};
                public long A00;
                public boolean A01;
                public final InterfaceC09464u A02;
                public final InterfaceC2549nl A03;

                {
                    this.A03 = (InterfaceC2549nl) C3M.A01(interfaceC2549nl);
                    this.A02 = (InterfaceC09464u) C3M.A01(interfaceC09464u);
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final void A3v(C5H c5h) {
                    C3M.A01(c5h);
                    this.A03.A3v(c5h);
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final Map<String, List<String>> A8l() {
                    return this.A03.A8l();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final Uri A9H() {
                    return this.A03.A9H();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
                    this.A00 = this.A03.AFy(anonymousClass56);
                    if (this.A00 == 0) {
                        return 0L;
                    }
                    long j10 = anonymousClass56.A03;
                    String[] strArr = A04;
                    if (strArr[4].length() != strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[2] = "8JYiy7Q3QOgUU9IJtNo1oEeVZYLkhQA2";
                    strArr2[1] = "C3hXJiAszWGMEEgz1C8EzdfpsF4hhGij";
                    if (j10 == -1 && this.A00 != -1) {
                        anonymousClass56 = anonymousClass56.A05(0L, this.A00);
                    }
                    this.A01 = true;
                    this.A02.AG0(anonymousClass56);
                    return this.A00;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                public final void close() throws IOException {
                    try {
                        this.A03.close();
                    } finally {
                        if (this.A01) {
                            this.A01 = false;
                            this.A02.close();
                        }
                    }
                }

                @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                public final int read(byte[] bArr, int i12, int i13) throws IOException {
                    if (this.A00 != 0) {
                        int i14 = this.A03.read(bArr, i12, i13);
                        if (i14 > 0) {
                            this.A02.write(bArr, i12, i14);
                            if (this.A00 != -1) {
                                this.A00 -= i14;
                            }
                        }
                        return i14;
                    }
                    String[] strArr = A04;
                    if (strArr[4].length() != strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[0] = "tTmOA5hODgmGBNxF0mS11dvWTNwifcB6";
                    strArr2[3] = "mpSZqupnUd3dBB1VIyplsxMvqiIWybTS";
                    return -1;
                }
            } : null;
        } else {
            this.A0F = C10469d.A02;
            this.A0E = null;
        }
        this.A0H = interfaceC1367Lq;
    }

    private int A00(AnonymousClass56 anonymousClass56) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && anonymousClass56.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC1364Ln interfaceC1364Ln, String str, Uri redirectedUri) {
        Uri redirectedUri2 = M7.A01(interfaceC1364Ln.A7K(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
            this.A07 = null;
            this.A06 = null;
            if (A0N[5].charAt(3) == 'i') {
                String[] strArr = A0N;
                strArr[2] = "vHGwoIowQcJHPzt2zHibHrQYTuNv4ZzT";
                strArr[1] = "k7MJrtNgTHKuOTKhmFADSg5K1rHaIFar";
                if (this.A0A != null) {
                    InterfaceC1364Ln interfaceC1364Ln = this.A0G;
                    if (A0N[6].charAt(29) == '4') {
                        String[] strArr2 = A0N;
                        strArr2[2] = "npCyc8crYVBLSlKGvChDlZdzdxvHOR7S";
                        strArr2[1] = "yWpl1AKn1flVHx0rOJ2JJIdMQnxjFkRn";
                        interfaceC1364Ln.AGw(this.A0A);
                        this.A0A = null;
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th2) {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AGw(this.A0A);
                this.A0A = null;
            }
            throw th2;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A72();
            throw new NullPointerException(A02(103, 17, 44));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(com.facebook.ads.redexgen.core.AnonymousClass56 r22, boolean r23, boolean r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C7S.A06(com.facebook.ads.redexgen.X.56, boolean, boolean):void");
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            M9 m9 = new M9();
            M9.A00(m9, this.A03);
            this.A0G.A46(str, m9);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        M9 m9 = new M9();
        if (!uri.equals(this.A05)) {
            Uri uri2 = this.A05;
            if (A0N[6].charAt(29) != '4') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "HwBuIJEC6JIKumxqgSDJ0pUKIwQFYzQv";
            strArr[7] = "1FgFIXgVQckXZ73NbznNhujKeCbi6Slt";
            M9.A01(m9, uri2);
        } else {
            M9.A01(m9, null);
        }
        try {
            this.A0G.A46(str, m9);
        } catch (C1361Lk e10) {
            String message = A02(15, 88, 73);
            Log.w(A02(0, 15, 70), message, e10);
        }
    }

    private void A09(Throwable th2) {
        if (A0B() || (th2 instanceof C1361Lk)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final InterfaceC1364Ln A0E() {
        return this.A0G;
    }

    public final InterfaceC1373Lw A0F() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    public final void A3v(C5H c5h) {
        C3M.A01(c5h);
        this.A0D.A3v(c5h);
        this.A0F.A3v(c5h);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    public final Map<String, List<String>> A8l() {
        if (A0C()) {
            return this.A0F.A8l();
        }
        return Collections.emptyMap();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    public final Uri A9H() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e10) {
            A09(e10);
            throw e10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final int read(byte[] bArr, int i10, int i11) throws Throwable {
        if (i11 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        AnonymousClass56 currentDataSpec = (AnonymousClass56) C3M.A01(this.A08);
        AnonymousClass56 anonymousClass56 = (AnonymousClass56) C3M.A01(this.A07);
        try {
            if (this.A03 >= this.A01) {
                A06(currentDataSpec, true, false);
            }
            try {
                int bytesRead = ((InterfaceC2549nl) C3M.A01(this.A06)).read(bArr, i10, i11);
                if (bytesRead != -1) {
                    if (A0B()) {
                        this.A04 += bytesRead;
                    }
                    this.A03 += bytesRead;
                    this.A02 += bytesRead;
                    if (this.A00 != -1) {
                        this.A00 -= bytesRead;
                    }
                } else if (A0C() && (anonymousClass56.A03 == -1 || this.A02 < anonymousClass56.A03)) {
                    A07((String) AbstractC09264a.A0f(currentDataSpec.A08));
                } else if (this.A00 > 0 || this.A00 == -1) {
                    A03();
                    A06(currentDataSpec, false, false);
                    return read(bArr, i10, i11);
                }
                return bytesRead;
            } catch (Throwable th2) {
                e = th2;
                A09(e);
                throw e;
            }
        } catch (Throwable th3) {
            e = th3;
        }
    }
}
