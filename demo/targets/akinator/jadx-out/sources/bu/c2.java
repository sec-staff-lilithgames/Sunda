package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f10162b;

    public c2(f2 f2Var) {
        this.f10162b = f2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        f2 f2Var = this.f10162b;
        try {
            f2Var.f10295b.onComplete();
        } finally {
            f2Var.f10298f.dispose();
        }
    }
}
