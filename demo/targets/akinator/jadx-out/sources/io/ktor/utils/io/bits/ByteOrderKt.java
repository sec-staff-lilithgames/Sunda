package io.ktor.utils.io.bits;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import tu.k0;
import tu.o0;
import tu.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteOrderKt {
    public static final byte getHighByte(short s10) {
        return (byte) (s10 >>> 8);
    }

    public static final int getHighInt(long j10) {
        return (int) (j10 >>> 32);
    }

    public static final short getHighShort(int i10) {
        return (short) (i10 >>> 16);
    }

    public static final byte getLowByte(short s10) {
        return (byte) (s10 & 255);
    }

    public static final int getLowInt(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final short getLowShort(int i10) {
        return (short) (i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    /* renamed from: reverseByteOrder-VKZWuLQ, reason: not valid java name */
    public static final long m4310reverseByteOrderVKZWuLQ(long j10) {
        return o0.m7081constructorimpl(Long.reverseBytes(j10));
    }

    /* renamed from: reverseByteOrder-WZ4Q5Ns, reason: not valid java name */
    public static final int m4311reverseByteOrderWZ4Q5Ns(int i10) {
        return k0.m7056constructorimpl(Integer.reverseBytes(i10));
    }

    /* renamed from: reverseByteOrder-xj2QHRw, reason: not valid java name */
    public static final short m4312reverseByteOrderxj2QHRw(short s10) {
        return t0.m7106constructorimpl(Short.reverseBytes(s10));
    }
}
