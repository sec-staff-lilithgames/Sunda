package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u3 extends w3 {
    public u3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, byte b10) {
        if (x3.f26542h) {
            x3.a(obj, j10, b10);
        } else {
            x3.b(obj, j10, b10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j10) {
        return Double.longBitsToDouble(this.f26523a.getLong(obj, j10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f26523a.getInt(obj, j10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j10) {
        return x3.f26542h ? x3.a(obj, j10) : x3.b(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j10) {
        return x3.f26542h ? x3.a(obj, j10) != 0 : x3.b(obj, j10) != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, boolean z10) {
        if (x3.f26542h) {
            x3.a(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            x3.b(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, float f10) {
        this.f26523a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, double d10) {
        this.f26523a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j10, byte[] bArr, long j11) {
        throw new UnsupportedOperationException();
    }
}
