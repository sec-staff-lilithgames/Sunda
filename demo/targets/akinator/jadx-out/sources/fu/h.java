package fu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends AtomicReference implements Runnable, pt.c, ou.a {

    /* renamed from: b, reason: collision with root package name */
    public final tt.h f56027b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.h f56028c;

    public h(Runnable runnable) {
        super(runnable);
        this.f56027b = new tt.h();
        this.f56028c = new tt.h();
    }

    @Override // pt.c
    public void dispose() {
        if (getAndSet(null) != null) {
            this.f56027b.dispose();
            this.f56028c.dispose();
        }
    }

    @Override // ou.a
    public Runnable getWrappedRunnable() {
        Runnable runnable = (Runnable) get();
        return runnable != null ? runnable : ut.m0.f88679b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public void run() {
        tt.h hVar = this.f56028c;
        tt.h hVar2 = this.f56027b;
        tt.d dVar = tt.d.f87352b;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                hVar2.lazySet(dVar);
                hVar.lazySet(dVar);
            }
        }
    }
}
