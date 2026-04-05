package sh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final k f85801b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f85802c;

    public e(k kVar, n1 n1Var) {
        this.f85801b = kVar;
        this.f85802c = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f85801b.f85862b != this) {
            return;
        }
        Object objI = k.i(this.f85802c);
        if (t.f85861i.f(this.f85801b, this, objI)) {
            k.f(this.f85801b, false);
        }
    }
}
