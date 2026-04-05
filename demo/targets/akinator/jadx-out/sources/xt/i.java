package xt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends AtomicInteger implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93420b;

    /* renamed from: c, reason: collision with root package name */
    public final int f93421c;

    /* renamed from: e, reason: collision with root package name */
    public final int f93422e;

    /* renamed from: f, reason: collision with root package name */
    public final h f93423f = new h(this);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f93424g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public int f93425h;

    /* renamed from: i, reason: collision with root package name */
    public int f93426i;

    /* renamed from: j, reason: collision with root package name */
    public vt.o f93427j;

    /* renamed from: k, reason: collision with root package name */
    public tw.d f93428k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f93429l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f93430m;

    public i(mt.f fVar, int i10) {
        this.f93420b = fVar;
        this.f93421c = i10;
        this.f93422e = i10 - (i10 >> 2);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!isDisposed()) {
            if (!this.f93430m) {
                boolean z10 = this.f93429l;
                try {
                    mt.i iVar = (mt.i) this.f93427j.poll();
                    boolean z11 = iVar == null;
                    if (z10 && z11) {
                        if (this.f93424g.compareAndSet(false, true)) {
                            this.f93420b.onComplete();
                            return;
                        }
                        return;
                    } else if (!z11) {
                        this.f93430m = true;
                        iVar.subscribe(this.f93423f);
                        if (this.f93425h != 1) {
                            int i10 = this.f93426i + 1;
                            if (i10 == this.f93422e) {
                                this.f93426i = 0;
                                this.f93428k.request(i10);
                            } else {
                                this.f93426i = i10;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    if (!this.f93424g.compareAndSet(false, true)) {
                        mu.a.onError(th2);
                        return;
                    } else {
                        this.f93428k.cancel();
                        this.f93420b.onError(th2);
                        return;
                    }
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f93428k.cancel();
        tt.d.dispose(this.f93423f);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f93423f.get());
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f93429l = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f93424g.compareAndSet(false, true)) {
            mu.a.onError(th2);
        } else {
            tt.d.dispose(this.f93423f);
            this.f93420b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f93428k, dVar)) {
            this.f93428k = dVar;
            int i10 = this.f93421c;
            long j10 = i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10;
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f93425h = iRequestFusion;
                    this.f93427j = lVar;
                    this.f93429l = true;
                    this.f93420b.onSubscribe(this);
                    a();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f93425h = iRequestFusion;
                    this.f93427j = lVar;
                    this.f93420b.onSubscribe(this);
                    dVar.request(j10);
                    return;
                }
            }
            if (this.f93421c == Integer.MAX_VALUE) {
                this.f93427j = new eu.d(mt.l.bufferSize());
            } else {
                this.f93427j = new eu.c(this.f93421c);
            }
            this.f93420b.onSubscribe(this);
            dVar.request(j10);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(mt.i iVar) {
        if (this.f93425h != 0 || this.f93427j.offer(iVar)) {
            a();
        } else {
            onError(new qt.e());
        }
    }
}
