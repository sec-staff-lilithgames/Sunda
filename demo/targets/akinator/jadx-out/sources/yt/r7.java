package yt;

import java.util.concurrent.atomic.AtomicLong;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class r7 extends hu.a implements mt.q, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final m0.a f96240b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f96241c;

    /* renamed from: e, reason: collision with root package name */
    public final int f96242e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96243f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f96244g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public tw.d f96245h;

    /* renamed from: i, reason: collision with root package name */
    public vt.o f96246i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f96247j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f96248k;

    /* renamed from: l, reason: collision with root package name */
    public Throwable f96249l;

    /* renamed from: m, reason: collision with root package name */
    public int f96250m;

    /* renamed from: n, reason: collision with root package name */
    public long f96251n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f96252o;

    public r7(m0.a aVar, boolean z10, int i10) {
        this.f96240b = aVar;
        this.f96241c = z10;
        this.f96242e = i10;
        this.f96243f = i10 - (i10 >> 2);
    }

    public final boolean a(tw.c cVar, boolean z10, boolean z11) {
        if (this.f96247j) {
            clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (this.f96241c) {
            if (!z11) {
                return false;
            }
            this.f96247j = true;
            Throwable th2 = this.f96249l;
            if (th2 != null) {
                cVar.onError(th2);
            } else {
                cVar.onComplete();
            }
            this.f96240b.dispose();
            return true;
        }
        Throwable th3 = this.f96249l;
        if (th3 != null) {
            this.f96247j = true;
            clear();
            cVar.onError(th3);
            this.f96240b.dispose();
            return true;
        }
        if (!z11) {
            return false;
        }
        this.f96247j = true;
        cVar.onComplete();
        this.f96240b.dispose();
        return true;
    }

    public abstract void b();

    public abstract void c();

    @Override // hu.a, vt.l, tw.d
    public final void cancel() {
        if (this.f96247j) {
            return;
        }
        this.f96247j = true;
        this.f96245h.cancel();
        this.f96240b.dispose();
        if (this.f96252o || getAndIncrement() != 0) {
            return;
        }
        this.f96246i.clear();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public final void clear() {
        this.f96246i.clear();
    }

    public abstract void d();

    public final void e() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f96240b.schedule(this);
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public final boolean isEmpty() {
        return this.f96246i.isEmpty();
    }

    @Override // mt.q, tw.c, mt.f
    public final void onComplete() {
        if (this.f96248k) {
            return;
        }
        this.f96248k = true;
        e();
    }

    @Override // mt.q, tw.c, mt.f
    public final void onError(Throwable th2) {
        if (this.f96248k) {
            mu.a.onError(th2);
            return;
        }
        this.f96249l = th2;
        this.f96248k = true;
        e();
    }

    @Override // mt.q, tw.c
    public final void onNext(Object obj) {
        if (this.f96248k) {
            return;
        }
        if (this.f96250m == 2) {
            e();
            return;
        }
        if (!this.f96246i.offer(obj)) {
            this.f96245h.cancel();
            this.f96249l = new qt.e("Queue is full?!");
            this.f96248k = true;
        }
        e();
    }

    @Override // mt.q, tw.c
    public abstract /* synthetic */ void onSubscribe(tw.d dVar);

    @Override // hu.a, vt.l, vt.k, vt.o
    public abstract /* synthetic */ Object poll() throws Exception;

    @Override // hu.a, vt.l, tw.d
    public final void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f96244g, j10);
            e();
        }
    }

    @Override // hu.a, vt.l, vt.k
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f96252o = true;
        return 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f96252o) {
            c();
        } else if (this.f96250m == 1) {
            d();
        } else {
            b();
        }
    }
}
