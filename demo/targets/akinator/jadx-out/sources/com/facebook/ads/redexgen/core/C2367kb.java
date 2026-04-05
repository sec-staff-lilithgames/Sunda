package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.kb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2367kb implements GX {
    public static byte[] A0e;
    public static String[] A0f = {"ywSCwlzG1SMdvvW", "WbYO2rYjmhbf4R3oYDPvQZ3H98amgjSr", "Za", "aa8pMmtLKrvpWkukTfymetmlHniL9M", "752FE5aLUbaesINptKDix8v", "1m6bsNbzXuacY99BBbBsLUDHw0asFdhp", "tFAwrqTGVJ2tUOf2i", "X0elgRXJnrwhMbXNAucG6j3nQ1B9k96A"};
    public static final InterfaceC1223Gb A0g;
    public static final C2614or A0h;
    public static final byte[] A0i;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public SparseArray<IV> A0D;
    public C4J A0E;
    public GY A0F;
    public IV A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public H1[] A0K;
    public H1[] A0L;
    public final int A0M;
    public final DrmInitData A0N;
    public final C4J A0O;
    public final C4J A0P;
    public final C4J A0Q;
    public final C4J A0R;
    public final C4J A0S;
    public final C4R A0T;
    public final H1 A0U;
    public final HO A0V;
    public final C1285Im A0W;
    public final ArrayDeque<C2375kj> A0X;
    public final ArrayDeque<IU> A0Y;
    public final List<C2614or> A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final byte[] A0d;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(com.facebook.ads.redexgen.core.IV r25, int r26, long r27, int r29, com.facebook.ads.redexgen.core.C4J r30, int r31) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2367kb.A00(com.facebook.ads.redexgen.X.IV, int, long, int, com.facebook.ads.redexgen.X.4J, int):int");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C2408lT> A04(C4J c4j, long j10) throws C08822i {
        long jA0R;
        long jA0R2;
        c4j.A0f(8);
        int iA01 = II.A01(c4j.A0C());
        c4j.A0g(4);
        long jA0Q = c4j.A0Q();
        if (iA01 == 0) {
            jA0R = c4j.A0Q();
            jA0R2 = j10 + c4j.A0Q();
        } else {
            jA0R = c4j.A0R();
            jA0R2 = j10 + c4j.A0R();
        }
        long jA0U = AbstractC09264a.A0U(jA0R, 1000000L, jA0Q);
        c4j.A0g(2);
        int iA0M = c4j.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i10 = 0; i10 < iA0M; i10++) {
            int iA0C = c4j.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw new C08822i(A0B(634, 28, 93));
            }
            long jA0Q2 = c4j.A0Q();
            iArr[i10] = Integer.MAX_VALUE & iA0C;
            jArr[i10] = jA0R2;
            jArr3[i10] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = AbstractC09264a.A0U(jA0R, 1000000L, jA0Q);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "mBjUzKzbBV9DJWZlH52EoviqXd7Fx3w7";
            jArr2[i10] = jA0U2 - jArr3[i10];
            c4j.A0g(4);
            jA0R2 += iArr[i10];
        }
        return Pair.create(Long.valueOf(jA0U), new C2408lT(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static IV A09(C4J c4j, SparseArray<IV> sparseArray, boolean z10) {
        c4j.A0f(8);
        int iA00 = II.A00(c4j.A0C());
        IV ivA08 = A08(sparseArray, c4j.A0C(), z10);
        if (ivA08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c4j.A0R();
            ivA08.A07.A04 = jA0R;
            ivA08.A07.A03 = jA0R;
        }
        IP ip2 = ivA08.A04;
        ivA08.A07.A06 = new IP((iA00 & 2) != 0 ? c4j.A0L() - 1 : ip2.A02, (iA00 & 8) != 0 ? c4j.A0L() : ip2.A00, (iA00 & 16) != 0 ? c4j.A0L() : ip2.A03, (iA00 & 32) != 0 ? c4j.A0L() : ip2.A01);
        return ivA08;
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        String[] strArr = A0f;
        if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[1] = "BGZmKOZPo9hBykc2GdFNUQpHC0I3sPv1";
        strArr2[5] = "CvUkm70dQ0grN9w1V6xWMg6HVylPciNL";
        A0e = new byte[]{84, 88, 95, 106, 113, 115, 62, 109, 119, 100, 123, 62, 114, 123, 109, 109, 62, 106, 118, AbstractJsonLexerKt.TC_INVALID, 112, 62, 118, 123, AbstractJsonLexerKt.TC_INVALID, 122, 123, 108, 62, 114, 123, 112, 121, 106, 118, 62, 54, 107, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 55, 48, 99, 72, 82, 84, 95, 6, 69, 73, 83, 72, 82, 6, 79, 72, 6, 85, 68, 65, 86, 6, 7, 27, 6, 23, 6, 14, 83, 72, 85, 83, 86, 86, 73, 84, 82, 67, 66, 15, 8, 73, 98, 120, 126, 117, 44, 111, 99, 121, 98, 120, 44, 101, 98, 44, AbstractJsonLexerKt.TC_INVALID, 107, 124, 104, 44, 45, 49, 44, 61, 44, 36, 121, 98, AbstractJsonLexerKt.TC_INVALID, 121, 124, 124, 99, 126, 120, 105, 104, 37, 34, 104, 92, 79, 73, 67, 75, 64, 90, 75, 74, 99, 94, 26, 107, 86, 90, 92, 79, 77, 90, 65, 92, 57, 23, 30, 31, 2, 25, 30, 23, 80, 30, 21, 23, 17, 4, 25, 6, 21, 80, 31, 22, 22, 3, 21, 4, 80, 4, 31, 80, 3, 17, 29, 0, 28, 21, 80, 20, 17, 4, 17, 94, 116, 83, 75, 92, 81, 84, 89, 29, 115, 124, 113, 29, 81, 88, 83, 90, 73, 85, 113, 88, 92, 91, 29, 92, 73, 82, 80, 29, 89, 88, 91, 84, 83, 88, 78, 29, 88, 69, 73, 88, 83, 89, 88, 89, 29, 92, 73, 82, 80, 29, 78, 84, 71, 88, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 19, 62, 23, 19, 20, 82, 19, 6, 29, 31, 82, 5, 27, 6, 26, 82, 30, 23, 28, 21, 6, 26, 82, 76, 82, 64, 67, 70, 69, 70, 74, 65, 68, 70, 69, 82, 90, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 91, 92, 2, 43, 32, 41, 58, 38, 110, 35, 39, 61, 35, 47, 58, 45, 38, 116, 110, 82, 123, 123, 110, 120, 105, 61, 105, 114, 61, 120, 115, 126, 111, 100, 109, 105, 116, 114, 115, 61, 121, 124, 105, 124, 61, 106, 124, 110, 61, 115, 120, 122, 124, 105, 116, 107, 120, 51, 123, 82, 82, 71, 81, 64, 20, 64, 91, 20, 81, 90, 80, 20, 91, 82, 20, 89, 80, 85, 64, 20, 67, 85, 71, 20, 90, 81, 83, 85, 64, 93, 66, 81, 26, 61, 4, 23, 0, 0, 27, 22, 27, 28, 21, 82, 38, 0, 19, 17, 25, 55, 28, 17, 0, 11, 2, 6, 27, 29, 28, 48, 29, 10, 82, 2, 19, 0, 19, 31, 23, 6, 23, 0, 1, 82, 27, 1, 82, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 92, 84, 108, 110, 119, 119, 98, 99, 39, 119, 116, 116, 111, 39, 102, 115, 104, 106, 39, 47, 97, 102, 110, 107, 98, 99, 39, 115, 104, 39, 98, AbstractJsonLexerKt.TC_INVALID, 115, 117, 102, 100, 115, 39, 114, 114, 110, 99, 46, 60, 4, 6, 31, 31, 6, 1, 8, 79, 14, 27, 0, 2, 79, 24, 6, 27, 7, 79, 3, 10, 1, 8, 27, 7, 79, 81, 79, 93, 94, 91, 88, 91, 87, 92, 89, 91, 88, 79, 71, 26, 1, 28, 26, 31, 31, 0, 29, 27, 10, 11, 70, 65, 79, 119, 117, 108, 108, 117, 114, 123, 60, 105, 114, 111, 105, 108, 108, 115, 110, 104, 121, 120, 60, 121, 113, 111, 123, 60, 106, 121, 110, 111, 117, 115, 114, 38, 60, 57, 2, 9, 20, 28, 9, 15, 24, 9, 8, 76, 1, 3, 3, 26, 76, 14, 3, 20, 66, 71, 124, 119, 106, 98, 119, 113, 102, 119, 118, 50, 97, 115, 123, 125, 50, 119, 124, 102, 96, 107, 50, 113, 125, 103, 124, 102, 40, 50, 107, 80, 86, 95, 80, 90, 82, 91, 90, 30, 87, 80, 90, 87, 76, 91, 93, 74, 30, 76, 91, 88, 91, 76, 91, 80, 93, 91, 107, 92, 79, 84, 92, 95, 81, 88, 29, 81, 88, 83, 90, 73, 85, 29, 89, 88, 78, 94, 79, 84, 77, 73, 84, 82, 83, 29, 84, 83, 29, 78, 90, 77, 89, 29, 91, 82, 72, 83, 89, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 83, 66, 66, 94, 91, 81, 83, 70, 91, 93, 92, 29, 74, 31, 87, 95, 65, 85, 66, 83, 83, 79, 74, 64, 66, 87, 74, 76, 77, 12, 91, 14, 78, 83, 23, 14, 85, 87, 87, 70, 89, 84, 85, 95, 31, 88, 85, 70, 83, 40, 55, 58, 59, 49, 113, 51, 46, 106};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0I(C4J c4j, Uri uri) {
        String str;
        String str2;
        long jA0U;
        long jA0Q;
        if (this.A0L == null || this.A0L.length == 0) {
            return;
        }
        c4j.A0f(8);
        int iA01 = II.A01(c4j.A0C());
        long jA0U2 = C.TIME_UNSET;
        long jA05 = C.TIME_UNSET;
        switch (iA01) {
            case 0:
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                if (A0f[2].length() != 2) {
                    throw new RuntimeException();
                }
                A0f[0] = "4yWaL9iFGGaDiXT";
                long jA0Q2 = c4j.A0Q();
                jA0U2 = AbstractC09264a.A0U(c4j.A0Q(), 1000000L, jA0Q2);
                if (this.A0C != C.TIME_UNSET) {
                    jA05 = this.A0C + jA0U2;
                }
                jA0U = AbstractC09264a.A0U(c4j.A0Q(), 1000L, jA0Q2);
                jA0Q = c4j.A0Q();
                break;
            case 1:
                long jA0Q3 = c4j.A0Q();
                jA05 = AbstractC09264a.A0U(c4j.A0R(), 1000000L, jA0Q3);
                jA0U = AbstractC09264a.A0U(c4j.A0Q(), 1000L, jA0Q3);
                jA0Q = c4j.A0Q();
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                break;
            default:
                AnonymousClass44.A07(A0B(128, 22, 77), A0B(550, 35, 127) + iA01);
                return;
        }
        byte[] bArr = new byte[c4j.A07()];
        c4j.A0k(bArr, 0, c4j.A07());
        int i10 = 0;
        C4J c4j2 = new C4J(this.A0V.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c4j2.A07();
        H1[] h1Arr = this.A0L;
        int length = h1Arr.length;
        int i11 = 0;
        while (i11 < length) {
            H1 h12 = h1Arr[i11];
            c4j2.A0f(i10);
            h12.AJu(uri);
            h12.AI7(c4j2, iA07);
            i11++;
            i10 = 0;
        }
        if (jA05 == C.TIME_UNSET) {
            this.A0Y.addLast(new IU(jA0U2, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0T != null) {
            jA05 = this.A0T.A05(jA05);
        }
        if (this.A0b && this.A0A != C.TIME_UNSET) {
            jA05 = this.A0A;
        }
        for (H1 h13 : this.A0L) {
            h13.AIA(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0J(C4J c4j, C4J c4j2, String str, C1287Io c1287Io) throws C08822i {
        c4j.A0f(8);
        int iA0C = c4j.A0C();
        if (c4j.A0C() != 1936025959) {
            return;
        }
        int iA01 = II.A01(iA0C);
        if (A0f[2].length() != 2) {
            throw new RuntimeException();
        }
        A0f[0] = "QrVDtjxvyixdHPq";
        if (iA01 == 1) {
            c4j.A0g(4);
        }
        if (c4j.A0C() != 1) {
            throw new C08822i(A0B(50, 39, 69));
        }
        c4j2.A0f(8);
        int iA0C2 = c4j2.A0C();
        if (c4j2.A0C() != 1936025959) {
            return;
        }
        int iA012 = II.A01(iA0C2);
        if (iA012 == 1) {
            if (c4j2.A0Q() == 0) {
                throw new C08822i(A0B(EventTypeExtended.EVENT_TYPE_EXTENDED_SK_OVERLAY_PRESENTING_VALUE, 55, 94));
            }
        } else if (iA012 >= 2) {
            c4j2.A0g(4);
        }
        if (c4j2.A0Q() != 1) {
            throw new C08822i(A0B(89, 39, 111));
        }
        c4j2.A0g(1);
        int iA0I = c4j2.A0I();
        int i10 = (iA0I & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i11 = iA0I & 15;
        boolean z10 = c4j2.A0I() == 1;
        if (z10) {
            int iA0I2 = c4j2.A0I();
            byte[] bArr = new byte[16];
            c4j2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (iA0I2 == 0) {
                int iA0I3 = c4j2.A0I();
                bArr2 = new byte[iA0I3];
                c4j2.A0k(bArr2, 0, iA0I3);
            }
            c1287Io.A08 = true;
            c1287Io.A07 = new C1286In(z10, str, iA0I2, bArr, i10, i11, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0R(com.facebook.ads.redexgen.core.C2375kj r17) throws com.facebook.ads.redexgen.core.C08822i {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2367kb.A0R(com.facebook.ads.redexgen.X.kj):void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[PHI: r0 r3
      0x006a: PHI (r0v33 com.facebook.ads.redexgen.X.ki) = (r0v12 com.facebook.ads.redexgen.X.ki), (r0v38 com.facebook.ads.redexgen.X.ki) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r3v6 com.facebook.ads.redexgen.X.In) = (r3v1 com.facebook.ads.redexgen.X.In), (r3v7 com.facebook.ads.redexgen.X.In) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0T(com.facebook.ads.redexgen.core.C2375kj r9, android.util.SparseArray<com.facebook.ads.redexgen.core.IV> r10, int r11, byte[] r12, boolean r13) throws com.facebook.ads.redexgen.core.C08822i {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2367kb.A0T(com.facebook.ads.redexgen.X.kj, android.util.SparseArray, int, byte[], boolean):void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0W(C1286In c1286In, C4J c4j, C1287Io c1287Io) throws C08822i {
        int i10 = c1286In.A00;
        c4j.A0f(8);
        if ((II.A00(c4j.A0C()) & 1) == 1) {
            c4j.A0g(8);
        }
        int iA0I = c4j.A0I();
        int iA0L = c4j.A0L();
        if (iA0L != c1287Io.A00) {
            throw new C08822i(A0B(308, 17, 45) + iA0L + A0B(0, 2, 27) + c1287Io.A00);
        }
        int i11 = 0;
        if (iA0I == 0) {
            boolean[] zArr = c1287Io.A0F;
            for (int i12 = 0; i12 < iA0L; i12++) {
                int iA0I2 = c4j.A0I();
                i11 += iA0I2;
                zArr[i12] = iA0I2 > i10;
            }
        } else {
            i11 = 0 + (iA0I * iA0L);
            Arrays.fill(c1287Io.A0F, 0, iA0L, iA0I > i10);
        }
        c1287Io.A02(i11);
    }

    static {
        A0E();
        A0g = new InterfaceC1223Gb() { // from class: com.facebook.ads.redexgen.X.kf
            @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
            public final GX[] A5F() {
                return C2367kb.A0b();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1222Ga.A01(this, uri, map);
            }
        };
        A0i = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0h = new C2D().A11(A0B(717, 18, 81)).A14();
    }

    public C2367kb() {
        this(0);
    }

    public C2367kb(int i10) {
        this(i10, null);
    }

    public C2367kb(int i10, C4R c4r) {
        this(i10, c4r, null, null);
    }

    public C2367kb(int i10, C4R c4r, C1285Im c1285Im, DrmInitData drmInitData) {
        this(i10, c4r, c1285Im, drmInitData, Collections.emptyList());
    }

    public C2367kb(int i10, C4R c4r, C1285Im c1285Im, DrmInitData drmInitData, List<C2614or> list) {
        this(i10, c4r, c1285Im, drmInitData, list, null, false, false, false);
    }

    public C2367kb(int i10, C4R c4r, C1285Im c1285Im, DrmInitData drmInitData, List<C2614or> list, H1 h12, boolean z10, boolean z11, boolean z12) {
        this.A0A = C.TIME_UNSET;
        this.A0M = (c1285Im != null ? 8 : 0) | i10;
        this.A0T = c4r;
        this.A0W = c1285Im;
        this.A0N = drmInitData;
        this.A0Z = Collections.unmodifiableList(list);
        this.A0U = h12;
        this.A0c = z10;
        this.A0b = z11;
        this.A0a = z12;
        this.A0V = new HO();
        this.A0O = new C4J(16);
        this.A0R = new C4J(AbstractC1238Gq.A03);
        this.A0Q = new C4J(5);
        this.A0P = new C4J();
        this.A0d = new byte[16];
        this.A0S = new C4J(this.A0d);
        this.A0X = new ArrayDeque<>();
        this.A0Y = new ArrayDeque<>();
        this.A0D = new SparseArray<>();
        this.A08 = C.TIME_UNSET;
        this.A0B = C.TIME_UNSET;
        this.A0C = C.TIME_UNSET;
        A0C();
    }

    public static long A01(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        return II.A01(fullAtom) == 0 ? c4j.A0Q() : c4j.A0R();
    }

    public static long A02(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        int version = II.A01(fullAtom);
        return version == 1 ? c4j.A0R() : c4j.A0Q();
    }

    public static Pair<Integer, IP> A03(C4J c4j) {
        c4j.A0f(12);
        int defaultSampleDescriptionIndex = c4j.A0C();
        int trackId = c4j.A0L();
        int defaultSampleFlags = c4j.A0L();
        int defaultSampleSize = c4j.A0L();
        int defaultSampleDuration = c4j.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new IP(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C2374ki> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2374ki c2374ki = list.get(i10);
            int leafChildrenSize = A0f[4].length();
            if (leafChildrenSize != 23) {
                throw new RuntimeException();
            }
            A0f[0] = "gRucWkmmr3YeQcV";
            C2374ki c2374ki2 = c2374ki;
            int leafChildrenSize2 = ((II) c2374ki2).A00;
            if (leafChildrenSize2 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c2374ki2.A00.A00;
                UUID uuidA02 = AbstractC1278If.A02(bArr);
                if (uuidA02 == null) {
                    AnonymousClass44.A07(A0B(128, 22, 77), A0B(455, 42, 100));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0B(766, 9, 61), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private IP A06(SparseArray<IP> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (IP) C3M.A01(sparseArray.get(i10));
    }

    public static IV A07(SparseArray<IV> sparseArray) {
        IV iv2 = null;
        long j10 = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            IV ivValueAt = sparseArray.valueAt(i10);
            if (ivValueAt.A02 != ivValueAt.A07.A01) {
                long nextTrackRunOffset = ivValueAt.A07.A0E[ivValueAt.A02];
                if (nextTrackRunOffset < j10) {
                    iv2 = ivValueAt;
                    j10 = nextTrackRunOffset;
                }
            }
        }
        return iv2;
    }

    public static IV A08(SparseArray<IV> sparseArray, int i10, boolean z10) {
        if (sparseArray.size() == 1 && !z10) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i10);
    }

    private final C1285Im A0A(C1285Im c1285Im) {
        return c1285Im;
    }

    private void A0C() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x007e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0D() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.H1[] r0 = r6.A0L
            if (r0 != 0) goto L6c
            r0 = 2
            com.facebook.ads.redexgen.X.H1[] r0 = new com.facebook.ads.redexgen.core.H1[r0]
            r6.A0L = r0
            r3 = 0
            com.facebook.ads.redexgen.X.H1 r0 = r6.A0U
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.H1[] r2 = r6.A0L
            int r1 = r3 + 1
            com.facebook.ads.redexgen.X.H1 r0 = r6.A0U
            r2[r3] = r0
            r3 = r1
        L17:
            int r0 = r6.A0M
            r0 = r0 & 4
            if (r0 == 0) goto L4c
            com.facebook.ads.redexgen.X.H1[] r4 = r6.A0L
            int r5 = r3 + 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2367kb.A0f
            r0 = 7
            r1 = r1[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            r0 = 48
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2367kb.A0f
            java.lang.String r1 = "2Ynf6gmdLfe6xE9EEWKUzFfHKl41sL7a"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "AN0qqeacVBgpTr6ZS3JdezHHRUzhKU8l"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.GY r2 = r6.A0F
            android.util.SparseArray<com.facebook.ads.redexgen.X.IV> r0 = r6.A0D
            int r1 = r0.size()
            r0 = 5
            com.facebook.ads.redexgen.X.H1 r0 = r2.AJh(r1, r0)
            r4[r3] = r0
            r3 = r5
        L4c:
            com.facebook.ads.redexgen.X.H1[] r0 = r6.A0L
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            com.facebook.ads.redexgen.X.H1[] r0 = (com.facebook.ads.redexgen.core.H1[]) r0
            r6.A0L = r0
            com.facebook.ads.redexgen.X.H1[] r4 = r6.A0L
            int r3 = r4.length
            r2 = 0
        L5a:
            if (r2 >= r3) goto L6c
            r1 = r4[r2]
            com.facebook.ads.redexgen.X.or r0 = com.facebook.ads.redexgen.core.C2367kb.A0h
            r1.A6W(r0)
            int r2 = r2 + 1
            goto L5a
        L66:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6c:
            com.facebook.ads.redexgen.X.H1[] r0 = r6.A0K
            if (r0 != 0) goto La2
            java.util.List<com.facebook.ads.redexgen.X.or> r0 = r6.A0Z
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.H1[] r0 = new com.facebook.ads.redexgen.core.H1[r0]
            r6.A0K = r0
            r3 = 0
        L7b:
            com.facebook.ads.redexgen.X.H1[] r0 = r6.A0K
            int r0 = r0.length
            if (r3 >= r0) goto La2
            com.facebook.ads.redexgen.X.GY r2 = r6.A0F
            android.util.SparseArray<com.facebook.ads.redexgen.X.IV> r0 = r6.A0D
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.H1 r1 = r2.AJh(r1, r0)
            java.util.List<com.facebook.ads.redexgen.X.or> r0 = r6.A0Z
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.redexgen.X.or r0 = (com.facebook.ads.redexgen.core.C2614or) r0
            r1.A6W(r0)
            com.facebook.ads.redexgen.X.H1[] r0 = r6.A0K
            r0[r3] = r1
            int r3 = r3 + 1
            goto L7b
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2367kb.A0D():void");
    }

    private void A0F(long j10) {
        while (!this.A0Y.isEmpty()) {
            IU iuRemoveFirst = this.A0Y.removeFirst();
            this.A03 -= iuRemoveFirst.A00;
            long jA05 = j10 + iuRemoveFirst.A01;
            if (this.A0T != null) {
                jA05 = this.A0T.A05(jA05);
            }
            for (H1 h12 : this.A0L) {
                h12.AIA(jA05, 1, iuRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0G(long j10) throws C08822i {
        while (!this.A0X.isEmpty() && this.A0X.peek().A00 == j10) {
            A0P(this.A0X.pop());
        }
        A0C();
    }

    public static void A0H(C4J c4j, int i10, C1287Io c1287Io) throws C08822i {
        c4j.A0f(i10 + 8);
        int fullAtom = c4j.A0C();
        int flags = II.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = c4j.A0L();
            int fullAtom4 = c1287Io.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c1287Io.A0F, 0, sampleCount, z10);
                int fullAtom5 = c4j.A07();
                c1287Io.A02(fullAtom5);
                c1287Io.A04(c4j);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0B(308, 17, 45)).append(sampleCount).append(A0B(0, 2, 27));
            int fullAtom6 = c1287Io.A00;
            throw new C08822i(sbAppend.append(fullAtom6).toString());
        }
        throw new C08822i(A0B(399, 56, 17));
    }

    public static void A0K(C4J c4j, C1287Io c1287Io) throws C08822i {
        c4j.A0f(8);
        int flags = c4j.A0C();
        int fullAtom = II.A00(flags) & 1;
        if (fullAtom == 1) {
            c4j.A0g(8);
        }
        int iA0L = c4j.A0L();
        if (iA0L == 1) {
            int entryCount = II.A01(flags);
            c1287Io.A03 += entryCount == 0 ? c4j.A0Q() : c4j.A0R();
            return;
        }
        throw new C08822i(A0B(605, 29, 113) + iA0L);
    }

    public static void A0L(C4J c4j, C1287Io c1287Io) throws C08822i {
        A0H(c4j, 0, c1287Io);
    }

    public static void A0M(C4J c4j, C1287Io c1287Io, byte[] bArr) throws C08822i {
        c4j.A0f(8);
        c4j.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0i)) {
            return;
        }
        A0H(c4j, 16, c1287Io);
    }

    private void A0N(InterfaceC2403lN interfaceC2403lN) throws IOException {
        int i10 = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC2403lN.readFully(this.A0E.A00, 8, i10);
            A0V(new C2374ki(this.A01, this.A0E), interfaceC2403lN);
        } else {
            interfaceC2403lN.AJJ(i10);
        }
        A0G(interfaceC2403lN.A8f());
    }

    private void A0O(InterfaceC2403lN interfaceC2403lN) throws IOException {
        IV ivValueAt = null;
        long j10 = Long.MAX_VALUE;
        int size = this.A0D.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                IV nextTrackBundle = this.A0D.valueAt(i10);
                C1287Io c1287Io = nextTrackBundle.A07;
                if (c1287Io.A0A) {
                    long nextDataOffset = c1287Io.A03;
                    String[] strArr = A0f;
                    if (strArr[3].length() == strArr[6].length()) {
                        break;
                    }
                    A0f[4] = "mIjUpcDFQdM2YkTgY6cnbvy";
                    if (nextDataOffset < j10) {
                        j10 = c1287Io.A03;
                        ivValueAt = this.A0D.valueAt(i10);
                    }
                }
                i10++;
            } else {
                if (ivValueAt != null) {
                    int iA8f = (int) (j10 - interfaceC2403lN.A8f());
                    if (iA8f >= 0) {
                        interfaceC2403lN.AJJ(iA8f);
                        ivValueAt.A07.A05(interfaceC2403lN);
                        return;
                    }
                    throw new C08822i(A0B(325, 39, 126));
                }
                if (A0f[4].length() == 23) {
                    A0f[0] = "NbtoUSPOiQE3wq0";
                    this.A02 = 3;
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    private void A0P(C2375kj c2375kj) throws C08822i {
        if (((II) c2375kj).A00 == 1836019574) {
            A0R(c2375kj);
        } else if (((II) c2375kj).A00 == 1836019558) {
            A0Q(c2375kj);
        } else {
            if (this.A0X.isEmpty()) {
                return;
            }
            this.A0X.peek().A08(c2375kj);
        }
    }

    private void A0Q(C2375kj c2375kj) throws C08822i {
        A0S(c2375kj, this.A0D, this.A0M, this.A0d, this.A0c);
        DrmInitData drmInitDataA05 = this.A0N != null ? null : A05(c2375kj.A02);
        if (drmInitDataA05 != null) {
            int i10 = this.A0D.size();
            for (int trackCount = 0; trackCount < i10; trackCount++) {
                this.A0D.valueAt(trackCount).A07(drmInitDataA05);
            }
        }
        if (this.A0B != C.TIME_UNSET) {
            int size = this.A0D.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0D.valueAt(i11).A06(this.A0B);
            }
            this.A0B = C.TIME_UNSET;
        }
    }

    public static void A0S(C2375kj c2375kj, SparseArray<IV> sparseArray, int i10, byte[] bArr, boolean z10) throws C08822i {
        int size = c2375kj.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2375kj child = c2375kj.A01.get(i11);
            int i12 = ((II) child).A00;
            if (i12 == 1953653094) {
                boolean z11 = true;
                if (size <= 1 || !z10) {
                    z11 = false;
                }
                A0T(child, sparseArray, i10, bArr, z11);
            }
        }
    }

    public static void A0U(C2375kj c2375kj, IV iv2, long j10, int i10) {
        int i11 = 0;
        int i12 = 0;
        List<C2374ki> list = c2375kj.A02;
        int size = list.size();
        int i13 = 0;
        while (true) {
            String[] strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            A0f[0] = "3b9EJYgpciD07do";
            if (i13 < size) {
                C2374ki c2374ki = list.get(i13);
                if (((II) c2374ki).A00 == 1953658222) {
                    C4J trunData = c2374ki.A00;
                    trunData.A0f(12);
                    int iA0L = trunData.A0L();
                    if (iA0L > 0) {
                        i12 += iA0L;
                        i11++;
                    }
                }
                i13++;
            } else {
                iv2.A02 = 0;
                iv2.A00 = 0;
                iv2.A01 = 0;
                iv2.A07.A03(i11, i12);
                int i14 = 0;
                int trunStartPosition = 0;
                for (int i15 = 0; i15 < size; i15++) {
                    C2374ki c2374ki2 = list.get(i15);
                    if (((II) c2374ki2).A00 == 1953658222) {
                        trunStartPosition = A00(iv2, i14, j10, i10, c2374ki2.A00, trunStartPosition);
                        i14++;
                    }
                }
                return;
            }
        }
    }

    private void A0V(C2374ki c2374ki, InterfaceC2403lN interfaceC2403lN) throws C08822i {
        Uri uriA9H;
        if (!this.A0X.isEmpty()) {
            this.A0X.peek().A09(c2374ki);
            return;
        }
        if (((II) c2374ki).A00 == 1936286840) {
            Pair<Long, C2408lT> pairA04 = A04(c2374ki.A00, interfaceC2403lN.A8f());
            this.A0C = ((Long) pairA04.first).longValue();
            this.A0F.AIN((InterfaceC1244Gw) pairA04.second);
            if (A0f[2].length() != 2) {
                throw new RuntimeException();
            }
            A0f[2] = "jw";
            this.A0H = true;
            return;
        }
        if (((II) c2374ki).A00 != 1701671783 || (uriA9H = interfaceC2403lN.A9H()) == null) {
            return;
        }
        A0I(c2374ki.A00, uriA9H);
    }

    public static boolean A0X(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    public static boolean A0Y(int i10) {
        if (i10 != 1751411826 && i10 != 1835296868 && i10 != 1836476516 && i10 != 1936286840 && i10 != 1937011556 && i10 != 1952867444 && i10 != 1952868452 && i10 != 1953196132 && i10 != 1953654136 && i10 != 1953658222 && i10 != 1886614376) {
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[1] = "pufslWDHGkolcxIdleA53YlHTmcCni23";
            strArr[5] = "pxTVwd0BvZHkKJbeu8mcyfUHnPvesqsQ";
            if (i10 != 1935763834 && i10 != 1935763823 && i10 != 1936027235 && i10 != 1970628964 && i10 != 1935828848 && i10 != 1936158820 && i10 != 1701606260 && i10 != 1835362404 && i10 != 1701671783) {
                return false;
            }
        }
        return true;
    }

    private boolean A0Z(InterfaceC2403lN interfaceC2403lN) throws IOException {
        if (this.A00 == 0) {
            if (!interfaceC2403lN.AGh(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0f(0);
            this.A07 = this.A0O.A0Q();
            this.A01 = this.A0O.A0C();
        }
        if (this.A07 == 1) {
            interfaceC2403lN.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0R();
        } else if (this.A07 == 0) {
            long jA8G = interfaceC2403lN.A8G();
            if (jA8G == -1 && !this.A0X.isEmpty()) {
                jA8G = this.A0X.peek().A00;
            }
            if (jA8G != -1) {
                long jA8f = jA8G - interfaceC2403lN.A8f();
                int trackCount = this.A00;
                this.A07 = jA8f + trackCount;
            }
        }
        if (this.A07 >= this.A00) {
            long jA8f2 = interfaceC2403lN.A8f() - this.A00;
            if (this.A01 == 1836019558) {
                int size = this.A0D.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C1287Io c1287Io = this.A0D.valueAt(i10).A07;
                    c1287Io.A02 = jA8f2;
                    c1287Io.A03 = jA8f2;
                    c1287Io.A04 = jA8f2;
                }
            }
            if (this.A01 == 1835295092) {
                this.A0G = null;
                this.A09 = this.A07 + jA8f2;
                if (!this.A0H) {
                    this.A0F.AIN(new C2398lI(this.A08, jA8f2));
                    this.A0H = true;
                }
                this.A02 = 2;
                return true;
            }
            boolean zA0X = A0X(this.A01);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "BTpsgrbOJA5y808qoKaZGmPima83kMX9";
            if (zA0X) {
                long jA8f3 = (interfaceC2403lN.A8f() + this.A07) - 8;
                this.A0X.push(new C2375kj(this.A01, jA8f3));
                if (this.A07 == this.A00) {
                    A0G(jA8f3);
                } else {
                    A0C();
                }
            } else if (A0Y(this.A01)) {
                if (this.A00 != 8) {
                    throw new C08822i(A0B(208, 51, 94));
                }
                if (this.A07 <= 2147483647L) {
                    this.A0E = new C4J((int) this.A07);
                    System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                    this.A02 = 1;
                } else {
                    throw new C08822i(A0B(259, 49, 17));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0E = null;
                this.A02 = 1;
            } else {
                throw new C08822i(A0B(497, 53, 12));
            }
            return true;
        }
        throw new C08822i(A0B(2, 48, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0a(com.facebook.ads.redexgen.core.InterfaceC2403lN r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2367kb.A0a(com.facebook.ads.redexgen.X.lN):boolean");
    }

    public static /* synthetic */ GX[] A0b() {
        return new GX[]{new C2367kb()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A0F = gy;
        if (this.A0W != null) {
            IV iv2 = new IV(gy.AJh(0, this.A0W.A03));
            iv2.A08(this.A0W, new IP(0, 0, 0, 0));
            this.A0D.put(0, iv2);
            A0D();
            this.A0F.A6G();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt) throws IOException {
        while (true) {
            int i10 = this.A02;
            if (A0f[0].length() == 15) {
                String[] strArr = A0f;
                strArr[3] = "yYIiClYY3RZS73RDJ5vLPk2bDdZFXU";
                strArr[6] = "bGm4sUzBrXbQjG5ES";
                switch (i10) {
                    case 0:
                        if (!A0Z(interfaceC2403lN)) {
                            return -1;
                        }
                        break;
                    case 1:
                        A0N(interfaceC2403lN);
                        break;
                    case 2:
                        A0O(interfaceC2403lN);
                        break;
                    default:
                        if (!A0a(interfaceC2403lN)) {
                            break;
                        } else {
                            return 0;
                        }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        int size = this.A0D.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0D.valueAt(i10).A05();
        }
        this.A0Y.clear();
        this.A03 = 0;
        this.A0B = j11;
        this.A0X.clear();
        this.A0I = false;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2403lN interfaceC2403lN) throws IOException {
        return AbstractC1283Ik.A01(interfaceC2403lN);
    }
}
