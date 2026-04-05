package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import x3.o2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f4759a;

    public j1(m1 m1Var) {
        this.f4759a = m1Var;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationEnd(View view) {
        View view2;
        m1 m1Var = this.f4759a;
        if (m1Var.f4795u && (view2 = m1Var.f4782h) != null) {
            view2.setTranslationY(0.0f);
            m1Var.f4779e.setTranslationY(0.0f);
        }
        m1Var.f4779e.setVisibility(8);
        m1Var.f4779e.setTransitioning(false);
        m1Var.f4800z = null;
        o.b bVar = m1Var.f4790p;
        if (bVar != null) {
            bVar.onDestroyActionMode(m1Var.f4789o);
            m1Var.f4789o = null;
            m1Var.f4790p = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = m1Var.f4778d;
        if (actionBarOverlayLayout != null) {
            z1.requestApplyInsets(actionBarOverlayLayout);
        }
    }
}
