package cc;

import com.unity3d.services.core.request.NJc.yFkbx;
import ic.w;
import ub.f0;
import ub.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final f f12072b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12073c;

    /* renamed from: e, reason: collision with root package name */
    public ub.i f12074e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12075f;

    /* renamed from: g, reason: collision with root package name */
    public final ic.b f12076g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12077h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f12078i;

    /* renamed from: j, reason: collision with root package name */
    public final j0 f12079j;

    /* renamed from: k, reason: collision with root package name */
    public final ub.e f12080k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f12081l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f12082m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f12083n;

    /* renamed from: o, reason: collision with root package name */
    public char[] f12084o;

    /* renamed from: p, reason: collision with root package name */
    public char[] f12085p;

    /* renamed from: q, reason: collision with root package name */
    public char[] f12086q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12087r;

    public h(f0 f0Var, j0 j0Var, ub.e eVar, ic.b bVar, f fVar, boolean z10) {
        this.f12077h = true;
        this.f12087r = false;
        this.f12078i = f0Var;
        this.f12079j = j0Var;
        this.f12080k = eVar;
        this.f12076g = bVar;
        this.f12072b = fVar;
        this.f12073c = fVar.getRawContent();
        this.f12075f = z10;
    }

    public static void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public byte[] allocBase64Buffer() {
        a(this.f12083n);
        byte[] bArrAllocByteBuffer = this.f12076g.allocByteBuffer(3);
        this.f12083n = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public char[] allocConcatBuffer() {
        a(this.f12085p);
        char[] cArrAllocCharBuffer = this.f12076g.allocCharBuffer(1);
        this.f12085p = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public char[] allocNameCopyBuffer(int i10) {
        a(this.f12086q);
        char[] cArrAllocCharBuffer = this.f12076g.allocCharBuffer(3, i10);
        this.f12086q = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public byte[] allocReadIOBuffer() {
        a(this.f12081l);
        byte[] bArrAllocByteBuffer = this.f12076g.allocByteBuffer(0);
        this.f12081l = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public char[] allocTokenBuffer() {
        a(this.f12084o);
        char[] cArrAllocCharBuffer = this.f12076g.allocCharBuffer(0);
        this.f12084o = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public byte[] allocWriteEncodingBuffer() {
        a(this.f12082m);
        byte[] bArrAllocByteBuffer = this.f12076g.allocByteBuffer(1);
        this.f12082m = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public ic.b bufferRecycler() {
        return this.f12076g;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f12087r) {
            return;
        }
        this.f12087r = true;
        if (this.f12077h) {
            this.f12077h = false;
            this.f12076g.releaseToPool();
        }
    }

    public ic.j0 constructReadConstrainedTextBuffer() {
        return new w(this.f12078i, this.f12076g);
    }

    public ic.j0 constructTextBuffer() {
        return new ic.j0(this.f12076g);
    }

    public f contentReference() {
        return this.f12072b;
    }

    public ub.e errorReportConfiguration() {
        return this.f12080k;
    }

    public ub.i getEncoding() {
        return this.f12074e;
    }

    @Deprecated
    public Object getSourceReference() {
        return this.f12073c;
    }

    public boolean isResourceManaged() {
        return this.f12075f;
    }

    public h markBufferRecyclerReleased() {
        this.f12077h = false;
        return this;
    }

    public void releaseBase64Buffer(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.f12083n;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.f12083n = null;
            this.f12076g.releaseByteBuffer(3, bArr);
        }
    }

    public void releaseConcatBuffer(char[] cArr) {
        if (cArr != null) {
            char[] cArr2 = this.f12085p;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.f12085p = null;
            this.f12076g.releaseCharBuffer(1, cArr);
        }
    }

    public void releaseNameCopyBuffer(char[] cArr) {
        if (cArr != null) {
            char[] cArr2 = this.f12086q;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.f12086q = null;
            this.f12076g.releaseCharBuffer(3, cArr);
        }
    }

    public void releaseReadIOBuffer(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.f12081l;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.f12081l = null;
            this.f12076g.releaseByteBuffer(0, bArr);
        }
    }

    public void releaseTokenBuffer(char[] cArr) {
        if (cArr != null) {
            char[] cArr2 = this.f12084o;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.f12084o = null;
            this.f12076g.releaseCharBuffer(0, cArr);
        }
    }

    public void setEncoding(ub.i iVar) {
        this.f12074e = iVar;
    }

    public f0 streamReadConstraints() {
        return this.f12078i;
    }

    public j0 streamWriteConstraints() {
        return this.f12079j;
    }

    public h withEncoding(ub.i iVar) {
        this.f12074e = iVar;
        return this;
    }

    public void releaseWriteEncodingBuffer(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.f12082m;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException(yFkbx.jAIiPDWECe);
            }
            this.f12082m = null;
            this.f12076g.releaseByteBuffer(1, bArr);
        }
    }

    public byte[] allocBase64Buffer(int i10) {
        a(this.f12083n);
        byte[] bArrAllocByteBuffer = this.f12076g.allocByteBuffer(3, i10);
        this.f12083n = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public byte[] allocReadIOBuffer(int i10) {
        a(this.f12081l);
        byte[] bArrAllocByteBuffer = this.f12076g.allocByteBuffer(0, i10);
        this.f12081l = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public char[] allocTokenBuffer(int i10) {
        a(this.f12084o);
        char[] cArrAllocCharBuffer = this.f12076g.allocCharBuffer(0, i10);
        this.f12084o = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public byte[] allocWriteEncodingBuffer(int i10) {
        a(this.f12082m);
        byte[] bArrAllocByteBuffer = this.f12076g.allocByteBuffer(1, i10);
        this.f12082m = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    @Deprecated
    public h(f0 f0Var, ic.b bVar, f fVar, boolean z10) {
        this(f0Var, j0.defaults(), ub.e.defaults(), bVar, fVar, z10);
    }

    @Deprecated
    public h(ic.b bVar, f fVar, boolean z10) {
        this(f0.defaults(), j0.defaults(), ub.e.defaults(), bVar, fVar, z10);
    }

    @Deprecated
    public h(ic.b bVar, Object obj, boolean z10) {
        this(bVar, f.rawReference(obj), z10);
    }
}
