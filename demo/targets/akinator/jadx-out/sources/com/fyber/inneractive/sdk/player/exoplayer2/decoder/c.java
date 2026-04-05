package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f24627a;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f24629c;

    /* renamed from: d, reason: collision with root package name */
    public long f24630d;

    /* renamed from: b, reason: collision with root package name */
    public final b f24628b = new b();

    /* renamed from: e, reason: collision with root package name */
    public final int f24631e = 0;

    public final void a() {
        this.f24627a = 0;
        ByteBuffer byteBuffer = this.f24629c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean b(int i10) {
        return (this.f24627a & i10) == i10;
    }

    public final ByteBuffer a(int i10) {
        int i11 = this.f24631e;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f24629c;
        throw new IllegalStateException(o2.i(byteBuffer == null ? 0 : byteBuffer.capacity(), i10, "Buffer too small (", " < ", ")"));
    }
}
