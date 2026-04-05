package x3;

import a2.h4;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g3 extends k3 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f91585c;

    public g3() {
        this.f91585c = h4.d();
    }

    @Override // x3.k3
    public e3 b() {
        a();
        e3 windowInsetsCompat = e3.toWindowInsetsCompat(this.f91585c.build());
        windowInsetsCompat.f91569a.setOverriddenInsets(this.f91619b);
        return windowInsetsCompat;
    }

    @Override // x3.k3
    public void c(s sVar) {
        this.f91585c.setDisplayCutout(sVar != null ? sVar.f91667a : null);
    }

    @Override // x3.k3
    public void f(o3.c cVar) {
        this.f91585c.setMandatorySystemGestureInsets(cVar.toPlatformInsets());
    }

    @Override // x3.k3
    public void i(o3.c cVar) {
        this.f91585c.setStableInsets(cVar.toPlatformInsets());
    }

    @Override // x3.k3
    public void j(o3.c cVar) {
        this.f91585c.setSystemGestureInsets(cVar.toPlatformInsets());
    }

    @Override // x3.k3
    public void k(o3.c cVar) {
        this.f91585c.setSystemWindowInsets(cVar.toPlatformInsets());
    }

    @Override // x3.k3
    public void l(o3.c cVar) {
        this.f91585c.setTappableElementInsets(cVar.toPlatformInsets());
    }

    public g3(e3 e3Var) {
        WindowInsets.Builder builderD;
        super(e3Var);
        WindowInsets windowInsets = e3Var.toWindowInsets();
        if (windowInsets != null) {
            builderD = h4.e(windowInsets);
        } else {
            builderD = h4.d();
        }
        this.f91585c = builderD;
    }
}
