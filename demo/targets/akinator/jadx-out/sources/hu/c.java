package hu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f59162b;

    /* renamed from: c, reason: collision with root package name */
    public Object f59163c;

    public c(tw.c cVar) {
        this.f59162b = cVar;
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        set(4);
        this.f59163c = null;
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public final void clear() {
        lazySet(32);
        this.f59163c = null;
    }

    public final void complete(Object obj) {
        int i10 = get();
        do {
            tw.c cVar = this.f59162b;
            if (i10 == 8) {
                this.f59163c = obj;
                lazySet(16);
                cVar.onNext(obj);
                if (get() != 4) {
                    cVar.onComplete();
                    return;
                }
                return;
            }
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                cVar.onNext(obj);
                if (get() != 4) {
                    cVar.onComplete();
                    return;
                }
                return;
            }
            this.f59163c = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i10 = get();
            }
        } while (i10 != 4);
        this.f59163c = null;
    }

    public final boolean isCancelled() {
        return get() == 4;
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f59163c;
        this.f59163c = null;
        return obj;
    }

    @Override // hu.a, vt.l, tw.d
    public final void request(long j10) {
        Object obj;
        if (g.validate(j10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f59163c) == null) {
                        return;
                    }
                    this.f59163c = null;
                    tw.c cVar = this.f59162b;
                    cVar.onNext(obj);
                    if (get() != 4) {
                        cVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // hu.a, vt.l, vt.k
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}
