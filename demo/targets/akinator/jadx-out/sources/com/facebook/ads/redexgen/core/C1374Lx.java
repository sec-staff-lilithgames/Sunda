package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Lx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1374Lx implements Comparable<C1374Lx> {
    public static byte[] A06;

    @MetaExoPlayerCustomization
    public static final String A07;
    public final long A00;
    public final long A01;
    public final long A02;
    public final File A03;
    public final String A04;
    public final boolean A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{15, 67, 78, 91, 21, 65, 17, 14, 18, 91, 65, 119, 36, 62, 45, 50, 109, 119, 65, 99, 97, 106, 103, 81, 114, 99, 108, 121};
    }

    static {
        A01();
        A07 = C1374Lx.class.getSimpleName();
    }

    public C1374Lx(String str, long j10, long j11, long j12, File file) {
        this.A04 = str;
        this.A02 = j10;
        this.A01 = j11;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1374Lx c1374Lx) {
        if (!this.A04.equals(c1374Lx.A04)) {
            return this.A04.compareTo(c1374Lx.A04);
        }
        long j10 = this.A02 - c1374Lx.A02;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final boolean A03() {
        return !this.A05;
    }

    public final boolean A04() {
        return this.A01 == -1;
    }

    @MetaExoPlayerCustomization
    public final String toString() {
        return A00(18, 10, 12) + this.A04 + A00(0, 5, 33) + this.A00 + A00(5, 6, 111) + this.A02 + A00(11, 7, 89) + this.A01 + AbstractJsonLexerKt.END_OBJ;
    }
}
