package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f52762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f52763c;

    public k(l lVar, Object obj) {
        this.f52763c = lVar;
        this.f52762b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f52763c.f52770c.onSuccess(this.f52762b);
    }
}
