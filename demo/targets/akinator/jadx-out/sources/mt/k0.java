package mt;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 implements pt.c, Runnable, ou.a {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f74917b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.a f74918c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f74919e;

    public k0(Runnable runnable, m0.a aVar) {
        this.f74917b = runnable;
        this.f74918c = aVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f74919e = true;
        this.f74918c.dispose();
    }

    @Override // ou.a
    public Runnable getWrappedRunnable() {
        return this.f74917b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f74919e;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f74919e) {
            return;
        }
        try {
            this.f74917b.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f74918c.dispose();
            throw iu.m.wrapOrThrow(th2);
        }
    }
}
