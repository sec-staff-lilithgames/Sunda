package x3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m3 extends l3 {

    /* renamed from: n, reason: collision with root package name */
    public o3.c f91647n;

    public m3(e3 e3Var, WindowInsets windowInsets) {
        super(e3Var, windowInsets);
        this.f91647n = null;
    }

    @Override // x3.s3
    public e3 b() {
        return e3.toWindowInsetsCompat(this.f91632c.consumeStableInsets());
    }

    @Override // x3.s3
    public e3 c() {
        return e3.toWindowInsetsCompat(this.f91632c.consumeSystemWindowInsets());
    }

    @Override // x3.s3
    public final o3.c j() {
        if (this.f91647n == null) {
            WindowInsets windowInsets = this.f91632c;
            this.f91647n = o3.c.of(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f91647n;
    }

    @Override // x3.s3
    public boolean o() {
        return this.f91632c.isConsumed();
    }

    @Override // x3.s3
    public void setStableInsets(o3.c cVar) {
        this.f91647n = cVar;
    }

    public m3(e3 e3Var, m3 m3Var) {
        super(e3Var, m3Var);
        this.f91647n = null;
        this.f91647n = m3Var.f91647n;
    }
}
