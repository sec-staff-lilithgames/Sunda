package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MediaCodecInitializationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "codecName", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.hn, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public final class MediaCodecInitializationException extends Exception {
    public static byte[] A01;
    public final String A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-6, 6, -5, -4, -6, -27, -8, 4, -4};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecInitializationException(String str, Throwable th2) {
        super(th2);
        C2628p6.A09(str, A00(0, 9, 70));
        this.A00 = str;
    }
}
