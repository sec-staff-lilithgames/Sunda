package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i6 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10414b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10415c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final h6 f10416e = new h6(this);

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f10417f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f10418g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10419h;

    public i6(mt.i0 i0Var) {
        this.f10414b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10415c);
        tt.d.dispose(this.f10416e);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f10415c.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10418g = true;
        if (this.f10419h) {
            iu.n.onComplete(this.f10414b, this, this.f10417f);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f10416e);
        iu.n.onError(this.f10414b, th2, this, this.f10417f);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        iu.n.onNext(this.f10414b, obj, this, this.f10417f);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10415c, cVar);
    }
}
