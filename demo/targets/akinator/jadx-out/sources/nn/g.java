package nn;

import gn.q0;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g extends nn.a {

    /* renamed from: c, reason: collision with root package name */
    public io.bidmachine.media3.common.b f77078c;

    /* renamed from: e, reason: collision with root package name */
    public final d f77079e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f77080f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77081g;

    /* renamed from: h, reason: collision with root package name */
    public long f77082h;

    /* renamed from: i, reason: collision with root package name */
    public ByteBuffer f77083i;

    /* renamed from: j, reason: collision with root package name */
    public final int f77084j;

    /* renamed from: k, reason: collision with root package name */
    public final int f77085k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends IllegalStateException {
        public a(int i10, int i11) {
            super(o2.i(i10, i11, "Buffer too small (", " < ", ")"));
        }
    }

    static {
        q0.registerModule("media3.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    public static g newNoDataInstance() {
        return new g(0);
    }

    public final ByteBuffer b(int i10) {
        int i11 = this.f77084j;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f77080f;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @Override // nn.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f77080f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f77083i;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f77081g = false;
    }

    @EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int i10) {
        int i11 = i10 + this.f77085k;
        ByteBuffer byteBuffer = this.f77080f;
        if (byteBuffer == null) {
            this.f77080f = b(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f77080f = byteBuffer;
            return;
        }
        ByteBuffer byteBufferB = b(i12);
        byteBufferB.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferB.put(byteBuffer);
        }
        this.f77080f = byteBufferB;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.f77080f;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f77083i;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return a(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int i10) {
        ByteBuffer byteBuffer = this.f77083i;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f77083i = ByteBuffer.allocate(i10);
        } else {
            this.f77083i.clear();
        }
    }

    public g(int i10, int i11) {
        this.f77079e = new d();
        this.f77084j = i10;
        this.f77085k = i11;
    }
}
