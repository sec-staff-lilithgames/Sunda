package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f10246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f10247c;

    public e2(f2 f2Var, Object obj) {
        this.f10247c = f2Var;
        this.f10246b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10247c.f10295b.onNext(this.f10246b);
    }
}
