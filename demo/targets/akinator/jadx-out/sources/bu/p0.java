package bu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p0 extends wt.u implements Runnable, pt.c {

    /* renamed from: j, reason: collision with root package name */
    public final Callable f10783j;

    /* renamed from: k, reason: collision with root package name */
    public final long f10784k;

    /* renamed from: l, reason: collision with root package name */
    public final long f10785l;

    /* renamed from: m, reason: collision with root package name */
    public final TimeUnit f10786m;

    /* renamed from: n, reason: collision with root package name */
    public final m0.a f10787n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedList f10788o;

    /* renamed from: p, reason: collision with root package name */
    public pt.c f10789p;

    public p0(ku.m mVar, Callable callable, long j10, long j11, TimeUnit timeUnit, m0.a aVar) {
        super(mVar, new eu.b());
        this.f10783j = callable;
        this.f10784k = j10;
        this.f10785l = j11;
        this.f10786m = timeUnit;
        this.f10787n = aVar;
        this.f10788o = new LinkedList();
    }

    @Override // pt.c
    public void dispose() {
        if (this.f91287g) {
            return;
        }
        this.f91287g = true;
        synchronized (this) {
            this.f10788o.clear();
        }
        this.f10789p.dispose();
        this.f10787n.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f91287g;
    }

    @Override // wt.u, mt.i0, mt.f
    public void onComplete() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f10788o);
            this.f10788o.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f91286f.offer((Collection) it.next());
        }
        this.f91288h = true;
        if (enter()) {
            iu.z.drainLoop(this.f91286f, this.f91285e, false, this.f10787n, this);
        }
    }

    @Override // wt.u, mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f91288h = true;
        synchronized (this) {
            this.f10788o.clear();
        }
        this.f91285e.onError(th2);
        this.f10787n.dispose();
    }

    @Override // wt.u, mt.i0
    public void onNext(Object obj) {
        synchronized (this) {
            try {
                Iterator it = this.f10788o.iterator();
                while (it.hasNext()) {
                    ((Collection) it.next()).add(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wt.u, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        m0.a aVar = this.f10787n;
        mt.i0 i0Var = this.f91285e;
        if (tt.d.validate(this.f10789p, cVar)) {
            this.f10789p = cVar;
            try {
                Collection collection = (Collection) ut.o0.requireNonNull(this.f10783j.call(), "The buffer supplied is null");
                this.f10788o.add(collection);
                i0Var.onSubscribe(this);
                long j10 = this.f10785l;
                this.f10787n.schedulePeriodically(this, j10, j10, this.f10786m);
                aVar.schedule(new o0(this, collection), this.f10784k, this.f10786m);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cVar.dispose();
                tt.e.error(th2, i0Var);
                aVar.dispose();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f91287g) {
            return;
        }
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(this.f10783j.call(), "The bufferSupplier returned a null buffer");
            synchronized (this) {
                try {
                    if (this.f91287g) {
                        return;
                    }
                    this.f10788o.add(collection);
                    this.f10787n.schedule(new n0(this, collection), this.f10784k, this.f10786m);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            this.f91285e.onError(th3);
            dispose();
        }
    }

    @Override // wt.u, iu.v
    public void accept(mt.i0 i0Var, Collection<Object> collection) {
        i0Var.onNext(collection);
    }
}
