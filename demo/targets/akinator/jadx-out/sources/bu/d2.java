package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f10196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f10197c;

    public d2(f2 f2Var, Throwable th2) {
        this.f10197c = f2Var;
        this.f10196b = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        f2 f2Var = this.f10197c;
        try {
            f2Var.f10295b.onError(this.f10196b);
        } finally {
            f2Var.f10298f.dispose();
        }
    }
}
