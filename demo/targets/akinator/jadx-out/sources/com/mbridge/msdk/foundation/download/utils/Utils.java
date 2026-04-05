package com.mbridge.msdk.foundation.download.utils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Utils {
    private Utils() {
    }

    public static int getDownloadRate(long j10, long j11) {
        if (j10 == 0 || j11 == 0) {
            return 0;
        }
        if (j10 == j11) {
            return 100;
        }
        return (int) (((j11 * 1.0d) / (j10 * 1.0d)) * 100.0d);
    }
}
