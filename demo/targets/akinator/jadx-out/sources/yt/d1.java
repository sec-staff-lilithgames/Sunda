package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d1 extends AtomicInteger implements mt.q, h1, tw.d {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f95325c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95326e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95327f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f95328g;

    /* renamed from: h, reason: collision with root package name */
    public int f95329h;

    /* renamed from: i, reason: collision with root package name */
    public vt.o f95330i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f95331j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f95332k;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f95334m;

    /* renamed from: n, reason: collision with root package name */
    public int f95335n;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f95324b = new g1(this);

    /* renamed from: l, reason: collision with root package name */
    public final iu.d f95333l = new iu.d();

    public d1(st.o oVar, int i10) {
        this.f95325c = oVar;
        this.f95326e = i10;
        this.f95327f = i10 - (i10 >> 2);
    }

    public abstract void a();

    public abstract void b();

    @Override // tw.d
    public abstract /* synthetic */ void cancel();

    @Override // yt.h1
    public final void innerComplete() {
        this.f95334m = false;
        a();
    }

    @Override // yt.h1
    public abstract /* synthetic */ void innerError(Throwable th2);

    @Override // yt.h1
    public abstract /* synthetic */ void innerNext(Object obj);

    @Override // mt.q, tw.c, mt.f
    public final void onComplete() {
        this.f95331j = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.q, tw.c
    public final void onNext(Object obj) {
        if (this.f95335n == 2 || this.f95330i.offer(obj)) {
            a();
        } else {
            this.f95328g.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }
    }

    @Override // mt.q, tw.c
    public final void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95328g, dVar)) {
            this.f95328g = dVar;
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f95335n = iRequestFusion;
                    this.f95330i = lVar;
                    this.f95331j = true;
                    b();
                    a();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f95335n = iRequestFusion;
                    this.f95330i = lVar;
                    b();
                    dVar.request(this.f95326e);
                    return;
                }
            }
            this.f95330i = new eu.c(this.f95326e);
            b();
            dVar.request(this.f95326e);
        }
    }

    @Override // tw.d
    public abstract /* synthetic */ void request(long j10);
}
