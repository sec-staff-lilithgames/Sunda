package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class x4 extends hu.b {

    /* renamed from: b, reason: collision with root package name */
    public Iterator f96544b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f96545c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96546e;

    public abstract void a();

    public abstract void b(long j10);

    @Override // hu.b, vt.l, tw.d
    public final void cancel() {
        this.f96545c = true;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final void clear() {
        this.f96544b = null;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final boolean isEmpty() {
        Iterator it = this.f96544b;
        return it == null || !it.hasNext();
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final Object poll() {
        Iterator it = this.f96544b;
        if (it == null) {
            return null;
        }
        if (!this.f96546e) {
            this.f96546e = true;
        } else if (!it.hasNext()) {
            return null;
        }
        return ut.o0.requireNonNull(this.f96544b.next(), "Iterator.next() returned a null value");
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
}
