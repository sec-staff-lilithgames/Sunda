package q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f82116b;

    public i2(j2 j2Var) {
        this.f82116b = j2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        j2 j2Var = this.f82116b;
        s1 s1Var = j2Var.f82139e;
        if (s1Var == null || !s1Var.isAttachedToWindow() || j2Var.f82139e.getCount() <= j2Var.f82139e.getChildCount() || j2Var.f82139e.getChildCount() > j2Var.f82151q) {
            return;
        }
        j2Var.H.setInputMethodMode(2);
        j2Var.show();
    }
}
