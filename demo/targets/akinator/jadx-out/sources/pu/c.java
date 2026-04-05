package pu;

import java.util.concurrent.atomic.AtomicBoolean;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends AtomicBoolean implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f81840b;

    /* renamed from: c, reason: collision with root package name */
    public final d f81841c;

    public c(i0 i0Var, d dVar) {
        this.f81840b = i0Var;
        this.f81841c = dVar;
    }

    @Override // pt.c
    public void dispose() {
        if (compareAndSet(false, true)) {
            this.f81841c.d(this);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get();
    }

    public void onComplete() {
        if (get()) {
            return;
        }
        this.f81840b.onComplete();
    }

    public void onError(Throwable th2) {
        if (get()) {
            mu.a.onError(th2);
        } else {
            this.f81840b.onError(th2);
        }
    }

    public void onNext(Object obj) {
        if (get()) {
            return;
        }
        this.f81840b.onNext(obj);
    }
}
