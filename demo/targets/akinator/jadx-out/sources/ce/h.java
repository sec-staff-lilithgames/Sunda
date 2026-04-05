package ce;

import com.google.android.exoplayer2.w0;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h extends ce.a {

    /* renamed from: c, reason: collision with root package name */
    public final d f12236c;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f12237e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12238f;

    /* renamed from: g, reason: collision with root package name */
    public long f12239g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f12240h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12241i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12242j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends IllegalStateException {
        public a(int i10, int i11) {
            super(o2.i(i10, i11, "Buffer too small (", " < ", ")"));
        }
    }

    static {
        w0.registerModule("goog.exo.decoder");
    }

    public h(int i10) {
        this(i10, 0);
    }

    public static h newNoDataInstance() {
        return new h(0);
    }

    public final ByteBuffer b(int i10) {
        int i11 = this.f12241i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f12237e;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @Override // ce.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f12237e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f12240h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f12238f = false;
    }

    @EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int i10) {
        int i11 = i10 + this.f12242j;
        ByteBuffer byteBuffer = this.f12237e;
        if (byteBuffer == null) {
            this.f12237e = b(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f12237e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferB = b(i12);
        byteBufferB.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferB.put(byteBuffer);
        }
        this.f12237e = byteBufferB;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.f12237e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f12240h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return a(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int i10) {
        ByteBuffer byteBuffer = this.f12240h;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f12240h = ByteBuffer.allocate(i10);
        } else {
            this.f12240h.clear();
        }
    }

    public h(int i10, int i11) {
        this.f12236c = new d();
        this.f12241i = i10;
        this.f12242j = i11;
    }
}
