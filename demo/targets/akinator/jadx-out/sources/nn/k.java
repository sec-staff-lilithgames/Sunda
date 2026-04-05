package nn;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j f77089a;

    /* renamed from: e, reason: collision with root package name */
    public final g[] f77093e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f77094f;

    /* renamed from: g, reason: collision with root package name */
    public int f77095g;

    /* renamed from: h, reason: collision with root package name */
    public int f77096h;

    /* renamed from: i, reason: collision with root package name */
    public g f77097i;

    /* renamed from: j, reason: collision with root package name */
    public f f77098j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f77099k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f77100l;

    /* renamed from: b, reason: collision with root package name */
    public final Object f77090b = new Object();

    /* renamed from: m, reason: collision with root package name */
    public long f77101m = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f77091c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f77092d = new ArrayDeque();

    public k(g[] gVarArr, i[] iVarArr) {
        this.f77093e = gVarArr;
        this.f77095g = gVarArr.length;
        for (int i10 = 0; i10 < this.f77095g; i10++) {
            this.f77093e[i10] = a();
        }
        this.f77094f = iVarArr;
        this.f77096h = iVarArr.length;
        for (int i11 = 0; i11 < this.f77096h; i11++) {
            this.f77094f[i11] = b();
        }
        j jVar = new j(this);
        this.f77089a = jVar;
        jVar.start();
    }

    public abstract g a();

    public abstract i b();

    public abstract f c(Throwable th2);

    public abstract f d(g gVar, i iVar, boolean z10);

    public final boolean e() {
        boolean z10;
        f fVarC;
        synchronized (this.f77090b) {
            while (!this.f77100l) {
                try {
                    if (!this.f77091c.isEmpty() && this.f77096h > 0) {
                        break;
                    }
                    this.f77090b.wait();
                } finally {
                }
            }
            if (this.f77100l) {
                return false;
            }
            g gVar = (g) this.f77091c.removeFirst();
            i[] iVarArr = this.f77094f;
            int i10 = this.f77096h - 1;
            this.f77096h = i10;
            i iVar = iVarArr[i10];
            boolean z11 = this.f77099k;
            this.f77099k = false;
            if (gVar.isEndOfStream()) {
                iVar.addFlag(4);
            } else {
                iVar.f77086c = gVar.f77082h;
                if (gVar.isFirstSample()) {
                    iVar.addFlag(134217728);
                }
                long j10 = gVar.f77082h;
                synchronized (this.f77090b) {
                    long j11 = this.f77101m;
                    z10 = j11 == C.TIME_UNSET || j10 >= j11;
                }
                if (!z10) {
                    iVar.f77087e = true;
                }
                try {
                    fVarC = d(gVar, iVar, z11);
                } catch (OutOfMemoryError e10) {
                    fVarC = c(e10);
                } catch (RuntimeException e11) {
                    fVarC = c(e11);
                }
                if (fVarC != null) {
                    synchronized (this.f77090b) {
                        this.f77098j = fVarC;
                    }
                    return false;
                }
            }
            synchronized (this.f77090b) {
                try {
                    if (this.f77099k || iVar.f77087e) {
                        iVar.release();
                    } else {
                        this.f77092d.addLast(iVar);
                    }
                    gVar.clear();
                    g[] gVarArr = this.f77093e;
                    int i11 = this.f77095g;
                    this.f77095g = i11 + 1;
                    gVarArr[i11] = gVar;
                } finally {
                }
            }
            return true;
        }
    }

    public final void f(i iVar) {
        synchronized (this.f77090b) {
            iVar.clear();
            i[] iVarArr = this.f77094f;
            int i10 = this.f77096h;
            this.f77096h = i10 + 1;
            iVarArr[i10] = iVar;
            if (!this.f77091c.isEmpty() && this.f77096h > 0) {
                this.f77090b.notify();
            }
        }
    }

    @Override // nn.e
    public final void flush() {
        synchronized (this.f77090b) {
            try {
                this.f77099k = true;
                g gVar = this.f77097i;
                if (gVar != null) {
                    gVar.clear();
                    g[] gVarArr = this.f77093e;
                    int i10 = this.f77095g;
                    this.f77095g = i10 + 1;
                    gVarArr[i10] = gVar;
                    this.f77097i = null;
                }
                while (!this.f77091c.isEmpty()) {
                    g gVar2 = (g) this.f77091c.removeFirst();
                    gVar2.clear();
                    g[] gVarArr2 = this.f77093e;
                    int i11 = this.f77095g;
                    this.f77095g = i11 + 1;
                    gVarArr2[i11] = gVar2;
                }
                while (!this.f77092d.isEmpty()) {
                    ((i) this.f77092d.removeFirst()).release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nn.e, hp.j
    public abstract /* synthetic */ String getName();

    @Override // nn.e
    public void release() throws InterruptedException {
        synchronized (this.f77090b) {
            this.f77100l = true;
            this.f77090b.notify();
        }
        try {
            this.f77089a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // nn.e
    public final void setOutputStartTimeUs(long j10) {
        synchronized (this.f77090b) {
            try {
                io.bidmachine.media3.common.util.a.checkState(this.f77095g == this.f77093e.length || this.f77099k);
                this.f77101m = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nn.e
    public final g dequeueInputBuffer() throws f {
        g gVar;
        synchronized (this.f77090b) {
            try {
                f fVar = this.f77098j;
                if (fVar != null) {
                    throw fVar;
                }
                io.bidmachine.media3.common.util.a.checkState(this.f77097i == null);
                int i10 = this.f77095g;
                if (i10 == 0) {
                    gVar = null;
                } else {
                    g[] gVarArr = this.f77093e;
                    int i11 = i10 - 1;
                    this.f77095g = i11;
                    gVar = gVarArr[i11];
                }
                this.f77097i = gVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // nn.e
    public final i dequeueOutputBuffer() throws f {
        synchronized (this.f77090b) {
            try {
                f fVar = this.f77098j;
                if (fVar != null) {
                    throw fVar;
                }
                if (this.f77092d.isEmpty()) {
                    return null;
                }
                return (i) this.f77092d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nn.e
    public final void queueInputBuffer(g gVar) throws f {
        synchronized (this.f77090b) {
            try {
                f fVar = this.f77098j;
                if (fVar != null) {
                    throw fVar;
                }
                io.bidmachine.media3.common.util.a.checkArgument(gVar == this.f77097i);
                this.f77091c.addLast(gVar);
                if (!this.f77091c.isEmpty() && this.f77096h > 0) {
                    this.f77090b.notify();
                }
                this.f77097i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
