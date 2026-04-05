package io.odeeo.internal.e;

import io.odeeo.internal.b.r;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g extends io.odeeo.internal.e.a {

    /* renamed from: b, reason: collision with root package name */
    public final c f63704b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f63705c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f63706d;

    /* renamed from: e, reason: collision with root package name */
    public long f63707e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f63708f;

    /* renamed from: g, reason: collision with root package name */
    public final int f63709g;

    /* renamed from: h, reason: collision with root package name */
    public final int f63710h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public final int f63711a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63712b;

        public a(int i10, int i11) {
            super(o2.i(i10, i11, "Buffer too small (", " < ", ")"));
            this.f63711a = i10;
            this.f63712b = i11;
        }
    }

    static {
        r.registerModule("goog.exo.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    public static g newNoDataInstance() {
        return new g(0);
    }

    public final ByteBuffer b(int i10) {
        int i11 = this.f63709g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f63705c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @Override // io.odeeo.internal.e.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f63705c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f63708f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f63706d = false;
    }

    @EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int i10) {
        int i11 = i10 + this.f63710h;
        ByteBuffer byteBuffer = this.f63705c;
        if (byteBuffer == null) {
            this.f63705c = b(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f63705c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferB = b(i12);
        byteBufferB.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferB.put(byteBuffer);
        }
        this.f63705c = byteBufferB;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.f63705c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f63708f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return a(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int i10) {
        ByteBuffer byteBuffer = this.f63708f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f63708f = ByteBuffer.allocate(i10);
        } else {
            this.f63708f.clear();
        }
    }

    public g(int i10, int i11) {
        this.f63704b = new c();
        this.f63709g = i10;
        this.f63710h = i11;
    }
}
