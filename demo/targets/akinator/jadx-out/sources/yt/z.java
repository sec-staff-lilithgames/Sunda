package yt;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z extends AtomicLong implements mt.q, tw.d, st.e {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96623b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f96624c;

    /* renamed from: e, reason: collision with root package name */
    public final int f96625e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96626f;

    /* renamed from: i, reason: collision with root package name */
    public tw.d f96629i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f96630j;

    /* renamed from: k, reason: collision with root package name */
    public int f96631k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f96632l;

    /* renamed from: m, reason: collision with root package name */
    public long f96633m;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f96628h = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f96627g = new ArrayDeque();

    public z(tw.c cVar, int i10, int i11, Callable callable) {
        this.f96623b = cVar;
        this.f96625e = i10;
        this.f96626f = i11;
        this.f96624c = callable;
    }

    @Override // tw.d
    public void cancel() {
        this.f96632l = true;
        this.f96629i.cancel();
    }

    @Override // st.e
    public boolean getAsBoolean() {
        return this.f96632l;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96630j) {
            return;
        }
        this.f96630j = true;
        long j10 = this.f96633m;
        if (j10 != 0) {
            iu.e.produced(this, j10);
        }
        iu.z.postComplete(this.f96623b, this.f96627g, this, this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96630j) {
            mu.a.onError(th2);
            return;
        }
        this.f96630j = true;
        this.f96627g.clear();
        this.f96623b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96630j) {
            return;
        }
        int i10 = this.f96631k;
        int i11 = i10 + 1;
        ArrayDeque arrayDeque = this.f96627g;
        if (i10 == 0) {
            try {
                arrayDeque.offer((Collection) ut.o0.requireNonNull(this.f96624c.call(), "The bufferSupplier returned a null buffer"));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cancel();
                onError(th2);
                return;
            }
        }
        Collection collection = (Collection) arrayDeque.peek();
        if (collection != null && collection.size() + 1 == this.f96625e) {
            arrayDeque.poll();
            collection.add(obj);
            this.f96633m++;
            this.f96623b.onNext(collection);
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).add(obj);
        }
        if (i11 == this.f96626f) {
            i11 = 0;
        }
        this.f96631k = i11;
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96629i, dVar)) {
            this.f96629i = dVar;
            this.f96623b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (!hu.g.validate(j10) || iu.z.postCompleteRequest(j10, this.f96623b, this.f96627g, this, this)) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f96628h;
        boolean z10 = atomicBoolean.get();
        int i10 = this.f96626f;
        if (z10 || !atomicBoolean.compareAndSet(false, true)) {
            this.f96629i.request(iu.e.multiplyCap(i10, j10));
        } else {
            this.f96629i.request(iu.e.addCap(this.f96625e, iu.e.multiplyCap(i10, j10 - 1)));
        }
    }
}
