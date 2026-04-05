package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x0 extends hu.a {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96527b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f96528c;

    /* renamed from: e, reason: collision with root package name */
    public final y0[] f96529e;

    /* renamed from: f, reason: collision with root package name */
    public final eu.d f96530f;

    /* renamed from: g, reason: collision with root package name */
    public final Object[] f96531g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f96532h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f96533i;

    /* renamed from: j, reason: collision with root package name */
    public int f96534j;

    /* renamed from: k, reason: collision with root package name */
    public int f96535k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f96536l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicLong f96537m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f96538n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f96539o;

    public x0(tw.c cVar, st.o oVar, boolean z10, int i10, int i11) {
        this.f96527b = cVar;
        this.f96528c = oVar;
        y0[] y0VarArr = new y0[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            y0VarArr[i12] = new y0(this, i12, i11);
        }
        this.f96529e = y0VarArr;
        this.f96531g = new Object[i10];
        this.f96530f = new eu.d(i11);
        this.f96537m = new AtomicLong();
        this.f96539o = new AtomicReference();
        this.f96532h = z10;
    }

    public final void a() {
        for (y0 y0Var : this.f96529e) {
            y0Var.cancel();
        }
    }

    public final boolean b(boolean z10, boolean z11, tw.c cVar, eu.d dVar) {
        if (this.f96536l) {
            a();
            dVar.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (this.f96532h) {
            if (!z11) {
                return false;
            }
            a();
            Throwable thTerminate = iu.m.terminate(this.f96539o);
            if (thTerminate == null || thTerminate == iu.m.f68415a) {
                cVar.onComplete();
                return true;
            }
            cVar.onError(thTerminate);
            return true;
        }
        Throwable thTerminate2 = iu.m.terminate(this.f96539o);
        if (thTerminate2 != null && thTerminate2 != iu.m.f68415a) {
            a();
            dVar.clear();
            cVar.onError(thTerminate2);
            return true;
        }
        if (!z11) {
            return false;
        }
        a();
        cVar.onComplete();
        return true;
    }

    public final void c(int i10) {
        int i11;
        synchronized (this) {
            try {
                Object[] objArr = this.f96531g;
                if (objArr[i10] != null && (i11 = this.f96535k + 1) != objArr.length) {
                    this.f96535k = i11;
                } else {
                    this.f96538n = true;
                    drain();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        this.f96536l = true;
        a();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        this.f96530f.clear();
    }

    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        if (this.f96533i) {
            tw.c cVar = this.f96527b;
            eu.d dVar = this.f96530f;
            while (!this.f96536l) {
                Throwable th2 = (Throwable) this.f96539o.get();
                if (th2 != null) {
                    dVar.clear();
                    cVar.onError(th2);
                    return;
                }
                boolean z10 = this.f96538n;
                boolean zIsEmpty = dVar.isEmpty();
                if (!zIsEmpty) {
                    cVar.onNext(null);
                }
                if (z10 && zIsEmpty) {
                    cVar.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            dVar.clear();
            return;
        }
        tw.c cVar2 = this.f96527b;
        eu.d dVar2 = this.f96530f;
        int iAddAndGet2 = 1;
        do {
            long j10 = this.f96537m.get();
            long j11 = 0;
            while (j11 != j10) {
                boolean z11 = this.f96538n;
                Object objPoll = dVar2.poll();
                boolean z12 = objPoll == null;
                if (b(z11, z12, cVar2, dVar2)) {
                    return;
                }
                if (z12) {
                    break;
                }
                try {
                    cVar2.onNext(ut.o0.requireNonNull(this.f96528c.apply((Object[]) dVar2.poll()), "The combiner returned a null value"));
                    ((y0) objPoll).requestOne();
                    j11++;
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    a();
                    iu.m.addThrowable(this.f96539o, th3);
                    cVar2.onError(iu.m.terminate(this.f96539o));
                    return;
                }
            }
            if (j11 == j10 && b(this.f96538n, dVar2.isEmpty(), cVar2, dVar2)) {
                return;
            }
            if (j11 != 0 && j10 != Long.MAX_VALUE) {
                this.f96537m.addAndGet(-j11);
            }
            iAddAndGet2 = addAndGet(-iAddAndGet2);
        } while (iAddAndGet2 != 0);
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f96530f.isEmpty();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        eu.d dVar = this.f96530f;
        Object objPoll = dVar.poll();
        if (objPoll == null) {
            return null;
        }
        Object objRequireNonNull = ut.o0.requireNonNull(this.f96528c.apply((Object[]) dVar.poll()), "The combiner returned a null value");
        ((y0) objPoll).requestOne();
        return objRequireNonNull;
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f96537m, j10);
            drain();
        }
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 4) != 0) {
            return 0;
        }
        int i11 = i10 & 2;
        this.f96533i = i11 != 0;
        return i11;
    }
}
