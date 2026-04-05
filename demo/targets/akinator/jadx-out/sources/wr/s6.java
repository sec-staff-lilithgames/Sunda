package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f91129b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f91130c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f91131e;

    public s6(Runnable runnable) {
        this.f91129b = (Runnable) mh.p1.checkNotNull(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f91130c) {
            return;
        }
        this.f91131e = true;
        this.f91129b.run();
    }
}
