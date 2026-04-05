package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q4 extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f10847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10848c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10849e;

    /* JADX WARN: Multi-variable type inference failed */
    public q4(p4 p4Var, boolean z10, int i10) {
        this.f10847b = (AtomicInteger) p4Var;
        this.f10848c = z10;
        this.f10849e = i10;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bu.p4, java.util.concurrent.atomic.AtomicInteger] */
    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10847b.innerClose(this.f10848c, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bu.p4, java.util.concurrent.atomic.AtomicInteger] */
    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10847b.innerCloseError(th2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [bu.p4, java.util.concurrent.atomic.AtomicInteger] */
    @Override // mt.i0
    public void onNext(Object obj) {
        if (tt.d.dispose(this)) {
            this.f10847b.innerClose(this.f10848c, this);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
