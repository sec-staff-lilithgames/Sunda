package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r4 extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f10893b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10894c;

    /* JADX WARN: Multi-variable type inference failed */
    public r4(p4 p4Var, boolean z10) {
        this.f10893b = (AtomicInteger) p4Var;
        this.f10894c = z10;
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
        this.f10893b.innerComplete(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bu.p4, java.util.concurrent.atomic.AtomicInteger] */
    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10893b.innerError(th2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bu.p4, java.util.concurrent.atomic.AtomicInteger] */
    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10893b.innerValue(this.f10894c, obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
