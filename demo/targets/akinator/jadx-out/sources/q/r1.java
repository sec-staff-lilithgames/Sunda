package q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f82219b;

    public r1(s1 s1Var) {
        this.f82219b = s1Var;
    }

    public void cancel() {
        s1 s1Var = this.f82219b;
        s1Var.f82246n = null;
        s1Var.removeCallbacks(this);
    }

    public void post() {
        this.f82219b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        s1 s1Var = this.f82219b;
        s1Var.f82246n = null;
        s1Var.drawableStateChanged();
    }
}
