package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f52752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f52753c;

    public j(l lVar, Throwable th2) {
        this.f52753c = lVar;
        this.f52752b = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f52753c.f52770c.onError(this.f52752b);
    }
}
