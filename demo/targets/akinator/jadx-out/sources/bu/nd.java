package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class nd implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final md f10713b;

    /* renamed from: c, reason: collision with root package name */
    public final eu.d f10714c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f10715e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f10716f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f10717g = new AtomicReference();

    public nd(md mdVar, int i10) {
        this.f10713b = mdVar;
        this.f10714c = new eu.d(i10);
    }

    public void dispose() {
        tt.d.dispose(this.f10717g);
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10715e = true;
        this.f10713b.drain();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10716f = th2;
        this.f10715e = true;
        this.f10713b.drain();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10714c.offer(obj);
        this.f10713b.drain();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10717g, cVar);
    }
}
