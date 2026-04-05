package yt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i1 extends AtomicBoolean implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95642b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f95643c;

    public i1(Object obj, tw.c cVar) {
        this.f95643c = obj;
        this.f95642b = cVar;
    }

    @Override // tw.d
    public void request(long j10) {
        if (j10 <= 0 || !compareAndSet(false, true)) {
            return;
        }
        Object obj = this.f95643c;
        tw.c cVar = this.f95642b;
        cVar.onNext(obj);
        cVar.onComplete();
    }

    @Override // tw.d
    public void cancel() {
    }
}
