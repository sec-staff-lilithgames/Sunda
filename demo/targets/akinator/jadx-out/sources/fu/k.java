package fu;

import fu.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tt.h f56038b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f56039c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l.a f56040e;

    public k(l.a aVar, tt.h hVar, Runnable runnable) {
        this.f56040e = aVar;
        this.f56038b = hVar;
        this.f56039c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f56038b.replace(this.f56040e.schedule(this.f56039c));
    }
}
