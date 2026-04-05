package um;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f88600b;

    public k0(m0 m0Var) {
        this.f88600b = m0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m0 m0Var = this.f88600b;
        if (m0Var.f88613l) {
            return true;
        }
        m0Var.f88613l = true;
        h0.onUiThread(m0Var.f88608g, 100L);
        return true;
    }
}
