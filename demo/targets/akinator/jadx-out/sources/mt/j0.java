package mt;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 implements pt.c, Runnable, ou.a {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f74914b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.a f74915c;

    /* renamed from: e, reason: collision with root package name */
    public Thread f74916e;

    public j0(Runnable runnable, m0.a aVar) {
        this.f74914b = runnable;
        this.f74915c = aVar;
    }

    @Override // pt.c
    public void dispose() {
        Thread thread = this.f74916e;
        Thread threadCurrentThread = Thread.currentThread();
        m0.a aVar = this.f74915c;
        if (thread == threadCurrentThread && (aVar instanceof fu.u)) {
            ((fu.u) aVar).shutdown();
        } else {
            aVar.dispose();
        }
    }

    @Override // ou.a
    public Runnable getWrappedRunnable() {
        return this.f74914b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f74915c.isDisposed();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f74916e = Thread.currentThread();
        try {
            this.f74914b.run();
        } finally {
            dispose();
            this.f74916e = null;
        }
    }
}
