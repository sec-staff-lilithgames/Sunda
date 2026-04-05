package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class y8 extends hu.b {

    /* renamed from: b, reason: collision with root package name */
    public final long f96602b;

    /* renamed from: c, reason: collision with root package name */
    public long f96603c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f96604e;

    public y8(long j10, long j11) {
        this.f96603c = j10;
        this.f96602b = j11;
    }

    public abstract void a();

    public abstract void b(long j10);

    @Override // hu.b, vt.l, tw.d
    public final void cancel() {
        this.f96604e = true;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final void clear() {
        this.f96603c = this.f96602b;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final boolean isEmpty() {
        return this.f96603c == this.f96602b;
    }

    @Override // hu.b, vt.l, tw.d
    public final void request(long j10) {
        if (hu.g.validate(j10) && iu.e.add(this, j10) == 0) {
            if (j10 == Long.MAX_VALUE) {
                a();
            } else {
                b(j10);
            }
        }
    }

    @Override // hu.b, vt.l, vt.k
    public final int requestFusion(int i10) {
        return i10 & 1;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final Long poll() {
        long j10 = this.f96603c;
        if (j10 == this.f96602b) {
            return null;
        }
        this.f96603c = 1 + j10;
        return Long.valueOf(j10);
    }
}
