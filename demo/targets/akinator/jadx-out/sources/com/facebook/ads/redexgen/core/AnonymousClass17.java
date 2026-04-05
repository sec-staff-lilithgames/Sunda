package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.17, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass17 extends AbstractC10549l {
    public static byte[] A04;
    public static String[] A05 = {"EpUFNdKyF", "ElnVCWkanZ28CNZmVbXI8Cgdfk8l0", "X39VUuGfeiZ7XA2vCr", "EABpQNGHZAa4ZPAJBF04BZM7WLurFTC9", "chwMXTauvlPIh4ZEXg6aw7fxDLbtX6Fs", "XZGBORnRKKQlpHrvvOBFjnqbRPoZpqW4", "uC2aRCtD", "rZqfEylCjzpizgmEVXgae15ipmvYBT3W"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {99, 108, 105, 96, 86, 119, 102, 87, 96, 100, 97, 74, 117, 96, 107, 111, 96, 101, 108, 90, 123, 106, 91, 108, 104, 109, 91, 72, 79, 47, 36, 35, 56, 113, 57, 48, 34, 113, 32, 36, 52, 35, 40, 113, 48, Utf8.REPLACEMENT_BYTE, 53, 126, 62, 35, 113, 55, 35, 48, 54, 60, 52, Utf8.REPLACEMENT_BYTE, 37, 125, 113, 38, 57, 56, 50, 57, 113, 48, 35, 52, 113, Utf8.REPLACEMENT_BYTE, 62, 37, 113, 34, 36, 33, 33, 62, 35, 37, 52, 53, AbstractJsonLexerKt.TC_INVALID, 113, 21, 56, 53, 113, 40, 62, 36, 113, 50, 48, 61, 61, 113, 4, 35, 56, AbstractJsonLexerKt.TC_INVALID, 33, 48, 35, 34, 52, 121, 120, 113, 62, Utf8.REPLACEMENT_BYTE, 113, 48, 113, 34, 37, 35, 56, Utf8.REPLACEMENT_BYTE, 54, 113, 50, 62, Utf8.REPLACEMENT_BYTE, 37, 48, 56, Utf8.REPLACEMENT_BYTE, 56, Utf8.REPLACEMENT_BYTE, 54, 113, 118, 110, 118, 113, 62, 35, 113, 118, 114, 118, 110, 113, 4, 34, 52, 113, 4, 35, 56, AbstractJsonLexerKt.TC_INVALID, 55, 35, 62, 60, 23, 56, 61, 52, 121, Utf8.REPLACEMENT_BYTE, 52, 38, 113, 23, 56, 61, 52, 121, 33, 48, 37, 57, 120, 120, 113, 37, 62, 113, 48, 39, 62, 56, 53, 113, 37, 57, 56, 34, AbstractJsonLexerKt.TC_INVALID, 113, 33, 48, 37, 57, 108, 116, 34, 125, 32, 36, 52, 35, 40, 108, 116, 34, 125, 55, 35, 48, 54, 60, 52, Utf8.REPLACEMENT_BYTE, 37, 108, 116, 34};
        String[] strArr = A05;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[3] = "X0VoZl0WlZuonvRnqv5GR18rztIlLTBl";
        strArr2[7] = "XOIDFuTAWw0P55lYRHi5z3HfEt22MTH0";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AFy(AnonymousClass56 anonymousClass56) throws C2543nf {
        C4S.A02(A01(0, 15, 71));
        Uri uri = anonymousClass56.A06;
        this.A01 = uri;
        A0G(anonymousClass56);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(anonymousClass56.A04);
                this.A00 = anonymousClass56.A03 == -1 ? this.A02.length() - anonymousClass56.A04 : anonymousClass56.A03;
                C4S.A00();
                if (this.A00 < 0) {
                    throw new C2543nf(null, null, 2008);
                }
                this.A03 = true;
                A0H(anonymousClass56);
                long j10 = this.A00;
                if (A05[1].length() == 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[0] = "xa7zJISj9";
                strArr[2] = "YSvWE2PgVF009LXgrm";
                return j10;
            } catch (IOException e10) {
                throw new C2543nf(e10, 2000);
            }
        } catch (Throwable th2) {
            C4S.A00();
            throw th2;
        }
    }

    static {
        A02();
    }

    public AnonymousClass17() {
        super(false);
    }

    public static RandomAccessFile A00(Uri uri) throws C2543nf {
        try {
            return new RandomAccessFile((String) C3M.A01(uri.getPath()), A01(29, 1, 31));
        } catch (FileNotFoundException e10) {
            boolean zIsEmpty = TextUtils.isEmpty(uri.getQuery());
            String[] strArr = A05;
            if (strArr[3].charAt(29) != strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            A05[1] = "uF4";
            if (zIsEmpty && TextUtils.isEmpty(uri.getFragment())) {
                throw new C2543nf(e10, (AbstractC09264a.A02 < 21 || !AnonymousClass58.A00(e10.getCause())) ? 2005 : 2006);
            }
            throw new C2543nf(String.format(A01(30, PsExtractor.AUDIO_STREAM, 19), uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new C2543nf(e11, 2006);
        } catch (RuntimeException e12) {
            throw new C2543nf(e12, 2000);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    public final Uri A9H() {
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.facebook.ads.redexgen.core.C2543nf {
        /*
            r6 = this;
            r4 = 0
            r6.A01 = r4
            r3 = 0
            java.io.RandomAccessFile r0 = r6.A02     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L46
            if (r0 == 0) goto Ld
            java.io.RandomAccessFile r0 = r6.A02     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L46
            r0.close()     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L46
        Ld:
            r6.A02 = r4
            boolean r4 = r6.A03
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            r0 = 0
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L37
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            java.lang.String r1 = "OaGc5WGUg2QUkWgGCbKJpnMVI4k73TqR"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "7y85lWdOal5lz5BxO7mJ0PPL1NIIxTrt"
            r0 = 7
            r2[r0] = r1
            if (r4 == 0) goto L36
            r6.A03 = r3
            r6.A0E()
        L36:
            return
        L37:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3d:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            com.facebook.ads.redexgen.X.nf r0 = new com.facebook.ads.redexgen.X.nf     // Catch: java.lang.Throwable -> L46
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L46
            throw r0     // Catch: java.lang.Throwable -> L46
        L46:
            r5 = move-exception
            r6.A02 = r4
            boolean r4 = r6.A03
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            r0 = 3
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L73
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            java.lang.String r1 = "Vm3YcALUN"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "c4edS4Kr4EVyTdnKAl"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L72
        L6d:
            r6.A03 = r3
            r6.A0E()
        L72:
            throw r5
        L73:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            java.lang.String r1 = "xGGiO6aoc87d3bdrOM0514KxVU6xxq2z"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "rL55lenIs2jXGgYduJCww9Rx5eQkWv1P"
            r0 = 4
            r2[r0] = r1
            if (r4 == 0) goto L72
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass17.close():void");
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i10, int i11) throws C2543nf {
        if (i11 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                C4S.A02(A01(15, 14, 75));
                int i12 = ((RandomAccessFile) AbstractC09264a.A0f(this.A02)).read(bArr, i10, (int) Math.min(this.A00, i11));
                if (i12 > 0) {
                    this.A00 -= i12;
                    A0F(i12);
                }
                return i12;
            } catch (IOException e10) {
                throw new C2543nf(e10, 2000);
            }
        } finally {
            C4S.A00();
        }
    }
}
