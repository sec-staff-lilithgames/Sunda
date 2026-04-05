package io.odeeo.internal.d0;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e extends io.odeeo.internal.e.j<k, l, h> implements g {

    /* renamed from: n, reason: collision with root package name */
    public final String f63588n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends l {
        public a() {
        }

        @Override // io.odeeo.internal.e.h
        public void release() {
            e.this.a((e) this);
        }
    }

    public e(String str) {
        super(new k[2], new l[2]);
        this.f63588n = str;
        a(1024);
    }

    public abstract f a(byte[] bArr, int i10, boolean z10) throws h;

    @Override // io.odeeo.internal.e.j, io.odeeo.internal.e.d
    public final String getName() {
        return this.f63588n;
    }

    @Override // io.odeeo.internal.e.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final k b() {
        return new k();
    }

    @Override // io.odeeo.internal.e.j
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final l c() {
        return new a();
    }

    @Override // io.odeeo.internal.e.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h a(Throwable th2) {
        return new h("Unexpected decode error", th2);
    }

    @Override // io.odeeo.internal.e.j
    public final h a(k kVar, l lVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) io.odeeo.internal.q0.a.checkNotNull(kVar.f63705c);
            lVar.setContent(kVar.f63707e, a(byteBuffer.array(), byteBuffer.limit(), z10), kVar.f63602i);
            lVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (h e10) {
            return e10;
        }
    }

    @Override // io.odeeo.internal.d0.g
    public void setPositionUs(long j10) {
    }
}
