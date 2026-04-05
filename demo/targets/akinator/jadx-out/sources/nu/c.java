package nu;

import hu.g;
import iu.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends hu.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f77206b;

    public c(d dVar) {
        this.f77206b = dVar;
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        if (this.f77206b.f77213j) {
            return;
        }
        this.f77206b.f77213j = true;
        Runnable runnable = (Runnable) this.f77206b.f77208e.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        this.f77206b.f77212i.lazySet(null);
        if (this.f77206b.f77215l.getAndIncrement() == 0) {
            this.f77206b.f77212i.lazySet(null);
            d dVar = this.f77206b;
            if (dVar.f77217n) {
                return;
            }
            dVar.f77207c.clear();
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        this.f77206b.f77207c.clear();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f77206b.f77207c.isEmpty();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() {
        return this.f77206b.f77207c.poll();
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        if (g.validate(j10)) {
            d dVar = this.f77206b;
            e.add(dVar.f77216m, j10);
            dVar.f();
        }
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f77206b.f77217n = true;
        return 2;
    }
}
