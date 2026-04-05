package com.mbridge.msdk.thrid.okio;

import b0.e2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f43865a = Charset.forName(C.UTF8_NAME);

    public static int a(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static short a(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbR = e2.r(j10, "size=", " offset=");
            sbR.append(j11);
            throw new ArrayIndexOutOfBoundsException(e2.i(j12, " byteCount=", sbR));
        }
    }

    public static void a(Throwable th2) throws Throwable {
        b(th2);
    }

    public static boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    private static <T extends Throwable> void b(Throwable th2) throws Throwable {
        throw th2;
    }
}
