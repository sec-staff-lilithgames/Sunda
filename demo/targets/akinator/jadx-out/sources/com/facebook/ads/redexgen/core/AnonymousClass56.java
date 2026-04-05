package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.56, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass56 {
    public static byte[] A0B;

    @MetaExoPlayerCustomization
    public static final AnonymousClass56 A0C;
    public final int A00;
    public final int A01;

    @Deprecated
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Uri A06;

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C1360Lj A07;
    public final String A08;
    public final Map<String, String> A09;
    public final byte[] A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @MetaExoPlayerCustomization("Replacement of customData Object with fbDataSpecExtension")
    public AnonymousClass56(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, C1360Lj c1360Lj) {
        boolean z10 = true;
        C3M.A07(j10 + j11 >= 0);
        C3M.A07(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        C3M.A07(z10);
        this.A06 = uri;
        this.A05 = j10;
        this.A01 = i10;
        this.A0A = (bArr == null || bArr.length == 0) ? null : bArr;
        this.A09 = Collections.unmodifiableMap(new HashMap(map));
        this.A04 = j11;
        this.A02 = j10 + j11;
        this.A03 = j12;
        this.A08 = str;
        this.A00 = i11;
        this.A07 = c1360Lj;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{-123, -84, -96, -112, -83, -64, -83, -97, -68, -79, -81, -89, -52, -54, -39, -116, -119, -123, -120, -52, -53, -49, -48, -88, -88, -80, -80, -88, 111, -90, -71, -80, 111, -91, -94, -75, -94, -76, -80, -74, -77, -92, -90, -61, -61, -61, 122, -78, -83, -81, -79, -82, -69, -69, -73, 122, -81, -69, -71};
    }

    static {
        A03();
        C2T.A03(A02(24, 19, 23));
        A0C = new AnonymousClass56(Uri.parse(A02(43, 16, 34)));
    }

    public AnonymousClass56(Uri uri) {
        this(uri, 0, -1);
    }

    @MetaExoPlayerCustomization
    @Deprecated
    public AnonymousClass56(Uri uri, int i10, int i11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, i10, new C1360Lj(A02(0, 0, 9), -1L, false, -1, -1, -1, -1, false, false, i11, -1L, new C1359Li(), -1L, false, -1, -1, -1L, -1L, -1, null, -1, null, null, C1358Lh.A02, -1, false, null, A02(0, 0, 9), A02(0, 0, 9), null, -1L, -1L));
    }

    @MetaExoPlayerCustomization("creation and passage of FbDataSpecExtension")
    @Deprecated
    public AnonymousClass56(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, str, 0, new C1360Lj());
    }

    private final String A00() {
        return A01(this.A01);
    }

    public static String A01(int i10) {
        switch (i10) {
            case 1:
                return A02(12, 3, 91);
            case 2:
                return A02(19, 4, 82);
            case 3:
                return A02(15, 4, 26);
            default:
                throw new IllegalStateException();
        }
    }

    public final AnonymousClass53 A04() {
        return new AnonymousClass53(this);
    }

    @MetaExoPlayerCustomization("Replacement of customData Object with fbDataSpecExtension + new copy creation")
    public final AnonymousClass56 A05(long j10, long j11) {
        if (j10 == 0 && this.A03 == j11) {
            return this;
        }
        return new AnonymousClass56(this.A06, this.A05, this.A01, this.A0A, this.A09, this.A04 + j10, j11, this.A08, this.A00, new C1360Lj(this.A07));
    }

    public final boolean A06(int i10) {
        return (this.A00 & i10) == i10;
    }

    @MetaExoPlayerCustomization("Stringification of fbDataSpecExtension (last two items)")
    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A02(3, 9, 34)).append(A00()).append(A02(0, 1, 59)).append(this.A06);
        String strA02 = A02(1, 2, 86);
        return sbAppend.append(strA02).append(this.A04).append(strA02).append(this.A03).append(strA02).append(this.A08).append(strA02).append(this.A00).append(strA02).append(this.A07).append(strA02).append(this.A07.A0Q).append(A02(23, 1, 33)).toString();
    }
}
