package tm;

import android.app.Activity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f87068b;

    public h0(l0 l0Var) {
        this.f87068b = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        Integer num;
        l0 l0Var = this.f87068b;
        g gVar = l0Var.f87077k;
        n0 mraidViewState = gVar.getMraidViewState();
        if (mraidViewState == n0.f87104e) {
            l0.b(l0Var.f87078l);
            l0Var.f87078l = null;
            gVar.closeResized();
            return;
        }
        if (mraidViewState != n0.f87105f) {
            if (gVar.isInterstitial()) {
                gVar.close();
                m0 m0Var = l0Var.f87083q;
                if (m0Var != null) {
                    m0Var.onClose(l0Var);
                    return;
                }
                return;
            }
            return;
        }
        l0.b(l0Var.f87079m);
        l0Var.f87079m = null;
        Activity activityPeekActivity = l0Var.peekActivity();
        if (activityPeekActivity != null && (num = l0Var.I) != null) {
            activityPeekActivity.setRequestedOrientation(num.intValue());
            l0Var.I = null;
        }
        gVar.closeExpanded();
    }
}
